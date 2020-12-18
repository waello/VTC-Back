package com.navettevatry.rem4u.common.resources.dto.lecab.updated.estimate;

public class Drop {
    private Object id;
    private double latitude;
    private double longitude;
    private String address;
    private String type;
    private Object subtype;
    private String name;
    private Object parentID;
    private Object suggestion;
    private Object waitingTime;
    private Object waitingTimeAmount;
    private Object waitingTimeAmountTax;

    public Object getID() {
        return id;
    }

    public void setID(Object value) {
        this.id = value;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double value) {
        this.latitude = value;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double value) {
        this.longitude = value;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String value) {
        this.address = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public Object getSubtype() {
        return subtype;
    }

    public void setSubtype(Object value) {
        this.subtype = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public Object getParentID() {
        return parentID;
    }

    public void setParentID(Object value) {
        this.parentID = value;
    }

    public Object getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(Object value) {
        this.suggestion = value;
    }

    public Object getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(Object value) {
        this.waitingTime = value;
    }

    public Object getWaitingTimeAmount() {
        return waitingTimeAmount;
    }

    public void setWaitingTimeAmount(Object value) {
        this.waitingTimeAmount = value;
    }

    public Object getWaitingTimeAmountTax() {
        return waitingTimeAmountTax;
    }

    public void setWaitingTimeAmountTax(Object value) {
        this.waitingTimeAmountTax = value;
    }
}
