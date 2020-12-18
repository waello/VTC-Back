package com.navettevatry.rem4u.common.resources.enumeration.lecab;

import java.io.Serializable;

/**
 *
 * Created by Chakib Daii.
 */
public enum LocationResponseType implements Serializable {
    LEAF("LEAF"),
    NODE("NODE");

    private String type;

    LocationResponseType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
