package com.navettevatry.rem4u.common.resources.dto.uber.updated;

public class FareEstimateRange {
    private long minFare;
    private long maxFare;

    public long getMinFare() {
        return minFare;
    }

    public void setMinFare(long value) {
        this.minFare = value;
    }

    public long getMaxFare() {
        return maxFare;
    }

    public void setMaxFare(long value) {
        this.maxFare = value;
    }

    @Override
    public String toString() {
        return "FareEstimateRange{" +
                "minFare=" + minFare +
                ", maxFare=" + maxFare +
                '}';
    }
}
