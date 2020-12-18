package com.navettevatry.rem4u.common.resources.dto.allocab;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * Created by Ahmed Ferjani.
 * Updated By Chakib DAII
 */
public class Trip implements Serializable {
    /* plain text addresses, ideally ‘street number, street name zip code city, country’, IATA (for airports) codes are also accepted */
    private String pickUpAddress ;

    /* same as pickUpAddress */
    private String dropOffAddress ;

    /* date and time of departure, format yyyy-MM-ddTHH:mm:ss.sssZ */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private Date departureAt ;

    /* (optional) can be SEDAN, VAN or MOTO */
    private String vehicleType ;

    /* (optional) a string that you can pass to store on the trip a custom reference, this reference will be returned on trip creation/confirmation and get */
    private String thirdPartReference ;

    public Trip() {
    }

    public Trip(String pickUpAddress, String dropOffAddress, Date departureAt, String vehicleType, String thirdPartReference) {
        this.pickUpAddress = pickUpAddress;
        this.dropOffAddress = dropOffAddress;
        this.departureAt = departureAt;
        this.vehicleType = vehicleType;
        this.thirdPartReference = thirdPartReference;
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

    @Override
    public String toString() {
        return "Trip{" +
                "pickUpAddress='" + pickUpAddress + '\'' +
                ", dropOffAddress='" + dropOffAddress + '\'' +
                ", departureAt='" + departureAt + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", thirdPartReference='" + thirdPartReference + '\'' +
                '}';
    }
}
