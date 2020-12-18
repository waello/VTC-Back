package com.navettevatry.rem4u.common.resources.dto.uber.updated;

import java.util.UUID;

public class Meta {
    private UUID lighthouseRequestUUID;

    public UUID getLighthouseRequestUUID() {
        return lighthouseRequestUUID;
    }

    public void setLighthouseRequestUUID(UUID value) {
        this.lighthouseRequestUUID = value;
    }

    @Override
    public String toString() {
        return "Meta{" +
                "lighthouseRequestUUID=" + lighthouseRequestUUID +
                '}';
    }
}
