package com.navettevatry.rem4u.common.resources.dto.allocab;

import java.io.Serializable;
import java.util.List;

/**
 *
 * Created by Ahmed Ferjani.
 */
/*
https://docs.google.com/document/d/1bsKsbCrrmoa4T8g9EgBfcXCW4jPtpxmE5uSDrVE0PRc/edit#
 */
public class TripCreateResponse implements Serializable {
    private Integer statusCode ;
    private String message ;
    private String type ;
    private TripCreated trip ;
    private List<Quotation> quotations ;
    private String status ;
    private String processTime ;
    private String kind ;
    private String etag ;

    public TripCreateResponse() {
    }

    public TripCreateResponse(Integer statusCode, String message, String type, TripCreated trip, List<Quotation> quotations, String status, String processTime, String kind, String etag) {
        this.statusCode = statusCode;
        this.message = message;
        this.type = type;
        this.trip = trip;
        this.quotations = quotations;
        this.status = status;
        this.processTime = processTime;
        this.kind = kind;
        this.etag = etag;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TripCreated getTrip() {
        return trip;
    }

    public void setTrip(TripCreated trip) {
        this.trip = trip;
    }

    public List<Quotation> getQuotations() {
        return quotations;
    }

    public void setQuotations(List<Quotation> quotations) {
        this.quotations = quotations;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProcessTime() {
        return processTime;
    }

    public void setProcessTime(String processTime) {
        this.processTime = processTime;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    @Override
    public String toString() {
        return "TripCreateResponse{" +
                "statusCode=" + statusCode +
                ", message='" + message + '\'' +
                ", type='" + type + '\'' +
                ", trip=" + trip +
                ", quotations=" + quotations +
                ", status='" + status + '\'' +
                ", processTime='" + processTime + '\'' +
                ", kind='" + kind + '\'' +
                ", etag='" + etag + '\'' +
                '}';
    }
}
