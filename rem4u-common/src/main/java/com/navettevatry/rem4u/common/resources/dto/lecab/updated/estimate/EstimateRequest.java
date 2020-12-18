package com.navettevatry.rem4u.common.resources.dto.lecab.updated.estimate;

import java.util.Date;

public class EstimateRequest {
    private Date date;
    private DropRequest pickup;
    private DropRequest drop;

    public Date getDate() { return date; }
    public void setDate(Date value) { this.date = value; }

    public DropRequest getPickup() { return pickup; }
    public void setPickup(DropRequest value) { this.pickup = value; }

    public DropRequest getDrop() { return drop; }
    public void setDrop(DropRequest value) { this.drop = value; }
}

