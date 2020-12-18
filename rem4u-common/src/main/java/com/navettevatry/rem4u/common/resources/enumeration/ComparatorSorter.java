package com.navettevatry.rem4u.common.resources.enumeration;


/**
 *
 * Created by Chakib Daii.
 */
public enum ComparatorSorter {
    CO2_EMISSION_SORTER("Co2EmissionSorter",10),
    COMFORT_SORTER("ComfortSorter",10),
    DELAY_SORTER("DelaySorter",10), //in case of immediate trip only
    PRICE_SORTER("PriceSorter",10);

    private String sorter;
    private Integer priority;

    ComparatorSorter (String sorter) {
        this.sorter = sorter;
    }

    ComparatorSorter(String sorter, Integer priority) {
        this.sorter = sorter;
        this.priority = priority;
    }

    public String getSorter() {
        return sorter;
    }

    public Integer getPriority() {
        return priority;
    }
}
