package com.navettevatry.rem4u.common.resources.dto.uber.updated;

public class Tiers {
    private Popular popular;

    public Popular getPopular() {
        return popular;
    }

    public void setPopular(Popular value) {
        this.popular = value;
    }

    @Override
    public String toString() {
        return "Tiers{" +
                "popular=" + popular +
                '}';
    }
}
