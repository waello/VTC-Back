package com.navettevatry.rem4u.common.resources.dto.olacab;

import java.io.Serializable;

/**
 *
 * Created by Wael Jlassi.
 * Updated by Chakib Daii.
 */
public class RideBooking implements Serializable {
    private String status;
    private String booking_id;
    private String message;
    private String merchant_txn_id;
    private Integer booking_timeout;
    private String booking_timeout_unit;

    public RideBooking() {
    }

    public RideBooking(String status, String booking_id, String message, String merchant_txn_id, Integer booking_timeout,
                       String booking_timeout_unit) {
        this.status = status;
        this.booking_id = booking_id;
        this.message = message;
        this.merchant_txn_id = merchant_txn_id;
        this.booking_timeout = booking_timeout;
        this.booking_timeout_unit = booking_timeout_unit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(String booking_id) {
        this.booking_id = booking_id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMerchant_txn_id() {
        return merchant_txn_id;
    }

    public void setMerchant_txn_id(String merchant_txn_id) {
        this.merchant_txn_id = merchant_txn_id;
    }

    public Integer getBooking_timeout() {
        return booking_timeout;
    }

    public void setBooking_timeout(Integer booking_timeout) {
        this.booking_timeout = booking_timeout;
    }

    public String getBooking_timeout_unit() {
        return booking_timeout_unit;
    }

    public void setBooking_timeout_unit(String booking_timeout_unit) {
        this.booking_timeout_unit = booking_timeout_unit;
    }

    @Override
    public String toString() {
        return "RideBooking{" +
                "status='" + status + '\'' +
                ", booking_id='" + booking_id + '\'' +
                ", message='" + message + '\'' +
                ", merchant_txn_id='" + merchant_txn_id + '\'' +
                ", booking_timeout=" + booking_timeout +
                ", booking_timeout_unit='" + booking_timeout_unit + '\'' +
                '}';
    }
}