package com.navettevatry.rem4u.common.resources.dto.allocab;


import java.io.Serializable;
import java.util.Objects;

/**
 *
 * Created by Ahmed Ferjani.
 */
public class Access implements Serializable {
    private String appKey ;
    private String accessToken ;

    public Access() {
    }

    public Access(String appKey, String accessToken) {
        this.appKey = appKey;
        this.accessToken = accessToken;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public String toString() {
        return "Access{" +
                "appKey='" + appKey + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
