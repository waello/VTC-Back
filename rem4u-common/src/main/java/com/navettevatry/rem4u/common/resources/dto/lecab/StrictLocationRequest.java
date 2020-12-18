package com.navettevatry.rem4u.common.resources.dto.lecab;

import java.io.Serializable;
/**
 *
 * Created by Chakib Daii.
 */
public class StrictLocationRequest implements Serializable {
    /*Only one of this parameter should be set: id OR (latitude AND longitude)*/
    private String id; //Location's unique identifier
    private Float latitude; //Location's latitude coordinate
    private Float longitude; //Location's longitude coordinate

    public StrictLocationRequest() {
    }

    public StrictLocationRequest(String id, Float latitude, Float longitude) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "StrictLocationRequest{" +
                "id='" + id + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}

