package com.navettevatry.rem4u.common.resources.dto.uber.updated;

import com.navettevatry.rem4u.common.resources.dto.uber.updated.Meta;
import com.navettevatry.rem4u.common.resources.dto.uber.updated.ReverseGeocode;

public class Eyeball {
    private DynamicFares dynamicFares;
    private Meta meta;
    private ReverseGeocode reverseGeocode;

    public DynamicFares getDynamicFares() {
        return dynamicFares;
    }

    public void setDynamicFares(DynamicFares value) {
        this.dynamicFares = value;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta value) {
        this.meta = value;
    }

    public ReverseGeocode getReverseGeocode() {
        return reverseGeocode;
    }

    public void setReverseGeocode(ReverseGeocode value) {
        this.reverseGeocode = value;
    }

    @Override
    public String toString() {
        return "Eyeball{" +
                "dynamicFares=" + dynamicFares +
                ", meta=" + meta +
                ", reverseGeocode=" + reverseGeocode +
                '}';
    }
}
