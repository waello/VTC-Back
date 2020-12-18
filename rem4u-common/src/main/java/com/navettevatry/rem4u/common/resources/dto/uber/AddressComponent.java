package com.navettevatry.rem4u.common.resources.dto.uber;

import java.util.List;

public class AddressComponent {
    private String longName;
    private String shortName;
    private List<String> types;

    public String getLongName() {
        return longName;
    }

    public void setLongName(String value) {
        this.longName = value;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String value) {
        this.shortName = value;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> value) {
        this.types = value;
    }
}
