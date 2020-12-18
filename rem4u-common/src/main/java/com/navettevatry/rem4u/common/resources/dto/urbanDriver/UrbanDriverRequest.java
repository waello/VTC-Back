package com.navettevatry.rem4u.common.resources.dto.urbanDriver;


public class UrbanDriverRequest {
    private Float depLat;
    private Float depLng;
    private String locale;

    public UrbanDriverRequest() {
    }

    public UrbanDriverRequest(Float depLat, Float depLng, String locale) {
        this.depLat = depLat;
        this.depLng = depLng;
        this.locale = locale;
    }

    public Float getDepLat() {
        return depLat;
    }

    public void setDepLat(Float depLat) {
        this.depLat = depLat;
    }

    public Float getDepLng() {
        return depLng;
    }

    public void setDepLng(Float depLng) {
        this.depLng = depLng;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    @Override
    public String toString() {
        return "UrbanDriverRequest{" +
                "depLat=" + depLat +
                ", depLng=" + depLng +
                ", locale='" + locale + '\'' +
                '}';
    }
}
