package com.navettevatry.rem4u.common.resources.dto.uber;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Result {
    private List<AddressComponent> addressComponents;
    private String formattedAddress;
    private Geometry geometry;
    private String placeID;
    private PlusCode plusCode;
    private List<String> types;


    public List<AddressComponent> getAddressComponents() {
        return addressComponents;
    }

    public void setAddressComponents(List<AddressComponent> value) {
        this.addressComponents = value;
    }

    public String getFormattedAddress() {
        return formattedAddress;
    }

    public void setFormattedAddress(String value) {
        this.formattedAddress = value;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry value) {
        this.geometry = value;
    }


    public PlusCode getPlusCode() {
        return plusCode;
    }

    public void setPlusCode(PlusCode value) {
        this.plusCode = value;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> value) {
        this.types = value;
    }
    @JsonProperty("place_id")
    public String getPlaceID() {
        return placeID;
    }

    public void setPlaceID(String placeID) {
        this.placeID = placeID;
    }
}
