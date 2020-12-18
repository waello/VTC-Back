package com.navettevatry.rem4u.common.resources.dto.olacab;

import java.io.Serializable;

/**
 *
 * Created by Wael Jlassi.
 * Updated by Chakib Daii.
 */

public class HubCharges implements Serializable {
    private Integer total_hub_fee;
    private Integer pickup_hub_fee;
    private String pickup_hub_name;

    public HubCharges() {
    }

    public HubCharges(Integer total_hub_fee, Integer pickup_hub_fee, String pickup_hub_name) {
        this.total_hub_fee = total_hub_fee;
        this.pickup_hub_fee = pickup_hub_fee;
        this.pickup_hub_name = pickup_hub_name;
    }

    public Integer getTotal_hub_fee() {
        return total_hub_fee;
    }

    public void setTotal_hub_fee(Integer total_hub_fee) {
        this.total_hub_fee = total_hub_fee;
    }

    public Integer getPickup_hub_fee() {
        return pickup_hub_fee;
    }

    public void setPickup_hub_fee(Integer pickup_hub_fee) {
        this.pickup_hub_fee = pickup_hub_fee;
    }

    public String getPickup_hub_name() {
        return pickup_hub_name;
    }

    public void setPickup_hub_name(String pickup_hub_name) {
        this.pickup_hub_name = pickup_hub_name;
    }

    @Override
    public String toString() {
        return "HubCharges{" +
                "total_hub_fee=" + total_hub_fee +
                ", pickup_hub_fee=" + pickup_hub_fee +
                ", pickup_hub_name='" + pickup_hub_name + '\'' +
                '}';
    }
}
