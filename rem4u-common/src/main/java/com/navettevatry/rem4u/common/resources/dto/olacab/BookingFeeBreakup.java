package com.navettevatry.rem4u.common.resources.dto.olacab;

import java.io.Serializable;

/**
 *
 * Created by Wael Jlassi.
 * Updated by Chakib Daii.
 */
public class BookingFeeBreakup implements Serializable {
    private String display_text;
    private Integer value;

    public BookingFeeBreakup() {
    }

    public BookingFeeBreakup(String display_text, Integer value) {
        this.display_text = display_text;
        this.value = value;
    }

    public String getDisplay_text() {
        return display_text;
    }

    public void setDisplay_text(String display_text) {
        this.display_text = display_text;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "BookingFeeBreakup{" +
                "display_text='" + display_text + '\'' +
                ", value=" + value +
                '}';
    }
}
