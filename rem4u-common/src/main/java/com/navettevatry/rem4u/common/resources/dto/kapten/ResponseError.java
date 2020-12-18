package com.navettevatry.rem4u.common.resources.dto.kapten;

import java.io.Serializable;

public class ResponseError implements Serializable {
    private Integer status ;
    private String message ;

    public ResponseError(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public ResponseError() {
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResponseError{" +
                "status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}
