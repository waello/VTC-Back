package com.navettevatry.rem4u.common.resources.dto.olacab;

public class PreviousCancellationCharge {
    private String currency;
    private String booking_id;
    private Integer amount;

    public PreviousCancellationCharge() {
    }

    public PreviousCancellationCharge(String currency, String booking_id, Integer amount) {
        this.currency = currency;
        this.booking_id = booking_id;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(String booking_id) {
        this.booking_id = booking_id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PreviousCancellationCharge{" +
                "currency='" + currency + '\'' +
                ", booking_id='" + booking_id + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
