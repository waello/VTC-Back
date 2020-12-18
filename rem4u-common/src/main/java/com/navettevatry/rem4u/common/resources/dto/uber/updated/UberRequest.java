// UberRequest.java

package com.navettevatry.rem4u.common.resources.dto.uber.updated;

import com.navettevatry.rem4u.common.resources.dto.uber.updated.UberRequestStatus;

import java.util.List;

public class UberRequest {
    private String locale;
    private PickupLocation pickupLocation;
    private Destination destination;
    private UberRequestStatus status;
    private Object profileUUID;
    private Object profileType;
    private boolean isScheduled;

    public String getLocale() { return locale; }
    public void setLocale(String value) { this.locale = value; }

    public PickupLocation getPickupLocation() { return pickupLocation; }
    public void setPickupLocation(PickupLocation value) { this.pickupLocation = value; }

    public Destination getDestination() { return destination; }
    public void setDestination(Destination value) { this.destination = value; }

    public UberRequestStatus getStatus() { return status; }
    public void setStatus(UberRequestStatus value) { this.status = value; }

    public Object getProfileUUID() { return profileUUID; }
    public void setProfileUUID(Object value) { this.profileUUID = value; }

    public Object getProfileType() { return profileType; }
    public void setProfileType(Object value) { this.profileType = value; }

    public boolean getIsScheduled() { return isScheduled; }
    public void setIsScheduled(boolean value) { this.isScheduled = value; }

    @Override
    public String toString() {
        return "UberRequest{" +
                "locale='" + locale + '\'' +
                ", pickupLocation=" + pickupLocation +
                ", destination=" + destination +
                ", status=" + status +
                ", profileUUID=" + profileUUID +
                ", profileType=" + profileType +
                ", isScheduled=" + isScheduled +
                '}';
    }
}

