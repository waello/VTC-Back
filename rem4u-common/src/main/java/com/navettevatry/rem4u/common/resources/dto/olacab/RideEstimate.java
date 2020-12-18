package com.navettevatry.rem4u.common.resources.dto.olacab;

import java.io.Serializable;
import java.util.List;

/**
 *
 * Created by Wael Jlassi.
 * Updated by Chakib Daii.
 */
public class RideEstimate implements Serializable {
    private String category;
    private Float distance;
    private Integer travel_time_in_minutes;
    private Integer amount_min;
    private Integer amount_max;
    private Integer booking_fee;
    private List<BookingFeeBreakup> booking_fee_breakup;
    private Taxes taxes;
    private HubCharges hub_charges;
    private Discounts discounts;
    private Upfront upfront;

    public RideEstimate() {
    }

    public RideEstimate(String category, Float distance, Integer travel_time_in_minutes, Integer amount_min, Integer amount_max, Integer booking_fee, List<BookingFeeBreakup> booking_fee_breakup, Taxes taxes, HubCharges hub_charges, Discounts discounts, Upfront upfront) {
        this.category = category;
        this.distance = distance;
        this.travel_time_in_minutes = travel_time_in_minutes;
        this.amount_min = amount_min;
        this.amount_max = amount_max;
        this.booking_fee = booking_fee;
        this.booking_fee_breakup = booking_fee_breakup;
        this.taxes = taxes;
        this.hub_charges = hub_charges;
        this.discounts = discounts;
        this.upfront = upfront;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public Integer getTravel_time_in_minutes() {
        return travel_time_in_minutes;
    }

    public void setTravel_time_in_minutes(Integer travel_time_in_minutes) {
        this.travel_time_in_minutes = travel_time_in_minutes;
    }

    public Integer getAmount_min() {
        return amount_min;
    }

    public void setAmount_min(Integer amount_min) {
        this.amount_min = amount_min;
    }

    public Integer getAmount_max() {
        return amount_max;
    }

    public void setAmount_max(Integer amount_max) {
        this.amount_max = amount_max;
    }

    public Integer getBooking_fee() {
        return booking_fee;
    }

    public void setBooking_fee(Integer booking_fee) {
        this.booking_fee = booking_fee;
    }

    public List<BookingFeeBreakup> getBooking_fee_breakup() {
        return booking_fee_breakup;
    }

    public void setBooking_fee_breakup(List<BookingFeeBreakup> booking_fee_breakup) {
        this.booking_fee_breakup = booking_fee_breakup;
    }

    public Taxes getTaxes() {
        return taxes;
    }

    public void setTaxes(Taxes taxes) {
        this.taxes = taxes;
    }

    public HubCharges getHub_charges() {
        return hub_charges;
    }

    public void setHub_charges(HubCharges hub_charges) {
        this.hub_charges = hub_charges;
    }

    public Discounts getDiscounts() {
        return discounts;
    }

    public void setDiscounts(Discounts discounts) {
        this.discounts = discounts;
    }

    public Upfront getUpfront() {
        return upfront;
    }

    public void setUpfront(Upfront upfront) {
        this.upfront = upfront;
    }

    @Override
    public String toString() {
        return "RideEstimate{" +
                "category='" + category + '\'' +
                ", distance=" + distance +
                ", travel_time_in_minutes=" + travel_time_in_minutes +
                ", amount_min=" + amount_min +
                ", amount_max=" + amount_max +
                ", booking_fee=" + booking_fee +
                ", booking_fee_breakup=" + booking_fee_breakup +
                ", taxes=" + taxes +
                ", hub_charges=" + hub_charges +
                ", discounts=" + discounts +
                ", upfront=" + upfront +
                '}';
    }
}