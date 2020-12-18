package com.navettevatry.rem4u.common.resources.dto.bcvtc;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 *
 * Created by Wael Jlassi.
 * Updated by Chakib Daii.
 */
public class Forfait implements Serializable {
    @JsonProperty("Prices")
    private List<ForfaitPrice> prices;
    @JsonProperty("FlatPriceName")
    private String flatPriceName;
    @JsonProperty("FlatPriceId")
    private String flatPriceId;

    public Forfait() {
    }

    public Forfait(List<ForfaitPrice> prices, String flatPriceName, String flatPriceId) {
        this.prices = prices;
        this.flatPriceName = flatPriceName;
        this.flatPriceId = flatPriceId;
    }

    public List<ForfaitPrice> getPrices() {
        return prices;
    }

    public void setPrices(List<ForfaitPrice> prices) {
        this.prices = prices;
    }

    public String getFlatPriceName() {
        return flatPriceName;
    }

    public void setFlatPriceName(String flatPriceName) {
        this.flatPriceName = flatPriceName;
    }

    public String getFlatPriceId() {
        return flatPriceId;
    }

    public void setFlatPriceId(String flatPriceId) {
        this.flatPriceId = flatPriceId;
    }

    @Override
    public String toString() {
        return "Forfait{" +
                "prices=" + prices +
                ", flatPriceName='" + flatPriceName + '\'' +
                ", flatPriceId='" + flatPriceId + '\'' +
                '}';
    }
}