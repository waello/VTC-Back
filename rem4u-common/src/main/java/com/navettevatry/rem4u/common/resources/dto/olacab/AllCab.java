package com.navettevatry.rem4u.common.resources.dto.olacab;

import java.io.Serializable;

/**
 *
 * Created by Wael Jlassi.
 * Updated by Chakib Daii.
 */
public class AllCab implements Serializable {
    private Float lat;
    private Float lng;
    private String id;
    private Integer bearing;
    private Integer accuracy;

    public AllCab() {
    }

    public AllCab(Float lat, Float lng, String id, Integer bearing, Integer accuracy) {
        this.lat = lat;
        this.lng = lng;
        this.id = id;
        this.bearing = bearing;
        this.accuracy = accuracy;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getBearing() {
        return bearing;
    }

    public void setBearing(Integer bearing) {
        this.bearing = bearing;
    }

    public Integer getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    @Override
    public String toString() {
        return "AllCab{" +
                "lat=" + lat +
                ", lng=" + lng +
                ", id='" + id + '\'' +
                ", bearing=" + bearing +
                ", accuracy=" + accuracy +
                '}';
    }
}
