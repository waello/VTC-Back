package com.navettevatry.rem4u.common.resources.dto.marcel;

public class Geo {
    private Latlng latlng;
    private Provider provider;

    public Latlng getLatlng() {
        return latlng;
    }

    public void setLatlng(Latlng value) {
        this.latlng = value;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider value) {
        this.provider = value;
    }
}
