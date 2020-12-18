package com.navettevatry.rem4u.common.resources.dto.uber.updated;

import com.navettevatry.rem4u.common.resources.dto.uber.updated.Tiers;
import com.navettevatry.rem4u.common.resources.dto.uber.updated.VehicleView;

import java.util.List;
import java.util.Map;

public class Status {
    private String name;
    private String description;
    private DynamicFares dynamicFares;
    private Map<String, NearbyVehicle> nearbyVehicles;
    private ReverseGeocode reverseGeocode;
    private String cityName;
    private String cityID;
    private Map<String, VehicleView> vehicleViews;
    private List<Long> viewsOrder;
    private long defaultVehicleViewID;
    private Tiers tiers;
    private List<String> tiersOrder;
    private String fareSplitFeeString;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public DynamicFares getDynamicFares() {
        return dynamicFares;
    }

    public void setDynamicFares(DynamicFares value) {
        this.dynamicFares = value;
    }

    public Map<String, NearbyVehicle> getNearbyVehicles() {
        return nearbyVehicles;
    }

    public void setNearbyVehicles(Map<String, NearbyVehicle> value) {
        this.nearbyVehicles = value;
    }

    public ReverseGeocode getReverseGeocode() {
        return reverseGeocode;
    }

    public void setReverseGeocode(ReverseGeocode value) {
        this.reverseGeocode = value;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String value) {
        this.cityName = value;
    }

    public String getCityID() {
        return cityID;
    }

    public void setCityID(String value) {
        this.cityID = value;
    }

    public Map<String, VehicleView> getVehicleViews() {
        return vehicleViews;
    }

    public void setVehicleViews(Map<String, VehicleView> value) {
        this.vehicleViews = value;
    }

    public List<Long> getViewsOrder() {
        return viewsOrder;
    }

    public void setViewsOrder(List<Long> value) {
        this.viewsOrder = value;
    }

    public long getDefaultVehicleViewID() {
        return defaultVehicleViewID;
    }

    public void setDefaultVehicleViewID(long value) {
        this.defaultVehicleViewID = value;
    }

    public Tiers getTiers() {
        return tiers;
    }

    public void setTiers(Tiers value) {
        this.tiers = value;
    }

    public List<String> getTiersOrder() {
        return tiersOrder;
    }

    public void setTiersOrder(List<String> value) {
        this.tiersOrder = value;
    }

    public String getFareSplitFeeString() {
        return fareSplitFeeString;
    }

    public void setFareSplitFeeString(String value) {
        this.fareSplitFeeString = value;
    }

    @Override
    public String toString() {
        return "Status{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dynamicFares=" + dynamicFares +
                ", nearbyVehicles=" + nearbyVehicles +
                ", reverseGeocode=" + reverseGeocode +
                ", cityName='" + cityName + '\'' +
                ", cityID='" + cityID + '\'' +
                ", vehicleViews=" + vehicleViews +
                ", viewsOrder=" + viewsOrder +
                ", defaultVehicleViewID=" + defaultVehicleViewID +
                ", tiers=" + tiers +
                ", tiersOrder=" + tiersOrder +
                ", fareSplitFeeString='" + fareSplitFeeString + '\'' +
                '}';
    }
}
