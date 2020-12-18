package com.navettevatry.rem4u.common.resources.dto.lecab.updated.price;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class WelcomeDiscount {
    private List<Object> appliedDiscounts;
    private List<Object> excludedDiscounts;

    @JsonProperty("appliedDiscounts")
    public List<Object> getAppliedDiscounts() { return appliedDiscounts; }
    @JsonProperty("appliedDiscounts")
    public void setAppliedDiscounts(List<Object> value) { this.appliedDiscounts = value; }

    @JsonProperty("excludedDiscounts")
    public List<Object> getExcludedDiscounts() { return excludedDiscounts; }
    @JsonProperty("excludedDiscounts")
    public void setExcludedDiscounts(List<Object> value) { this.excludedDiscounts = value; }
}
