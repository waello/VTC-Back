package com.navettevatry.rem4u.common.resources.dto.marcel;

import com.fasterxml.jackson.annotation.*;
import java.time.OffsetDateTime;
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

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("company_admin")
    public boolean getCompanyAdmin() { return companyAdmin; }
    @JsonProperty("company_admin")
    public void setCompanyAdmin(boolean value) { this.companyAdmin = value; }

    @JsonProperty("book_for_other_account")
    public Object getBookForOtherAccount() { return bookForOtherAccount; }
    @JsonProperty("book_for_other_account")
    public void setBookForOtherAccount(Object value) { this.bookForOtherAccount = value; }

    @JsonProperty("last_name")
    public String getLastName() { return lastName; }
    @JsonProperty("last_name")
    public void setLastName(String value) { this.lastName = value; }

    @JsonProperty("first_name")
    public String getFirstName() { return firstName; }
    @JsonProperty("first_name")
    public void setFirstName(String value) { this.firstName = value; }

    @JsonProperty("email")
    public String getEmail() { return email; }
    @JsonProperty("email")
    public void setEmail(String value) { this.email = value; }

    @JsonProperty("phone_number")
    public String getPhoneNumber() { return phoneNumber; }
    @JsonProperty("phone_number")
    public void setPhoneNumber(String value) { this.phoneNumber = value; }

    @JsonProperty("send_pdf_email")
    public boolean getSendPDFEmail() { return sendPDFEmail; }
    @JsonProperty("send_pdf_email")
    public void setSendPDFEmail(boolean value) { this.sendPDFEmail = value; }

    @JsonProperty("locale")
    public String getLocale() { return locale; }
    @JsonProperty("locale")
    public void setLocale(String value) { this.locale = value; }

    @JsonProperty("second_email")
    public Object getSecondEmail() { return secondEmail; }
    @JsonProperty("second_email")
    public void setSecondEmail(Object value) { this.secondEmail = value; }

    @JsonProperty("default_comment")
    public Object getDefaultComment() { return defaultComment; }
    @JsonProperty("default_comment")
    public void setDefaultComment(Object value) { this.defaultComment = value; }

    @JsonProperty("landline_number")
    public Object getLandlineNumber() { return landlineNumber; }
    @JsonProperty("landline_number")
    public void setLandlineNumber(Object value) { this.landlineNumber = value; }

    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() { return createdAt; }
    @JsonProperty("created_at")
    public void setCreatedAt(OffsetDateTime value) { this.createdAt = value; }

    @JsonProperty("default_passenger")
    public Passenger getDefaultPassenger() { return defaultPassenger; }
    @JsonProperty("default_passenger")
    public void setDefaultPassenger(Passenger value) { this.defaultPassenger = value; }

    @JsonProperty("companies")
    public List<Object> getCompanies() { return companies; }
    @JsonProperty("companies")
    public void setCompanies(List<Object> value) { this.companies = value; }

    @JsonProperty("default_sender")
    public Passenger getDefaultSender() { return defaultSender; }
    @JsonProperty("default_sender")
    public void setDefaultSender(Passenger value) { this.defaultSender = value; }

    @JsonProperty("default_recipient")
    public Passenger getDefaultRecipient() { return defaultRecipient; }
    @JsonProperty("default_recipient")
    public void setDefaultRecipient(Passenger value) { this.defaultRecipient = value; }

    @JsonProperty("passengers_count")
    public long getPassengersCount() { return passengersCount; }
    @JsonProperty("passengers_count")
    public void setPassengersCount(long value) { this.passengersCount = value; }

    @JsonProperty("can_create_card")
    public boolean getCanCreateCard() { return canCreateCard; }
    @JsonProperty("can_create_card")
    public void setCanCreateCard(boolean value) { this.canCreateCard = value; }
}
