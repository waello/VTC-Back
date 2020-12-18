package com.navettevatry.rem4u.common.resources.enumeration.lecab;

import java.io.Serializable;
/**
 *
 * Created by Chakib Daii.
 */
public enum ServicesAvailableResponseType implements Serializable {
    P508("P508"),
    VIANO("VIANO"),
    ECO("ECO"),
    GREEN("GREEN"),
    FRANCE("FRANCE"),
    VAN_FRANCE("VAN_FRANCE"),
    MOTO("MOTO");

    private String type;

    ServicesAvailableResponseType (String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
