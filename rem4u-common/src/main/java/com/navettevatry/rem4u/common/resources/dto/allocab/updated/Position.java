package com.navettevatry.rem4u.common.resources.dto.allocab.updated;

public class Position {
    private double lat;
    private double lng;

    public Position() {
    }

    public Position(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public double getLat() { return lat; }
    public void setLat(double value) { this.lat = value; }

    public double getLng() { return lng; }
    public void setLng(double value) { this.lng = value; }

    @Override
    public String toString() {
        return "Position{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
