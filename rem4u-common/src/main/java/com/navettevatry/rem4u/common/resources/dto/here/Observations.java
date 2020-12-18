package com.navettevatry.rem4u.common.resources.dto.here;

/**
 *
 * Created by Ala Hadj Brahim & Ichrak Ben Abdallah.
 */
import java.util.List;

public class Observations {
    private List<LocationWeather> location;


    public Observations(){

    }

    public Observations(List<LocationWeather> location) {
        this.location = location;
    }

    public List<LocationWeather> getLocation() {
        return location;
    }

    public void setLocation(List<LocationWeather> location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Observations{" +
                "location=" + location +
                '}';
    }
}
