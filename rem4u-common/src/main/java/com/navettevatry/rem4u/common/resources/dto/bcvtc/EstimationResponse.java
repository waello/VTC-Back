package com.navettevatry.rem4u.common.resources.dto.bcvtc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 *
 * Created by Wael Jlassi.
 * Updated by Chakib Daii.
 */

public class EstimationResponse implements Serializable {
    @JsonProperty("Status")
    private String status;
    @JsonProperty("Message")
    private String message;
    @JsonProperty("Data")
    private Estimation data;

    public EstimationResponse() {
    }

    public EstimationResponse(String status, String message, Estimation data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Estimation getData() {
        return data;
    }

    public void setData(Estimation data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "EstimationResponse{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
