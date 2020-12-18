package com.navettevatry.rem4u.common.resources.dto.marcel;

import com.fasterxml.jackson.annotation.*;

public class TimeSlot {
    private String start;
    private String end;

    @JsonProperty("start")
    public String getStart() { return start; }
    @JsonProperty("start")
    public void setStart(String value) { this.start = value; }

    @JsonProperty("end")
    public String getEnd() { return end; }
    @JsonProperty("end")
    public void setEnd(String value) { this.end = value; }
}
