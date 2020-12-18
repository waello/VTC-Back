package com.navettevatry.rem4u.common.resources.dto.lecab.updated;

import com.fasterxml.jackson.annotation.*;

public class RouteSettings {
    private boolean asDirectedAvailable;
    private boolean destinationUnknownAvailable;
    private boolean waitAndReturnAvailable;
    private Long minAsDirectedMinutes;

    @JsonProperty("asDirectedAvailable")
    public boolean getAsDirectedAvailable() { return asDirectedAvailable; }
    @JsonProperty("asDirectedAvailable")
    public void setAsDirectedAvailable(boolean value) { this.asDirectedAvailable = value; }

    @JsonProperty("destinationUnknownAvailable")
    public boolean getDestinationUnknownAvailable() { return destinationUnknownAvailable; }
    @JsonProperty("destinationUnknownAvailable")
    public void setDestinationUnknownAvailable(boolean value) { this.destinationUnknownAvailable = value; }

    @JsonProperty("waitAndReturnAvailable")
    public boolean getWaitAndReturnAvailable() { return waitAndReturnAvailable; }
    @JsonProperty("waitAndReturnAvailable")
    public void setWaitAndReturnAvailable(boolean value) { this.waitAndReturnAvailable = value; }

    @JsonProperty("minAsDirectedMinutes")
    public Long getMinAsDirectedMinutes() { return minAsDirectedMinutes; }
    @JsonProperty("minAsDirectedMinutes")
    public void setMinAsDirectedMinutes(Long value) { this.minAsDirectedMinutes = value; }
}
