package com.navettevatry.rem4u.common.resources.enumeration.lecab;

import java.io.Serializable;
/**
 *
 * Created by Chakib Daii.
 */
public enum PaymentType implements Serializable {
    CARD("CARD"),
    INVOICE("INVOICE"),
    CASH_AT_DROP("CASH_AT_DROP"),
    CARD_AT_DROP("CARD_AT_DROP");

    private String type;

    PaymentType (String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
