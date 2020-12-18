package com.navettevatry.rem4u.comparator.controllers;

import com.navettevatry.rem4u.common.resources.dto.standard.Offer;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorRequest;
import com.navettevatry.rem4u.common.resources.enumeration.ComparatorSorter;
import com.navettevatry.rem4u.common.resources.enumeration.Provider;
import com.navettevatry.rem4u.common.resources.enumeration.SortByComparatorSorterChain;
import com.navettevatry.rem4u.common.utils.response.GenericResponse;
import com.navettevatry.rem4u.common.utils.response.ResponseBuilder;
import com.navettevatry.rem4u.common.utils.response.body.BooleanResponse;
import com.navettevatry.rem4u.common.utils.response.body.ListResponse;
import com.navettevatry.rem4u.comparator.comparatorLogic.ComparisonService;
import com.navettevatry.rem4u.comparator.platforms.AlloCabService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Wael Jlassi & Ahmed Ferjani
 * Updated by Chakib DAII
 */

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/comparatorSort")
class ComparisonController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ComparisonController.class);

    @Autowired
    private ComparisonService service;

    /**
     * sort using sorter chain provided at @{@link SortByComparatorSorterChain}
     * @param Offers @{@link Offer}
     * @param sorter @{@link String}
     * @param desc @{@link String}
     * @return @{@link GenericResponse<List<Offer>>}
     */
    @PostMapping(value = "/sort/{sorter}")
    public GenericResponse sort(@RequestBody List<Offer> Offers, @PathVariable("sorter") String sorter, @RequestParam(name = "desc") String desc){
        LOGGER.debug("[ComparisonController] sortBy {}", sorter);
        try {
            List<Offer> ListOffer = service.sort(Offers,
                    SortByComparatorSorterChain.valueOf(sorter).getSortChain(),
                    Boolean.getBoolean(desc));

            return ResponseBuilder.buildSuccessResponse(new ListResponse<>(ListOffer), Provider.MODULE);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseBuilder.buildSuccessResponse(new BooleanResponse(false), Provider.MODULE);
        }
    }

    /**
     * sort by delay as provided at @{@link SortByComparatorSorterChain}
     * @param Offers @{@link Offer}
     * @param desc @{@link String}
     * @return @{@link GenericResponse<List<Offer>>}
     */
    @PostMapping(value = "/sortByDelay")
    public GenericResponse sortByDelay (@RequestBody List<Offer> Offers, @RequestParam(name = "desc") String desc){
        LOGGER.debug("[ComparisonController] sortByDelay");
        try {
            List<Offer> ListOffer = service.sortByDelay(Offers,
                    SortByComparatorSorterChain.DELAY_IMMEDIATE.getSortChain(),
                    Boolean.getBoolean(desc));

            return ResponseBuilder.buildSuccessResponse(new ListResponse<>(ListOffer), Provider.MODULE);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseBuilder.buildSuccessResponse(new BooleanResponse(false), Provider.MODULE);
        }
    }

    /**
     * sort by price as provided at @{@link SortByComparatorSorterChain}
     * @param Offers @{@link Offer}
     * @param immediate @{@link String}
     * @param desc @@{@link String}
     * @return @{@link GenericResponse<List<Offer>>}
     */
     @PostMapping(value = "/sortByPrice")
     public GenericResponse sortByPrice (@RequestBody List<Offer> Offers, @RequestParam(name = "immediate") String immediate, @RequestParam(name = "desc") String desc){
         LOGGER.debug("[ComparisonController] sortByPrice");
         try {
             List<Offer> ListOffer = null;
             if(Boolean.getBoolean(immediate))
                 ListOffer = service.sortByPrice(Offers,
                         SortByComparatorSorterChain.PRICE_IMMEDIATE.getSortChain(),
                         Boolean.getBoolean(desc));
             else
                 ListOffer = service.sortByPrice(Offers,
                         SortByComparatorSorterChain.PRICE_NOT_IMMEDIATE.getSortChain(),
                         Boolean.getBoolean(desc));

             return ResponseBuilder.buildSuccessResponse(new ListResponse<>(ListOffer), Provider.MODULE);
         } catch (Exception e) {
             e.printStackTrace();
             return ResponseBuilder.buildSuccessResponse(new BooleanResponse(false), Provider.MODULE);
         }
     }

    /**
     * sort by comfort as provided at @{@link SortByComparatorSorterChain}
     * @param Offers @{@link Offer}
     * @param immediate @{@link String}
     * @param desc @@{@link String}
     * @return @{@link GenericResponse<List<Offer>>}
     */
    @PostMapping(value = "/sortByComfort")
    public GenericResponse sortByComfort (@RequestBody List<Offer> Offers, @RequestParam(name = "immediate") String immediate, @RequestParam(name = "desc") String desc){
        LOGGER.debug("[ComparisonController] sortByPrice");
        try {
            List<Offer> ListOffer = null;
            if(Boolean.getBoolean(immediate))
                ListOffer = service.sortByComfort(Offers,
                        SortByComparatorSorterChain.COMFORT_IMMEDIATE.getSortChain(),
                        Boolean.getBoolean(desc));
            else
                ListOffer = service.sortByComfort(Offers,
                        SortByComparatorSorterChain.COMFORT_NOT_IMMEDIATE.getSortChain(),
                        Boolean.getBoolean(desc));

            return ResponseBuilder.buildSuccessResponse(new ListResponse<>(ListOffer), Provider.MODULE);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseBuilder.buildSuccessResponse(new BooleanResponse(false), Provider.MODULE);
        }
    }

    /**
     * sort by co2Emission as provided at @{@link SortByComparatorSorterChain}
     * @param Offers @{@link Offer}
     * @param immediate @{@link String}
     * @param desc @@{@link String}
     * @return @{@link GenericResponse<List<Offer>>}
     */
    @PostMapping(value = "/sortByCo2Emission")
    public GenericResponse sortByCo2Emission (@RequestBody List<Offer> Offers, @RequestParam(name = "immediate") String immediate, @RequestParam(name = "desc") String desc){
        LOGGER.debug("[ComparisonController] sortByCo2Emission");
        try {
            List<Offer> ListOffer = null;
            if(Boolean.getBoolean(immediate))
                ListOffer = service.sortByCo2Emission(Offers,
                        SortByComparatorSorterChain.CO2_EMISSION_IMMEDIATE.getSortChain(),
                        Boolean.getBoolean(desc));
            else
                ListOffer = service.sortByCo2Emission(Offers,
                        SortByComparatorSorterChain.CO2_EMISSION_NOT_IMMEDIATE.getSortChain(),
                        Boolean.getBoolean(desc));

            return ResponseBuilder.buildSuccessResponse(new ListResponse<>(ListOffer), Provider.MODULE);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseBuilder.buildSuccessResponse(new BooleanResponse(false), Provider.MODULE);
        }
    }


    /**
     * sort by a given chain order as provided at @{@link ComparatorSorter}
     * @param Offers @{@link Offer}
     * @param comparatorsChainOrder @{@link List<ComparatorSorter>}
     * @param desc @{@link String}
     * @return @{@link GenericResponse<List<Offer>>}
     */
    @PostMapping(value = "/sortByGivenchainOrder")
    public GenericResponse sortByGivenchainOrder (@RequestBody List<Offer> Offers, @RequestParam(name = "comparatorsChainOrder") List<ComparatorSorter>  comparatorsChainOrder, @RequestParam(name = "desc") String desc){
        LOGGER.debug("[ComparisonController] sortByGivenchainOrder");
        try {
            List<Offer> ListOffer = service.sortByGivenchainOrder(Offers, comparatorsChainOrder, Boolean.getBoolean(desc));

            return ResponseBuilder.buildSuccessResponse(new ListResponse<>(ListOffer), Provider.MODULE);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseBuilder.buildSuccessResponse(new BooleanResponse(false), Provider.MODULE);
        }
    }

    /**
     * sort by a given chain (each has priority) order as provided at @{@link ComparatorSorter}
     * @param Offers @{@link Offer}
     * @param comparatorsChainOrder @{@link List<ComparatorSorter>}
     * @param desc @{@link String}
     * @return @{@link GenericResponse<List<Offer>>}
     */
    @PostMapping(value = "/sortByPriorities")
    public GenericResponse sortByPriorities (@RequestBody List<Offer> Offers, @RequestParam(name = "comparatorsChainOrder") List<ComparatorSorter> comparatorsChainOrder, @RequestParam(name = "desc") String desc){
        LOGGER.debug("[ComparisonController] sortByPriorities");
        try {
            List<Offer> ListOffer = service.sortByPriorities(Offers,comparatorsChainOrder,Boolean.getBoolean(desc));

            return ResponseBuilder.buildSuccessResponse(new ListResponse<>(ListOffer), Provider.MODULE);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseBuilder.buildSuccessResponse(new BooleanResponse(false), Provider.MODULE);
        }
    }
}
