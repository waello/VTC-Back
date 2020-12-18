package com.navettevatry.rem4u.common.resources.dto.allocab;

import java.io.Serializable;

/**
 *
 * Created by Ahmed Ferjani.
 */
/*
https://docs.google.com/document/d/1bsKsbCrrmoa4T8g9EgBfcXCW4jPtpxmE5uSDrVE0PRc/edit#
 */
public class TripCreateRequest implements Serializable {
    private Access access ;
    private Trip trip ;

    public TripCreateRequest(Access access, Trip trip) {
        this.access = access;
        this.trip = trip;
    }

    public TripCreateRequest() {
    }

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    @Override
    public String toString() {
        return "TripCreateRequest{" +
                "access=" + access +
                ", trip=" + trip +
                '}';
    }
}
