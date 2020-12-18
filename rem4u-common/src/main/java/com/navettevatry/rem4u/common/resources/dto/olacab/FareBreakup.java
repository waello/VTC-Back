package com.navettevatry.rem4u.common.resources.dto.olacab;

import java.io.Serializable;
import java.util.List;

/**
 *
 * Created by Wael Jlassi.
 * Updated by Chakib Daii.
 */

public class FareBreakup implements Serializable {
    private String type;
    private Integer minimum_distance;
    private Integer minimum_time;
    private Integer base_fare;
    private Integer minimum_fare;
    private Integer cost_per_distance;
    private Integer waiting_cost_per_minute;
    private Integer ride_cost_per_minute;
    private List<Object> surcharge;
    private Boolean rates_lower_than_usual;
    private Boolean rates_higher_than_usual;

    public FareBreakup() {
    }

    public FareBreakup(String type, Integer minimum_distance, Integer minimum_time, Integer base_fare, Integer minimum_fare,
                       Integer cost_per_distance, Integer waiting_cost_per_minute, Integer ride_cost_per_minute,
                       List<Object> surcharge, Boolean rates_lower_than_usual, Boolean rates_higher_than_usual) {
        this.type = type;
        this.minimum_distance = minimum_distance;
        this.minimum_time = minimum_time;
        this.base_fare = base_fare;
        this.minimum_fare = minimum_fare;
        this.cost_per_distance = cost_per_distance;
        this.waiting_cost_per_minute = waiting_cost_per_minute;
        this.ride_cost_per_minute = ride_cost_per_minute;
        this.surcharge = surcharge;
        this.rates_lower_than_usual = rates_lower_than_usual;
        this.rates_higher_than_usual = rates_higher_than_usual;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getMinimum_distance() {
        return minimum_distance;
    }

    public void setMinimum_distance(Integer minimum_distance) {
        this.minimum_distance = minimum_distance;
    }

    public Integer getMinimum_time() {
        return minimum_time;
    }

    public void setMinimum_time(Integer minimum_time) {
        this.minimum_time = minimum_time;
    }

    public Integer getBase_fare() {
        return base_fare;
    }

    public void setBase_fare(Integer base_fare) {
        this.base_fare = base_fare;
    }

    public Integer getMinimum_fare() {
        return minimum_fare;
    }

    public void setMinimum_fare(Integer minimum_fare) {
        this.minimum_fare = minimum_fare;
    }

    public Integer getCost_per_distance() {
        return cost_per_distance;
    }

    public void setCost_per_distance(Integer cost_per_distance) {
        this.cost_per_distance = cost_per_distance;
    }

    public Integer getWaiting_cost_per_minute() {
        return waiting_cost_per_minute;
    }

    public void setWaiting_cost_per_minute(Integer waiting_cost_per_minute) {
        this.waiting_cost_per_minute = waiting_cost_per_minute;
    }

    public Integer getRide_cost_per_minute() {
        return ride_cost_per_minute;
    }

    public void setRide_cost_per_minute(Integer ride_cost_per_minute) {
        this.ride_cost_per_minute = ride_cost_per_minute;
    }

    public List<Object> getSurcharge() {
        return surcharge;
    }

    public void setSurcharge(List<Object> surcharge) {
        this.surcharge = surcharge;
    }

    public Boolean isRates_lower_than_usual() {
        return rates_lower_than_usual;
    }

    public void setRates_lower_than_usual(Boolean rates_lower_than_usual) {
        this.rates_lower_than_usual = rates_lower_than_usual;
    }

    public Boolean isRates_higher_than_usual() {
        return rates_higher_than_usual;
    }

    public void setRates_higher_than_usual(Boolean rates_higher_than_usual) {
        this.rates_higher_than_usual = rates_higher_than_usual;
    }

    @Override
    public String toString() {
        return "FareBreakup{" +
                "type='" + type + '\'' +
                ", minimum_distance=" + minimum_distance +
                ", minimum_time=" + minimum_time +
                ", base_fare=" + base_fare +
                ", minimum_fare=" + minimum_fare +
                ", cost_per_distance=" + cost_per_distance +
                ", waiting_cost_per_minute=" + waiting_cost_per_minute +
                ", ride_cost_per_minute=" + ride_cost_per_minute +
                ", surcharge=" + surcharge +
                ", rates_lower_than_usual=" + rates_lower_than_usual +
                ", rates_higher_than_usual=" + rates_higher_than_usual +
                '}';
    }
}
