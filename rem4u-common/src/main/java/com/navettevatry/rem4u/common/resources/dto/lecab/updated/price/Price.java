package com.navettevatry.rem4u.common.resources.dto.lecab.updated.price;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Price {
    private GrossClass net;
    private GrossClass taxTotal;
    private GrossClass gross;
    private GrossClass discount;
    private Details details;
    private List<PriceDetail> priceDetails;
    private Object prefix;

    @JsonProperty("net")
    public GrossClass getNet() { return net; }
    @JsonProperty("net")
    public void setNet(GrossClass value) { this.net = value; }

    @JsonProperty("taxTotal")
    public GrossClass getTaxTotal() { return taxTotal; }
    @JsonProperty("taxTotal")
    public void setTaxTotal(GrossClass value) { this.taxTotal = value; }

    @JsonProperty("gross")
    public GrossClass getGross() { return gross; }
    @JsonProperty("gross")
    public void setGross(GrossClass value) { this.gross = value; }

    @JsonProperty("discount")
    public GrossClass getDiscount() { return discount; }
    @JsonProperty("discount")
    public void setDiscount(GrossClass value) { this.discount = value; }

    @JsonProperty("details")
    public Details getDetails() { return details; }
    @JsonProperty("details")
    public void setDetails(Details value) { this.details = value; }

    @JsonProperty("priceDetails")
    public List<PriceDetail> getPriceDetails() { return priceDetails; }
    @JsonProperty("priceDetails")
    public void setPriceDetails(List<PriceDetail> value) { this.priceDetails = value; }

    @JsonProperty("prefix")
    public Object getPrefix() { return prefix; }
    @JsonProperty("prefix")
    public void setPrefix(Object value) { this.prefix = value; }
}
