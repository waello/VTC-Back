package com.navettevatry.rem4u.common.resources.dto.EureCab;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

public class EuroCabRequest implements Serializable {
    @JsonProperty("type_vehicle")
    private String typeVehicle;
    @JsonProperty("from")
    private String from;
    @JsonProperty("to")
    private String to ;
    @JsonProperty("date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy'T'HH:mm'Z'")
    private Date date ;

    public EuroCabRequest() {
    }

    public EuroCabRequest(String typeVehicle, String from, String to, Date date) {
        this.typeVehicle = typeVehicle;
        this.from = from;
        this.to = to;
        this.date = date;
    }

    public String getTypeVehicle() {
        return typeVehicle;
    }

    public void setTypeVehicle(String typeVehicle) {
        this.typeVehicle = typeVehicle;
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
        return "EuroCabRequest{" +
                "typeVehicle='" + typeVehicle + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", date=" + date +
                '}';
    }
}
