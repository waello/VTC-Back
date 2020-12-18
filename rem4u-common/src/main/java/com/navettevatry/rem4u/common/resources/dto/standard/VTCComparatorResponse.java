package com.navettevatry.rem4u.common.resources.dto.standard;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

/**
 *
 * Created by Chakib Daii.
 */
public class VTCComparatorResponse implements Serializable {
    private VTCLocation departureLocation;
    private VTCLocation arrivalLocation;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private Date date;
    private Float estimatedDistance; /*distance in km*/
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private Integer estimatedTime; /*Time in min*/
    private List<Offer> offers;

    public VTCComparatorResponse() {
    }

    public VTCComparatorResponse(VTCLocation departureLocation, VTCLocation arrivalLocation, Date date,
                                 Float estimatedDistance, Integer estimatedTime, List<Offer> offers) {
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
        this.date = date;
        this.estimatedDistance = estimatedDistance;
        this.estimatedTime = estimatedTime;
        this.offers = offers;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getEstimatedDistance() {
        return estimatedDistance;
    }

    public void setEstimatedDistance(Float estimatedDistance) {
        this.estimatedDistance = estimatedDistance;
    }

    public Integer getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(Integer estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public List<Offer> getOffers() {
        return offers;
    }

    public void setOffers(List<Offer> offers) {
        this.offers = offers;
    }

    @Override
    public String toString() {
        return "VTCComparatorResponse{" +
                "departureLocation=" + departureLocation +
                ", arrivalLocation=" + arrivalLocation +
                ", date=" + date +
                ", estimatedDistance=" + estimatedDistance +
                ", estimatedTime=" + estimatedTime +
                ", offers=" + offers +
                '}';
    }
}
