package com.navettevatry.rem4u.common.resources.dto.urbanDriver;

import java.util.List;

public class Passenger {
    private String firstName;
    private String lastName;
    private long id;
    private String email;
    private String phoneNumber;
    private Object companyName;
    private boolean sendInvoice;
    private boolean showPrice;
    private String locale;
    private Object defaultComment;
    private String type;
    private boolean passengerDefault;
    private List<Object> favorites;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String value) {
        this.lastName = value;
    }

    public long getID() {
        return id;
    }

    public void setID(long value) {
        this.id = value;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String value) {
        this.email = value;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    public Object getCompanyName() {
        return companyName;
    }

    public void setCompanyName(Object value) {
        this.companyName = value;
    }

    public boolean getSendInvoice() {
        return sendInvoice;
    }

    public void setSendInvoice(boolean value) {
        this.sendInvoice = value;
    }

    public boolean getShowPrice() {
        return showPrice;
    }

    public void setShowPrice(boolean value) {
        this.showPrice = value;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String value) {
        this.locale = value;
    }

    public Object getDefaultComment() {
        return defaultComment;
    }

    public void setDefaultComment(Object value) {
        this.defaultComment = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public boolean getPassengerDefault() {
        return passengerDefault;
    }

    public void setPassengerDefault(boolean value) {
        this.passengerDefault = value;
    }

    public List<Object> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<Object> value) {
        this.favorites = value;
    }
}
