package com.navettevatry.rem4u.common.resources.enumeration.standard;

import java.io.Serializable;

/**
 *
 * Created by Chakib Daii.
 */
public enum TripType implements Serializable {
    DEFAULT("DEFAULT"),
    AIRPORT("AIRPORT"),
    SEAPORT("SEAPORT"),
    BUS_STATION("BUS_STATION"),
    TRAIN_STATION("TRAIN_STATION");

    private String type;

    TripType (String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
