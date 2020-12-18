package com.navettevatry.rem4u.common.resources.dto.here;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 *
 * Created by Ala Hadj Brahim & Ichrak Ben Abdallah.
 * Updated by Chakib DAII
 */

public class WeatherResponse {
    private Observations observations;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private Date feedCreation;
    private Boolean metric;

    public WeatherResponse(){

    }

    public WeatherResponse(Observations observations, Date feedCreation, Boolean metric) {
        this.observations = observations;
        this.feedCreation = feedCreation;
        this.metric = metric;
    }

    public Observations getObservations() {
        return observations;
    }

    public void setObservations(Observations observations) {
        this.observations = observations;
    }

    public Date getFeedCreation() {
        return feedCreation;
    }

    public void setFeedCreation(Date feedCreation) {
        this.feedCreation = feedCreation;
    }

    public Boolean getMetric() {
        return metric;
    }

    public void setMetric(Boolean metric) {
        this.metric = metric;
    }

    @Override
    public String toString() {
        return "WeatherResponse{" +
                "observations=" + observations +
                ", feedCreation=" + feedCreation +
                ", metric=" + metric +
                '}';
    }
}
