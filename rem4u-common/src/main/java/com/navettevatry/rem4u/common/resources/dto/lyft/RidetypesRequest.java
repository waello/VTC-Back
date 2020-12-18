package com.navettevatry.rem4u.common.resources.dto.lyft;

import java.io.Serializable;

/**
 *
 * Created by Chakib Daii.
 */
public class RidetypesRequest implements Serializable {
    private Double latitude;
    private Double longitude;
    private String rideType;

    public RidetypesRequest() {
    }

    public RidetypesRequest(Double latitude, Double longitude, String rideType) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.rideType = rideType;
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

    public String getRideType() {
        return rideType;
    }

    public void setRideType(String rideType) {
        this.rideType = rideType;
    }

    @Override
    public String toString() {
        return "RidetypesRequest{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", rideType='" + rideType + '\'' +
                '}';
    }
}
