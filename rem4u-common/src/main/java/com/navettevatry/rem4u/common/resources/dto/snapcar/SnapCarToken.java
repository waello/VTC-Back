package com.navettevatry.rem4u.common.resources.dto.snapcar;

import java.io.Serializable;

/**
 *
 * Created by Chakib Daii.
 */
public class SnapCarToken implements Serializable {
    private String access_token;
    private Integer expires_at;

    public SnapCarToken() {
    }

    public SnapCarToken(String access_token, Integer expires_at) {
        this.access_token = access_token;
        this.expires_at = expires_at;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public Integer getExpires_at() {
        return expires_at;
    }

    public void setExpires_at(Integer expires_at) {
        this.expires_at = expires_at;
    }

    @Override
    public String toString() {
        return "SnapCarToken{" +
                "access_token='" + access_token + '\'' +
                ", expires_at=" + expires_at +
                '}';
    }
}
