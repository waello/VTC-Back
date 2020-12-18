package com.navettevatry.rem4u.common.resources.dto.uber.updated;

import com.navettevatry.rem4u.common.resources.dto.uber.updated.TargetLocationSynced;

public class Metadata {
    private TargetLocationSynced targetLocationSynced;
    private long pollingIntervalMS;

    public TargetLocationSynced getTargetLocationSynced() {
        return targetLocationSynced;
    }

    public void setTargetLocationSynced(TargetLocationSynced value) {
        this.targetLocationSynced = value;
    }

    public long getPollingIntervalMS() {
        return pollingIntervalMS;
    }

    public void setPollingIntervalMS(long value) {
        this.pollingIntervalMS = value;
    }

    @Override
    public String toString() {
        return "Metadata{" +
                "targetLocationSynced=" + targetLocationSynced +
                ", pollingIntervalMS=" + pollingIntervalMS +
                '}';
    }
}
