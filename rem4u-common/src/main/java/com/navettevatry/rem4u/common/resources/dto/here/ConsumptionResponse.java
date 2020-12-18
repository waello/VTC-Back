package com.navettevatry.rem4u.common.resources.dto.here;

import java.util.List;

/**
 *
 * Created by Ala Hadj Brahim & Ichrak Ben Abdallah.
 * Updated by Chakib DAII
 */
public class ConsumptionResponse  {
    private List<Route> routes;

    public ConsumptionResponse() {
    }

    public ConsumptionResponse(List<Route> routes) {
        this.routes = routes;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    @Override
    public String toString() {
        return "ConsumptionResponse{" +
                "routes=" + routes +
                '}';
    }
}
