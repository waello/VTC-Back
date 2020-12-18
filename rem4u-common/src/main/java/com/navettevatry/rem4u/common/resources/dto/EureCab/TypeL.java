
package com.navettevatry.rem4u.common.resources.dto.EureCab;

import java.io.IOException;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.*;

public enum TypeL implements Serializable {
    AFFAIRES("Affaires"),
    ECONOMIQUE("Economique"),
    MOTO("Moto"),
    VAN_7_PLACES("Van 7 places");

    private String type;

    TypeL(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @JsonValue
    public String toValue() {
        switch (this) {
            case AFFAIRES: return "Affaires";
            case ECONOMIQUE: return "Economique";
            case MOTO: return "Moto";
            case VAN_7_PLACES: return "Van 7 places";
        }
        return null;
    }

    @JsonCreator
    public static TypeL forValue(String value) throws IOException {
        if (value.equals("Affaires")) return AFFAIRES;
        if (value.equals("Economique")) return ECONOMIQUE;
        if (value.equals("Moto")) return MOTO;
        if (value.equals("Van 7 places")) return VAN_7_PLACES;
        throw new IOException("Cannot deserialize TypeL");
    }
}