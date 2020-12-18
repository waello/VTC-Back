package com.navettevatry.rem4u.common.resources.dto.here;

/**
 *
 * Created by Ala Hadj Brahim & Ichrak Ben Abdallah.
 */
public class OriginalLocation {
    private Float lat;
    private Float lng;

    public OriginalLocation() {
    }

    public OriginalLocation(Float lat, Float lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public void setLat(Float lat) { this.lat = lat; }

    public void setLng(Float lng) { this.lng = lng; }

    public Float getLat() { return lat; }

    public Float getLng() { return lng; }



    @Override
    public String toString() {
        return "originalLocation{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }

}
