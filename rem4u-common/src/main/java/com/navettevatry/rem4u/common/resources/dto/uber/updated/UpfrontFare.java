package com.navettevatry.rem4u.common.resources.dto.uber.updated;

import java.util.List;
import java.util.UUID;

public class UpfrontFare {
    private long capacity;
    private String currencyCode;
    private double destinationLat;
    private double destinationLng;
    private String fare;
    private double originLat;
    private double originLng;
    private Signature signature;
    private long vehicleViewID;
    private UUID uuid;
    private DynamicFareInfo dynamicFareInfo;
    private long surgeMultiplier;
    private List<Object> viaLocations;

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long value) {
        this.capacity = value;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    public double getDestinationLat() {
        return destinationLat;
    }

    public void setDestinationLat(double value) {
        this.destinationLat = value;
    }

    public double getDestinationLng() {
        return destinationLng;
    }

    public void setDestinationLng(double value) {
        this.destinationLng = value;
    }

    public String getFare() {
        return fare;
    }

    public void setFare(String value) {
        this.fare = value;
    }

    public double getOriginLat() {
        return originLat;
    }

    public void setOriginLat(double value) {
        this.originLat = value;
    }

    public double getOriginLng() {
        return originLng;
    }

    public void setOriginLng(double value) {
        this.originLng = value;
    }

    public Signature getSignature() {
        return signature;
    }

    public void setSignature(Signature value) {
        this.signature = value;
    }

    public long getVehicleViewID() {
        return vehicleViewID;
    }

    public void setVehicleViewID(long value) {
        this.vehicleViewID = value;
    }

    public UUID getUUID() {
        return uuid;
    }

    public void setUUID(UUID value) {
        this.uuid = value;
    }

    public DynamicFareInfo getDynamicFareInfo() {
        return dynamicFareInfo;
    }

    public void setDynamicFareInfo(DynamicFareInfo value) {
        this.dynamicFareInfo = value;
    }

    public long getSurgeMultiplier() {
        return surgeMultiplier;
    }

    public void setSurgeMultiplier(long value) {
        this.surgeMultiplier = value;
    }

    public List<Object> getViaLocations() {
        return viaLocations;
    }

    public void setViaLocations(List<Object> value) {
        this.viaLocations = value;
    }

    @Override
    public String toString() {
        return "UpfrontFare{" +
                "capacity=" + capacity +
                ", currencyCode='" + currencyCode + '\'' +
                ", destinationLat=" + destinationLat +
                ", destinationLng=" + destinationLng +
                ", fare='" + fare + '\'' +
                ", originLat=" + originLat +
                ", originLng=" + originLng +
                ", signature=" + signature +
                ", vehicleViewID=" + vehicleViewID +
                ", uuid=" + uuid +
                ", dynamicFareInfo=" + dynamicFareInfo +
                ", surgeMultiplier=" + surgeMultiplier +
                ", viaLocations=" + viaLocations +
                '}';
    }
}
