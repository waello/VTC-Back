package com.navettevatry.rem4u.common.resources.dto.kapten;

import java.io.Serializable;

/**
 *
 * Created by Chakib Daii.
 */
public class WaitingTimeRequest implements Serializable {
    private Float lat;
    private Float lng;

    public WaitingTimeRequest() {
    }

    public WaitingTimeRequest(Float lat, Float lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLng() {
        return lng;
    }

    public void setLng(Float lng) {
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "WaitingTimeRequest{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
