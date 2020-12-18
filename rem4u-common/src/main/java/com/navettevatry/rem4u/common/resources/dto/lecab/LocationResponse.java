package com.navettevatry.rem4u.common.resources.dto.lecab;

import com.navettevatry.rem4u.common.resources.enumeration.lecab.LocationResponseSubType;
import com.navettevatry.rem4u.common.resources.enumeration.lecab.LocationResponseType;

import java.io.Serializable;

/**
 *
 * Created by Chakib Daii.
 */
public class LocationResponse implements Serializable {
    private String id; //location's unique identifier
    private Float latitude; //Location's latitude coordinate
    private Float longitude; //Location's longitude coordinate
    private String address; //Location's text address or name
    private LocationResponseType type; //Location's type flags result as a final place (LEAF, ex: meeting point) or if it requires more details (NODE, ex: train station)
    private LocationResponseSubType subtype; //Location's subtype
    private String name; //Additional location's name

    public LocationResponse() {
    }

    public LocationResponse(String id, Float latitude, Float longitude, String address, LocationResponseType type, LocationResponseSubType subtype, String name) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
        this.type = type;
        this.subtype = subtype;
        this.name = name;
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

    public LocationResponseType getType() {
        return type;
    }

    public void setType(LocationResponseType type) {
        this.type = type;
    }

    public LocationResponseSubType getSubtype() {
        return subtype;
    }

    public void setSubtype(LocationResponseSubType subtype) {
        this.subtype = subtype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LocationResponse{" +
                "id='" + id + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", address='" + address + '\'' +
                ", type=" + type +
                ", subtype=" + subtype +
                ", name='" + name + '\'' +
                '}';
    }
}
