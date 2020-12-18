package com.navettevatry.rem4u.common.resources.dto.EureCab.CompanyResult;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class CompanyResponse implements Serializable {
    @JsonProperty("data")
    private Data data;

    public CompanyResponse() {
    }

    public CompanyResponse(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CompanyResponse{" +
                "data=" + data +
                '}';
    }
}
