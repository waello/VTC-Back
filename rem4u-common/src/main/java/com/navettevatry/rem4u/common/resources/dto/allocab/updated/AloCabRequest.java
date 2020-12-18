package com.navettevatry.rem4u.common.resources.dto.allocab.updated;

import java.util.Date;
import java.util.List;

/**

 {
 "session":{
 "id":5935629444071424,
 "appToken":"a7f0a5c8-1943-4351-aafc-f0b01e13ec13",
 "accessToken":"7b19e707-2b58-4c29-bba4-4c1b58408604",
 "userKeyStr":"ag5zfmFsbG9jYWItcHJvZHIuCxIQUGFzc2VuZ2VyYWNjb3VudBiAgP6B5sbhCwwLEgRVc2VyGICA_qHKy9UIDA",
 "type":"Passenger"
 },

  **/

public class AloCabRequest {
    private Session session;
    private long period;
    private List<Direction> direction;
    private Date departureAt;
    private String source;
    private boolean reception;
    private long comms;

    public Session getSession() { return session; }
    public void setSession(Session value) { this.session = value; }

    public long getPeriod() { return period; }
    public void setPeriod(long value) { this.period = value; }

    public List<Direction> getDirection() { return direction; }
    public void setDirection(List<Direction> value) { this.direction = value; }

    public Date getDepartureAt() { return departureAt; }
    public void setDepartureAt(Date value) { this.departureAt = value; }

    public String getSource() { return source; }
    public void setSource(String value) { this.source = value; }

    public boolean getReception() { return reception; }
    public void setReception(boolean value) { this.reception = value; }

    public long getComms() { return comms; }
    public void setComms(long value) { this.comms = value; }
}
