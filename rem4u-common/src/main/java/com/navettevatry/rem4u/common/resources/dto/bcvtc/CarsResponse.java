package com.navettevatry.rem4u.common.resources.dto.bcvtc;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 *
 * Created by Wael Jlassi.
 * Updated by Chakib Daii.
 */
public class CarsResponse implements Serializable {
    @JsonProperty("Status")
    private String status;
    @JsonProperty("Message")
    private String message;
    @JsonProperty("Data")
    private List<Car> data;

    public CarsResponse() {
    }

    public CarsResponse(String status, String message, List<Car> data) {
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

    public List<Car> getData() {
        return data;
    }

    public void setData(List<Car> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CarsResponse{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}