package com.navettevatry.rem4u.common.resources.dto.olacab;

import java.io.Serializable;

/**
 *
 * Created by Chakib Daii.
 */
public class RideBookingRequest implements Serializable {
    private Float pickup_lat;
    private Float pickup_lng;
    private Float drop_lat;
    private Float drop_lng;
    private String fare_id;
    private String pickup_mode;

    public RideBookingRequest() {
    }

    public RideBookingRequest(Float pickup_lat, Float pickup_lng, Float drop_lat, Float drop_lng,
                              String fare_id, String pickup_mode) {
        this.pickup_lat = pickup_lat;
        this.pickup_lng = pickup_lng;
        this.drop_lat = drop_lat;
        this.drop_lng = drop_lng;
        this.fare_id = fare_id;
        this.pickup_mode = pickup_mode;
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

    public String getFare_id() {
        return fare_id;
    }

    public void setFare_id(String fare_id) {
        this.fare_id = fare_id;
    }

    public String getPickup_mode() {
        return pickup_mode;
    }

    public void setPickup_mode(String pickup_mode) {
        this.pickup_mode = pickup_mode;
    }

    @Override
    public String toString() {
        return "RideBookingRequest{" +
                "pickup_lat=" + pickup_lat +
                ", pickup_lng=" + pickup_lng +
                ", drop_lat=" + drop_lat +
                ", drop_lng=" + drop_lng +
                ", fare_id='" + fare_id + '\'' +
                ", pickup_mode='" + pickup_mode + '\'' +
                '}';
    }
}
