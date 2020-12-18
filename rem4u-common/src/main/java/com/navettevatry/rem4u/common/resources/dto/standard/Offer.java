package com.navettevatry.rem4u.common.resources.dto.standard;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.navettevatry.rem4u.common.resources.enumeration.standard.VTCPlatformName;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * Created by Chakib Daii.
 */
public class Offer implements Serializable{
    private VTCPlatformName platformVTC;
    private Driver driver;
    private Vehicle vehicle;
    private Price price;
    private Integer waitingTime;
    private VTCLocation VTCProvidedDepartureLocation;
    private VTCLocation VTCProvidedArrivalLocation;
    private Float VTCProvidedEstimatedDistance; /*distance in km*/
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private Integer VTCProvidedEstimatedTime; /*Time in min*/

    public Offer() {
    }


    public Offer(VTCPlatformName platformVTC, Driver driver, Vehicle vehicle, Price price, Integer waitingTime) {
        this.platformVTC = platformVTC;
        this.driver = driver;
        this.vehicle = vehicle;
        this.price = price;
        this.waitingTime = waitingTime;
    }

    public Offer(VTCPlatformName platformVTC, Driver driver, Vehicle vehicle, Price price, Integer waitingTime, VTCLocation VTCProvidedDepartureLocation, VTCLocation VTCProvidedArrivalLocation, Float VTCProvidedEstimatedDistance, Integer VTCProvidedEstimatedTime) {
        this.platformVTC = platformVTC;
        this.driver = driver;
        this.vehicle = vehicle;
        this.price = price;
        this.waitingTime = waitingTime;
        this.VTCProvidedDepartureLocation = VTCProvidedDepartureLocation;
        this.VTCProvidedArrivalLocation = VTCProvidedArrivalLocation;
        this.VTCProvidedEstimatedDistance = VTCProvidedEstimatedDistance;
        this.VTCProvidedEstimatedTime = VTCProvidedEstimatedTime;
    }

    public VTCPlatformName getPlatformVTC() {
        return platformVTC;
    }

    public void setPlatformVTC(VTCPlatformName platformVTC) {
        this.platformVTC = platformVTC;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Integer getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(Integer waitingTime) {
        this.waitingTime = waitingTime;
    }

    public VTCLocation getVTCProvidedDepartureLocation() {
        return VTCProvidedDepartureLocation;
    }

    public void setVTCProvidedDepartureLocation(VTCLocation VTCProvidedDepartureLocation) {
        this.VTCProvidedDepartureLocation = VTCProvidedDepartureLocation;
    }

    public VTCLocation getVTCProvidedArrivalLocation() {
        return VTCProvidedArrivalLocation;
    }

    public void setVTCProvidedArrivalLocation(VTCLocation VTCProvidedArrivalLocation) {
        this.VTCProvidedArrivalLocation = VTCProvidedArrivalLocation;
    }

    public Float getVTCProvidedEstimatedDistance() {
        return VTCProvidedEstimatedDistance;
    }

    public void setVTCProvidedEstimatedDistance(Float VTCProvidedEstimatedDistance) {
        this.VTCProvidedEstimatedDistance = VTCProvidedEstimatedDistance;
    }

    public Integer getVTCProvidedEstimatedTime() {
        return VTCProvidedEstimatedTime;
    }

    public void setVTCProvidedEstimatedTime(Integer VTCProvidedEstimatedTime) {
        this.VTCProvidedEstimatedTime = VTCProvidedEstimatedTime;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "platformVTC=" + platformVTC +
                ", driver=" + driver +
                ", vehicle=" + vehicle +
                ", price=" + price +
                ", waitingTime=" + waitingTime +
                ", VTCProvidedDepartureLocation=" + VTCProvidedDepartureLocation +
                ", VTCProvidedArrivalLocation=" + VTCProvidedArrivalLocation +
                ", VTCProvidedEstimatedDistance=" + VTCProvidedEstimatedDistance +
                ", VTCProvidedEstimatedTime=" + VTCProvidedEstimatedTime +
                '}';
    }
}
