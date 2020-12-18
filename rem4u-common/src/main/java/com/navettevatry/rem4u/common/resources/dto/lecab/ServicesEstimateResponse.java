package com.navettevatry.rem4u.common.resources.dto.lecab;

import java.io.Serializable;
/**
 *
 * Created by Chakib Daii.
 */
public class ServicesEstimateResponse implements Serializable {
    private LocationResponse location;
    private Integer delay; /*Estimated time before arrival in minutes*/

    public ServicesEstimateResponse() {
    }

    public ServicesEstimateResponse(LocationResponse location, Integer delay) {
        this.location = location;
        this.delay = delay;
    }

    public LocationResponse getLocation() {
        return location;
    }

    public void setLocation(LocationResponse location) {
        this.location = location;
    }

    public Integer getDelay() {
        return delay;
    }

    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    @Override
    public String toString() {
        return "ServicesEstimateResponse{" +
                "location=" + location +
                ", delay=" + delay +
                '}';
    }
}
