package  com.navettevatry.rem4u.common.resources.dto.TaxiMetre;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.List;

public class TaxiResponse implements Serializable {
    private boolean success;
    private List<Result> results;
    private Journey journey;
    private long idRequete;

    @JsonProperty("success")
    public boolean getSuccess() { return success; }
    @JsonProperty("success")
    public void setSuccess(boolean value) { this.success = value; }

    @JsonProperty("results")
    public List<Result> getResults() { return results; }
    @JsonProperty("results")
    public void setResults(List<Result> value) { this.results = value; }

    @JsonProperty("journey")
    public Journey getJourney() { return journey; }
    @JsonProperty("journey")
    public void setJourney(Journey value) { this.journey = value; }

    @JsonProperty("id_requete")
    public long getIDRequete() { return idRequete; }
    @JsonProperty("id_requete")
    public void setIDRequete(long value) { this.idRequete = value; }
}
