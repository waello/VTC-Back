package com.navettevatry.rem4u.common.resources.dto.EureCab;

import java.io.IOException;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.*;

public enum AcceptLabel implements Serializable {
    EMPTY(""),
    GOOD_RESPONSIVENESS("Good responsiveness"),
    IMMEDIATE_CONFIRMATION("Immediate Confirmation"),
    VERY_GOOD_RESPONSIVENESS("Very good responsiveness");

    private String label;

    AcceptLabel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @JsonValue
    public String toValue() {
        switch (this) {
            case EMPTY: return "";
            case GOOD_RESPONSIVENESS: return "Good responsiveness";
            case IMMEDIATE_CONFIRMATION: return "Immediate Confirmation";
            case VERY_GOOD_RESPONSIVENESS: return "Very good responsiveness";
        }
        return null;
    }

    @JsonCreator
    public static AcceptLabel forValue(String value) throws IOException {
        if (value.equals("")) return EMPTY;
        if (value.equals("Good responsiveness")) return GOOD_RESPONSIVENESS;
        if (value.equals("Immediate Confirmation")) return IMMEDIATE_CONFIRMATION;
        if (value.equals("Very good responsiveness")) return VERY_GOOD_RESPONSIVENESS;
        throw new IOException("Cannot deserialize AcceptLabel");
    }
}
