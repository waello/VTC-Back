package com.navettevatry.rem4u.common.resources.dto.here;

/**
 *
 * Created by Ala Hadj Brahim & Ichrak Ben Abdallah.
 * Updated by Chakib DAII
 */

public class WeatherRequest {
    private String product ;
    private String name;

    public WeatherRequest() {
    }

    public WeatherRequest(String product, String name) {
        this.product = product;
        this.name = name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "WeatherRequest{" +
                "product='" + product + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
