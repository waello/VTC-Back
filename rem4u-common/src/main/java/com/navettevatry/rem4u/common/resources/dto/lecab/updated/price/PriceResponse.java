package com.navettevatry.rem4u.common.resources.dto.lecab.updated.price;

import com.fasterxml.jackson.annotation.*;

public class PriceResponse {
    private String status;
    private Object errorMessage;
    private Price price;
    private Object extPrice;
    private WelcomeDiscount discount;
    private Object extDiscount;
    private Object asDirectedMinutesRounding;
    private PriceIncreaseDetails priceIncreaseDetails;
    private boolean offerWorkflowRequired;
    private Surge surge;

    @JsonProperty("status")
    public String getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(String value) { this.status = value; }

    @JsonProperty("errorMessage")
    public Object getErrorMessage() { return errorMessage; }
    @JsonProperty("errorMessage")
    public void setErrorMessage(Object value) { this.errorMessage = value; }

    @JsonProperty("price")
    public Price getPrice() { return price; }
    @JsonProperty("price")
    public void setPrice(Price value) { this.price = value; }

    @JsonProperty("extPrice")
    public Object getEXTPrice() { return extPrice; }
    @JsonProperty("extPrice")
    public void setEXTPrice(Object value) { this.extPrice = value; }

    @JsonProperty("discount")
    public WelcomeDiscount getDiscount() { return discount; }
    @JsonProperty("discount")
    public void setDiscount(WelcomeDiscount value) { this.discount = value; }

    @JsonProperty("extDiscount")
    public Object getEXTDiscount() { return extDiscount; }
    @JsonProperty("extDiscount")
    public void setEXTDiscount(Object value) { this.extDiscount = value; }

    @JsonProperty("asDirectedMinutesRounding")
    public Object getAsDirectedMinutesRounding() { return asDirectedMinutesRounding; }
    @JsonProperty("asDirectedMinutesRounding")
    public void setAsDirectedMinutesRounding(Object value) { this.asDirectedMinutesRounding = value; }

    @JsonProperty("priceIncreaseDetails")
    public PriceIncreaseDetails getPriceIncreaseDetails() { return priceIncreaseDetails; }
    @JsonProperty("priceIncreaseDetails")
    public void setPriceIncreaseDetails(PriceIncreaseDetails value) { this.priceIncreaseDetails = value; }

    @JsonProperty("offerWorkflowRequired")
    public boolean getOfferWorkflowRequired() { return offerWorkflowRequired; }
    @JsonProperty("offerWorkflowRequired")
    public void setOfferWorkflowRequired(boolean value) { this.offerWorkflowRequired = value; }

    @JsonProperty("surge")
    public Surge getSurge() { return surge; }
    @JsonProperty("surge")
    public void setSurge(Surge value) { this.surge = value; }
}
