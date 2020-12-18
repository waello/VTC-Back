package com.navettevatry.rem4u.common.resources.dto.Tomtom;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FlowSegmentData {
    private String frc;
    private long currentSpeed;
    private long freeFlowSpeed;
    private long currentTravelTime;
    private long freeFlowTravelTime;
    private double confidence;
    private boolean roadClosure;
    private Coordinates coordinates;
    private String version;

    @JsonProperty("frc")
    public String getFrc() { return frc; }
    @JsonProperty("frc")
    public void setFrc(String value) { this.frc = value; }

    @JsonProperty("currentSpeed")
    public long getCurrentSpeed() { return currentSpeed; }
    @JsonProperty("currentSpeed")
    public void setCurrentSpeed(long value) { this.currentSpeed = value; }

    @JsonProperty("freeFlowSpeed")
    public long getFreeFlowSpeed() { return freeFlowSpeed; }
    @JsonProperty("freeFlowSpeed")
    public void setFreeFlowSpeed(long value) { this.freeFlowSpeed = value; }

    @JsonProperty("currentTravelTime")
    public long getCurrentTravelTime() { return currentTravelTime; }
    @JsonProperty("currentTravelTime")
    public void setCurrentTravelTime(long value) { this.currentTravelTime = value; }

    @JsonProperty("freeFlowTravelTime")
    public long getFreeFlowTravelTime() { return freeFlowTravelTime; }
    @JsonProperty("freeFlowTravelTime")
    public void setFreeFlowTravelTime(long value) { this.freeFlowTravelTime = value; }

    @JsonProperty("confidence")
    public double getConfidence() { return confidence; }
    @JsonProperty("confidence")
    public void setConfidence(double value) { this.confidence = value; }

    @JsonProperty("roadClosure")
    public boolean getRoadClosure() { return roadClosure; }
    @JsonProperty("roadClosure")
    public void setRoadClosure(boolean value) { this.roadClosure = value; }

    @JsonProperty("coordinates")
    public Coordinates getCoordinates() { return coordinates; }
    @JsonProperty("coordinates")
    public void setCoordinates(Coordinates value) { this.coordinates = value; }

    @JsonProperty("@version")
    public String getVersion() { return version; }
    @JsonProperty("@version")
    public void setVersion(String value) { this.version = value; }

    @Override
    public String toString() {
        return "FlowSegmentData{" +
                "frc='" + frc + '\'' +
                ", currentSpeed=" + currentSpeed +
                ", freeFlowSpeed=" + freeFlowSpeed +
                ", currentTravelTime=" + currentTravelTime +
                ", freeFlowTravelTime=" + freeFlowTravelTime +
                ", confidence=" + confidence +
                ", roadClosure=" + roadClosure +
                ", coordinates=" + coordinates +
                ", version='" + version + '\'' +
                '}';
    }
}
