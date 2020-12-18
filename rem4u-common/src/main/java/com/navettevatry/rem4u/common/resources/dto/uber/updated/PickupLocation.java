package com.navettevatry.rem4u.common.resources.dto.uber.updated;

public class PickupLocation {
    private String id;
    private String addressLine1;
    private String addressLine2;
    private String provider;
    private String locale;
    private double latitude;
    private double longitude;


    public PickupLocation(String id, String addressLine1, String addressLine2, String provider, String locale, double latitude, double longitude) {
        this.id = id;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.provider = provider;
        this.locale = locale;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public PickupLocation() {

    }

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String value) {
        this.provider = value;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String value) {
        this.locale = value;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double value) {
        this.latitude = value;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double value) {
        this.longitude = value;
    }

    @Override
    public String toString() {
        return "PickupLocation{" +
                "id='" + id + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", provider='" + provider + '\'' +
                ", locale='" + locale + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
