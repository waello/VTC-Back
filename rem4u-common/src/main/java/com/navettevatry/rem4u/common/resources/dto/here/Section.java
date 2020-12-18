package com.navettevatry.rem4u.common.resources.dto.here;
/**
 *
 * Created by Ala Hadj Brahim & Ichrak Ben Abdallah.
 */
public class Section {
    private String id;
    private String type;
    private PlaceLocation departure;
    private PlaceLocation arrival;
    private Summary summary;
    private Transport transport;

    public Section(){

    }

    public Section(String id, String type, PlaceLocation departure, PlaceLocation arrival, Summary summary, Transport transport) {
        this.id = id;
        this.type = type;
        this.departure = departure;
        this.arrival = arrival;
        this.summary = summary;
        this.transport = transport;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PlaceLocation getDeparture() {
        return departure;
    }

    public void setDeparture(PlaceLocation departure) {
        this.departure = departure;
    }

    public PlaceLocation getArrival() {
        return arrival;
    }

    public void setArrival(PlaceLocation arrival) {
        this.arrival = arrival;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "Section{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", departure=" + departure +
                ", arrival=" + arrival +
                ", summary=" + summary +
                ", transport=" + transport +
                '}';
    }
}
