package com.navettevatry.rem4u.common.resources.dto.lecab;

import java.io.Serializable;
import java.util.List;

/**
 *
 * Created by Chakib Daii.
 */
public class LocationsSearchResponse implements Serializable {
    private List<LocationResponse> locations;

    public LocationsSearchResponse() {
    }

    public LocationsSearchResponse(List<LocationResponse> locations) {
        this.locations = locations;
    }

    public List<LocationResponse> getLocations() {
        return locations;
    }

    public void setLocations(List<LocationResponse> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "LocationsSearchResponse{" +
                "locations=" + locations +
                '}';
    }
}
