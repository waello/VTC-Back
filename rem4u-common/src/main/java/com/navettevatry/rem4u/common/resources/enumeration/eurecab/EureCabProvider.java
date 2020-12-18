package com.navettevatry.rem4u.common.resources.enumeration.eurecab;

public enum EureCabProvider {
    SNAPCAR(1524),
    MARCEL_FUEL(1964),
    MARCEL_HYBRID(2515),
    FELIX(2054),
    CITYBIRD(2056);

    private Integer providerId;

    EureCabProvider(Integer providerId) {
        this.providerId = providerId;
    }

    public Integer getProviderId() {
        return providerId;
    }


}
