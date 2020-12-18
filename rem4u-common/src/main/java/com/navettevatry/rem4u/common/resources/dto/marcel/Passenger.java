        package com.navettevatry.rem4u.common.resources.dto.marcel;

import com.fasterxml.jackson.annotation.*;
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

    @JsonProperty("first_name")
    public String getFirstName() { return firstName; }
    @JsonProperty("first_name")
    public void setFirstName(String value) { this.firstName = value; }

    @JsonProperty("last_name")
    public String getLastName() { return lastName; }
    @JsonProperty("last_name")
    public void setLastName(String value) { this.lastName = value; }

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("email")
    public String getEmail() { return email; }
    @JsonProperty("email")
    public void setEmail(String value) { this.email = value; }

    @JsonProperty("phone_number")
    public String getPhoneNumber() { return phoneNumber; }
    @JsonProperty("phone_number")
    public void setPhoneNumber(String value) { this.phoneNumber = value; }

    @JsonProperty("company_name")
    public Object getCompanyName() { return companyName; }
    @JsonProperty("company_name")
    public void setCompanyName(Object value) { this.companyName = value; }

    @JsonProperty("send_invoice")
    public boolean getSendInvoice() { return sendInvoice; }
    @JsonProperty("send_invoice")
    public void setSendInvoice(boolean value) { this.sendInvoice = value; }

    @JsonProperty("show_price")
    public boolean getShowPrice() { return showPrice; }
    @JsonProperty("show_price")
    public void setShowPrice(boolean value) { this.showPrice = value; }

    @JsonProperty("locale")
    public String getLocale() { return locale; }
    @JsonProperty("locale")
    public void setLocale(String value) { this.locale = value; }

    @JsonProperty("default_comment")
    public Object getDefaultComment() { return defaultComment; }
    @JsonProperty("default_comment")
    public void setDefaultComment(Object value) { this.defaultComment = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("default")
    public boolean getPassengerDefault() { return passengerDefault; }
    @JsonProperty("default")
    public void setPassengerDefault(boolean value) { this.passengerDefault = value; }

    @JsonProperty("favorites")
    public List<Object> getFavorites() { return favorites; }
    @JsonProperty("favorites")
    public void setFavorites(List<Object> value) { this.favorites = value; }
}
