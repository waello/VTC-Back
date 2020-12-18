package com.navettevatry.rem4u.common.resources.dto.urbanDriver;

public class Path {
    private double lat;
    private double lng;

    public double getLat() { return lat; }
    public void setLat(double value) { this.lat = value; }

    public double getLng() { return lng; }
    public void setLng(double value) { this.lng = value; }

    @Override
    public String toString() {
        return "Path{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
