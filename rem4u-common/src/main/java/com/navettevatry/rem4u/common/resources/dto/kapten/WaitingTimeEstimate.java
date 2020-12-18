package com.navettevatry.rem4u.common.resources.dto.kapten;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 *
 * Created By Chakib Daii
 *
 */
public class WaitingTimeEstimate  implements Serializable {
    @JsonProperty("localized_product_name")
    private String localizedProductName; /* A localized human readable description of the product */
    @JsonProperty("product_id")
    private String productId ; /* product identifier */
    @JsonProperty("eta_seconds")
    private Integer etaSeconds ; /* Estimated seconds for a driver to pickup */

    public WaitingTimeEstimate() {
    }

    public WaitingTimeEstimate(String localizedProductName, String productId, Integer etaSeconds) {
        this.localizedProductName = localizedProductName;
        this.productId = productId;
        this.etaSeconds = etaSeconds;
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

    @Override
    public String toString() {
        return "WaitingTimeEstimate{" +
                "localizedProductName='" + localizedProductName + '\'' +
                ", productId='" + productId + '\'' +
                ", etaSeconds=" + etaSeconds +
                '}';
    }
}
