package com.navettevatry.rem4u.common.resources.dto.olacab;

import java.io.Serializable;

/**
 *
 * Created by Wael Jlassi.
 * Updated by Chakib Daii.
 */

public class PickupPoint implements Serializable {
    private Float lat;
    private Float lng;
    private String name;
    private Integer id;

    public PickupPoint() {
    }

    public PickupPoint(Float lat, Float lng, String name, Integer id) {
        this.lat = lat;
        this.lng = lng;
        this.name = name;
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PickupPoint{" +
                "lat=" + lat +
                ", lng=" + lng +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
