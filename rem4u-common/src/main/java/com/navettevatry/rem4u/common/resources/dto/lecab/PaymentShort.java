package com.navettevatry.rem4u.common.resources.dto.lecab;

import com.navettevatry.rem4u.common.resources.enumeration.lecab.PaymentType;

import java.io.Serializable;
/**
 *
 * Created by Chakib Daii.
 */
public class PaymentShort implements Serializable {
    private PaymentType type; /*Payment's type*/

    public PaymentShort() {
    }

    public PaymentShort(PaymentType type) {
        this.type = type;
    }

    public PaymentType getType() {
        return type;
    }

    public void setType(PaymentType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "PaymentShort{" +
                "type=" + type +
                '}';
    }
}
