package com.navettevatry.rem4u.common.resources.dto.lecab.updated.price;

public class Available {
    private boolean pickupAvailable;
    private boolean dropoffAvailable;
    private boolean intermediateAvailable;

    public boolean getPickupAvailable() {
        return pickupAvailable;
    }

    public void setPickupAvailable(boolean value) {
        this.pickupAvailable = value;
    }

    public boolean getDropoffAvailable() {
        return dropoffAvailable;
    }

    public void setDropoffAvailable(boolean value) {
        this.dropoffAvailable = value;
    }

    public boolean getIntermediateAvailable() {
        return intermediateAvailable;
    }

    public void setIntermediateAvailable(boolean value) {
        this.intermediateAvailable = value;
    }
}
