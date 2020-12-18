package com.navettevatry.rem4u.common.resources.dto.snapcar;

import java.io.Serializable;

/**
 *
 * Created by Chakib Daii.
 */
public class ETAResult implements Serializable {
    private String status; /*The service availability status ['ok' or 'unavailable']*/
    private ServiceClass service_class; /*The service class*/
    private Integer eta; /*The ETA for the closest available driver, in seconds*/

    public ETAResult() {
    }

    public ETAResult(String status, ServiceClass service_class) {
        this.status = status;
        this.service_class = service_class;
    }

    public ETAResult(String status, ServiceClass service_class, Integer eta) {
        this.status = status;
        this.service_class = service_class;
        this.eta = eta;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ServiceClass getService_class() {
        return service_class;
    }

    public void setService_class(ServiceClass service_class) {
        this.service_class = service_class;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "ETAResult{" +
                "status='" + status + '\'' +
                ", service_class=" + service_class +
                ", eta=" + eta +
                '}';
    }
}
