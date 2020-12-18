package com.navettevatry.rem4u.common.resources.dto.urbanDriver;

import java.util.List;

public class Customer {
    private long id;
    private boolean companyAdmin;
    private Object bookForOtherAccount;
    private String lastName;
    private String firstName;
    private String email;
    private String phoneNumber;
    private boolean sendPDFEmail;
    private String locale;
    private Object secondEmail;
    private Object defaultComment;
    private Object landlineNumber;
    private OffsetDateTime createdAt;
    private Passenger defaultPassenger;
    private List<Object> companies;
    private Passenger defaultSender;
    private Passenger defaultRecipient;
    private long passengersCount;
    private boolean canCreateCard;

    public long getID() {
        return id;
    }

    public void setID(long value) {
        this.id = value;
    }

    public boolean getCompanyAdmin() {
        return companyAdmin;
    }

    public void setCompanyAdmin(boolean value) {
        this.companyAdmin = value;
    }

    public Object getBookForOtherAccount() {
        return bookForOtherAccount;
    }

    public void setBookForOtherAccount(Object value) {
        this.bookForOtherAccount = value;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String value) {
        this.lastName = value;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String value) {
        this.firstName = value;
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

    public boolean getSendPDFEmail() {
        return sendPDFEmail;
    }

    public void setSendPDFEmail(boolean value) {
        this.sendPDFEmail = value;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String value) {
        this.locale = value;
    }

    public Object getSecondEmail() {
        return secondEmail;
    }

    public void setSecondEmail(Object value) {
        this.secondEmail = value;
    }

    public Object getDefaultComment() {
        return defaultComment;
    }

    public void setDefaultComment(Object value) {
        this.defaultComment = value;
    }

    public Object getLandlineNumber() {
        return landlineNumber;
    }

    public void setLandlineNumber(Object value) {
        this.landlineNumber = value;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime value) {
        this.createdAt = value;
    }

    public Passenger getDefaultPassenger() {
        return defaultPassenger;
    }

    public void setDefaultPassenger(Passenger value) {
        this.defaultPassenger = value;
    }

    public List<Object> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Object> value) {
        this.companies = value;
    }

    public Passenger getDefaultSender() {
        return defaultSender;
    }

    public void setDefaultSender(Passenger value) {
        this.defaultSender = value;
    }

    public Passenger getDefaultRecipient() {
        return defaultRecipient;
    }

    public void setDefaultRecipient(Passenger value) {
        this.defaultRecipient = value;
    }

    public long getPassengersCount() {
        return passengersCount;
    }

    public void setPassengersCount(long value) {
        this.passengersCount = value;
    }

    public boolean getCanCreateCard() {
        return canCreateCard;
    }

    public void setCanCreateCard(boolean value) {
        this.canCreateCard = value;
    }
}
