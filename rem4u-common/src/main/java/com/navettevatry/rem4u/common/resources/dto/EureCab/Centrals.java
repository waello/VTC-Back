package com.navettevatry.rem4u.common.resources.dto.EureCab;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Centrals implements Serializable {
    @JsonProperty("data")
    private List<CentralsDatum> data;

    public Centrals() {
    }

    public Centrals(List<CentralsDatum> data) {
        this.data = data;
    }

    public List<CentralsDatum> getData() {
        return data;
    }

    public void setData(List<CentralsDatum> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Centrals{" +
                "data=" + data +
                '}';
    }
}