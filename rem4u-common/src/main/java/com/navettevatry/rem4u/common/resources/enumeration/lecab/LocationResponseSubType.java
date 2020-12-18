package com.navettevatry.rem4u.common.resources.enumeration.lecab;

import java.io.Serializable;

/**
 *
 * Created by Chakib Daii.
 */
public enum LocationResponseSubType implements Serializable {
    AIRPORT("AIRPORT"),
    TRAIN("TRAIN");

    private String subType;

    LocationResponseSubType(String subType) {
        this.subType = subType;
    }

    public String getSubType() {
        return subType;
    }
}
