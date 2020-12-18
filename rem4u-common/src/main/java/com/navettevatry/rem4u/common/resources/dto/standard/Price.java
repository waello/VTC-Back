package com.navettevatry.rem4u.common.resources.dto.standard;

import java.io.Serializable;
import java.util.Comparator;

/**
 *
 * Created by Chakib Daii.
 */
public class Price implements Serializable/*, Comparable<Price>, Comparator<Price> */{
    private String currency;
    private Float unitAmount;

    public Price() {
    }

    public Price(String currency, Float unitAmount) {
        this.currency = currency;
        this.unitAmount = unitAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Float getUnitAmount() {
        return unitAmount;
    }

    public void setUnitAmount(Float unitAmount) {
        this.unitAmount = unitAmount;
    }

    @Override
    public String toString() {
        return "Price{" +
                "currency='" + currency + '\'' +
                ", unitAmount=" + unitAmount +
                '}';
    }


//    @Override
//    public int compareTo(Price o) {
//        return (int) (this.getUnitAmount() - o.getUnitAmount()); //TODO: Verify After Test
//    }
//
//    @Override
//    public int compare(Price o1, Price o2) {
//        return (int) (o1.getUnitAmount() - o2.getUnitAmount());
//    }

}
