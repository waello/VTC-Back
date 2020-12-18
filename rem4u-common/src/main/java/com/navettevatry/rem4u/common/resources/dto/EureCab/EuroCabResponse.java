
package com.navettevatry.rem4u.common.resources.dto.EureCab;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EuroCabResponse implements Serializable {
    @JsonProperty("centrals")
    private Centrals centrals;
    @JsonProperty("results")
    private Results results;
    @JsonProperty("stats")
    private Stats stats;
    @JsonProperty("di")
    private Boolean di;
    @JsonProperty("is_short_delay")
    private Boolean isShortDelay;
    @JsonProperty("value_short_delay")
    private Integer valueShortDelay;

    public EuroCabResponse() {
    }

    public EuroCabResponse(Centrals centrals, Results results, Stats stats, Boolean di, Boolean isShortDelay, Integer valueShortDelay) {
        this.centrals = centrals;
        this.results = results;
        this.stats = stats;
        this.di = di;
        this.isShortDelay = isShortDelay;
        this.valueShortDelay = valueShortDelay;
    }

    public Centrals getCentrals() {
        return centrals;
    }

    public void setCentrals(Centrals centrals) {
        this.centrals = centrals;
    }

    public Results getResults() {
        return results;
    }

    public void setResults(Results results) {
        this.results = results;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public Boolean getDi() {
        return di;
    }

    public void setDi(Boolean di) {
        this.di = di;
    }

    public Boolean getShortDelay() {
        return isShortDelay;
    }

    public void setShortDelay(Boolean shortDelay) {
        isShortDelay = shortDelay;
    }

    public Integer getValueShortDelay() {
        return valueShortDelay;
    }

    public void setValueShortDelay(Integer valueShortDelay) {
        this.valueShortDelay = valueShortDelay;
    }

    @Override
    public String toString() {
        return "EuroCabResponse{" +
                "centrals=" + centrals +
                ", results=" + results +
                ", stats=" + stats +
                ", di=" + di +
                ", isShortDelay=" + isShortDelay +
                ", valueShortDelay=" + valueShortDelay +
                '}';
    }
}
