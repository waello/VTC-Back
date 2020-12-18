package com.navettevatry.rem4u.common.resources.dto.uber.updated;


import java.util.UUID;

public class Estimate {
    private UUID packageVariantUUID;
    private boolean isSurge;
    private boolean hasPromo;
    private String currencyCode;
    private FareEstimateRange fareEstimateRange;
    private String preAdjustmentValue;
    private String adjustmentValue;
    private UpfrontFare upfrontFare;
    private String formattedFare;
    private long estimatedTime;
    private Etd etd;
    private String locale;
    private String toll;
    private double tollValue;
    private String surcharge;
    private long surchargeValue;

    public UUID getPackageVariantUUID() {
        return packageVariantUUID;
    }

    public void setPackageVariantUUID(UUID value) {
        this.packageVariantUUID = value;
    }

    public boolean getIsSurge() {
        return isSurge;
    }

    public void setIsSurge(boolean value) {
        this.isSurge = value;
    }

    public boolean getHasPromo() {
        return hasPromo;
    }

    public void setHasPromo(boolean value) {
        this.hasPromo = value;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    public FareEstimateRange getFareEstimateRange() {
        return fareEstimateRange;
    }

    public void setFareEstimateRange(FareEstimateRange value) {
        this.fareEstimateRange = value;
    }

    public String getPreAdjustmentValue() {
        return preAdjustmentValue;
    }

    public void setPreAdjustmentValue(String value) {
        this.preAdjustmentValue = value;
    }

    public String getAdjustmentValue() {
        return adjustmentValue;
    }

    public void setAdjustmentValue(String value) {
        this.adjustmentValue = value;
    }

    public UpfrontFare getUpfrontFare() {
        return upfrontFare;
    }

    public void setUpfrontFare(UpfrontFare value) {
        this.upfrontFare = value;
    }

    public String getFormattedFare() {
        return formattedFare;
    }

    public void setFormattedFare(String value) {
        this.formattedFare = value;
    }

    public long getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(long value) {
        this.estimatedTime = value;
    }

    public Etd getEtd() {
        return etd;
    }

    public void setEtd(Etd value) {
        this.etd = value;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String value) {
        this.locale = value;
    }

    public String getToll() {
        return toll;
    }

    public void setToll(String value) {
        this.toll = value;
    }

    public double getTollValue() {
        return tollValue;
    }

    public void setTollValue(double value) {
        this.tollValue = value;
    }

    public String getSurcharge() {
        return surcharge;
    }

    public void setSurcharge(String value) {
        this.surcharge = value;
    }

    public long getSurchargeValue() {
        return surchargeValue;
    }

    public void setSurchargeValue(long value) {
        this.surchargeValue = value;
    }

    @Override
    public String toString() {
        return "Estimate{" +
                "packageVariantUUID=" + packageVariantUUID +
                ", isSurge=" + isSurge +
                ", hasPromo=" + hasPromo +
                ", currencyCode='" + currencyCode + '\'' +
                ", fareEstimateRange=" + fareEstimateRange +
                ", preAdjustmentValue='" + preAdjustmentValue + '\'' +
                ", adjustmentValue='" + adjustmentValue + '\'' +
                ", upfrontFare=" + upfrontFare +
                ", formattedFare='" + formattedFare + '\'' +
                ", estimatedTime=" + estimatedTime +
                ", etd=" + etd +
                ", locale='" + locale + '\'' +
                ", toll='" + toll + '\'' +
                ", tollValue=" + tollValue +
                ", surcharge='" + surcharge + '\'' +
                ", surchargeValue=" + surchargeValue +
                '}';
    }
}
