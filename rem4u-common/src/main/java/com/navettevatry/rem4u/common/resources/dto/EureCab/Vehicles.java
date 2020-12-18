package com.navettevatry.rem4u.common.resources.dto.EureCab;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Vehicles implements Serializable {
    @JsonProperty("data")
    private List<VehiclesDatum> data;

    public Vehicles() {
    }

    public Vehicles(List<VehiclesDatum> data) {
        this.data = data;
    }

    public List<VehiclesDatum> getData() {
        return data;
    }

    public void setData(List<VehiclesDatum> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "data=" + data +
                '}';
    }
}