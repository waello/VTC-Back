package com.navettevatry.rem4u.common.resources.dto.lecab.updated.estimate;

public class DropRequest {
    private double latitude;
    private double longitude;

    public DropRequest() {
    }

    public DropRequest(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

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
}
