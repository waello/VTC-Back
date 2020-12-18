
package com.navettevatry.rem4u.common.resources.dto.lecab.updated.price;


import java.util.List;
import java.util.UUID;

public class PriceRequest {
    private UUID requestID;
    private RouteInfo routeInfo;
    private Service service;
    private PaymentType paymentType;
    private List<Object> instructions;
    private String operationType;
    private boolean asap;
    private String date;
    private List<Stop> stops;

    public UUID getRequestID() { return requestID; }
    public void setRequestID(UUID value) { this.requestID = value; }

    public RouteInfo getRouteInfo() { return routeInfo; }
    public void setRouteInfo(RouteInfo value) { this.routeInfo = value; }

    public Service getService() { return service; }
    public void setService(Service value) { this.service = value; }

    public PaymentType getPaymentType() { return paymentType; }
    public void setPaymentType(PaymentType value) { this.paymentType = value; }

    public List<Object> getInstructions() { return instructions; }
    public void setInstructions(List<Object> value) { this.instructions = value; }

    public String getOperationType() { return operationType; }
    public void setOperationType(String value) { this.operationType = value; }

    public boolean getAsap() { return asap; }
    public void setAsap(boolean value) { this.asap = value; }

    public String getDate() { return date; }
    public void setDate(String value) { this.date = value; }

    public List<Stop> getStops() { return stops; }
    public void setStops(List<Stop> value) { this.stops = value; }
}

// PaymentType.java


// RouteInfo.java


// Stop.java


// Address.java


// Available.java


