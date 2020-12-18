package com.navettevatry.rem4u.common.resources.dto.olacab;

import java.io.Serializable;

public class Upfront implements Serializable {
    private Integer fare;
    private String fare_id;
    //TODO: verify this attribute
    private String select_discount;
    private Boolean is_upfront_applicable;

    public Upfront() {
    }

    public Upfront(Integer fare, String fare_id, String select_discount, Boolean is_upfront_applicable) {
        this.fare = fare;
        this.fare_id = fare_id;
        this.select_discount = select_discount;
        this.is_upfront_applicable = is_upfront_applicable;
    }

    public Integer getFare() {
        return fare;
    }

    public void setFare(Integer fare) {
        this.fare = fare;
    }

    public String getFare_id() {
        return fare_id;
    }

    public void setFare_id(String fare_id) {
        this.fare_id = fare_id;
    }

    public String getSelect_discount() {
        return select_discount;
    }

    public void setSelect_discount(String select_discount) {
        this.select_discount = select_discount;
    }

    public Boolean getIs_upfront_applicable() {
        return is_upfront_applicable;
    }

    public void setIs_upfront_applicable(Boolean is_upfront_applicable) {
        this.is_upfront_applicable = is_upfront_applicable;
    }

    @Override
    public String toString() {
        return "Upfront{" +
                "fare=" + fare +
                ", fare_id='" + fare_id + '\'' +
                ", select_discount='" + select_discount + '\'' +
                ", is_upfront_applicable=" + is_upfront_applicable +
                '}';
    }
}
