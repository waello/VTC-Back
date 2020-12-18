package com.navettevatry.rem4u.common.resources.dto.allocab.updated;

public class AloCabResponse {
    private String status;
    private Result result;

    public String getStatus() { return status; }
    public void setStatus(String value) { this.status = value; }

    public Result getResult() { return result; }
    public void setResult(Result value) { this.result = value; }

    @Override
    public String toString() {
        return "AloCabResponse{" +
                "status='" + status + '\'' +
                ", result=" + result +
                '}';
    }
}

