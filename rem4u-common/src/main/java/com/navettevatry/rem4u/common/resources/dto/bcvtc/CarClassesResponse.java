package com.navettevatry.rem4u.common.resources.dto.bcvtc;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 *
 * Created by Wael Jlassi.
 * Updated by Chakib Daii.
 */
public class CarClassesResponse implements Serializable {
    @JsonProperty("Status")
    private String status;
    @JsonProperty("Message")
    private String message;
    @JsonProperty("Data")
    private List<CarClass> data;

    public CarClassesResponse() {
    }

    public CarClassesResponse(String status, String message, List<CarClass> data) {
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

    public List<CarClass> getData() {
        return data;
    }

    public void setData(List<CarClass> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CarClassesResponse{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
