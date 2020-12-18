package com.navettevatry.rem4u.common.resources.dto.here;

/**
 *
 * Created by Ala Hadj Brahim & Ichrak Ben Abdallah.
 * Updated by Chakib DAII
 */
import java.util.List;

public class LocationWeather {
    private List<Observation> observation;
    private String country;
    private String state;
    private String city;
    private Float latitude ;
    private Float longitude;
    private Float distance;
    private Float timezone;


    public LocationWeather(){

    }

    public LocationWeather(List<Observation> observation, String country, String state, String city, Float latitude, Float longitude, Float distance, Float timezone) {
        this.observation = observation;
        this.country = country;
        this.state = state;
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
        this.distance = distance;
        this.timezone = timezone;
    }

    public List<Observation> getObservations() {
        return observation;
    }

    public void setObservations(List<Observation> observation) {
        this.observation = observation;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public Float getTimezone() {
        return timezone;
    }

    public void setTimezone(Float timezone) {
        this.timezone = timezone;
    }

    @Override
    public String toString() {
        return "LocationWeather{" +
                "observations=" + observation +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", distance=" + distance +
                ", timezone=" + timezone +
                '}';
    }
}
