package com.navettevatry.rem4u.common.resources.dto.here;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 *
 * Created by Ala Hadj Brahim & Ichrak Ben Abdallah.
 * Updated by Chakib DAII
 */
public class PlaceLocation {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date time;
    private Place place;

    public PlaceLocation(){

    }

    public PlaceLocation(Date time, Place place) {
        this.time = time;
        this.place = place;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "PlaceLocation{" +
                "time=" + time +
                ", place=" + place +
                '}';
    }
}
