package com.navettevatry.rem4u.common.resources.dto.bcvtc;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 *
 * Created by Wael Jlassi.
 * Updated by Chakib Daii.
 */
public class ForfaitPrice implements Serializable {
    @JsonProperty("ClassFlatPrice")
    private String classFlatPrice;
    @JsonProperty("ClassName")
    private String className;
    @JsonProperty("ClassesFlatId")
    private String classesFlatId;
    @JsonProperty("PaxesVolume")
    private String paxesVolume;

    public ForfaitPrice() {
    }

    public ForfaitPrice(String classFlatPrice, String className, String classesFlatId, String paxesVolume) {
        this.classFlatPrice = classFlatPrice;
        this.className = className;
        this.classesFlatId = classesFlatId;
        this.paxesVolume = paxesVolume;
    }

    public String getClassFlatPrice() {
        return classFlatPrice;
    }

    public void setClassFlatPrice(String classFlatPrice) {
        this.classFlatPrice = classFlatPrice;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassesFlatId() {
        return classesFlatId;
    }

    public void setClassesFlatId(String classesFlatId) {
        this.classesFlatId = classesFlatId;
    }

    public String getPaxesVolume() {
        return paxesVolume;
    }

    public void setPaxesVolume(String paxesVolume) {
        this.paxesVolume = paxesVolume;
    }

    @Override
    public String toString() {
        return "ForfaitPrice{" +
                "classFlatPrice='" + classFlatPrice + '\'' +
                ", className='" + className + '\'' +
                ", classesFlatId='" + classesFlatId + '\'' +
                ", paxesVolume='" + paxesVolume + '\'' +
                '}';
    }
}
