package com.navettevatry.rem4u.common.resources.dto.urbanDriver;

import java.util.List;

public class TrafficResponse {
    private long durationInTraffic;
    private long duration;
    private long distance;
    private String date;
    private List<Leg> legs;

    public long getDurationInTraffic() { return durationInTraffic; }
    public void setDurationInTraffic(long value) { this.durationInTraffic = value; }

    public long getDuration() { return duration; }
    public void setDuration(long value) { this.duration = value; }

    public long getDistance() { return distance; }
    public void setDistance(long value) { this.distance = value; }

    public String getDate() { return date; }
    public void setDate(String value) { this.date = value; }

    public List<Leg> getLegs() { return legs; }
    public void setLegs(List<Leg> value) { this.legs = value; }

    @Override
    public String toString() {
        return "TrafficResponse{" +
                "durationInTraffic=" + durationInTraffic +
                ", duration=" + duration +
                ", distance=" + distance +
                ", date='" + date + '\'' +
                ", legs=" + legs +
                '}';
    }
}
