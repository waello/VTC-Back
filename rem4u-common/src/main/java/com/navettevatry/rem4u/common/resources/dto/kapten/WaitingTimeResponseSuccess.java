package com.navettevatry.rem4u.common.resources.dto.kapten;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 *
 * Created by Ahmed Ferjani.
 * Updated By Chakib Daii.
 */
public class WaitingTimeResponseSuccess implements Serializable {
    @JsonProperty("eta_estimates")
    private List<WaitingTimeEstimate> etaEstimates;

    public WaitingTimeResponseSuccess() {
    }

    public WaitingTimeResponseSuccess(List<WaitingTimeEstimate> etaEstimates) {
        this.etaEstimates = etaEstimates;
    }

    public List<WaitingTimeEstimate> getEtaEstimates() {
        return etaEstimates;
    }

    public void setEtaEstimates(List<WaitingTimeEstimate> etaEstimates) {
        this.etaEstimates = etaEstimates;
    }

    @Override
    public String toString() {
        return "WaitingTimeResponseSuccess{" +
                "etaEstimates=" + etaEstimates +
                '}';
    }
}
