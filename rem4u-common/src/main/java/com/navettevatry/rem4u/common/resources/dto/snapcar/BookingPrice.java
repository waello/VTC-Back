package com.navettevatry.rem4u.common.resources.dto.snapcar;

import java.io.Serializable;

/**
 *
 * Created by Chakib Daii.
 */
public class BookingPrice implements Serializable {
    private Integer id; /*Unique identifier for the resource*/
    private ServiceClass service_class; /*The service class for which the price is valid*/
    private Float price;
    private String currency;
    private String formatted_price; /*A formatted string representing the value*/
    private Integer expiry_date; /*The timestamp of the validity date for the given price*/

    public BookingPrice() {
    }

    public BookingPrice(Integer id, Float price, String currency, Integer expiry_date) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.expiry_date = expiry_date;
    }

    public BookingPrice(Integer id, ServiceClass service_class, Float price, String currency, String formatted_price, Integer expiry_date) {
        this.id = id;
        this.service_class = service_class;
        this.price = price;
        this.currency = currency;
        this.formatted_price = formatted_price;
        this.expiry_date = expiry_date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ServiceClass getService_class() {
        return service_class;
    }

    public void setService_class(ServiceClass service_class) {
        this.service_class = service_class;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getFormatted_price() {
        return formatted_price;
    }

    public void setFormatted_price(String formatted_price) {
        this.formatted_price = formatted_price;
    }

    public Integer getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(Integer expiry_date) {
        this.expiry_date = expiry_date;
    }

    @Override
    public String toString() {
        return "BookingPrice{" +
                "id=" + id +
                ", service_class=" + service_class +
                ", price=" + price +
                ", currency='" + currency + '\'' +
                ", formatted_price='" + formatted_price + '\'' +
                ", expiry_date=" + expiry_date +
                '}';
    }
}
