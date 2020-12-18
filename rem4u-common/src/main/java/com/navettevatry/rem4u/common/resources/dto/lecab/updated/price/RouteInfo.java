package com.navettevatry.rem4u.common.resources.dto.lecab.updated.price;

public class RouteInfo {
    private boolean waitAndReturn;
    private boolean destinationUnknown;
    private boolean asDirected;
    private Object asDirectedMinutes;

    public boolean getWaitAndReturn() {
        return waitAndReturn;
    }

    public void setWaitAndReturn(boolean value) {
        this.waitAndReturn = value;
    }

    public boolean getDestinationUnknown() {
        return destinationUnknown;
    }

    public void setDestinationUnknown(boolean value) {
        this.destinationUnknown = value;
    }

    public boolean getAsDirected() {
        return asDirected;
    }

    public void setAsDirected(boolean value) {
        this.asDirected = value;
    }

    public Object getAsDirectedMinutes() {
        return asDirectedMinutes;
    }

    public void setAsDirectedMinutes(Object value) {
        this.asDirectedMinutes = value;
    }
}
