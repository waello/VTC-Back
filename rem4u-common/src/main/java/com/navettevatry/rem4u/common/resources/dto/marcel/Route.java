package com.navettevatry.rem4u.common.resources.dto.marcel;

import com.fasterxml.jackson.annotation.*;

public class Route {
    private AddressDropOff address;
    private String estimatedDatetime;
    private AddressDropOff operationalAddress;
    private boolean station;
    private TimeSlot timeSlot;
    private String type;

    @JsonProperty("address")
    public AddressDropOff getAddress() { return address; }
    @JsonProperty("address")
    public void setAddress(AddressDropOff value) { this.address = value; }

    @JsonProperty("estimated_datetime")
    public String getEstimatedDatetime() { return estimatedDatetime; }
    @JsonProperty("estimated_datetime")
    public void setEstimatedDatetime(String value) { this.estimatedDatetime = value; }

    @JsonProperty("operational_address")
    public AddressDropOff getOperationalAddress() { return operationalAddress; }
    @JsonProperty("operational_address")
    public void setOperationalAddress(AddressDropOff value) { this.operationalAddress = value; }

    @JsonProperty("station")
    public boolean getStation() { return station; }
    @JsonProperty("station")
    public void setStation(boolean value) { this.station = value; }

    @JsonProperty("time_slot")
    public TimeSlot getTimeSlot() { return timeSlot; }
    @JsonProperty("time_slot")
    public void setTimeSlot(TimeSlot value) { this.timeSlot = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }
}
