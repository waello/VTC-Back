package com.navettevatry.rem4u.common.resources.dto.lecab;

import com.navettevatry.rem4u.common.resources.enumeration.lecab.LocationsPresetRequestType;

import java.io.Serializable;
/**
 *
 * Created by Chakib Daii.
 */
public class LocationsPresetRequest implements Serializable {

    private String id; /* Unique identifier*/
    private LocationsPresetRequestType type; /* Location type*/

    public LocationsPresetRequest() {
    }

    public LocationsPresetRequest(String id, LocationsPresetRequestType type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocationsPresetRequestType getType() {
        return type;
    }

    public void setType(LocationsPresetRequestType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "LocationsPresetRequest{" +
                "id='" + id + '\'' +
                ", type=" + type +
                '}';
    }
}
