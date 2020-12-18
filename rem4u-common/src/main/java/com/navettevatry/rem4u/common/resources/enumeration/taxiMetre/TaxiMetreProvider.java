package com.navettevatry.rem4u.common.resources.enumeration.taxiMetre;

public enum TaxiMetreProvider {
    CAREEM("careem"),
    MARCEL_CAB("marcelcab"),
    TALIXO("talixo"),
    UBER("uber"),
    LECAB("lecab"),
    PRIVATE_DRIVER("chauffeurPrive"),
    SNAP_CAR("snapCar"),
    TAXI_BLEUS("taxisBleus"),
    DRIVE_GT("drivegt");

    private String providerName;

    TaxiMetreProvider(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderName() {
        return providerName;
    }
}
