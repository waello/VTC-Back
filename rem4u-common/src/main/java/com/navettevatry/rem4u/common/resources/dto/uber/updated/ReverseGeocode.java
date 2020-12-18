package com.navettevatry.rem4u.common.resources.dto.uber.updated;

import java.util.UUID;

public class ReverseGeocode {
    private UUID uuid;
    private double latitude;
    private double longitude;
    private String shortAddress;
    private String longAddress;

    public UUID getUUID() {
        return uuid;
    }

    public void setUUID(UUID value) {
        this.uuid = value;
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

    public String getShortAddress() {
        return shortAddress;
    }

    public void setShortAddress(String value) {
        this.shortAddress = value;
    }

    public String getLongAddress() {
        return longAddress;
    }

    public void setLongAddress(String value) {
        this.longAddress = value;
    }

    @Override
    public String toString() {
        return "ReverseGeocode{" +
                "uuid=" + uuid +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", shortAddress='" + shortAddress + '\'' +
                ", longAddress='" + longAddress + '\'' +
                '}';
    }
}
