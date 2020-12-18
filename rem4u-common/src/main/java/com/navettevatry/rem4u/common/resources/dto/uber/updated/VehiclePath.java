package com.navettevatry.rem4u.common.resources.dto.uber.updated;

public class VehiclePath {
    private double latitude;
    private double longitude;
    private long course;
    private long epoch;

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

    public long getCourse() {
        return course;
    }

    public void setCourse(long value) {
        this.course = value;
    }

    public long getEpoch() {
        return epoch;
    }

    public void setEpoch(long value) {
        this.epoch = value;
    }

    @Override
    public String toString() {
        return "VehiclePath{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", course=" + course +
                ", epoch=" + epoch +
                '}';
    }
}
