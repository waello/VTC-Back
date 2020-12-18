package com.navettevatry.rem4u.common.resources.dto.here;

/**
 *
 * Created by Ala Hadj Brahim & Ichrak Ben Abdallah.
 * Updated by Chakib DAII
 */
import java.util.List;

public class Route {
    private String id ;
    private List<Section> Sections;

    public Route(){

    }

    public Route(String id, List<Section> sections) {
        this.id = id;
        Sections = sections;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Section> getSections() {
        return Sections;
    }

    public void setSections(List<Section> sections) {
        Sections = sections;
    }

    @Override
    public String toString() {
        return "Route{" +
                "id='" + id + '\'' +
                ", Sections=" + Sections +
                '}';
    }
}