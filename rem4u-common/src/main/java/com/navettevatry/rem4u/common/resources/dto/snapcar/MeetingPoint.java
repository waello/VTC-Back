package com.navettevatry.rem4u.common.resources.dto.snapcar;

import java.io.Serializable;

/**
 *
 * Created by Chakib Daii.
 */
public class MeetingPoint implements Serializable {
    private String id; /*Unique identifier for the resource*/
    private LocalizedText name; /*Name of the meeting point*/
    private LocalizedText rdv_point; /*Detailed access information*/

    public MeetingPoint() {
    }

    public MeetingPoint(String id, LocalizedText name, LocalizedText rdv_point) {
        this.id = id;
        this.name = name;
        this.rdv_point = rdv_point;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalizedText getName() {
        return name;
    }

    public void setName(LocalizedText name) {
        this.name = name;
    }

    public LocalizedText getRdv_point() {
        return rdv_point;
    }

    public void setRdv_point(LocalizedText rdv_point) {
        this.rdv_point = rdv_point;
    }

    @Override
    public String toString() {
        return "MeetingPoint{" +
                "id='" + id + '\'' +
                ", name=" + name +
                ", rdv_point=" + rdv_point +
                '}';
    }
}
