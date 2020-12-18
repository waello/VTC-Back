package com.navettevatry.rem4u.common.resources.dto.standard;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.navettevatry.rem4u.common.resources.enumeration.standard.TripType;

import java.io.Serializable;
import java.time.LocalTime;

/**
 *
 * Created by Chakib Daii.
 */
public class TripTypeDetails implements Serializable {
    private TripType tripType;
    //TODO: verif or change it
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
//    private LocalTime hour;
    private Integer hour;
    private String tripNumber;
    private String tripProvenance;
    private String tripClass;
    private String pickup;

    public TripTypeDetails() {
    }

//    public TripTypeDetails(TripType tripType, LocalTime hour, String tripNumber, String tripProvenance,
//                           String tripClass, String pickup) {
//        this.tripType = tripType;
//        this.hour = hour;
//        this.tripNumber = tripNumber;
//        this.tripProvenance = tripProvenance;
//        this.tripClass = tripClass;
//        this.pickup = pickup;
//    }


    public TripTypeDetails(TripType tripType, Integer hour, String tripNumber, String tripProvenance, String tripClass, String pickup) {
        this.tripType = tripType;
        this.hour = hour;
        this.tripNumber = tripNumber;
        this.tripProvenance = tripProvenance;
        this.tripClass = tripClass;
        this.pickup = pickup;
    }

    public TripType getTripType() {
        return tripType;
    }

    public void setTripType(TripType tripType) {
        this.tripType = tripType;
    }

//    public LocalTime getHour() {
//        return hour;
//    }
//
//    public void setHour(LocalTime hour) {
//        this.hour = hour;
//    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public String getTripNumber() {
        return tripNumber;
    }

    public void setTripNumber(String tripNumber) {
        this.tripNumber = tripNumber;
    }

    public String getTripProvenance() {
        return tripProvenance;
    }

    public void setTripProvenance(String tripProvenance) {
        this.tripProvenance = tripProvenance;
    }

    public String getTripClass() {
        return tripClass;
    }

    public void setTripClass(String tripClass) {
        this.tripClass = tripClass;
    }

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    @Override
    public String toString() {
        return "TripTypeDetails{" +
                "tripType=" + tripType +
                ", hour=" + hour +
                ", tripNumber=" + tripNumber +
                ", tripProvenance='" + tripProvenance + '\'' +
                ", tripClass='" + tripClass + '\'' +
                ", pickup='" + pickup + '\'' +
                '}';
    }
}
