package com.navettevatry.rem4u.common.resources.dto.here;
/**
 *
 * Created by Ala Hadj Brahim & Ichrak Ben Abdallah.
 * Updated by Chakib DAII
 */
public class Place {
    private String type;
    private Location location;
    private Location originalLocation;

    public Place() {
    }

    public Place(String type, Location location, Location originalLocation) {
        this.type = type;
        this.location = location;
        this.originalLocation = originalLocation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getOriginalLocation() {
        return originalLocation;
    }

    public void setOriginalLocation(Location originalLocation) {
        this.originalLocation = originalLocation;
    }

    @Override
    public String toString() {
        return "Place{" +
                "type='" + type + '\'' +
                ", location=" + location +
                ", originalLocation=" + originalLocation +
                '}';
    }
}
