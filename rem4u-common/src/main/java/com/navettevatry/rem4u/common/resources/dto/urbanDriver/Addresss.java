package com.navettevatry.rem4u.common.resources.dto.urbanDriver;

public class Addresss{
    private double lat;
    private double addressLong;
    private String zip_code;
    private String name;
    private String complement;

    @Override
    public String toString() {
        return "Address{" +
                "lat=" + lat +
                ", addressLong=" + addressLong +
                ", zipCode='" + zip_code + '\'' +
                ", name='" + name + '\'' +
                ", complement='" + complement + '\'' +
                '}';
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double value) {
        this.lat = value;
    }

    public double getlong() {
        return addressLong;
    }

    public void setlong(double value) {
        this.addressLong = value;
    }

    public String getzip_code() {
        return zip_code;
    }

    public void setzip_code(String value) {
        this.zip_code = value;
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
}
