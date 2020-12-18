package com.navettevatry.rem4u.common.resources.dto.lecab;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;
/**
 *
 * Created by Chakib Daii.
 */
public class JobsEstimateResponse implements Serializable {
    private LocationResponse pickup;
    private List<LocationResponse> stops; /*Intermediate stops between pick up and drop off*/
    private LocationResponse drop;
    @Max(9999)
    private Float price_net; /*maximum: 9999, net price (in Euro)*/
    @Max(9999)
    private Float price; /*maximum: 9999, price (in Euro)*/
    private Integer duration_min; /*duration (in minutes)*/
    private Integer duration_max;/*duration (in minutes)*/
    private Integer delay;/*duration (in minutes)*/
    private String estimate_id;/*Unique identifier*/
    @Size(max = 1024)
    private String universallink; /*Universal link url*/

    public JobsEstimateResponse() {
    }

    public JobsEstimateResponse(LocationResponse pickup, List<LocationResponse> stops, LocationResponse drop,
                                @Max(9999) Float price_net, @Max(9999) Float price, Integer duration_min,
                                Integer duration_max, Integer delay, String estimate_id,
                                @Size(max = 1024) String universallink) {
        this.pickup = pickup;
        this.stops = stops;
        this.drop = drop;
        this.price_net = price_net;
        this.price = price;
        this.duration_min = duration_min;
        this.duration_max = duration_max;
        this.delay = delay;
        this.estimate_id = estimate_id;
        this.universallink = universallink;
    }

    public LocationResponse getPickup() {
        return pickup;
    }

    public void setPickup(LocationResponse pickup) {
        this.pickup = pickup;
    }

    public List<LocationResponse> getStops() {
        return stops;
    }

    public void setStops(List<LocationResponse> stops) {
        this.stops = stops;
    }

    public LocationResponse getDrop() {
        return drop;
    }

    public void setDrop(LocationResponse drop) {
        this.drop = drop;
    }

    public Float getPrice_net() {
        return price_net;
    }

    public void setPrice_net(Float price_net) {
        this.price_net = price_net;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getDuration_min() {
        return duration_min;
    }

    public void setDuration_min(Integer duration_min) {
        this.duration_min = duration_min;
    }

    public Integer getDuration_max() {
        return duration_max;
    }

    public void setDuration_max(Integer duration_max) {
        this.duration_max = duration_max;
    }

    public Integer getDelay() {
        return delay;
    }

    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    public String getEstimate_id() {
        return estimate_id;
    }

    public void setEstimate_id(String estimate_id) {
        this.estimate_id = estimate_id;
    }

    public String getUniversallink() {
        return universallink;
    }

    public void setUniversallink(String universallink) {
        this.universallink = universallink;
    }

    @Override
    public String toString() {
        return "JobsEstimateResponse{" +
                "pickup=" + pickup +
                ", stops=" + stops +
                ", drop=" + drop +
                ", price_net=" + price_net +
                ", price=" + price +
                ", duration_min=" + duration_min +
                ", duration_max=" + duration_max +
                ", delay=" + delay +
                ", estimate_id='" + estimate_id + '\'' +
                ", universallink='" + universallink + '\'' +
                '}';
    }
}
