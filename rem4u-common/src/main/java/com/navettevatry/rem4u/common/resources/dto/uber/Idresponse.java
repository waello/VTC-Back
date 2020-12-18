// Idresponse.java

package com.navettevatry.rem4u.common.resources.dto.uber;

import java.util.List;

public class Idresponse {
    private PlusCode plusCode;
    private List<Result> results;
    private String status;

    public PlusCode getPlusCode() { return plusCode; }
    public void setPlusCode(PlusCode value) { this.plusCode = value; }

    public List<Result> getResults() { return results; }
    public void setResults(List<Result> value) { this.results = value; }

    public String getStatus() { return status; }
    public void setStatus(String value) { this.status = value; }
}

