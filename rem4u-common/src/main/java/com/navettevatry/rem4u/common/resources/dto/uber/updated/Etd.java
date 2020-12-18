package com.navettevatry.rem4u.common.resources.dto.uber.updated;

import com.navettevatry.rem4u.common.resources.dto.uber.updated.Meta;

public class Etd {
    private Meta meta;
    private long estimatedTripTime;
    private String legalDisclaimer;
    private long estimateRequestTime;
    private String etdDisplayString;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta value) {
        this.meta = value;
    }

    public long getEstimatedTripTime() {
        return estimatedTripTime;
    }

    public void setEstimatedTripTime(long value) {
        this.estimatedTripTime = value;
    }

    public String getLegalDisclaimer() {
        return legalDisclaimer;
    }

    public void setLegalDisclaimer(String value) {
        this.legalDisclaimer = value;
    }

    public long getEstimateRequestTime() {
        return estimateRequestTime;
    }

    public void setEstimateRequestTime(long value) {
        this.estimateRequestTime = value;
    }

    public String getEtdDisplayString() {
        return etdDisplayString;
    }

    public void setEtdDisplayString(String value) {
        this.etdDisplayString = value;
    }

    @Override
    public String toString() {
        return "Etd{" +
                "meta=" + meta +
                ", estimatedTripTime=" + estimatedTripTime +
                ", legalDisclaimer='" + legalDisclaimer + '\'' +
                ", estimateRequestTime=" + estimateRequestTime +
                ", etdDisplayString='" + etdDisplayString + '\'' +
                '}';
    }
}
