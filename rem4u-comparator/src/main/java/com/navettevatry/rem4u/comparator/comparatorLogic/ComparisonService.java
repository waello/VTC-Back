package com.navettevatry.rem4u.comparator.comparatorLogic;

import com.navettevatry.rem4u.common.resources.dto.standard.Offer;
import com.navettevatry.rem4u.common.resources.enumeration.ComparatorSorter;
import com.navettevatry.rem4u.common.utils.comparator.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Chakib Daii.
 */

@Service
public class ComparisonService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ComparisonService.class);

    /**
     * sort offers using chain order as provided at @{@link ComparatorSorter}
     * @param offers @{@link List<Offer>}
     * @param comparatorsChainOrder @{@link List<ComparatorSorter>}
     * @param desc @{@link Boolean}
     * @return @{@link List<Offer>}
     */
    public List<Offer> sort(List<Offer> offers, List<ComparatorSorter> comparatorsChainOrder, Boolean desc){
        assert (offers != null && comparatorsChainOrder != null) : "Invalid Arguments";
        LOGGER.debug("[ComparisonService] sort order : " + comparatorsChainOrder);

        Comparator<Offer>  comparator = getComparatorFromChainOrder(comparatorsChainOrder);

        Collections.sort(offers, comparator);
        return offers;
    }

    /**
     * sort by delay
     * @param offers @{@link List<Offer>}
     * @param comparatorsChainOrder @{@link List<ComparatorSorter>}
     * @param desc @{@link Boolean}
     * @return @{@link List<Offer>}
     */

    public List<Offer> sortByDelay(List<Offer> offers, List<ComparatorSorter> comparatorsChainOrder, Boolean desc){
        LOGGER.debug("[ComparisonService] sortByDelay");

        Comparator<Offer> comparator = new DelaySorter() //Delay
                    .thenComparing(new PriceSorter()) //Price
                    .thenComparing(new ComfortSorter()) //Comfort
                    .thenComparing(new Co2EmissionSorter()); // Co2Emission

        Collections.sort(offers, comparator);
        return offers;
    }

    /**
     * sort by price
     * @param offers @{@link List<Offer>}
     * @param comparatorsChainOrder @{@link List<ComparatorSorter>}
     * @param desc @{@link Boolean}
     * @return @{@link List<Offer>}
     */

    public List<Offer> sortByPrice(List<Offer> offers, List<ComparatorSorter> comparatorsChainOrder, Boolean desc){
        LOGGER.debug("[ComparisonService] sortByPrice");

        Comparator<Offer>  comparator = new PriceSorter() //Price
                .thenComparing(new DelaySorter()) //Delay
                .thenComparing(new ComfortSorter()) //Comfort
                .thenComparing(new Co2EmissionSorter()); // Co2Emission

        Collections.sort(offers, comparator);
        return offers;
    }

    /**
     * sort by comfort
     * @param offers @{@link List<Offer>}
     * @param comparatorsChainOrder @{@link List<ComparatorSorter>}
     * @param desc @{@link Boolean}
     * @return @{@link List<Offer>}
     */

    public List<Offer> sortByComfort(List<Offer> offers, List<ComparatorSorter> comparatorsChainOrder, Boolean desc){
        LOGGER.debug("[ComparisonService] sortByComfort");

        Comparator<Offer>  comparator = new ComfortSorter() //Comfort
                .thenComparing(new PriceSorter()) //Price
                .thenComparing(new DelaySorter()) //Delay
                .thenComparing(new Co2EmissionSorter()); // Co2Emission

        Collections.sort(offers, comparator);
        return offers;
    }

    /**
     * sort by co2 emission
     * @param offers @{@link List<Offer>}
     * @param comparatorsChainOrder @{@link List<ComparatorSorter>}
     * @param desc @{@link Boolean}
     * @return @{@link List<Offer>}
     */

    public List<Offer> sortByCo2Emission(List<Offer> offers, List<ComparatorSorter> comparatorsChainOrder, Boolean desc){
        LOGGER.debug("[ComparisonService] sortByCo2Emission");

        Comparator<Offer>  comparator = new Co2EmissionSorter() // Co2Emission
                .thenComparing(new PriceSorter()) //Price
                .thenComparing(new DelaySorter()) //Delay
                .thenComparing(new ComfortSorter()); //Comfort

        Collections.sort(offers, comparator);
        return offers;
    }

    /**
     * sort by given chain order
     * @param offers @{@link List<Offer>}
     * @param comparatorsChainOrder @{@link List<ComparatorSorter>}
     * @param desc @{@link Boolean}
     * @return @{@link List<Offer>}
     */

    public List<Offer> sortByGivenchainOrder(List<Offer> offers, List<ComparatorSorter>  comparatorsChainOrder, Boolean desc){
        LOGGER.debug("[ComparisonService] sortByGivenchainOrder: "+ comparatorsChainOrder);

        Comparator<Offer>  comparator = getComparatorFromChainOrder(comparatorsChainOrder);

        Collections.sort(offers, comparator);
        return offers;
    }

    /**
     * sort by priorities
     * @param offers @{@link List<Offer>}
     * @param comparatorsChainOrder @{@link List<ComparatorSorter>}
     * @param desc @{@link Boolean}
     * @return @{@link List<Offer>}
     */

    public List<Offer> sortByPriorities(List<Offer> offers, List<ComparatorSorter>  comparatorsChainOrder, Boolean desc){
        LOGGER.debug("[ComparisonService] sortByPriorities: "+ comparatorsChainOrder);
        Comparator<Offer>  comparator = new CombinedSorter(comparatorsChainOrder);

        Collections.sort(offers, comparator);
        return offers;
    }

    /**
     * creator comparator using @{@link List<ComparatorSorter>}
     * @param comparators {@link List<ComparatorSorter>}
     * @return @{@link Comparator<Offer>}
     */
    private Comparator<Offer> getComparatorFromChainOrder(List<ComparatorSorter> comparators){
        //4 comparators in case of immediate trip and 3 only else
        assert (comparators.size() == 4 || comparators.size() == 3) : "Invalid Comparison Chain Size";

        Comparator<Offer> offerComparator =  null;

        switch (comparators.get(0)){
            case DELAY_SORTER:
                if(comparators.size() == 4)
                    offerComparator = new DelaySorter()
                         .thenComparing(getComparator(comparators.get(1)))
                        .thenComparing(getComparator(comparators.get(2)))
                        .thenComparing(getComparator(comparators.get(3)));
                break;
            case PRICE_SORTER:
                if(comparators.size() == 4)
                    offerComparator = new PriceSorter()
                            .thenComparing(getComparator(comparators.get(1)))
                            .thenComparing(getComparator(comparators.get(2)))
                            .thenComparing(getComparator(comparators.get(3)));
                else if(comparators.size() == 3)
                    offerComparator = new PriceSorter()
                            .thenComparing(getComparator(comparators.get(1)))
                            .thenComparing(getComparator(comparators.get(2)));
                break;
            case COMFORT_SORTER:
                if(comparators.size() == 4)
                    offerComparator = new ComfortSorter()
                        .thenComparing(getComparator(comparators.get(1)))
                        .thenComparing(getComparator(comparators.get(2)))
                        .thenComparing(getComparator(comparators.get(3)));
                else if(comparators.size() == 3)
                    offerComparator = new ComfortSorter()
                            .thenComparing(getComparator(comparators.get(1)))
                            .thenComparing(getComparator(comparators.get(2)));
                break;
            case CO2_EMISSION_SORTER:
                if(comparators.size() == 4)
                    offerComparator = new Co2EmissionSorter()
                            .thenComparing(getComparator(comparators.get(1)))
                            .thenComparing(getComparator(comparators.get(2)))
                            .thenComparing(getComparator(comparators.get(3)));
                else if(comparators.size() == 3)
                    offerComparator = new Co2EmissionSorter()
                            .thenComparing(getComparator(comparators.get(1)))
                            .thenComparing(getComparator(comparators.get(2)));
                break;
            default:
                LOGGER.debug("No Comparator Chain");
        }

        return offerComparator;
    }

    /**
     * create instance of comparator using a provided {@link ComparatorSorter}
     * @param comparatorSorter @{@link ComparatorSorter}
     * @return @{@link Comparator<Offer>}
     */
    private Comparator<? super Offer> getComparator(ComparatorSorter comparatorSorter){
        switch (comparatorSorter){
            case DELAY_SORTER:
                return new DelaySorter();
            case PRICE_SORTER:
                return new PriceSorter();
            case COMFORT_SORTER:
                return new ComfortSorter();
            case CO2_EMISSION_SORTER:
                return new Co2EmissionSorter();
        }
        return null;
    }

}
