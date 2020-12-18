package com.navettevatry.rem4u.common.resources.dto.allocab.updated;

public class DirectionResume {
    private long distance;
    private long duration;
    private long durationInTraffic;
    private End start;
    private End end;

    public long getDistance() { return distance; }
    public void setDistance(long value) { this.distance = value; }

    public long getDuration() { return duration; }
    public void setDuration(long value) { this.duration = value; }

    public long getDurationInTraffic() { return durationInTraffic; }
    public void setDurationInTraffic(long value) { this.durationInTraffic = value; }

    public End getStart() { return start; }
    public void setStart(End value) { this.start = value; }

    public End getEnd() { return end; }
    public void setEnd(End value) { this.end = value; }

    @Override
    public String toString() {
        return "DirectionResume{" +
                "distance=" + distance +
                ", duration=" + duration +
                ", durationInTraffic=" + durationInTraffic +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
