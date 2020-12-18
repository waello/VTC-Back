
package com.navettevatry.rem4u.common.resources.dto.uber.updated;

import com.navettevatry.rem4u.common.resources.dto.uber.updated.Data;

public class UberResponse {
    private String status;
    private Data data;

    public UberResponse() {
    }

    public UberResponse(String status, Data data) {
        this.status = status;
        this.data = data;
    }

    public String getStatus() { return status; }
    public void setStatus(String value) { this.status = value; }

    public Data getData() { return data; }
    public void setData(Data value) { this.data = value; }

    @Override
    public String toString() {
        return "UberResponse{" +
                "status='" + status + '\'' +
                ", data=" + data +
                '}';
    }
}



