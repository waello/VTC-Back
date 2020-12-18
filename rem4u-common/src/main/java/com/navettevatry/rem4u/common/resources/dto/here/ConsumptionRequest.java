package com.navettevatry.rem4u.common.resources.dto.here;

import java.util.List;

/**
 *
 * Created by Chakib DAII
 */
public class ConsumptionRequest {
    private Location origin;
    private String transportMode;
    private Location destination;
    private String returnn;
    private List<? extends Number> freeFlowSpeedTable;//int,float,int,float
    private List<? extends Number> trafficSpeedTable;//int,float,int,float
    private Float auxiliaryConsumption;
    private Float ascent;
    private Float descent;

    public ConsumptionRequest() {
    }

    public ConsumptionRequest(Location origin, String transportMode, Location destination, String returnn,
                              List<? extends Number>freeFlowSpeedTable, List<? extends Number> trafficSpeedTable, Float auxiliaryConsumption, Float ascent, Float descent) {
        this.origin = origin;
        this.transportMode = transportMode;
        this.destination = destination;
        this.returnn = returnn;
        this.freeFlowSpeedTable = freeFlowSpeedTable;
        this.trafficSpeedTable = trafficSpeedTable;
        this.auxiliaryConsumption = auxiliaryConsumption;
        this.ascent = ascent;
        this.descent = descent;
    }

    public Location getOrigin() {
        return origin;
    }

    public void setOrigin(Location origin) {
        this.origin = origin;
    }

    public String getTransportMode() {
        return transportMode;
    }

    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode;
    }

    public Location getDestination() {
        return destination;
    }

    public void setDestination(Location destination) {
        this.destination = destination;
    }

    public String getReturnn() {
        return returnn;
    }

    public void setReturnn(String returnn) {
        this.returnn = returnn;
    }

    public List<? extends Number> getFreeFlowSpeedTable() {
        return freeFlowSpeedTable;
    }

    public void setFreeFlowSpeedTable(List<? extends Number> freeFlowSpeedTable) {
        this.freeFlowSpeedTable = freeFlowSpeedTable;
    }

    public List<? extends Number> getTrafficSpeedTable() {
        return trafficSpeedTable;
    }

    public void setTrafficSpeedTable(List<? extends Number> trafficSpeedTable) {
        this.trafficSpeedTable = trafficSpeedTable;
    }

    public Float getAuxiliaryConsumption() {
        return auxiliaryConsumption;
    }

    public void setAuxiliaryConsumption(Float auxiliaryConsumption) {
        this.auxiliaryConsumption = auxiliaryConsumption;
    }

    public Float getAscent() {
        return ascent;
    }

    public void setAscent(Float ascent) {
        this.ascent = ascent;
    }

    public Float getDescent() {
        return descent;
    }

    public void setDescent(Float descent) {
        this.descent = descent;
    }

    @Override
    public String toString() {
        return "ConsumptionRequest{" +
                "origin=" + origin +
                ", transportMode='" + transportMode + '\'' +
                ", destination=" + destination +
                ", returnn='" + returnn + '\'' +
                ", freeFlowSpeedTable=" + freeFlowSpeedTable +
                ", trafficSpeedTable=" + trafficSpeedTable +
                ", auxiliaryConsumption=" + auxiliaryConsumption +
                ", ascent=" + ascent +
                ", descent=" + descent +
                '}';
    }
}
