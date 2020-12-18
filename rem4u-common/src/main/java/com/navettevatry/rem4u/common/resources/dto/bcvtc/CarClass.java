package com.navettevatry.rem4u.common.resources.dto.bcvtc;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 *
 * Created by Wael Jlassi.
 * Updated by Chakib Daii.
 */
public class CarClass implements Serializable {
    @JsonProperty("ClassId")
    private String classId;	//L'identifiant unique de la classe
    @JsonProperty("ClassName")
    private String className;	//Le nom de la classe
    @JsonProperty("KmPrice")
    private String kmPrice;	//Tarif kilométrique sur un kilomètre en €
    @JsonProperty("MinutePrice")
    private String minutePrice;	//Tarif minute en €
    @JsonProperty("BasePrice")
    private String basePrice;	//Le tarif de base en €, (autrement dit Prise en charge) qui sera ajouté automatiquement à chaque formule de calcul.
    @JsonProperty("MiniPrice")
    private String miniPrice;	//Le prix minimum en €.
    @JsonProperty("PaxesVolume")
    private String paxesVolume;	//Nombre de places pour les passagers (Sans le chauffeur).

    public CarClass() {
    }

    public CarClass(String classId, String className, String kmPrice, String minutePrice, String basePrice, String miniPrice, String paxesVolume) {
        this.classId = classId;
        this.className = className;
        this.kmPrice = kmPrice;
        this.minutePrice = minutePrice;
        this.basePrice = basePrice;
        this.miniPrice = miniPrice;
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

    public String getKmPrice() {
        return kmPrice;
    }

    public void setKmPrice(String kmPrice) {
        this.kmPrice = kmPrice;
    }

    public String getMinutePrice() {
        return minutePrice;
    }

    public void setMinutePrice(String minutePrice) {
        this.minutePrice = minutePrice;
    }

    public String getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(String basePrice) {
        this.basePrice = basePrice;
    }

    public String getMiniPrice() {
        return miniPrice;
    }

    public void setMiniPrice(String miniPrice) {
        this.miniPrice = miniPrice;
    }

    public String getPaxesVolume() {
        return paxesVolume;
    }

    public void setPaxesVolume(String paxesVolume) {
        this.paxesVolume = paxesVolume;
    }

    @Override
    public String toString() {
        return "CarClass{" +
                "classId='" + classId + '\'' +
                ", className='" + className + '\'' +
                ", kmPrice='" + kmPrice + '\'' +
                ", minutePrice='" + minutePrice + '\'' +
                ", basePrice='" + basePrice + '\'' +
                ", miniPrice='" + miniPrice + '\'' +
                ", paxesVolume='" + paxesVolume + '\'' +
                '}';
    }
}