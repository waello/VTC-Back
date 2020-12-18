package com.navettevatry.rem4u.common.resources.dto.lecab.updated.price;

import com.fasterxml.jackson.annotation.*;

public class Details {
    private String baseAmountWithoutTax;
    private String clientTotalPrice;
    private String tva1000;
    private String price;
    private String noIncreaseGuarantee;
    private String vat;
    private String totalWithoutSurge;
    private String amountWithoutTax;

    @JsonProperty("Base Amount Without Tax")
    public String getBaseAmountWithoutTax() { return baseAmountWithoutTax; }
    @JsonProperty("Base Amount Without Tax")
    public void setBaseAmountWithoutTax(String value) { this.baseAmountWithoutTax = value; }

    @JsonProperty("Client Total Price")
    public String getClientTotalPrice() { return clientTotalPrice; }
    @JsonProperty("Client Total Price")
    public void setClientTotalPrice(String value) { this.clientTotalPrice = value; }

    @JsonProperty("TVA (10.00%)")
    public String getTva1000() { return tva1000; }
    @JsonProperty("TVA (10.00%)")
    public void setTva1000(String value) { this.tva1000 = value; }

    @JsonProperty("Price")
    public String getPrice() { return price; }
    @JsonProperty("Price")
    public void setPrice(String value) { this.price = value; }

    @JsonProperty("No increase guarantee")
    public String getNoIncreaseGuarantee() { return noIncreaseGuarantee; }
    @JsonProperty("No increase guarantee")
    public void setNoIncreaseGuarantee(String value) { this.noIncreaseGuarantee = value; }

    @JsonProperty("VAT")
    public String getVat() { return vat; }
    @JsonProperty("VAT")
    public void setVat(String value) { this.vat = value; }

    @JsonProperty("Total Without Surge")
    public String getTotalWithoutSurge() { return totalWithoutSurge; }
    @JsonProperty("Total Without Surge")
    public void setTotalWithoutSurge(String value) { this.totalWithoutSurge = value; }

    @JsonProperty("Amount Without Tax")
    public String getAmountWithoutTax() { return amountWithoutTax; }
    @JsonProperty("Amount Without Tax")
    public void setAmountWithoutTax(String value) { this.amountWithoutTax = value; }
}
