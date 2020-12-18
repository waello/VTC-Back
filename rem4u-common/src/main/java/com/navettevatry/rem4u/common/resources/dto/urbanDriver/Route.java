package com.navettevatry.rem4u.common.resources.dto.urbanDriver;

public class Route {
    private AddressDropOff address;
    private String estimatedDatetime;
    private AddressDropOff operationalAddress;
    private boolean station;
    private TimeSlot timeSlot;
    private String type;

    public AddressDropOff getAddress() {
        return address;
    }

    public void setAddress(AddressDropOff value) {
        this.address = value;
    }

    public String getEstimatedDatetime() {
        return estimatedDatetime;
    }

    public void setEstimatedDatetime(String value) {
        this.estimatedDatetime = value;
    }

    public AddressDropOff getOperationalAddress() {
        return operationalAddress;
    }

    public void setOperationalAddress(AddressDropOff value) {
        this.operationalAddress = value;
    }

    public boolean getStation() {
        return station;
    }

    public void setStation(boolean value) {
        this.station = value;
    }

    public TimeSlot getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(TimeSlot value) {
        this.timeSlot = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }
}
