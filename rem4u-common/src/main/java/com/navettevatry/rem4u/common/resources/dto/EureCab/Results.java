package com.navettevatry.rem4u.common.resources.dto.EureCab;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Results implements Serializable {
    @JsonProperty("data")
    private List<ResultsDatum> data;

    public Results() {
    }

    public Results(List<ResultsDatum> data) {
        this.data = data;
    }

    public List<ResultsDatum> getData() {
        return data;
    }

    public void setData(List<ResultsDatum> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Results{" +
                "data=" + data +
                '}';
    }
}