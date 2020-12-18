package com.navettevatry.rem4u.common.resources.dto.lecab.updated.price;

import com.fasterxml.jackson.annotation.*;

public class PriceDetail {
    private String name;
    private GrossClass amount;
    private String type;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("amount")
    public GrossClass getAmount() { return amount; }
    @JsonProperty("amount")
    public void setAmount(GrossClass value) { this.amount = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }
}
