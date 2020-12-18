package com.navettevatry.rem4u.common.resources.dto.uber.updated;

public class DestinationDetails {
    private double latitude;
    private double longitude;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double value) {
        this.latitude = value;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double value) {
        this.longitude = value;
    }

    @Override
    public String toString() {
        return "DestinationDetails{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
