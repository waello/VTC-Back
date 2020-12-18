package com.navettevatry.rem4u.common.resources.dto.uber.updated;

import java.util.UUID;

public class VehicleView {
    private long id;
    private UUID uuid;
    private UUID parentUUID;
    private Tier tier;
    private String name;
    private String detailsName;
    private Details details;
    private boolean uberNoLongerAvailable;
    private String noneAvailableString;
    private String routePreviewStyle;
    private TripTime tripTime;
    private boolean allowRidepool;
    private boolean isSchedulable;

    public long getID() {
        return id;
    }

    public void setID(long value) {
        this.id = value;
    }

    public UUID getUUID() {
        return uuid;
    }

    public void setUUID(UUID value) {
        this.uuid = value;
    }

    public UUID getParentUUID() {
        return parentUUID;
    }

    public void setParentUUID(UUID value) {
        this.parentUUID = value;
    }

    public Tier getTier() {
        return tier;
    }

    public void setTier(Tier value) {
        this.tier = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getDetailsName() {
        return detailsName;
    }

    public void setDetailsName(String value) {
        this.detailsName = value;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details value) {
        this.details = value;
    }

    public boolean getUberNoLongerAvailable() {
        return uberNoLongerAvailable;
    }

    public void setUberNoLongerAvailable(boolean value) {
        this.uberNoLongerAvailable = value;
    }

    public String getNoneAvailableString() {
        return noneAvailableString;
    }

    public void setNoneAvailableString(String value) {
        this.noneAvailableString = value;
    }

    public String getRoutePreviewStyle() {
        return routePreviewStyle;
    }

    public void setRoutePreviewStyle(String value) {
        this.routePreviewStyle = value;
    }

    public TripTime getTripTime() {
        return tripTime;
    }

    public void setTripTime(TripTime value) {
        this.tripTime = value;
    }

    public boolean getAllowRidepool() {
        return allowRidepool;
    }

    public void setAllowRidepool(boolean value) {
        this.allowRidepool = value;
    }

    public boolean getIsSchedulable() {
        return isSchedulable;
    }

    public void setIsSchedulable(boolean value) {
        this.isSchedulable = value;
    }

    @Override
    public String toString() {
        return "VehicleView{" +
                "id=" + id +
                ", uuid=" + uuid +
                ", parentUUID=" + parentUUID +
                ", tier=" + tier +
                ", name='" + name + '\'' +
                ", detailsName='" + detailsName + '\'' +
                ", details=" + details +
                ", uberNoLongerAvailable=" + uberNoLongerAvailable +
                ", noneAvailableString='" + noneAvailableString + '\'' +
                ", routePreviewStyle='" + routePreviewStyle + '\'' +
                ", tripTime=" + tripTime +
                ", allowRidepool=" + allowRidepool +
                ", isSchedulable=" + isSchedulable +
                '}';
    }
}
