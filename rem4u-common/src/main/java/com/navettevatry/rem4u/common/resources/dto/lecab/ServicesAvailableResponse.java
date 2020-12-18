package com.navettevatry.rem4u.common.resources.dto.lecab;

import com.navettevatry.rem4u.common.resources.enumeration.lecab.ServicesAvailableResponseType;

import java.io.Serializable;
import java.util.List;
/**
 *
 * Created by Chakib Daii.
 */
public class ServicesAvailableResponse implements Serializable {
    private LocationResponse location;
    private List<ServicesAvailableResponseType> services;

    public ServicesAvailableResponse() {
    }

    public ServicesAvailableResponse(LocationResponse location, List<ServicesAvailableResponseType> services) {
        this.location = location;
        this.services = services;
    }

    public LocationResponse getLocation() {
        return location;
    }

    public void setLocation(LocationResponse location) {
        this.location = location;
    }

    public List<ServicesAvailableResponseType> getServices() {
        return services;
    }

    public void setServices(List<ServicesAvailableResponseType> services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return "ServicesAvailableResponse{" +
                "location=" + location +
                ", services=" + services +
                '}';
    }
}
