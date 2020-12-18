package com.navettevatry.rem4u.common.resources.dto.bcvtc;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 *
 * Created by Wael Jlassi.
 * Updated by Chakib Daii.
 */
public class Price implements Serializable {
    @JsonProperty("ClassId")
    private String classId; //L'id unique de la classe
    @JsonProperty("ClassName")
    private String className; //Le nom de la classe
    @JsonProperty("DistancePrice")
    private Float distancePrice; //Le tarif pour la distance uniquement
    @JsonProperty("TimePrice")
    private Float timePrice; //Le tarif pour le temps parcouru uniquement
    @JsonProperty("Price")
    private Float price; //Tarif total brut en additionnant le tarif de base ou de prise en charge
    @JsonProperty("TTCPrice")
    private Float ttcPrice; //Tarif total TTC net
    @JsonProperty("HTPrice")
    private Float htPrice; //Tarif hors taxes net
    @JsonProperty("PaxesVolume")
    private String paxesVolume; //Nombre de places disponibles

    public Price() {
    }

    public Price(String classId, String className, Float distancePrice, Float timePrice, Float price, Float ttcPrice, Float htPrice, String paxesVolume) {
        this.classId = classId;
        this.className = className;
        this.distancePrice = distancePrice;
        this.timePrice = timePrice;
        this.price = price;
        this.ttcPrice = ttcPrice;
        this.htPrice = htPrice;
        this.paxesVolume = paxesVolume;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Float getDistancePrice() {
        return distancePrice;
    }

    public void setDistancePrice(Float distancePrice) {
        this.distancePrice = distancePrice;
    }

    public Float getTimePrice() {
        return timePrice;
    }

    public void setTimePrice(Float timePrice) {
        this.timePrice = timePrice;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getTtcPrice() {
        return ttcPrice;
    }

    public void setTtcPrice(Float ttcPrice) {
        this.ttcPrice = ttcPrice;
    }

    public Float getHtPrice() {
        return htPrice;
    }

    public void setHtPrice(Float htPrice) {
        this.htPrice = htPrice;
    }

    public String getPaxesVolume() {
        return paxesVolume;
    }

    public void setPaxesVolume(String paxesVolume) {
        this.paxesVolume = paxesVolume;
    }

    @Override
    public String toString() {
        return "Price{" +
                "classId='" + classId + '\'' +
                ", className='" + className + '\'' +
                ", distancePrice=" + distancePrice +
                ", timePrice=" + timePrice +
                ", price=" + price +
                ", ttcPrice=" + ttcPrice +
                ", htPrice=" + htPrice +
                ", paxesVolume='" + paxesVolume + '\'' +
                '}';
    }
}
