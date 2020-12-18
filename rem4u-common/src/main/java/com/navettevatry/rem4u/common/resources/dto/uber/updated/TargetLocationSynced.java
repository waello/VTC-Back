package com.navettevatry.rem4u.common.resources.dto.uber.updated;

public class TargetLocationSynced {
    private long latitude;
    private long longitude;

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long value) {
        this.latitude = value;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long value) {
        this.longitude = value;
    }

    @Override
    public String toString() {
        return "TargetLocationSynced{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
