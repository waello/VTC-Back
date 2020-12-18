package com.navettevatry.rem4u.common.resources.enumeration;

import com.navettevatry.rem4u.common.resources.dto.standard.Offer;
import com.navettevatry.rem4u.common.utils.comparator.Co2EmissionSorter;
import com.navettevatry.rem4u.common.utils.comparator.ComfortSorter;
import com.navettevatry.rem4u.common.utils.comparator.DelaySorter;
import com.navettevatry.rem4u.common.utils.comparator.PriceSorter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//TODO: Use it in Rest Controllers
public enum SortByComparatorSorterChain {
    //Immediate Trip: Price:1, Delay: 2, Comfort: 3, Co2Emission: 4 in Priority Order
    PRICE_IMMEDIATE("Price",true,
            new ArrayList<ComparatorSorter>(Arrays.asList(ComparatorSorter.PRICE_SORTER, ComparatorSorter.DELAY_SORTER,
                    ComparatorSorter.COMFORT_SORTER,ComparatorSorter.CO2_EMISSION_SORTER))),
    DELAY_IMMEDIATE("Delay", true,
            new ArrayList<ComparatorSorter>(Arrays.asList(ComparatorSorter.DELAY_SORTER, ComparatorSorter.PRICE_SORTER,
                    ComparatorSorter.COMFORT_SORTER,ComparatorSorter.CO2_EMISSION_SORTER))), //in case of immediate trip only
    COMFORT_IMMEDIATE("Comfort",true,
            new ArrayList<ComparatorSorter>(Arrays.asList(ComparatorSorter.COMFORT_SORTER, ComparatorSorter.PRICE_SORTER,
                    ComparatorSorter.DELAY_SORTER, ComparatorSorter.CO2_EMISSION_SORTER))),
    CO2_EMISSION_IMMEDIATE("Co2Emission",true,
           new ArrayList<ComparatorSorter>(Arrays.asList(ComparatorSorter.CO2_EMISSION_SORTER, ComparatorSorter.PRICE_SORTER,
                   ComparatorSorter.DELAY_SORTER, ComparatorSorter.COMFORT_SORTER))),
    //Not Immediate Trip: Price:1, Comfort: 2, Co2Emission: 3 in Priority Order
    PRICE_NOT_IMMEDIATE("Price",true,
            new ArrayList<ComparatorSorter>(Arrays.asList(ComparatorSorter.PRICE_SORTER, ComparatorSorter.COMFORT_SORTER,
                    ComparatorSorter.CO2_EMISSION_SORTER))),
    COMFORT_NOT_IMMEDIATE("Comfort",true,
           new ArrayList<ComparatorSorter>(Arrays.asList(ComparatorSorter.COMFORT_SORTER, ComparatorSorter.PRICE_SORTER,
                    ComparatorSorter.CO2_EMISSION_SORTER))),
    CO2_EMISSION_NOT_IMMEDIATE("Co2Emission",true,
           new ArrayList<ComparatorSorter>(Arrays.asList(ComparatorSorter.CO2_EMISSION_SORTER, ComparatorSorter.PRICE_SORTER,
                   ComparatorSorter.COMFORT_SORTER)));

    private String sortBy;
    private Boolean isImmediate;
    private List<ComparatorSorter> sortChain;

    SortByComparatorSorterChain(String sortBy, Boolean isImmediate, List<ComparatorSorter> sortChain) {
        this.sortBy = sortBy;
        this.isImmediate = isImmediate;
        this.sortChain = sortChain;
    }

    public String getSortBy() {
        return sortBy;
    }

    public Boolean getImmediate() {
        return isImmediate;
    }

    public List<ComparatorSorter> getSortChain() {
        return sortChain;
    }
}
