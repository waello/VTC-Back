package com.navettevatry.rem4u.common.resources.dto.lecab.updated.price;

import com.fasterxml.jackson.annotation.*;

public class Surge {
    private long value;
    private String formattedValue;
    private Object description;

    @JsonProperty("value")
    public long getValue() { return value; }
    @JsonProperty("value")
    public void setValue(long value) { this.value = value; }

    @JsonProperty("formattedValue")
    public String getFormattedValue() { return formattedValue; }
    @JsonProperty("formattedValue")
    public void setFormattedValue(String value) { this.formattedValue = value; }

    @JsonProperty("description")
    public Object getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(Object value) { this.description = value; }
}
