package com.navettevatry.rem4u.common.resources.dto.marcel;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class VehicleType {
    private List<Object> capacities;
    private long delayFreeInMin;
    private long delayFreeAirportInMin;
    private double delayFeePerMinHuman;
    private String designation;
    private boolean freeRideAllowed;
    private boolean freeRidePersoAllowed;
    private boolean freeRideProAllowed;
    private long id;
    private String logo;
    private String mapToUse;
    private long maxStops;
    private boolean pooling;
    private long scheduleMinOffsetInMin;
    private boolean useStations;
    private long reservationInterface;
    private long maxLuggages;
    private long maxPlaces;
    private List<Object> options;

    @JsonProperty("capacities")
    public List<Object> getCapacities() { return capacities; }
    @JsonProperty("capacities")
    public void setCapacities(List<Object> value) { this.capacities = value; }

    @JsonProperty("delay_free_in_min")
    public long getDelayFreeInMin() { return delayFreeInMin; }
    @JsonProperty("delay_free_in_min")
    public void setDelayFreeInMin(long value) { this.delayFreeInMin = value; }

    @JsonProperty("delay_free_airport_in_min")
    public long getDelayFreeAirportInMin() { return delayFreeAirportInMin; }
    @JsonProperty("delay_free_airport_in_min")
    public void setDelayFreeAirportInMin(long value) { this.delayFreeAirportInMin = value; }

    @JsonProperty("delay_fee_per_min_human")
    public double getDelayFeePerMinHuman() { return delayFeePerMinHuman; }
    @JsonProperty("delay_fee_per_min_human")
    public void setDelayFeePerMinHuman(double value) { this.delayFeePerMinHuman = value; }

    @JsonProperty("designation")
    public String getDesignation() { return designation; }
    @JsonProperty("designation")
    public void setDesignation(String value) { this.designation = value; }

    @JsonProperty("free_ride_allowed")
    public boolean getFreeRideAllowed() { return freeRideAllowed; }
    @JsonProperty("free_ride_allowed")
    public void setFreeRideAllowed(boolean value) { this.freeRideAllowed = value; }

    @JsonProperty("free_ride_perso_allowed")
    public boolean getFreeRidePersoAllowed() { return freeRidePersoAllowed; }
    @JsonProperty("free_ride_perso_allowed")
    public void setFreeRidePersoAllowed(boolean value) { this.freeRidePersoAllowed = value; }

    @JsonProperty("free_ride_pro_allowed")
    public boolean getFreeRideProAllowed() { return freeRideProAllowed; }
    @JsonProperty("free_ride_pro_allowed")
    public void setFreeRideProAllowed(boolean value) { this.freeRideProAllowed = value; }

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("logo")
    public String getLogo() { return logo; }
    @JsonProperty("logo")
    public void setLogo(String value) { this.logo = value; }

    @JsonProperty("map_to_use")
    public String getMapToUse() { return mapToUse; }
    @JsonProperty("map_to_use")
    public void setMapToUse(String value) { this.mapToUse = value; }

    @JsonProperty("max_stops")
    public long getMaxStops() { return maxStops; }
    @JsonProperty("max_stops")
    public void setMaxStops(long value) { this.maxStops = value; }

    @JsonProperty("pooling")
    public boolean getPooling() { return pooling; }
    @JsonProperty("pooling")
    public void setPooling(boolean value) { this.pooling = value; }

    @JsonProperty("schedule_min_offset_in_min")
    public long getScheduleMinOffsetInMin() { return scheduleMinOffsetInMin; }
    @JsonProperty("schedule_min_offset_in_min")
    public void setScheduleMinOffsetInMin(long value) { this.scheduleMinOffsetInMin = value; }

    @JsonProperty("use_stations")
    public boolean getUseStations() { return useStations; }
    @JsonProperty("use_stations")
    public void setUseStations(boolean value) { this.useStations = value; }

    @JsonProperty("reservation_interface")
    public long getReservationInterface() { return reservationInterface; }
    @JsonProperty("reservation_interface")
    public void setReservationInterface(long value) { this.reservationInterface = value; }

    @JsonProperty("max_luggages")
    public long getMaxLuggages() { return maxLuggages; }
    @JsonProperty("max_luggages")
    public void setMaxLuggages(long value) { this.maxLuggages = value; }

    @JsonProperty("max_places")
    public long getMaxPlaces() { return maxPlaces; }
    @JsonProperty("max_places")
    public void setMaxPlaces(long value) { this.maxPlaces = value; }

    @JsonProperty("options")
    public List<Object> getOptions() { return options; }
    @JsonProperty("options")
    public void setOptions(List<Object> value) { this.options = value; }
}
