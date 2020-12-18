package com.navettevatry.rem4u.common.resources.dto.standard;

import java.io.Serializable;

/**
 *
 * Created by Chakib Daii.
 */
public class Passengers implements Serializable {
    private Integer adults;
    private Integer children;
    private Integer babies;
    private Integer total;

    public Passengers() {
    }

    public Passengers(Integer adults, Integer children, Integer babies, Integer total) {
        this.adults = adults;
        this.children = children;
        this.babies = babies;
        this.total = total;
    }

    public Integer getAdults() {
        return adults;
    }

    public void setAdults(Integer adults) {
        this.adults = adults;
    }

    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }

    public Integer getBabies() {
        return babies;
    }

    public void setBabies(Integer babies) {
        this.babies = babies;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Passengers{" +
                "adults=" + adults +
                ", children=" + children +
                ", babies=" + babies +
                ", total=" + total +
                '}';
    }
}
