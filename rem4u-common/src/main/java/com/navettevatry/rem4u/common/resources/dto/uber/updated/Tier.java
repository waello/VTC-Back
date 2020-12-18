package com.navettevatry.rem4u.common.resources.dto.uber.updated;

public class Tier {
    private String type;
    private String name;

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    @Override
    public String toString() {
        return "Tier{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
