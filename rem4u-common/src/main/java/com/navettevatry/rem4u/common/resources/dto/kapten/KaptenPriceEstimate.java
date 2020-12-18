package com.navettevatry.rem4u.common.resources.dto.kapten;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 *
 * Created By Chakib Daii
 *
 */
public class KaptenPriceEstimate implements Serializable {
    @JsonProperty("localized_product_name")
    private String localizedProductName ; /*A localized human readable description of the product */
    @JsonProperty("product_id")
    private String productId ; /* product identifier */
    @JsonProperty("eta_seconds")
    private Integer etaSeconds ; /* Estimated seconds for a driver to pickup */
    @JsonProperty("duration_seconds")
    private Integer durationSeconds; /* Estimated time in seconds to get from the start location to the end */
    @JsonProperty("distance_meters")
    private Integer distanceMeters; /* Estimated distance for this ride in meter */
    @JsonProperty("currency_code")
    private String currencyCode; /* ISO 4217 currency code */
    @JsonProperty("price_min_cents")
    private Integer priceMinCents; /* Upper bound of the estimated price in minor units (cents) */
    @JsonProperty("price_max_cents")
    private Integer priceMaxCents; /* Lower bound of the estimated price in minor units (cents) */
    @JsonProperty("price_token")
    private String priceToken; /* 24-characters hexadecimal string */

    public KaptenPriceEstimate() {
    }

    public KaptenPriceEstimate(String localizedProductName, String productId, Integer etaSeconds, Integer durationSeconds,
                               Integer distanceMeters, String currencyCode, Integer priceMinCents, Integer priceMaxCents, String priceToken) {
        this.localizedProductName = localizedProductName;
        this.productId = productId;
        this.etaSeconds = etaSeconds;
        this.durationSeconds = durationSeconds;
        this.distanceMeters = distanceMeters;
        this.currencyCode = currencyCode;
        this.priceMinCents = priceMinCents;
        this.priceMaxCents = priceMaxCents;
        this.priceToken = priceToken;
    }

    public String getLocalizedProductName() {
        return localizedProductName;
    }

    public void setLocalizedProductName(String localizedProductName) {
        this.localizedProductName = localizedProductName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getEtaSeconds() {
        return etaSeconds;
    }

    public void setEtaSeconds(Integer etaSeconds) {
        this.etaSeconds = etaSeconds;
    }

    public Integer getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public Integer getDistanceMeters() {
        return distanceMeters;
    }

    public void setDistanceMeters(Integer distanceMeters) {
        this.distanceMeters = distanceMeters;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Integer getPriceMinCents() {
        return priceMinCents;
    }

    public void setPriceMinCents(Integer priceMinCents) {
        this.priceMinCents = priceMinCents;
    }

    public Integer getPriceMaxCents() {
        return priceMaxCents;
    }

    public void setPriceMaxCents(Integer priceMaxCents) {
        this.priceMaxCents = priceMaxCents;
    }

    public String getPriceToken() {
        return priceToken;
    }

    public void setPriceToken(String priceToken) {
        this.priceToken = priceToken;
    }

    @Override
    public String toString() {
        return "PriceEstimate{" +
                "localizedProductName='" + localizedProductName + '\'' +
                ", productId='" + productId + '\'' +
                ", etaSeconds=" + etaSeconds +
                ", durationSeconds=" + durationSeconds +
                ", distanceMeters=" + distanceMeters +
                ", currencyCode='" + currencyCode + '\'' +
                ", priceMinCents=" + priceMinCents +
                ", priceMaxCents=" + priceMaxCents +
                ", priceToken='" + priceToken + '\'' +
                '}';
    }
}
