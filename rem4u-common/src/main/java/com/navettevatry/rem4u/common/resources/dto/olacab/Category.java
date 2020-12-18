package com.navettevatry.rem4u.common.resources.dto.olacab;

import java.io.Serializable;
import java.util.List;

/**
 *
 * Created by Wael Jlassi.
 * Updated by Chakib Daii.
 */

public class Category implements Serializable {
    private String id;
    private String display_name;
    private String currency;
    private String distance_unit;
    private String time_unit;
    private Integer eta;
    private String distance;
    private String ride_later_enabled;
    private String image;
    private List<Integer> hotspot_pickup_points;
    private CancellationPolicy cancellation_policy;
    private List<FareBreakup> fare_breakup;
    private List<AllCab> all_cabs;

    public Category() {
    }


    public Category(String id, String display_name, String currency, String distance_unit, String time_unit, Integer eta,
                    String distance, String ride_later_enabled, String image, List<Integer> hotspot_pickup_points,
                    CancellationPolicy cancellation_policy, List<FareBreakup> fare_breakup, List<AllCab> all_cabs) {
        this.id = id;
        this.display_name = display_name;
        this.currency = currency;
        this.distance_unit = distance_unit;
        this.time_unit = time_unit;
        this.eta = eta;
        this.distance = distance;
        this.ride_later_enabled = ride_later_enabled;
        this.image = image;
        this.hotspot_pickup_points = hotspot_pickup_points;
        this.cancellation_policy = cancellation_policy;
        this.fare_breakup = fare_breakup;
        this.all_cabs = all_cabs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDistance_unit() {
        return distance_unit;
    }

    public void setDistance_unit(String distance_unit) {
        this.distance_unit = distance_unit;
    }

    public String getTime_unit() {
        return time_unit;
    }

    public void setTime_unit(String time_unit) {
        this.time_unit = time_unit;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getRide_later_enabled() {
        return ride_later_enabled;
    }

    public void setRide_later_enabled(String ride_later_enabled) {
        this.ride_later_enabled = ride_later_enabled;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Integer> getHotspot_pickup_points() {
        return hotspot_pickup_points;
    }

    public void setHotspot_pickup_points(List<Integer> hotspot_pickup_points) {
        this.hotspot_pickup_points = hotspot_pickup_points;
    }

    public CancellationPolicy getCancellation_policy() {
        return cancellation_policy;
    }

    public void setCancellation_policy(CancellationPolicy cancellation_policy) {
        this.cancellation_policy = cancellation_policy;
    }

    public List<FareBreakup> getFare_breakup() {
        return fare_breakup;
    }

    public void setFare_breakup(List<FareBreakup> fare_breakup) {
        this.fare_breakup = fare_breakup;
    }

    public List<AllCab> getAll_cabs() {
        return all_cabs;
    }

    public void setAll_cabs(List<AllCab> all_cabs) {
        this.all_cabs = all_cabs;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id='" + id + '\'' +
                ", display_name='" + display_name + '\'' +
                ", currency='" + currency + '\'' +
                ", distance_unit='" + distance_unit + '\'' +
                ", time_unit='" + time_unit + '\'' +
                ", eta=" + eta +
                ", distance='" + distance + '\'' +
                ", ride_later_enabled='" + ride_later_enabled + '\'' +
                ", image='" + image + '\'' +
                ", hotspot_pickup_points=" + hotspot_pickup_points +
                ", cancellation_policy=" + cancellation_policy +
                ", fare_breakup=" + fare_breakup +
                ", all_cabs=" + all_cabs +
                '}';
    }
}
