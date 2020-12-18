package com.navettevatry.rem4u.common.resources.dto.lyft;

import java.io.Serializable;

/**
 *
 * Created by Chakib Daii.
 */
public class EtasRequest implements Serializable {
    private Double latitude;
    private Double longitude;
    private String rideType;
    private Double destinationLatitude;
    private Double destinationLongitude;

    public EtasRequest() {
    }

    public EtasRequest(Double latitude, Double longitude, String rideType,
                       Double destinationLatitude, Double destinationLongitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.rideType = rideType;
        this.destinationLatitude = destinationLatitude;
        this.destinationLongitude = destinationLongitude;
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

    public Double getDestinationLatitude() {
        return destinationLatitude;
    }

    public void setDestinationLatitude(Double destinationLatitude) {
        this.destinationLatitude = destinationLatitude;
    }

    public Double getDestinationLongitude() {
        return destinationLongitude;
    }

    public void setDestinationLongitude(Double destinationLongitude) {
        this.destinationLongitude = destinationLongitude;
    }

    @Override
    public String toString() {
        return "EtasRequest{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", rideType='" + rideType + '\'' +
                ", destinationLatitude=" + destinationLatitude +
                ", destinationLongitude=" + destinationLongitude +
                '}';
    }
}
