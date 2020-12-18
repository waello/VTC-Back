package com.navettevatry.rem4u.common.resources.enumeration;

/**
 * Created by Chakib Daii.
 */
public enum Provider implements IProvider{
    MODULE("02", "REM4U");
    private String code;
    private String description;


    Provider(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
