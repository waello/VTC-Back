package com.navettevatry.rem4u.common.resources.dto.uber.updated;

import com.navettevatry.rem4u.common.resources.dto.uber.updated.Meta;

public class ClientStatus {
    private String status;
    private Meta meta;
    private String statusDescription;
    private String lastRequestJobUUID;

    public String getStatus() {
        return status;
    }

    public void setStatus(String value) {
        this.status = value;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta value) {
        this.meta = value;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String value) {
        this.statusDescription = value;
    }

    public String getLastRequestJobUUID() {
        return lastRequestJobUUID;
    }

    public void setLastRequestJobUUID(String value) {
        this.lastRequestJobUUID = value;
    }

    @Override
    public String toString() {
        return "ClientStatus{" +
                "status='" + status + '\'' +
                ", meta=" + meta +
                ", statusDescription='" + statusDescription + '\'' +
                ", lastRequestJobUUID='" + lastRequestJobUUID + '\'' +
                '}';
    }
}
