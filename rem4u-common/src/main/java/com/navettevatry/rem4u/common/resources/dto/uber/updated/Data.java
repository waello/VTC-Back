package com.navettevatry.rem4u.common.resources.dto.uber.updated;


import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Data {
    private UUID fareSessionUUID;
    private Map<String, Estimate> estimates;
    private Status status;
    private Object pickupDetails;
    private DestinationDetails destinationDetails;

    public UUID getFareSessionUUID() {
        return fareSessionUUID;
    }

    public void setFareSessionUUID(UUID value) {
        this.fareSessionUUID = value;
    }

    public Map<String, Estimate> getEstimates() {
        return estimates;
    }

    public void setEstimates(Map<String, Estimate> value) {
        this.estimates = value;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status value) {
        this.status = value;
    }

    public Object getPickupDetails() {
        return pickupDetails;
    }

    public void setPickupDetails(Object value) {
        this.pickupDetails = value;
    }

    public DestinationDetails getDestinationDetails() {
        return destinationDetails;
    }

    public void setDestinationDetails(DestinationDetails value) {
        this.destinationDetails = value;
    }

    @Override
    public String toString() {
        return "Data{" +
                "fareSessionUUID=" + fareSessionUUID +
                ", estimates=" + estimates +
                ", status=" + status +
                ", pickupDetails=" + pickupDetails +
                ", destinationDetails=" + destinationDetails +
                '}';
    }
}
