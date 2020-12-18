package com.navettevatry.rem4u.common.resources.dto.lecab;

import java.io.Serializable;
/**
 *
 * Created by Chakib Daii.
 */
public class ServicesAvailableRequest implements Serializable {
    private LocationRequest location;

    public ServicesAvailableRequest() {
    }

    public ServicesAvailableRequest(LocationRequest location) {
        this.location = location;
    }

    public LocationRequest getLocation() {
        return location;
    }

    public void setLocation(LocationRequest location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "ServicesAvailableRequest{" +
                "location=" + location +
                '}';
    }
}
