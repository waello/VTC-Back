package com.navettevatry.rem4u.common.resources.dto.uber.updated;

public class Destination {
    private String id;
    private String addressLine1;
    private String addressLine2;
    private String provider;
    private String locale;

    public Destination(String id, String addressLine1, String addressLine2, String provider, String locale) {
        this.id = id;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.provider = provider;
        this.locale = locale;
    }

    public Destination() {

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

    @Override
    public String toString() {
        return "Destination{" +
                "id='" + id + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", provider='" + provider + '\'' +
                ", locale='" + locale + '\'' +
                '}';
    }
}
