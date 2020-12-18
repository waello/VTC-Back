package com.navettevatry.rem4u.common.resources.dto.EureCab;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Stats implements Serializable {
    @JsonProperty("nb_res")
    private Integer nbRes;
    @JsonProperty("min_eco")
    private Integer minEco;
    @JsonProperty("min_affaires")
    private Integer minAffaires;
    @JsonProperty("min_van")
    private Integer minVan;
    @JsonProperty("min_moto")
    private Integer minMoto;

    public Stats() {
    }

    public Stats(Integer nbRes, Integer minEco, Integer minAffaires, Integer minVan, Integer minMoto) {
        this.nbRes = nbRes;
        this.minEco = minEco;
        this.minAffaires = minAffaires;
        this.minVan = minVan;
        this.minMoto = minMoto;
    }

    public Integer getNbRes() {
        return nbRes;
    }

    public void setNbRes(Integer nbRes) {
        this.nbRes = nbRes;
    }

    public Integer getMinEco() {
        return minEco;
    }

    public void setMinEco(Integer minEco) {
        this.minEco = minEco;
    }

    public Integer getMinAffaires() {
        return minAffaires;
    }

    public void setMinAffaires(Integer minAffaires) {
        this.minAffaires = minAffaires;
    }

    public Integer getMinVan() {
        return minVan;
    }

    public void setMinVan(Integer minVan) {
        this.minVan = minVan;
    }

    public Integer getMinMoto() {
        return minMoto;
    }

    public void setMinMoto(Integer minMoto) {
        this.minMoto = minMoto;
    }

    @Override
    public String toString() {
        return "Stats{" +
                "nbRes=" + nbRes +
                ", minEco=" + minEco +
                ", minAffaires=" + minAffaires +
                ", minVan=" + minVan +
                ", minMoto=" + minMoto +
                '}';
    }
}