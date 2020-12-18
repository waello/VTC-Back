package com.navettevatry.rem4u.common.resources.dto.olacab;

import java.io.Serializable;

/**
 *
 * Created by Wael Jlassi.
 * Updated by Chakib Daii.
 */

public class CancellationPolicy implements Serializable {
    private Integer cancellation_charge;
    private String currency;
    private Integer cancellation_charge_applies_after_time;
    private String time_unit;

    public CancellationPolicy() {
    }

    public CancellationPolicy(Integer cancellation_charge, String currency, Integer cancellation_charge_applies_after_time, String time_unit) {
        this.cancellation_charge = cancellation_charge;
        this.currency = currency;
        this.cancellation_charge_applies_after_time = cancellation_charge_applies_after_time;
        this.time_unit = time_unit;
    }

    public Integer getCancellation_charge() {
        return cancellation_charge;
    }

    public void setCancellation_charge(Integer cancellation_charge) {
        this.cancellation_charge = cancellation_charge;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getCancellation_charge_applies_after_time() {
        return cancellation_charge_applies_after_time;
    }

    public void setCancellation_charge_applies_after_time(Integer cancellation_charge_applies_after_time) {
        this.cancellation_charge_applies_after_time = cancellation_charge_applies_after_time;
    }

    public String getTime_unit() {
        return time_unit;
    }

    public void setTime_unit(String time_unit) {
        this.time_unit = time_unit;
    }

    @Override
    public String toString() {
        return "CancellationPolicy{" +
                "cancellation_charge=" + cancellation_charge +
                ", currency='" + currency + '\'' +
                ", cancellation_charge_applies_after_time=" + cancellation_charge_applies_after_time +
                ", time_unit='" + time_unit + '\'' +
                '}';
    }
}
