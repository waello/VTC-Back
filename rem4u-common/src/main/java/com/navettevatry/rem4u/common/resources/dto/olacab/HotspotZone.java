package com.navettevatry.rem4u.common.resources.dto.olacab;

import java.io.Serializable;
import java.util.List;

/**
 *
 * Created by Wael Jlassi.
 * Updated by Chakib Daii.
 */

public class HotspotZone implements Serializable {
    private Boolean is_hotpot_zone;
    private String desc;
    private Integer default_pickup_point_id;
    private List<List<Float>> hotspot_boundary;
    private List<PickupPoint> pickup_points;

    public HotspotZone() {
    }

    public HotspotZone(Boolean is_hotpot_zone, String desc, Integer default_pickup_point_id,
                       List<List<Float>> hotspot_boundary, List<PickupPoint> pickup_points) {
        this.is_hotpot_zone = is_hotpot_zone;
        this.desc = desc;
        this.default_pickup_point_id = default_pickup_point_id;
        this.hotspot_boundary = hotspot_boundary;
        this.pickup_points = pickup_points;
    }

    public Boolean isIs_hotpot_zone() {
        return is_hotpot_zone;
    }

    public void setIs_hotpot_zone(Boolean is_hotpot_zone) {
        this.is_hotpot_zone = is_hotpot_zone;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getDefault_pickup_point_id() {
        return default_pickup_point_id;
    }

    public void setDefault_pickup_poInteger_id(Integer default_pickup_point_id) {
        this.default_pickup_point_id = default_pickup_point_id;
    }

    public List<List<Float>> getHotspot_boundary() {
        return hotspot_boundary;
    }

    public void setHotspot_boundary(List<List<Float>> hotspot_boundary) {
        this.hotspot_boundary = hotspot_boundary;
    }

    public List<PickupPoint> getPickup_points() {
        return pickup_points;
    }

    public void setPickup_points(List<PickupPoint> pickup_points) {
        this.pickup_points = pickup_points;
    }

    @Override
    public String toString() {
        return "HotspotZone{" +
                "is_hotpot_zone=" + is_hotpot_zone +
                ", desc='" + desc + '\'' +
                ", default_pickup_point_id=" + default_pickup_point_id +
                ", hotspot_boundary=" + hotspot_boundary +
                ", pickup_points=" + pickup_points +
                '}';
    }
}
