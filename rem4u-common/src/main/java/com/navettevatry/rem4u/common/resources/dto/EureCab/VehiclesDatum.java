package com.navettevatry.rem4u.common.resources.dto.EureCab;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)
public class VehiclesDatum implements Serializable {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("type")
    private Integer type;
    @JsonProperty("type_literal")
    private TypeL typeLiteral;
    @JsonProperty("nb_passenger")
    private Integer nbPassenger;
    @JsonProperty("nb_luggage")
    private Integer nbLuggage;
    @JsonProperty("mod_price")
    private String modPrice;
    @JsonProperty("status")
    private Integer status;

    public VehiclesDatum() {
    }

    public VehiclesDatum(Integer id, Integer type, TypeL typeLiteral, Integer nbPassenger, Integer nbLuggage, String modPrice, Integer status) {
        this.id = id;
        this.type = type;
        this.typeLiteral = typeLiteral;
        this.nbPassenger = nbPassenger;
        this.nbLuggage = nbLuggage;
        this.modPrice = modPrice;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public TypeL getTypeLiteral() {
        return typeLiteral;
    }

    public void setTypeLiteral(TypeL typeLiteral) {
        this.typeLiteral = typeLiteral;
    }

    public Integer getNbPassenger() {
        return nbPassenger;
    }

    public void setNbPassenger(Integer nbPassenger) {
        this.nbPassenger = nbPassenger;
    }

    public Integer getNbLuggage() {
        return nbLuggage;
    }

    public void setNbLuggage(Integer nbLuggage) {
        this.nbLuggage = nbLuggage;
    }

    public String getModPrice() {
        return modPrice;
    }

    public void setModPrice(String modPrice) {
        this.modPrice = modPrice;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "VehiclesDatum{" +
                "id=" + id +
                ", type=" + type +
                ", typeLiteral='" + typeLiteral + '\'' +
                ", nbPassenger=" + nbPassenger +
                ", nbLuggage=" + nbLuggage +
                ", modPrice='" + modPrice + '\'' +
                ", status=" + status +
                '}';
    }
}