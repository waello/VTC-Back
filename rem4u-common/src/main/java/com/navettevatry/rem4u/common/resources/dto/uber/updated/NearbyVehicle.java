package com.navettevatry.rem4u.common.resources.dto.uber.updated;

import com.navettevatry.rem4u.common.resources.dto.uber.updated.VehiclePath;

import java.util.List;
import java.util.Map;

public class NearbyVehicle {
    private String etaString;
    private String etaStringShort;
    private Long minEta;
    private Map<String, List<VehiclePath>> vehiclePaths;
    private Long averageEta;
    private String sorryMsg;

    public String getEtaString() {
        return etaString;
    }

    public void setEtaString(String value) {
        this.etaString = value;
    }

    public String getEtaStringShort() {
        return etaStringShort;
    }

    public void setEtaStringShort(String value) {
        this.etaStringShort = value;
    }

    public Long getMinEta() {
        return minEta;
    }

    public void setMinEta(Long value) {
        this.minEta = value;
    }

    public Map<String, List<VehiclePath>> getVehiclePaths() {
        return vehiclePaths;
    }

    public void setVehiclePaths(Map<String, List<VehiclePath>> value) {
        this.vehiclePaths = value;
    }

    public Long getAverageEta() {
        return averageEta;
    }

    public void setAverageEta(Long value) {
        this.averageEta = value;
    }

    public String getSorryMsg() {
        return sorryMsg;
    }

    public void setSorryMsg(String value) {
        this.sorryMsg = value;
    }

    @Override
    public String toString() {
        return "NearbyVehicle{" +
                "etaString='" + etaString + '\'' +
                ", etaStringShort='" + etaStringShort + '\'' +
                ", minEta=" + minEta +
                ", vehiclePaths=" + vehiclePaths +
                ", averageEta=" + averageEta +
                ", sorryMsg='" + sorryMsg + '\'' +
                '}';
    }
}
