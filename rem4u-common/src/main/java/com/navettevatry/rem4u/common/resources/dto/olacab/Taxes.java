package com.navettevatry.rem4u.common.resources.dto.olacab;

import java.io.Serializable;

/**
 *
 * Created by Wael Jlassi.
 * Updated by Chakib Daii.
 */

public class Taxes implements Serializable {
    private Float total_tax;

    public Taxes() {
    }

    public Taxes(Float total_tax) {
        this.total_tax = total_tax;
    }

    public Float getTotal_tax() {
        return total_tax;
    }

    public void setTotal_tax(Float total_tax) {
        this.total_tax = total_tax;
    }

    @Override
    public String toString() {
        return "Taxes{" +
                "total_tax=" + total_tax +
                '}';
    }
}
