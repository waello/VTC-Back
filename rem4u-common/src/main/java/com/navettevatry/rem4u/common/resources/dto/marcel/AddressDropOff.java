package com.navettevatry.rem4u.common.resources.dto.marcel;

import com.fasterxml.jackson.annotation.*;

public class AddressDropOff {
    private double lat;
    private double addressDropOffLong;
    private String zipCode;
    private String name;
    private String complement;
    private String estimatedDatetime;

    @JsonProperty("lat")
    public double getLat() { return lat; }
    @JsonProperty("lat")
    public void setLat(double value) { this.lat = value; }

    @JsonProperty("long")
    public double getAddressDropOffLong() { return addressDropOffLong; }
    @JsonProperty("long")
    public void setAddressDropOffLong(double value) { this.addressDropOffLong = value; }

    @JsonProperty("zip_code")
    public String getZipCode() { return zipCode; }
    @JsonProperty("zip_code")
    public void setZipCode(String value) { this.zipCode = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("complement")
    public String getComplement() { return complement; }
    @JsonProperty("complement")
    public void setComplement(String value) { this.complement = value; }

    @JsonProperty("estimated_datetime")
    public String getEstimatedDatetime() { return estimatedDatetime; }
    @JsonProperty("estimated_datetime")
    public void setEstimatedDatetime(String value) { this.estimatedDatetime = value; }
}
