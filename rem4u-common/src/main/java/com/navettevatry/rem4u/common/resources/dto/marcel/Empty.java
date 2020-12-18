package com.navettevatry.rem4u.common.resources.dto.marcel;

import java.util.List;

public class Empty {
    private String address;
    private String complement;
    private String postalCode;
    private List<String> types;
    private Geo geo;
    private String source;
    private String name;
    private String zipCode;
    private double lat;
    private double purpleLong;

    public String getAddress() {
        return address;
    }

    public void setAddress(String value) {
        this.address = value;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String value) {
        this.complement = value;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> value) {
        this.types = value;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo value) {
        this.geo = value;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String value) {
        this.source = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String value) {
        this.zipCode = value;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double value) {
        this.lat = value;
    }

    public double getPurpleLong() {
        return purpleLong;
    }

    public void setPurpleLong(double value) {
        this.purpleLong = value;
    }
}
