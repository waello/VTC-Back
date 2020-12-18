package com.navettevatry.rem4u.common.resources.dto.lecab.updated.price;

import com.fasterxml.jackson.annotation.*;

public class GrossClass {
    private double value;
    private String formattedValue;

    @JsonProperty("value")
    public double getValue() { return value; }
    @JsonProperty("value")
    public void setValue(double value) { this.value = value; }

    @JsonProperty("formattedValue")
    public String getFormattedValue() { return formattedValue; }
    @JsonProperty("formattedValue")
    public void setFormattedValue(String value) { this.formattedValue = value; }
}
