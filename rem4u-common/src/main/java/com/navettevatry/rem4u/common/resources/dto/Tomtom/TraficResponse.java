package com.navettevatry.rem4u.common.resources.dto.Tomtom;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TraficResponse {
    private FlowSegmentData flowSegmentData;

    @JsonProperty("flowSegmentData")
    public FlowSegmentData getFlowSegmentData() { return flowSegmentData; }
    @JsonProperty("flowSegmentData")
    public void setFlowSegmentData(FlowSegmentData value) { this.flowSegmentData = value; }

    @Override
    public String toString() {
        return "TraficResponse{" +
                "flowSegmentData=" + flowSegmentData +
                '}';
    }
}
