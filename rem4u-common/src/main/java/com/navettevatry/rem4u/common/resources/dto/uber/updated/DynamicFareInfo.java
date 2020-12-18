package com.navettevatry.rem4u.common.resources.dto.uber.updated;

import java.util.UUID;

public class DynamicFareInfo {
    private long multiplier;
    private UUID uuid;
    private boolean isSobriety;

    public long getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(long value) {
        this.multiplier = value;
    }

    public UUID getUUID() {
        return uuid;
    }

    public void setUUID(UUID value) {
        this.uuid = value;
    }

    public boolean getIsSobriety() {
        return isSobriety;
    }

    public void setIsSobriety(boolean value) {
        this.isSobriety = value;
    }

    @Override
    public String toString() {
        return "DynamicFareInfo{" +
                "multiplier=" + multiplier +
                ", uuid=" + uuid +
                ", isSobriety=" + isSobriety +
                '}';
    }
}
