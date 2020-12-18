package com.navettevatry.rem4u.common.resources.dto.EureCab.CompanyResult;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

public class CompanyRequest implements Serializable {
    @JsonProperty("vehicle")
    private String vehicle; //can be empty or 1 a verifier
    @JsonProperty("from")
    private String from; // Marseille%20Saint-Charles%2C%20Marseille%2C%20France
    @JsonProperty("to")
    private String to ; //Paris%2C%20France
    @JsonProperty("date")
    private Date date ; //22%2F09%2F2020%2018%3A05 can be empty

    public CompanyRequest() {
    }

    public CompanyRequest(String vehicle, String from, String to, Date date) {
        this.vehicle = vehicle;
        this.from = from;
        this.to = to;
        this.date = date;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "CompanyRequest{" +
                "vehicle='" + vehicle + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", date=" + date +
                '}';
    }
}
