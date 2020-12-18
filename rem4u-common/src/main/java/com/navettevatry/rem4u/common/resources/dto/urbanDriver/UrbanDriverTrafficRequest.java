package com.navettevatry.rem4u.common.resources.dto.urbanDriver;

public class UrbanDriverTrafficRequest {
    private Float depLat;
    private Float depLng;
    private Float destLat;
    private Float destlng;

    public UrbanDriverTrafficRequest() {
    }

    public UrbanDriverTrafficRequest(Float depLat, Float depLng, Float destLat, Float destlng) {
        this.depLat = depLat;
        this.depLng = depLng;
        this.destLat = destLat;
        this.destlng = destlng;
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

    public Float getDestLat() {
        return destLat;
    }

    public void setDestLat(Float destLat) {
        this.destLat = destLat;
    }

    public Float getDestlng() {
        return destlng;
    }

    public void setDestlng(Float destlng) {
        this.destlng = destlng;
    }

    @Override
    public String toString() {
        return "UrbanDriverRequest{" +
                "depLat=" + depLat +
                ", depLng=" + depLng +
                ", destLat=" + destLat +
                ", destlng=" + destlng +
                '}';
    }
}
