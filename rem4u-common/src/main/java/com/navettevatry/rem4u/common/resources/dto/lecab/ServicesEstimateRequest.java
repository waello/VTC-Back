package com.navettevatry.rem4u.common.resources.dto.lecab;

import com.navettevatry.rem4u.common.resources.enumeration.lecab.ServicesAvailableResponseType;

import java.io.Serializable;
import java.util.List;
/**
 *
 * Created by Chakib Daii.
 */
public class ServicesEstimateRequest implements Serializable {
    private LocationRequest location;
    private ServicesAvailableResponseType service;
    private PaymentShort payment;

    public ServicesEstimateRequest() {
    }

    public ServicesEstimateRequest(LocationRequest location, ServicesAvailableResponseType service, PaymentShort payment) {
        this.location = location;
        this.service = service;
        this.payment = payment;
    }

    public LocationRequest getLocation() {
        return location;
    }

    public void setLocation(LocationRequest location) {
        this.location = location;
    }

    public ServicesAvailableResponseType getService() {
        return service;
    }

    public void setService(ServicesAvailableResponseType service) {
        this.service = service;
    }

    public PaymentShort getPayment() {
        return payment;
    }

    public void setPayment(PaymentShort payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "ServicesEstimateRequest{" +
                "location=" + location +
                ", service=" + service +
                ", payment=" + payment +
                '}';
    }
}
