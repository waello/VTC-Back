package com.navettevatry.rem4u.common.resources.dto.lyft;

import java.io.Serializable;

/**
 *
 * Created by Chakib Daii.
 */
public class DriversRequest implements Serializable {
    private Double latitude;
    private Double longitude;

    public DriversRequest() {
    }

    public DriversRequest(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "DriversRequest{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
