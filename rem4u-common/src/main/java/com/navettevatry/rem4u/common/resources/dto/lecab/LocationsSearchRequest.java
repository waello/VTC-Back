package com.navettevatry.rem4u.common.resources.dto.lecab;

import java.io.Serializable;

/**
 *
 * Created by Chakib Daii.
 */
public class LocationsSearchRequest implements Serializable {
    private LocationRequest location;
    private Integer limit; //Maximum number of results in response,  default 5

    public LocationsSearchRequest() {
    }

    public LocationsSearchRequest(LocationRequest location) {
        this.location = location;
    }

    public LocationsSearchRequest(LocationRequest location, Integer limit) {
        this.location = location;
        this.limit = limit;
    }

    public LocationRequest getLocation() {
        return location;
    }

    public void setLocation(LocationRequest location) {
        this.location = location;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "LocationsSearchRequest{" +
                "location=" + location +
                ", limit=" + limit +
                '}';
    }
}
