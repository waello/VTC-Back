package com.navettevatry.rem4u.common.resources.dto.lecab.updated.price;

import java.util.UUID;

public class Address {
    private UUID addressID;
    private String caption;
    private double latitude;
    private double longitude;
    private String source;
    private Object data;
    private Object note;
    private Object fields;
    private Available available;

    public UUID getAddressID() {
        return addressID;
    }

    public void setAddressID(UUID value) {
        this.addressID = value;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String value) {
        this.caption = value;
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

    public String getSource() {
        return source;
    }

    public void setSource(String value) {
        this.source = value;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object value) {
        this.data = value;
    }

    public Object getNote() {
        return note;
    }

    public void setNote(Object value) {
        this.note = value;
    }

    public Object getFields() {
        return fields;
    }

    public void setFields(Object value) {
        this.fields = value;
    }

    public Available getAvailable() {
        return available;
    }

    public void setAvailable(Available value) {
        this.available = value;
    }
}
