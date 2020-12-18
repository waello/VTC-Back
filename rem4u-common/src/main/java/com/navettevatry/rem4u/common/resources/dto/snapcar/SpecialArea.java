package com.navettevatry.rem4u.common.resources.dto.snapcar;

import java.io.Serializable;
import java.util.List;

/**
 *
 * Created by Chakib Daii.
 */
public class SpecialArea implements Serializable {
    private String id; /*Unique identifier for the resource*/
    private LocalizedText name; /*Name of the meeting point*/
    private LocalizedText menu_name; /*The name of the input field (eg : terminal)*/
    private Boolean selection_required; /*True if the user should have to select a meeting point*/
    private String area_type; /*The type of special area ['airport' or 'station' or 'normal']*/
    private List<MeetingPoint> meeting_points; /*The list of meeting points to be displayed, if nameboard option is not selected*/
    private List<MeetingPoint> meeting_points_nameboard; /*The list of meeting points to be displayed, if nameboard option is selected*/

    public SpecialArea() {
    }

    public SpecialArea(String id, LocalizedText name) {
        this.id = id;
        this.name = name;
    }

    public SpecialArea(String id, LocalizedText name, LocalizedText menu_name, Boolean selection_required, String area_type,
                       List<MeetingPoint> meeting_points, List<MeetingPoint> meeting_points_nameboard) {
        this.id = id;
        this.name = name;
        this.menu_name = menu_name;
        this.selection_required = selection_required;
        this.area_type = area_type;
        this.meeting_points = meeting_points;
        this.meeting_points_nameboard = meeting_points_nameboard;
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

    public LocalizedText getMenu_name() {
        return menu_name;
    }

    public void setMenu_name(LocalizedText menu_name) {
        this.menu_name = menu_name;
    }

    public Boolean isSelection_required() {
        return selection_required;
    }

    public void setSelection_required(Boolean selection_required) {
        this.selection_required = selection_required;
    }

    public String getArea_type() {
        return area_type;
    }

    public void setArea_type(String area_type) {
        this.area_type = area_type;
    }

    public List<MeetingPoint> getMeeting_points() {
        return meeting_points;
    }

    public void setMeeting_points(List<MeetingPoint> meeting_points) {
        this.meeting_points = meeting_points;
    }

    public List<MeetingPoint> getMeeting_points_nameboard() {
        return meeting_points_nameboard;
    }

    public void setMeeting_points_nameboard(List<MeetingPoint> meeting_points_nameboard) {
        this.meeting_points_nameboard = meeting_points_nameboard;
    }


    @Override
    public String toString() {
        return "SpecialArea{" +
                "id='" + id + '\'' +
                ", name=" + name +
                ", menu_name=" + menu_name +
                ", selection_required=" + selection_required +
                ", area_type='" + area_type + '\'' +
                ", meeting_points=" + meeting_points +
                ", meeting_points_nameboard=" + meeting_points_nameboard +
                '}';
    }
}
