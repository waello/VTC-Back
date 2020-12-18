package com.navettevatry.rem4u.common.resources.dto.allocab;


import java.io.Serializable;

/**
 *
 * Created by Ahmed Ferjani.
 */
public class Quotation implements Serializable {
    private Integer price;
    private String currency;
    private String vehiclePanelKey;
    private String vehiclePanelName;
    private String vehicleType;
    private Integer maxPassengers;
    private String vehicleDescription;
    private String photo;
    private String status;

    public Quotation() {
    }

    public Quotation(Integer price, String currency, String vehiclePanelKey, String vehiclePanelName, String vehicleType, Integer maxPassengers, String vehicleDescription, String photo, String status) {
        this.price = price;
        this.currency = currency;
        this.vehiclePanelKey = vehiclePanelKey;
        this.vehiclePanelName = vehiclePanelName;
        this.vehicleType = vehicleType;
        this.maxPassengers = maxPassengers;
        this.vehicleDescription = vehicleDescription;
        this.photo = photo;
        this.status = status;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getVehiclePanelKey() {
        return vehiclePanelKey;
    }

    public void setVehiclePanelKey(String vehiclePanelKey) {
        this.vehiclePanelKey = vehiclePanelKey;
    }

    public String getVehiclePanelName() {
        return vehiclePanelName;
    }

    public void setVehiclePanelName(String vehiclePanelName) {
        this.vehiclePanelName = vehiclePanelName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Integer getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(Integer maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public String getVehicleDescription() {
        return vehicleDescription;
    }

    public void setVehicleDescription(String vehicleDescription) {
        this.vehicleDescription = vehicleDescription;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Quotation{" +
                "price=" + price +
                ", currency='" + currency + '\'' +
                ", vehiclePanelKey='" + vehiclePanelKey + '\'' +
                ", vehiclePanelName='" + vehiclePanelName + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", maxPassengers=" + maxPassengers +
                ", vehicleDescription='" + vehicleDescription + '\'' +
                ", photo='" + photo + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
