package com.navettevatry.rem4u.common.resources.dto.snapcar.updated;

public class SnapCarRequest {
    public float getStart_lng() {
        return start_lng;
    }

    public SnapCarRequest() {
    }

    @Override
    public String toString() {
        return
                "start_lng=" + start_lng +
                "&start_lat=" + start_lat +
                "&end_lng=" + end_lng +
                "&end_lat=" + end_lat ;
    }

    public SnapCarRequest(float start_lng, float start_lat, float end_lng, float end_lat) {
        this.start_lng = start_lng;
        this.start_lat = start_lat;
        this.end_lng = end_lng;
        this.end_lat = end_lat;
    }

    public void setStart_lng(float start_lng) {
        this.start_lng = start_lng;
    }

    public float getStart_lat() {
        return start_lat;
    }

    public void setStart_lat(float start_lat) {
        this.start_lat = start_lat;
    }

    public float getEnd_lng() {
        return end_lng;
    }

    public void setEnd_lng(float end_lng) {
        this.end_lng = end_lng;
    }

    public float getEnd_lat() {
        return end_lat;
    }

    public void setEnd_lat(float end_lat) {
        this.end_lat = end_lat;
    }

    private  float start_lng;
    private  float start_lat    ;
    private  float end_lng;
    private  float end_lat;

}
