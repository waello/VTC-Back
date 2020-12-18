package com.navettevatry.rem4u.common.resources.dto.lyft;

import java.io.Serializable;

/**
 *
 * Created by Chakib Daii.
 */
public class CostEstimatesRequest implements Serializable {
    private Double startLatitude;
    private Double startLongitude;
    private String rideType;
    private Double endLatitude;
    private Double endLongitude;

    public CostEstimatesRequest() {
    }

    public CostEstimatesRequest(Double startLatitude, Double startLongitude, String rideType,
                                Double endLatitude, Double endLongitude) {
        this.startLatitude = startLatitude;
        this.startLongitude = startLongitude;
        this.rideType = rideType;
        this.endLatitude = endLatitude;
        this.endLongitude = endLongitude;
    }

    public Double getStartLatitude() {
        return startLatitude;
    }

    public void setStartLatitude(Double startLatitude) {
        this.startLatitude = startLatitude;
    }

    public Double getStartLongitude() {
        return startLongitude;
    }

    public void setStartLongitude(Double startLongitude) {
        this.startLongitude = startLongitude;
    }

    public String getRideType() {
        return rideType;
    }

    public void setRideType(String rideType) {
        this.rideType = rideType;
    }

    public Double getEndLatitude() {
        return endLatitude;
    }

    public void setEndLatitude(Double endLatitude) {
        this.endLatitude = endLatitude;
    }

    public Double getEndLongitude() {
        return endLongitude;
    }

    public void setEndLongitude(Double endLongitude) {
        this.endLongitude = endLongitude;
    }

    @Override
    public String toString() {
        return "CostEstimatesRequest{" +
                "startLatitude=" + startLatitude +
                ", startLongitude=" + startLongitude +
                ", rideType='" + rideType + '\'' +
                ", endLatitude=" + endLatitude +
                ", endLongitude=" + endLongitude +
                '}';
    }
}
