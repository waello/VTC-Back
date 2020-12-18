package com.navettevatry.rem4u.common.resources.dto.kapten;

import java.io.Serializable;
import java.util.List;

/**
 *
 * Created by Ahmed Ferjani.
 * Updated By Chakib Daii
 */
public class EstimatedPriceResponseSuccess implements Serializable {
    private List<KaptenPriceEstimate> prices;

    public EstimatedPriceResponseSuccess() {
    }

    public EstimatedPriceResponseSuccess(List<KaptenPriceEstimate> prices) {
        this.prices = prices;
    }

    public List<KaptenPriceEstimate> getPrices() {
        return prices;
    }

    public void setPrices(List<KaptenPriceEstimate> prices) {
        this.prices = prices;
    }

    @Override
    public String toString() {
        return "EstimatedPriceResponseSuccess{" +
                "prices=" + prices +
                '}';
    }
}
