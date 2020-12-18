package com.navettevatry.rem4u.common.resources.dto.EureCab;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Vehicle implements Serializable {
    @JsonProperty("type")
    private Long type;
    @JsonProperty("type_label")
    private TypeL typeLabel;
    @JsonProperty("model")
    private String model;
    @JsonProperty("luggage")
    private Long luggage;
    @JsonProperty("passenger")
    private Long passenger;

    public Vehicle() {
    }

    public Vehicle(Long type, TypeL typeLabel, String model, Long luggage, Long passenger) {
        this.type = type;
        this.typeLabel = typeLabel;
        this.model = model;
        this.luggage = luggage;
        this.passenger = passenger;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public TypeL getTypeLabel() {
        return typeLabel;
    }

    public void setTypeLabel(TypeL typeLabel) {
        this.typeLabel = typeLabel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getLuggage() {
        return luggage;
    }

    public void setLuggage(Long luggage) {
        this.luggage = luggage;
    }

    public Long getPassenger() {
        return passenger;
    }

    public void setPassenger(Long passenger) {
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type=" + type +
                ", typeLabel=" + typeLabel +
                ", model='" + model + '\'' +
                ", luggage=" + luggage +
                ", passenger=" + passenger +
                '}';
    }
}
