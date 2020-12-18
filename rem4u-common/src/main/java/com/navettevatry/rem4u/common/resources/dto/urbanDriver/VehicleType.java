package com.navettevatry.rem4u.common.resources.dto.urbanDriver;

import java.util.List;

public class VehicleType {
    private List<Object> capacities;
    private long delay_free_in_min;
    private long delay_free_airport_in_min;
    private long delayFeePerMinHuman;
    private String designation;
    private boolean free_ride_allowed;
    private boolean free_ride_perso_allowed;
    private boolean free_ride_pro_allowed;
    private long id;
    private String logo;
    private String map_to_use;
    private long max_stops;
    private boolean pooling;
    private long schedule_min_offset_in_min;
    private boolean use_stations;
    private long reservation_interface;
    private long max_luggages;
    private long max_places;
    private List<Object> options;

    public List<Object> getCapacities() {
        return capacities;
    }

    public void setCapacities(List<Object> capacities) {
        this.capacities = capacities;
    }

    public long getDelay_free_in_min() {
        return delay_free_in_min;
    }

    public void setDelay_free_in_min(long delay_free_in_min) {
        this.delay_free_in_min = delay_free_in_min;
    }

    public long getDelay_free_airport_in_min() {
        return delay_free_airport_in_min;
    }

    public void setDelay_free_airport_in_min(long delay_free_airport_in_min) {
        this.delay_free_airport_in_min = delay_free_airport_in_min;
    }

    public long getDelayFeePerMinHuman() {
        return delayFeePerMinHuman;
    }

    public void setDelayFeePerMinHuman(long delayFeePerMinHuman) {
        this.delayFeePerMinHuman = delayFeePerMinHuman;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public boolean isFree_ride_allowed() {
        return free_ride_allowed;
    }

    public void setFree_ride_allowed(boolean free_ride_allowed) {
        this.free_ride_allowed = free_ride_allowed;
    }

    public boolean isFree_ride_perso_allowed() {
        return free_ride_perso_allowed;
    }

    public void setFree_ride_perso_allowed(boolean free_ride_perso_allowed) {
        this.free_ride_perso_allowed = free_ride_perso_allowed;
    }

    public boolean isFree_ride_pro_allowed() {
        return free_ride_pro_allowed;
    }

    public void setFree_ride_pro_allowed(boolean free_ride_pro_allowed) {
        this.free_ride_pro_allowed = free_ride_pro_allowed;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getMap_to_use() {
        return map_to_use;
    }

    public void setMap_to_use(String map_to_use) {
        this.map_to_use = map_to_use;
    }

    public long getMax_stops() {
        return max_stops;
    }

    public void setMax_stops(long max_stops) {
        this.max_stops = max_stops;
    }

    public boolean isPooling() {
        return pooling;
    }

    public void setPooling(boolean pooling) {
        this.pooling = pooling;
    }

    public long getSchedule_min_offset_in_min() {
        return schedule_min_offset_in_min;
    }

    public void setSchedule_min_offset_in_min(long schedule_min_offset_in_min) {
        this.schedule_min_offset_in_min = schedule_min_offset_in_min;
    }

    public boolean isUse_stations() {
        return use_stations;
    }

    public void setUse_stations(boolean use_stations) {
        this.use_stations = use_stations;
    }

    public long getReservation_interface() {
        return reservation_interface;
    }

    public void setReservation_interface(long reservation_interface) {
        this.reservation_interface = reservation_interface;
    }

    public long getMax_luggages() {
        return max_luggages;
    }

    public void setMax_luggages(long max_luggages) {
        this.max_luggages = max_luggages;
    }

    public long getMax_places() {
        return max_places;
    }

    public void setMax_places(long max_places) {
        this.max_places = max_places;
    }

    public List<Object> getOptions() {
        return options;
    }

    public void setOptions(List<Object> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return
                "capacities=" + capacities +
                ", delay_free_in_min=" + delay_free_in_min +
                ", delay_free_airport_in_min=" + delay_free_airport_in_min +
                ", delayFeePerMinHuman=" + delayFeePerMinHuman +
                ", designation='" + designation + '\'' +
                ", free_ride_allowed=" + free_ride_allowed +
                ", free_ride_perso_allowed=" + free_ride_perso_allowed +
                ", free_ride_pro_allowed=" + free_ride_pro_allowed +
                ", id=" + id +
                ", logo='" + logo + '\'' +
                ", map_to_use='" + map_to_use + '\'' +
                ", max_stops=" + max_stops +
                ", pooling=" + pooling +
                ", schedule_min_offset_in_min=" + schedule_min_offset_in_min +
                ", use_stations=" + use_stations +
                ", reservation_interface=" + reservation_interface +
                ", max_luggages=" + max_luggages +
                ", max_places=" + max_places +
                ", options=" + options +
                '}';
    }
}
