package com.navettevatry.rem4u.common.resources.dto.bcvtc;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 *
 * Created by Wael Jlassi.
 * Updated by Chakib Daii.
 */
public class Estimation implements Serializable {
    @JsonProperty("Prices")
    private List<Price> prices; //contient tous les tarifs de toutes les classes disponibles sur le compte du chauffeur
    @JsonProperty("IsRounded")
    private Boolean isRounded; //true si le tarif (Price) a été arrondi à l'entier le plus proche
    @JsonProperty("Map")
    private String map; //Map Image with trip
    @JsonProperty("DurationText")
    private String durationText; //Le temps nécessaire pour faire ce trajet
    @JsonProperty("DurationValue")
    private Integer durationValue; //Le temps nécessaire en secondes pour faire ce trajet
    @JsonProperty("DistanceText")
    private String distanceText; //La distance entre les deux adresses en Km
    @JsonProperty("DistanceValue")
    private Integer distanceValue; //La distance entre les deux adresses en mètre
    @JsonProperty("PickUpAddress")
    private String pickUpAddress; //Adresse de prise en charge
    @JsonProperty("DropOffAddress")
    private String dropOffAddress; //Adresse d'arrivée
    @JsonProperty("ApplyVAT")
    private Boolean applyVAT; //true si la TVA est applicable
    @JsonProperty("Mad")
    private Boolean mad; //true si la course est une mise à disposition
    @JsonProperty("MadTitle")
    private String madTitle; //Type de course "Déplacement" ou "Mise à disposition"
    @JsonProperty("MadHours")
    private Integer madHours; //Le nombre d'heures supplémentaires pour la mise à disposition
    @JsonProperty("MadKm")
    private Integer madKm; //Le nombre de KM supplémentaires pour la mise à disposition

    public Estimation() {
    }

    public Estimation(List<Price> prices, Boolean isRounded, String map, String durationText, Integer durationValue, String distanceText, Integer distanceValue, String pickUpAddress, String dropOffAddress, Boolean applyVAT, Boolean mad, String madTitle, Integer madHours, Integer madKm) {
        this.prices = prices;
        this.isRounded = isRounded;
        this.map = map;
        this.durationText = durationText;
        this.durationValue = durationValue;
        this.distanceText = distanceText;
        this.distanceValue = distanceValue;
        this.pickUpAddress = pickUpAddress;
        this.dropOffAddress = dropOffAddress;
        this.applyVAT = applyVAT;
        this.mad = mad;
        this.madTitle = madTitle;
        this.madHours = madHours;
        this.madKm = madKm;
    }

    public List<Price> getPrices() {
        return prices;
    }

    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    public Boolean getRounded() {
        return isRounded;
    }

    public void setRounded(Boolean rounded) {
        isRounded = rounded;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getDurationText() {
        return durationText;
    }

    public void setDurationText(String durationText) {
        this.durationText = durationText;
    }

    public Integer getDurationValue() {
        return durationValue;
    }

    public void setDurationValue(Integer durationValue) {
        this.durationValue = durationValue;
    }

    public String getDistanceText() {
        return distanceText;
    }

    public void setDistanceText(String distanceText) {
        this.distanceText = distanceText;
    }

    public Integer getDistanceValue() {
        return distanceValue;
    }

    public void setDistanceValue(Integer distanceValue) {
        this.distanceValue = distanceValue;
    }

    public String getPickUpAddress() {
        return pickUpAddress;
    }

    public void setPickUpAddress(String pickUpAddress) {
        this.pickUpAddress = pickUpAddress;
    }

    public String getDropOffAddress() {
        return dropOffAddress;
    }

    public void setDropOffAddress(String dropOffAddress) {
        this.dropOffAddress = dropOffAddress;
    }

    public Boolean getApplyVAT() {
        return applyVAT;
    }

    public void setApplyVAT(Boolean applyVAT) {
        this.applyVAT = applyVAT;
    }

    public Boolean getMad() {
        return mad;
    }

    public void setMad(Boolean mad) {
        this.mad = mad;
    }

    public String getMadTitle() {
        return madTitle;
    }

    public void setMadTitle(String madTitle) {
        this.madTitle = madTitle;
    }

    public Integer getMadHours() {
        return madHours;
    }

    public void setMadHours(Integer madHours) {
        this.madHours = madHours;
    }

    public Integer getMadKm() {
        return madKm;
    }

    public void setMadKm(Integer madKm) {
        this.madKm = madKm;
    }

    @Override
    public String toString() {
        return "Estimation{" +
                "Prices=" + prices +
                ", isRounded=" + isRounded +
                ", map='" + map + '\'' +
                ", durationText='" + durationText + '\'' +
                ", durationValue=" + durationValue +
                ", distanceText='" + distanceText + '\'' +
                ", distanceValue=" + distanceValue +
                ", pickUpAddress='" + pickUpAddress + '\'' +
                ", dropOffAddress='" + dropOffAddress + '\'' +
                ", applyVAT=" + applyVAT +
                ", mad=" + mad +
                ", madTitle='" + madTitle + '\'' +
                ", madHours=" + madHours +
                ", madKm=" + madKm +
                '}';
    }
}
