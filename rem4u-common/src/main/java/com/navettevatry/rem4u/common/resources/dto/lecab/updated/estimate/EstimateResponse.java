// EstimateResponse.java

package com.navettevatry.rem4u.common.resources.dto.lecab.updated.estimate;

import java.util.List;
import java.util.UUID;

public class EstimateResponse {
    private Drop pickup;
    private List<Object> stops;
    private Drop drop;
    private String service;
    private double priceNet;
    private double price;
    private String payment;
    private long durationMin;
    private Object durationMax;
    private Object delay;
    private UUID estimateID;
    private Object discount;
    private String universallink;

    public Drop getPickup() { return pickup; }
    public void setPickup(Drop value) { this.pickup = value; }

    public List<Object> getStops() { return stops; }
    public void setStops(List<Object> value) { this.stops = value; }

    public Drop getDrop() { return drop; }
    public void setDrop(Drop value) { this.drop = value; }

    public String getService() { return service; }
    public void setService(String value) { this.service = value; }

    public double getPriceNet() { return priceNet; }
    public void setPriceNet(double value) { this.priceNet = value; }

    public double getPrice() { return price; }
    public void setPrice(double value) { this.price = value; }

    public String getPayment() { return payment; }
    public void setPayment(String value) { this.payment = value; }

    public long getDurationMin() { return durationMin; }
    public void setDurationMin(long value) { this.durationMin = value; }

    public Object getDurationMax() { return durationMax; }
    public void setDurationMax(Object value) { this.durationMax = value; }

    public Object getDelay() { return delay; }
    public void setDelay(Object value) { this.delay = value; }

    public UUID getEstimateID() { return estimateID; }
    public void setEstimateID(UUID value) { this.estimateID = value; }

    public Object getDiscount() { return discount; }
    public void setDiscount(Object value) { this.discount = value; }

    public String getUniversallink() { return universallink; }
    public void setUniversallink(String value) { this.universallink = value; }
}

// Drop.java


