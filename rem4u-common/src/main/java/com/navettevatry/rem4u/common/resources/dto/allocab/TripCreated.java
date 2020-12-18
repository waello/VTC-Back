package com.navettevatry.rem4u.common.resources.dto.allocab;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * Created by Ahmed Ferjani.
 */
/* this trip in within the TripCreateResponse */
public class TripCreated implements Serializable {
    private String id ;
    private String pickUpAddress ;
    private String dropOffAddress ;
    //TODO: Verify Shape
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Date departureAt ;
    private Float duration ;
    private Float distance ;
    private Float price ;
    private String state ;
    private String vehicleType ;
    private String thirdPartReference ;

    public TripCreated() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPickUpAddress() {
        return pickUpAddress;
    }

    public void setPickUpAddress(String pickUpAddress) {
        this.pickUpAddress = pickUpAddress;
    }

    public String getDropOffAddress() {
        return dropOffAddress;
    }

    public void setDropOffAddress(String dropOffAddress) {
        this.dropOffAddress = dropOffAddress;
    }

    public Date getDepartureAt() {
        return departureAt;
    }

    public void setDepartureAt(Date departureAt) {
        this.departureAt = departureAt;
    }

    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getThirdPartReference() {
        return thirdPartReference;
    }

    public void setThirdPartReference(String thirdPartReference) {
        this.thirdPartReference = thirdPartReference;
    }

    public TripCreated(String id, String pickUpAddress, String dropOffAddress, Date departureAt, Float duration, Float distance, Float price, String state, String vehicleType, String thirdPartReference) {
        this.id = id;
        this.pickUpAddress = pickUpAddress;
        this.dropOffAddress = dropOffAddress;
        this.departureAt = departureAt;
        this.duration = duration;
        this.distance = distance;
        this.price = price;
        this.state = state;
        this.vehicleType = vehicleType;
        this.thirdPartReference = thirdPartReference;
    }

    @Override
    public String toString() {
        return "TripCreated{" +
                "id='" + id + '\'' +
                ", pickUpAddress='" + pickUpAddress + '\'' +
                ", dropOffAddress='" + dropOffAddress + '\'' +
                ", departureAt='" + departureAt + '\'' +
                ", duration=" + duration +
                ", distance=" + distance +
                ", price=" + price +
                ", state='" + state + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", thirdPartReference='" + thirdPartReference + '\'' +
                '}';
    }
}
