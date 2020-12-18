package com.navettevatry.rem4u.common.utils.comparator;

import com.navettevatry.rem4u.common.resources.dto.standard.Offer;
import com.navettevatry.rem4u.common.resources.enumeration.ComparatorSorter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Chakib Daii.
 */
public class CombinedSorter implements Comparator<Offer> {

    private static final Logger LOGGER = LoggerFactory.getLogger(CombinedSorter.class);

    private List<ComparatorSorter> comparatorSorters;

    public CombinedSorter(List<ComparatorSorter> comparatorSorters) {
        this.comparatorSorters = comparatorSorters;
    }

    public List<ComparatorSorter> getComparatorSorters() {
        return comparatorSorters;
    }

    public void setComparatorSorters(List<ComparatorSorter> comparatorSorters) {
        this.comparatorSorters = comparatorSorters;
    }

    @Override
    public int compare(Offer o1, Offer o2) {
        // Get the difference
        float difference = comparisonByPririty(o1) - comparisonByPririty(o2);

        if (difference == 0) {
            // Both are equal
            return 0;
        }
        else if (difference < 0) {
            // o1 < 2
            return -1;
        }
        else {
            // o1 > o2
            return 1;
        }
    }

    //TODO: Verify priorities and results via testing
    public float comparisonByPririty(Offer o) {
        float total = o.getVehicle().getCo2Emission()*comparatorSorters.get(comparatorSorters.indexOf(ComparatorSorter.CO2_EMISSION_SORTER)).getPriority()
                    + o.getWaitingTime()*comparatorSorters.get(comparatorSorters.indexOf(ComparatorSorter.DELAY_SORTER)).getPriority()
                    + o.getVehicle().getComfort().getIndex()*comparatorSorters.get(comparatorSorters.indexOf(ComparatorSorter.COMFORT_SORTER)).getPriority()
                    + o.getPrice().getUnitAmount()*comparatorSorters.get(comparatorSorters.indexOf(ComparatorSorter.PRICE_SORTER)).getPriority();
        LOGGER.debug(o.getPlatformVTC()+" : "+String.valueOf(total));
        return total;
    }

    public float co2EmissionCompare(Offer o1, Offer o2) {
        float difference = o1.getVehicle().getCo2Emission() - o2.getVehicle().getCo2Emission();
        return difference*comparatorSorters.get(comparatorSorters.indexOf(ComparatorSorter.CO2_EMISSION_SORTER)).getPriority();
    }

    public int comfortCompare(Offer o1, Offer o2) {
        int returnValue = 0;
        if (o1.getVehicle().getComfort().getIndex() > o2.getVehicle().getComfort().getIndex()) {
            returnValue = 1;
        } else if (o1.getVehicle().getComfort().getIndex() < o2.getVehicle().getComfort().getIndex()) {
            returnValue = -1;
        }
        return returnValue*comparatorSorters.get(comparatorSorters.indexOf(ComparatorSorter.COMFORT_SORTER)).getPriority();
    }

    public int delayCompare(Offer o1, Offer o2) {
        int difference = o1.getWaitingTime() - o2.getWaitingTime();
        return difference*comparatorSorters.get(comparatorSorters.indexOf(ComparatorSorter.DELAY_SORTER)).getPriority();
    }

    public float priceCompare(Offer o1, Offer o2) {
        float difference = o1.getPrice().getUnitAmount() - o2.getPrice().getUnitAmount();
        return difference*comparatorSorters.get(comparatorSorters.indexOf(ComparatorSorter.PRICE_SORTER)).getPriority();
    }

    @Override
    public String toString() {
        return "CombinedSorter{" +
                "comparatorSorters=" + comparatorSorters +
                '}';
    }
}
