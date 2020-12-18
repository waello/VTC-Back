package com.navettevatry.rem4u.common.resources.dto.urbanDriver;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// params lat/long  request
public class VehiculeResponse {
    public List<Object> capacities;
    public int delay_free_in_min;
    public int delay_free_airport_in_min;
    public double delay_fee_per_min_human;

    @Override
    public String toString() {
        return "{" +
                "capacities=" + capacities +
                ", delay_free_in_min=" + delay_free_in_min +
                ", delay_free_airport_in_min=" + delay_free_airport_in_min +
                ", delay_fee_per_min_human=" + delay_fee_per_min_human +
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

    public VehiculeResponse() {
    }

    public VehiculeResponse(List<Object> capacities, int delay_free_in_min, int delay_free_airport_in_min, double delay_fee_per_min_human, String designation, boolean free_ride_allowed, boolean free_ride_perso_allowed, boolean free_ride_pro_allowed, int id, String logo, String map_to_use, int max_stops, boolean pooling, int schedule_min_offset_in_min, boolean use_stations, int reservation_interface, int max_luggages, int max_places, List<Object> options) {
        this.capacities = capacities;
        this.delay_free_in_min = delay_free_in_min;
        this.delay_free_airport_in_min = delay_free_airport_in_min;
        this.delay_fee_per_min_human = delay_fee_per_min_human;
        this.designation = designation;
        this.free_ride_allowed = free_ride_allowed;
        this.free_ride_perso_allowed = free_ride_perso_allowed;
        this.free_ride_pro_allowed = free_ride_pro_allowed;
        this.id = id;
        this.logo = logo;
        this.map_to_use = map_to_use;
        this.max_stops = max_stops;
        this.pooling = pooling;
        this.schedule_min_offset_in_min = schedule_min_offset_in_min;
        this.use_stations = use_stations;
        this.reservation_interface = reservation_interface;
        this.max_luggages = max_luggages;
        this.max_places = max_places;
        this.options = options;
    }

    public List<Object> getCapacities() {
        return capacities;
    }

    public void setCapacities(List<Object> capacities) {
        this.capacities = capacities;
    }

    public int getDelay_free_in_min() {
        return delay_free_in_min;
    }

    public void setDelay_free_in_min(int delay_free_in_min) {
        this.delay_free_in_min = delay_free_in_min;
    }

    public int getDelay_free_airport_in_min() {
        return delay_free_airport_in_min;
    }

    public void setDelay_free_airport_in_min(int delay_free_airport_in_min) {
        this.delay_free_airport_in_min = delay_free_airport_in_min;
    }

    public double getDelay_fee_per_min_human() {
        return delay_fee_per_min_human;
    }

    public void setDelay_fee_per_min_human(double delay_fee_per_min_human) {
        this.delay_fee_per_min_human = delay_fee_per_min_human;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getMax_stops() {
        return max_stops;
    }

    public void setMax_stops(int max_stops) {
        this.max_stops = max_stops;
    }

    public boolean isPooling() {
        return pooling;
    }

    public void setPooling(boolean pooling) {
        this.pooling = pooling;
    }

    public int getSchedule_min_offset_in_min() {
        return schedule_min_offset_in_min;
    }

    public void setSchedule_min_offset_in_min(int schedule_min_offset_in_min) {
        this.schedule_min_offset_in_min = schedule_min_offset_in_min;
    }

    public boolean isUse_stations() {
        return use_stations;
    }

    public void setUse_stations(boolean use_stations) {
        this.use_stations = use_stations;
    }

    public int getReservation_interface() {
        return reservation_interface;
    }

    public void setReservation_interface(int reservation_interface) {
        this.reservation_interface = reservation_interface;
    }

    public int getMax_luggages() {
        return max_luggages;
    }

    public void setMax_luggages(int max_luggages) {
        this.max_luggages = max_luggages;
    }

    public int getMax_places() {
        return max_places;
    }

    public void setMax_places(int max_places) {
        this.max_places = max_places;
    }

    public List<Object> getOptions() {
        return options;
    }

    public void setOptions(List<Object> options) {
        this.options = options;
    }

    public String designation;
    public boolean free_ride_allowed;
    public boolean free_ride_perso_allowed;
    public boolean free_ride_pro_allowed;
    public int id;
    public String logo;
    public String map_to_use;
    public int max_stops;
    public boolean pooling;
    public int schedule_min_offset_in_min;
    public boolean use_stations;
    public int reservation_interface;
    public int max_luggages;
    public int max_places;
    public List<Object> options;
}
