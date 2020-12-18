package com.navettevatry.rem4u.common.resources.dto.lecab;

import java.io.Serializable;

/**
 *
 * Created by Chakib Daii.
 */
public class LocationRequest implements Serializable {
    //Only one of this parameter should be set: id OR address OR (latitude AND longitude)
    private String id; //Location's unique identifier
    private Float latitude; //Location's latitude coordinate
    private Float longitude; //Location's longitude coordinate
    private String address; //Location's text address or name

    public LocationRequest() {
    }

    public LocationRequest(String id) {
        this.id = id;
    }

    public LocationRequest(Float latitude, Float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public LocationRequest(String id, Float latitude, Float longitude, String address) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "LocationRequest{" +
                "id='" + id + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", address='" + address + '\'' +
                '}';
    }
}
