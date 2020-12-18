package com.navettevatry.rem4u.common.resources.dto.uber.updated;

import com.navettevatry.rem4u.common.resources.dto.uber.updated.Meta;

import java.util.List;

public class City {
    private String cityID;
    private String cityName;
    private Meta meta;
    private String countryIso2;
    private String currencyCode;
    private long defaultVehicleViewID;
    private List<Object> vehicleViewsOrder;
    private Object productGroups;
    private List<String> productTiersOrder;
    private String timezone;
    private boolean isEmergencyLocationSharingAvailable;
    private String productsUnavailableMessage;

    public String getCityID() {
        return cityID;
    }

    public void setCityID(String value) {
        this.cityID = value;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String value) {
        this.cityName = value;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta value) {
        this.meta = value;
    }

    public String getCountryIso2() {
        return countryIso2;
    }

    public void setCountryIso2(String value) {
        this.countryIso2 = value;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    public long getDefaultVehicleViewID() {
        return defaultVehicleViewID;
    }

    public void setDefaultVehicleViewID(long value) {
        this.defaultVehicleViewID = value;
    }

    public List<Object> getVehicleViewsOrder() {
        return vehicleViewsOrder;
    }

    public void setVehicleViewsOrder(List<Object> value) {
        this.vehicleViewsOrder = value;
    }

    public Object getProductGroups() {
        return productGroups;
    }

    public void setProductGroups(Object value) {
        this.productGroups = value;
    }

    public List<String> getProductTiersOrder() {
        return productTiersOrder;
    }

    public void setProductTiersOrder(List<String> value) {
        this.productTiersOrder = value;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String value) {
        this.timezone = value;
    }

    public boolean getIsEmergencyLocationSharingAvailable() {
        return isEmergencyLocationSharingAvailable;
    }

    public void setIsEmergencyLocationSharingAvailable(boolean value) {
        this.isEmergencyLocationSharingAvailable = value;
    }

    public String getProductsUnavailableMessage() {
        return productsUnavailableMessage;
    }

    public void setProductsUnavailableMessage(String value) {
        this.productsUnavailableMessage = value;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityID='" + cityID + '\'' +
                ", cityName='" + cityName + '\'' +
                ", meta=" + meta +
                ", countryIso2='" + countryIso2 + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", defaultVehicleViewID=" + defaultVehicleViewID +
                ", vehicleViewsOrder=" + vehicleViewsOrder +
                ", productGroups=" + productGroups +
                ", productTiersOrder=" + productTiersOrder +
                ", timezone='" + timezone + '\'' +
                ", isEmergencyLocationSharingAvailable=" + isEmergencyLocationSharingAvailable +
                ", productsUnavailableMessage='" + productsUnavailableMessage + '\'' +
                '}';
    }
}
