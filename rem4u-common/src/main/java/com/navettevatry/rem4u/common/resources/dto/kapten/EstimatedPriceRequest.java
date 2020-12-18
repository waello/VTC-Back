package com.navettevatry.rem4u.common.resources.dto.kapten;

import java.io.Serializable;

/**
 *
 * Created by Chakib Daii.
 */
public class EstimatedPriceRequest implements Serializable {
    private Float start_lat;
    private Float start_lng;
    private Float end_lat;
    private Float end_lng;

    public EstimatedPriceRequest() {
    }

    public EstimatedPriceRequest(Float start_lat, Float start_lng, Float end_lat, Float end_lng) {
        this.start_lat = start_lat;
        this.start_lng = start_lng;
        this.end_lat = end_lat;
        this.end_lng = end_lng;
    }

    public Float getStart_lat() {
        return start_lat;
    }

    public void setStart_lat(Float start_lat) {
        this.start_lat = start_lat;
    }

    public Float getStart_lng() {
        return start_lng;
    }

    public void setStart_lng(Float start_lng) {
        this.start_lng = start_lng;
    }

    public Float getEnd_lat() {
        return end_lat;
    }

    public void setEnd_lat(Float end_lat) {
        this.end_lat = end_lat;
    }

    public Float getEnd_lng() {
        return end_lng;
    }

    public void setEnd_lng(Float end_lng) {
        this.end_lng = end_lng;
    }

    @Override
    public String toString() {
        return "EstimatedPriceRequest{" +
                "start_lat=" + start_lat +
                ", start_lng=" + start_lng +
                ", end_lat=" + end_lat +
                ", end_lng=" + end_lng +
                '}';
    }
}
