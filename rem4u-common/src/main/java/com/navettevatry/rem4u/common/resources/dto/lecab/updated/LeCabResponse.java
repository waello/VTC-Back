package com.navettevatry.rem4u.common.resources.dto.lecab.updated;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class LeCabResponse {
    private String status;
    private Object errorMessage;
    private List<Service> services;

    @JsonProperty("status")
    public String getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(String value) { this.status = value; }

    @JsonProperty("errorMessage")
    public Object getErrorMessage() { return errorMessage; }
    @JsonProperty("errorMessage")
    public void setErrorMessage(Object value) { this.errorMessage = value; }

    @JsonProperty("services")
    public List<Service> getServices() { return services; }
    @JsonProperty("services")
    public void setServices(List<Service> value) { this.services = value; }
}
