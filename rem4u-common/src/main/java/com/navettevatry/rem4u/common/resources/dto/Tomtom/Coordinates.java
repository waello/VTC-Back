package com.navettevatry.rem4u.common.resources.dto.Tomtom;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Coordinates {
    private List<Coordinate> coordinate;

    @JsonProperty("coordinate")
    public List<Coordinate> getCoordinate() { return coordinate; }
    @JsonProperty("coordinate")
    public void setCoordinate(List<Coordinate> value) { this.coordinate = value; }

    @Override
    public String toString() {
        return "Coordinates{" +
                "coordinate=" + coordinate +
                '}';
    }
}
