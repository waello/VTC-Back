package com.navettevatry.rem4u.common.resources.dto.olacab;

import java.io.Serializable;

public class Discounts implements Serializable {
    private String discount_type;
    private String discount_code;
    private String discount_mode;
    private Integer discount;
    private Integer cashback;
    private Integer pass_savings;

    public Discounts() {
    }

    public Discounts(String discount_type, String discount_code, String discount_mode, Integer discount, Integer cashback, Integer pass_savings) {
        this.discount_type = discount_type;
        this.discount_code = discount_code;
        this.discount_mode = discount_mode;
        this.discount = discount;
        this.cashback = cashback;
        this.pass_savings = pass_savings;
    }

    public String getDiscount_type() {
        return discount_type;
    }

    public void setDiscount_type(String discount_type) {
        this.discount_type = discount_type;
    }

    public String getDiscount_code() {
        return discount_code;
    }

    public void setDiscount_code(String discount_code) {
        this.discount_code = discount_code;
    }

    public String getDiscount_mode() {
        return discount_mode;
    }

    public void setDiscount_mode(String discount_mode) {
        this.discount_mode = discount_mode;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getCashback() {
        return cashback;
    }

    public void setCashback(Integer cashback) {
        this.cashback = cashback;
    }

    public Integer getPass_savings() {
        return pass_savings;
    }

    public void setPass_savings(Integer pass_savings) {
        this.pass_savings = pass_savings;
    }

    @Override
    public String toString() {
        return "Discounts{" +
                "discount_type='" + discount_type + '\'' +
                ", discount_code='" + discount_code + '\'' +
                ", discount_mode='" + discount_mode + '\'' +
                ", discount=" + discount +
                ", cashback=" + cashback +
                ", pass_savings=" + pass_savings +
                '}';
    }
}
