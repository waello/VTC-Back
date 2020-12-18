package com.navettevatry.rem4u.common.resources.dto.standard;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * Created by Chakib Daii.
 */
public class VTCComparatorRequest implements Serializable {
    private Boolean goingsComings;
    private VTCLocation departureLocation;
    private VTCLocation arrivalLocation;
    private Boolean isImmediate;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private Date date;
    private Passengers passengers;
    private TripTypeDetails tripType;
    private TripOptions tripOptions;

    public VTCComparatorRequest() {
    }

    public VTCComparatorRequest(Boolean goingsComings, VTCLocation departureLocation, VTCLocation arrivalLocation,
                                Boolean isImmediate, Date date, Passengers passengers, TripTypeDetails tripType,
                                TripOptions tripOptions) {
        this.goingsComings = goingsComings;
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
        this.isImmediate = isImmediate;
        this.date = date;
        this.passengers = passengers;
        this.tripType = tripType;
        this.tripOptions = tripOptions;
    }

    public Boolean getGoingsComings() {
        return goingsComings;
    }

    public void setGoingsComings(Boolean goingsComings) {
        this.goingsComings = goingsComings;
    }

    public VTCLocation getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(VTCLocation departureLocation) {
        this.departureLocation = departureLocation;
    }

    public VTCLocation getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(VTCLocation arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public Boolean getImmediate() {
        return isImmediate;
    }

    public void setImmediate(Boolean immediate) {
        isImmediate = immediate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Passengers getPassengers() {
        return passengers;
    }

    public void setPassengers(Passengers passengers) {
        this.passengers = passengers;
    }

    public TripTypeDetails getTripType() {
        return tripType;
    }

    public void setTripType(TripTypeDetails tripType) {
        this.tripType = tripType;
    }

    public TripOptions getTripOptions() {
        return tripOptions;
    }

    public void setTripOptions(TripOptions tripOptions) {
        this.tripOptions = tripOptions;
    }

    @Override
    public String toString() {
        return "VTCComparatorRequest{" +
                "goingsComings=" + goingsComings +
                ", departureLocation=" + departureLocation +
                ", arrivalLocation=" + arrivalLocation +
                ", isImmediate=" + isImmediate +
                ", date=" + date +
                ", passengers=" + passengers +
                ", tripType=" + tripType +
                ", tripOptions=" + tripOptions +
                '}';
    }
}
