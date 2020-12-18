package com.navettevatry.rem4u.common.resources.dto.lecab;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.navettevatry.rem4u.common.resources.enumeration.lecab.ServicesAvailableResponseType;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.SortedMap;

public class JobsEstimateRequest implements Serializable {
    private String id; /*Unique identifier*/
    private StrictLocationRequest pickup;
    private StrictLocationRequest drop;
    private List<StrictLocationRequest> stops; /*Intermediate stops between pick up and drop off*/
    private ServicesAvailableResponseType service;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private Date date;/*Job's date (ISO 8601 format)*/
    private PaymentShort payment;
    private String discount;/*Discount code*/

    public JobsEstimateRequest() {
    }

    public JobsEstimateRequest(String id, StrictLocationRequest pickup, StrictLocationRequest drop,
                               List<StrictLocationRequest> stops, ServicesAvailableResponseType service,
                               Date date, PaymentShort payment, String discount) {
        this.id = id;
        this.pickup = pickup;
        this.drop = drop;
        this.stops = stops;
        this.service = service;
        this.date = date;
        this.payment = payment;
        this.discount = discount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StrictLocationRequest getPickup() {
        return pickup;
    }

    public void setPickup(StrictLocationRequest pickup) {
        this.pickup = pickup;
    }

    public StrictLocationRequest getDrop() {
        return drop;
    }

    public void setDrop(StrictLocationRequest drop) {
        this.drop = drop;
    }

    public List<StrictLocationRequest> getStops() {
        return stops;
    }

    public void setStops(List<StrictLocationRequest> stops) {
        this.stops = stops;
    }

    public ServicesAvailableResponseType getService() {
        return service;
    }

    public void setService(ServicesAvailableResponseType service) {
        this.service = service;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public PaymentShort getPayment() {
        return payment;
    }

    public void setPayment(PaymentShort payment) {
        this.payment = payment;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "JobsEstimateRequest{" +
                "id='" + id + '\'' +
                ", pickup=" + pickup +
                ", drop=" + drop +
                ", stops=" + stops +
                ", service=" + service +
                ", date='" + date + '\'' +
                ", payment=" + payment +
                ", discount='" + discount + '\'' +
                '}';
    }
}
