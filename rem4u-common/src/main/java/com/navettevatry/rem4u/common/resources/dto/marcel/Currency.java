package com.navettevatry.rem4u.common.resources.dto.marcel;

import com.fasterxml.jackson.annotation.*;

public class Currency {
    private String name;
    private String symbol;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("symbol")
    public String getSymbol() { return symbol; }
    @JsonProperty("symbol")
    public void setSymbol(String value) { this.symbol = value; }
}
