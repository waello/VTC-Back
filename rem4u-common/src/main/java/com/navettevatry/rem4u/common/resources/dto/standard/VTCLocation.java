package com.navettevatry.rem4u.common.resources.dto.standard;

import java.io.Serializable;

/**
 *
 * Created by Chakib Daii.
 */
public class VTCLocation implements Serializable {
    private String id; //Location's unique google maps identifier
    private Float latitude; //Location's google maps latitude coordinate
    private Float longitude; //Location's google maps longitude coordinate
    private String address; //Location's google maps name
    private String addressLine1; //Location's google maps name
    private String addressLine2; //Location's google maps name

    public VTCLocation() {
    }

    public VTCLocation(String id, Float latitude, Float longitude, String address) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
    }

    public VTCLocation(String id, Float latitude, Float longitude, String address, String addressLine1, String addressLine2) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
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

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    @Override
    public String toString() {
        return "VTCLocation{" +
                "id='" + id + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", address='" + address + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                '}';
    }
}
