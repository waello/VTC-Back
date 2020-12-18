package com.navettevatry.rem4u.common.resources.dto.uber.updated;

public class UberRequestStatus {
    private StatusStatus status;

    public StatusStatus getStatus() {
        return status;
    }

    public void setStatus(StatusStatus value) {
        this.status = value;
    }

    @Override
    public String toString() {
        return "UberRequestStatus{" +
                "status=" + status +
                '}';
    }
}
