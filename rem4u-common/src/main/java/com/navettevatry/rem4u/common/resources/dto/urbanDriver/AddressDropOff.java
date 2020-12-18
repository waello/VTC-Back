package com.navettevatry.rem4u.common.resources.dto.urbanDriver;

public class AddressDropOff {
    private double lat;
    private double addressDropOffLong;
    private String zipCode;
    private String name;
    private String complement;
    private String estimatedDatetime;

    public double getLat() {
        return lat;
    }

    public void setLat(double value) {
        this.lat = value;
    }

    public double getAddressDropOffLong() {
        return addressDropOffLong;
    }

    public void setAddressDropOffLong(double value) {
        this.addressDropOffLong = value;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String value) {
        this.zipCode = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String value) {
        this.complement = value;
    }

    public String getEstimatedDatetime() {
        return estimatedDatetime;
    }

    public void setEstimatedDatetime(String value) {
        this.estimatedDatetime = value;
    }
}
