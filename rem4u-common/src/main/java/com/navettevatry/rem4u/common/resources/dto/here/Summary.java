package com.navettevatry.rem4u.common.resources.dto.here;

/**
 *
 * Created by Ala Hadj Brahim & Ichrak Ben Abdallah.
 */
public class Summary {
    private float duration;
    private float length;
    private float consumption;
    private float baseDuration;

    public Summary(){

    }

    public Summary(Float duration, Float length, Float consumption, Float baseduration) {
        this.duration = duration;
        this.length = length;
        this.consumption = consumption;
        this.baseDuration = baseduration;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    public float  getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public float getConsumption() {
        return consumption;
    }

    public void setConsumption(Float consumption) {
        this.consumption = consumption;
    }

    public float getBaseduration() {
        return baseDuration;
    }

    public void setBaseduration(Float baseduration) {
        this.baseDuration = baseduration;
    }

    @Override
    public String toString() {
        return "Summary{" +
                "duration=" + duration +
                ", length=" + length +
                ", consumption=" + consumption +
                ", baseduration=" + baseDuration +
                '}';
    }
}
