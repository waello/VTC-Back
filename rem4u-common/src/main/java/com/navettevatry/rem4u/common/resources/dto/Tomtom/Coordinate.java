package com.navettevatry.rem4u.common.resources.dto.Tomtom;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Coordinate {
    private double latitude;
    private double longitude;

    @JsonProperty("latitude")
    public double getLatitude() { return latitude; }
    @JsonProperty("latitude")
    public void setLatitude(double value) { this.latitude = value; }

    @JsonProperty("longitude")
    public double getLongitude() { return longitude; }

    public Coordinate() {
        this.latitude = latitude;
    }

    public Coordinate(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(double value) { this.longitude = value; }
}
