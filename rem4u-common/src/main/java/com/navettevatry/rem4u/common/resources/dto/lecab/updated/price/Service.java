package com.navettevatry.rem4u.common.resources.dto.lecab.updated.price;

import java.util.List;
import java.util.UUID;

public class Service {
    private List<String> availablePaymentTypes;
    private UUID id;
    private String caption;
    private String description;
    private Object pricePrefix;

    public List<String> getAvailablePaymentTypes() {
        return availablePaymentTypes;
    }

    public void setAvailablePaymentTypes(List<String> value) {
        this.availablePaymentTypes = value;
    }

    public UUID getID() {
        return id;
    }

    public void setID(UUID value) {
        this.id = value;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String value) {
        this.caption = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public Object getPricePrefix() {
        return pricePrefix;
    }

    public void setPricePrefix(Object value) {
        this.pricePrefix = value;
    }
}
