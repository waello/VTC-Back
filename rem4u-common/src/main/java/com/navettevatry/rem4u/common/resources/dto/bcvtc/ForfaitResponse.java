package com.navettevatry.rem4u.common.resources.dto.bcvtc;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 *
 * Created by Wael Jlassi.
 * Updated by Chakib Daii.
 */
public  class ForfaitResponse implements Serializable {
    @JsonProperty("Status")
    private String status;
    @JsonProperty("Message")
    private String message;
    @JsonProperty("Data")
    private List<Forfait> data;

    public ForfaitResponse() {
    }

    public ForfaitResponse(String status, String message, List<Forfait> data) {
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

    public List<Forfait> getData() {
        return data;
    }

    public void setData(List<Forfait> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ForfaitResponse{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}