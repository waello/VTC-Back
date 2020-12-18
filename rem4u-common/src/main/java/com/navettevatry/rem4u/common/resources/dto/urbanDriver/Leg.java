package com.navettevatry.rem4u.common.resources.dto.urbanDriver;

import java.util.List;

public class Leg {
    private long durationInTraffic;
    private long duration;
    private long distance;
    private List<Path> path;

    public long getDurationInTraffic() { return durationInTraffic; }
    public void setDurationInTraffic(long value) { this.durationInTraffic = value; }

    public long getDuration() { return duration; }
    public void setDuration(long value) { this.duration = value; }

    public long getDistance() { return distance; }
    public void setDistance(long value) { this.distance = value; }

    public List<Path> getPath() { return path; }
    public void setPath(List<Path> value) { this.path = value; }

    @Override
    public String toString() {
        return "Leg{" +
                "durationInTraffic=" + durationInTraffic +
                ", duration=" + duration +
                ", distance=" + distance +
                ", path=" + path +
                '}';
    }
}
