package com.navettevatry.rem4u.common.resources.dto.lecab.updated.price;

public class PaymentType {
    private String customerType;
    private String name;
    private String code;
    private String description;
    private boolean defaultType;
    private boolean creditCardsAvailable;
    private boolean cvcRequiredForNewCreditCards;
    private boolean cvcRequiredForExistingCreditCards;
    private Object merchantIdentifier;

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String value) {
        this.customerType = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String value) {
        this.code = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public boolean getDefaultType() {
        return defaultType;
    }

    public void setDefaultType(boolean value) {
        this.defaultType = value;
    }

    public boolean getCreditCardsAvailable() {
        return creditCardsAvailable;
    }

    public void setCreditCardsAvailable(boolean value) {
        this.creditCardsAvailable = value;
    }

    public boolean getCvcRequiredForNewCreditCards() {
        return cvcRequiredForNewCreditCards;
    }

    public void setCvcRequiredForNewCreditCards(boolean value) {
        this.cvcRequiredForNewCreditCards = value;
    }

    public boolean getCvcRequiredForExistingCreditCards() {
        return cvcRequiredForExistingCreditCards;
    }

    public void setCvcRequiredForExistingCreditCards(boolean value) {
        this.cvcRequiredForExistingCreditCards = value;
    }

    public Object getMerchantIdentifier() {
        return merchantIdentifier;
    }

    public void setMerchantIdentifier(Object value) {
        this.merchantIdentifier = value;
    }
}
