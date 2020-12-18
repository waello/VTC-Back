package com.navettevatry.rem4u.common.resources.dto.bcvtc;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 *
 * Created by Chakib Daii.
 */
public class EstimationRequest implements Serializable {
    @JsonProperty("TripType")
    private Float tripType;
    @JsonProperty("Email")
    private String email;
    @JsonProperty("PickUp")
    private String pickUp;
    @JsonProperty("DropOff")
    private String dropOff;
    @JsonProperty("Hours")
    private Integer hours;
    @JsonProperty("Kms")
    private Integer kms;

    public EstimationRequest() {
    }

    public EstimationRequest(Float tripType, String email, String pickUp, String dropOff, Integer hours, Integer kms) {
        this.tripType = tripType;
        this.email = email;
        this.pickUp = pickUp;
        this.dropOff = dropOff;
        this.hours = hours;
        this.kms = kms;
    }

    public Float getTripType() {
        return tripType;
    }

    public void setTripType(Float tripType) {
        this.tripType = tripType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPickUp() {
        return pickUp;
    }

    public void setPickUp(String pickUp) {
        this.pickUp = pickUp;
    }

    public String getDropOff() {
        return dropOff;
    }

    public void setDropOff(String dropOff) {
        this.dropOff = dropOff;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Integer getKms() {
        return kms;
    }

    public void setKms(Integer kms) {
        this.kms = kms;
    }

    @Override
    public String toString() {
        return "EstimationRequest{" +
                "tripType=" + tripType +
                ", email='" + email + '\'' +
                ", pickUp='" + pickUp + '\'' +
                ", dropOff='" + dropOff + '\'' +
                ", hours=" + hours +
                ", kms=" + kms +
                '}';
    }
}
