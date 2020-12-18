package com.navettevatry.rem4u.common.resources.dto.here;

/**
 *
 * Created by Ala Hadj Brahim & Ichrak Ben Abdallah.
 */
public class Location {
    private Float lat;
    private Float lng;
    private Integer elv;

    public Location() {
    }

    public Location(Float lat, Float lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public Location(Float lat, Float lng, Integer elv) {
        this.lat = lat;
        this.lng = lng;
        this.elv = elv;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLng() {
        return lng;
    }

    public void setLng(Float lng) {
        this.lng = lng;
    }

    public Integer getElv() {
        return elv;
    }

    public void setElv(Integer elv) {
        this.elv = elv;
    }

    @Override
    public String toString() {
        return "Location{" +
                "lat=" + lat +
                ", lng=" + lng +
                ", elv=" + elv +
                '}';
    }
}
