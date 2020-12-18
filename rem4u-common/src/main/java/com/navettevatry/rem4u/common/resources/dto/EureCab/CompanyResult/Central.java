package com.navettevatry.rem4u.common.resources.dto.EureCab.CompanyResult;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;

public class Central implements Serializable {
    @JsonProperty("type")
    private Long type;
    @JsonProperty("model")
    private Long model;
    @JsonProperty("is_freemium")
    private Boolean isFreemium;
    @JsonProperty("deeplink")
    private Object deeplink;

    public Central() {
    }

    public Central(Long type, Long model, Boolean isFreemium, Object deeplink) {
        this.type = type;
        this.model = model;
        this.isFreemium = isFreemium;
        this.deeplink = deeplink;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getModel() {
        return model;
    }

    public void setModel(Long model) {
        this.model = model;
    }

    public Boolean getFreemium() {
        return isFreemium;
    }

    public void setFreemium(Boolean freemium) {
        isFreemium = freemium;
    }

    public Object getDeeplink() {
        return deeplink;
    }

    public void setDeeplink(Object deeplink) {
        this.deeplink = deeplink;
    }

    @Override
    public String toString() {
        return "Central{" +
                "type=" + type +
                ", model=" + model +
                ", isFreemium=" + isFreemium +
                ", deeplink=" + deeplink +
                '}';
    }
}
