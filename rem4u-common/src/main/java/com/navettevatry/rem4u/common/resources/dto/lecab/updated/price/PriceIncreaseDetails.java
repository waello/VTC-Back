package com.navettevatry.rem4u.common.resources.dto.lecab.updated.price;

import com.fasterxml.jackson.annotation.*;

public class PriceIncreaseDetails {
    private GrossClass callOutPrice;
    private boolean minimumPriceApplied;
    private GrossClass minimumPrice;
    private long journeyTime;
    private GrossClass pricePerMinute;
    private double distance;
    private GrossClass pricePerKilometer;
    private boolean surgeCapApplied;

    @JsonProperty("callOutPrice")
    public GrossClass getCallOutPrice() { return callOutPrice; }
    @JsonProperty("callOutPrice")
    public void setCallOutPrice(GrossClass value) { this.callOutPrice = value; }

    @JsonProperty("minimumPriceApplied")
    public boolean getMinimumPriceApplied() { return minimumPriceApplied; }
    @JsonProperty("minimumPriceApplied")
    public void setMinimumPriceApplied(boolean value) { this.minimumPriceApplied = value; }

    @JsonProperty("minimumPrice")
    public GrossClass getMinimumPrice() { return minimumPrice; }
    @JsonProperty("minimumPrice")
    public void setMinimumPrice(GrossClass value) { this.minimumPrice = value; }

    @JsonProperty("journeyTime")
    public long getJourneyTime() { return journeyTime; }
    @JsonProperty("journeyTime")
    public void setJourneyTime(long value) { this.journeyTime = value; }

    @JsonProperty("pricePerMinute")
    public GrossClass getPricePerMinute() { return pricePerMinute; }
    @JsonProperty("pricePerMinute")
    public void setPricePerMinute(GrossClass value) { this.pricePerMinute = value; }

    @JsonProperty("distance")
    public double getDistance() { return distance; }
    @JsonProperty("distance")
    public void setDistance(double value) { this.distance = value; }

    @JsonProperty("pricePerKilometer")
    public GrossClass getPricePerKilometer() { return pricePerKilometer; }
    @JsonProperty("pricePerKilometer")
    public void setPricePerKilometer(GrossClass value) { this.pricePerKilometer = value; }

    @JsonProperty("surgeCapApplied")
    public boolean getSurgeCapApplied() { return surgeCapApplied; }
    @JsonProperty("surgeCapApplied")
    public void setSurgeCapApplied(boolean value) { this.surgeCapApplied = value; }
}
