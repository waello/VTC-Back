package com.navettevatry.rem4u.common.resources.dto.uber.updated;

import java.io.Serializable;

/**
 *
 * Created by Chakib Daii.
 */
public class PickupTimeEstimateRequest implements Serializable {
    private Float startLatitude;
    private Float startLongitude;
    private String productId;

    public PickupTimeEstimateRequest() {
    }

    public PickupTimeEstimateRequest(Float startLatitude, Float startLongitude, String productId) {
        this.startLatitude = startLatitude;
        this.startLongitude = startLongitude;
        this.productId = productId;
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

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "PickupTimeEstimateRequest{" +
                "startLatitude=" + startLatitude +
                ", startLongitude=" + startLongitude +
                ", productId='" + productId + '\'' +
                '}';
    }
}
