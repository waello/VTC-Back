package com.navettevatry.rem4u.common.resources.dto.olacab;

import java.io.Serializable;

/**
 *
 * Created by Chakib Daii.
 */
public class RideEstimateRequest implements Serializable {
    private Float pickup_lat;
    private Float pickup_lng;
    private Float drop_lat;
    private Float drop_lng;
    private Float service_type;
    private String category;

    public RideEstimateRequest() {
    }

    public RideEstimateRequest(Float pickup_lat, Float pickup_lng, Float drop_lat, Float drop_lng,
                               Float service_type, String category) {
        this.pickup_lat = pickup_lat;
        this.pickup_lng = pickup_lng;
        this.drop_lat = drop_lat;
        this.drop_lng = drop_lng;
        this.service_type = service_type;
        this.category = category;
    }

    public Float getPickup_lat() {
        return pickup_lat;
    }

    public void setPickup_lat(Float pickup_lat) {
        this.pickup_lat = pickup_lat;
    }

    public Float getPickup_lng() {
        return pickup_lng;
    }

    public void setPickup_lng(Float pickup_lng) {
        this.pickup_lng = pickup_lng;
    }

    public Float getDrop_lat() {
        return drop_lat;
    }

    public void setDrop_lat(Float drop_lat) {
        this.drop_lat = drop_lat;
    }

    public Float getDrop_lng() {
        return drop_lng;
    }

    public void setDrop_lng(Float drop_lng) {
        this.drop_lng = drop_lng;
    }

    public Float getService_type() {
        return service_type;
    }

    public void setService_type(Float service_type) {
        this.service_type = service_type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "RideEstimateRequest{" +
                "pickup_lat=" + pickup_lat +
                ", pickup_lng=" + pickup_lng +
                ", drop_lat=" + drop_lat +
                ", drop_lng=" + drop_lng +
                ", service_type=" + service_type +
                ", category='" + category + '\'' +
                '}';
    }
}
