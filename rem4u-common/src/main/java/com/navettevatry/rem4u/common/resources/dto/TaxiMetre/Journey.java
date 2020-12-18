package  com.navettevatry.rem4u.common.resources.dto.TaxiMetre;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;

public class Journey implements Serializable {
    private String distance;
    private String duration;
    private Object trafic;

    @JsonProperty("distance")
    public String getDistance() { return distance; }
    @JsonProperty("distance")
    public void setDistance(String value) { this.distance = value; }

    @JsonProperty("duration")
    public String getDuration() { return duration; }
    @JsonProperty("duration")
    public void setDuration(String value) { this.duration = value; }

    @JsonProperty("trafic")
    public Object getTrafic() { return trafic; }
    @JsonProperty("trafic")
    public void setTrafic(Object value) { this.trafic = value; }
}