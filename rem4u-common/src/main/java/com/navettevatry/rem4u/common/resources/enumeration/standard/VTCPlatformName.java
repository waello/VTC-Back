package com.navettevatry.rem4u.common.resources.enumeration.standard;

import java.io.Serializable;

/**
 *
 * Created by Chakib Daii.
 */
public enum VTCPlatformName implements Serializable {
    COMPANY("COMPANY"),
    ALLOCAB("ALLOCAB"),
    BCVTC("BCVTC"),
    UBER("UBER"),
    KAPTEN("KAPTEN"),
    LECAB("LECAB"),
    LYFT("LYFT"),
    OLACAB("OLACAB"),
    SNAPCAR("SNAPCAR"),
    MYSAM("MYSAM"),
    BOLT_TAXIFY("BOLT_TAXIFY"),
    HEETCH("HEETCH"),
    MARCEL_FUEL("MARCEL_FUEL"),
    MARCEL_HYBRID("MARCEL_HYBRID"),
    FELIX("FELIX"),
    CITYBIRD("CITYBIRD"),
    URBAN_DRIVER("URBAN_DRIVER");

    private String platformName;

    VTCPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getPlatformName() {
        return platformName;
    }
}
