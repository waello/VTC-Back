package com.navettevatry.rem4u.common.resources.dto.allocab.updated;

public class Total {
    private long amount;
    private long amountWithTax;
    private long vatRate;
    private long vatAmount;
    private String currency;

    public long getAmount() { return amount; }
    public void setAmount(long value) { this.amount = value; }

    public long getAmountWithTax() { return amountWithTax; }
    public void setAmountWithTax(long value) { this.amountWithTax = value; }

    public long getVatRate() { return vatRate; }
    public void setVatRate(long value) { this.vatRate = value; }

    public long getVatAmount() { return vatAmount; }
    public void setVatAmount(long value) { this.vatAmount = value; }

    public String getCurrency() { return currency; }
    public void setCurrency(String value) { this.currency = value; }

    @Override
    public String toString() {
        return "Total{" +
                "amount=" + amount +
                ", amountWithTax=" + amountWithTax +
                ", vatRate=" + vatRate +
                ", vatAmount=" + vatAmount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
