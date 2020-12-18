package com.navettevatry.rem4u.common.resources.dto.allocab.updated;

import java.util.UUID;

public class Session {
    private long id;
    private UUID appToken;
    private UUID accessToken;
    private String userKeyStr;
    private String type;

    public Session() {
    }

    public Session(long id, UUID appToken, UUID accessToken, String userKeyStr, String type) {
        this.id = id;
        this.appToken = appToken;
        this.accessToken = accessToken;
        this.userKeyStr = userKeyStr;
        this.type = type;
    }

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public UUID getAppToken() { return appToken; }
    public void setAppToken(UUID value) { this.appToken = value; }

    public UUID getAccessToken() { return accessToken; }
    public void setAccessToken(UUID value) { this.accessToken = value; }

    public String getUserKeyStr() { return userKeyStr; }
    public void setUserKeyStr(String value) { this.userKeyStr = value; }

    public String getType() { return type; }
    public void setType(String value) { this.type = value; }
}
