package com.navettevatry.rem4u.common.resources.dto.uber.updated;

public class TripTime {
    private boolean chargeForWaitTimeEnabled;
    private long waitTimeThresholdSEC;

    public boolean getChargeForWaitTimeEnabled() {
        return chargeForWaitTimeEnabled;
    }

    public void setChargeForWaitTimeEnabled(boolean value) {
        this.chargeForWaitTimeEnabled = value;
    }

    public long getWaitTimeThresholdSEC() {
        return waitTimeThresholdSEC;
    }

    public void setWaitTimeThresholdSEC(long value) {
        this.waitTimeThresholdSEC = value;
    }

    @Override
    public String toString() {
        return "TripTime{" +
                "chargeForWaitTimeEnabled=" + chargeForWaitTimeEnabled +
                ", waitTimeThresholdSEC=" + waitTimeThresholdSEC +
                '}';
    }
}
