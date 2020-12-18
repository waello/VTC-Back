package com.navettevatry.rem4u.common.resources.enumeration.lecab;

import java.io.Serializable;
/**
 *
 * Created by Chakib Daii.
 */
public enum LocationsPresetRequestType implements Serializable {
    AIRPORT("AIRPORT"),
    TRAIN("TRAIN"),
    SPECIAL_PLACE("SPECIAL_PLACE"),
    AIRPORT_TERMINAL("AIRPORT_TERMINAL"),
    TRAIN_MEETING_POINT("TRAIN_MEETING_POINT"),
    MEETING_POINT("MEETING_POINT");

    private String type;

    LocationsPresetRequestType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
