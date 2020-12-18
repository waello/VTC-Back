package com.navettevatry.rem4u.common.resources.dto.uber.updated;

import java.io.Serializable;

/**
 *
 * Created by Chakib Daii.
 */
public class ProductsRequest implements Serializable {
    private Float latitude;
    private Float longitude;

    public ProductsRequest() {
    }

    public ProductsRequest(Float latitude, Float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "ProductsRequest{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
