package com.navettevatry.rem4u.common.resources.dto.uber.updated;

import java.io.Serializable;

/**
 *
 * Created by Chakib Daii.
 */
public class PriceEstimatesPromotionRequest implements Serializable{
    private Float startLatitude;
    private Float startLongitude;
    private Float endLatitude;
    private Float endLongitude;

    public PriceEstimatesPromotionRequest() {
    }

    public PriceEstimatesPromotionRequest(Float startLatitude, Float startLongitude, Float endLatitude, Float endLongitude) {
        this.startLatitude = startLatitude;
        this.startLongitude = startLongitude;
        this.endLatitude = endLatitude;
        this.endLongitude = endLongitude;
    }

    public Float getStartLatitude() {
        return startLatitude;
    }

    public void setStartLatitude(Float startLatitude) {
        this.startLatitude = startLatitude;
    }

    public Float getStartLongitude() {
        return startLongitude;
    }

    public void setStartLongitude(Float startLongitude) {
        this.startLongitude = startLongitude;
    }

    public Float getEndLatitude() {
        return endLatitude;
    }

    public void setEndLatitude(Float endLatitude) {
        this.endLatitude = endLatitude;
    }

    public Float getEndLongitude() {
        return endLongitude;
    }

    public void setEndLongitude(Float endLongitude) {
        this.endLongitude = endLongitude;
    }

    @Override
    public String toString() {
        return "PriceEstimatesPromotionRequest{" +
                "startLatitude=" + startLatitude +
                ", startLongitude=" + startLongitude +
                ", endLatitude=" + endLatitude +
                ", endLongitude=" + endLongitude +
                '}';
    }
}
