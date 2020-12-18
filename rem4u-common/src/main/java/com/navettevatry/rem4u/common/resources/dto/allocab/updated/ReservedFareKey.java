package com.navettevatry.rem4u.common.resources.dto.allocab.updated;

public class ReservedFareKey {
    private String kind;
    private String appID;
    private long id;
    private boolean complete;
    private String namespace;

    public String getKind() { return kind; }
    public void setKind(String value) { this.kind = value; }

    public String getAppID() { return appID; }
    public void setAppID(String value) { this.appID = value; }

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public boolean getComplete() { return complete; }
    public void setComplete(boolean value) { this.complete = value; }

    public String getNamespace() { return namespace; }
    public void setNamespace(String value) { this.namespace = value; }

    @Override
    public String toString() {
        return "ReservedFareKey{" +
                "kind='" + kind + '\'' +
                ", appID='" + appID + '\'' +
                ", id=" + id +
                ", complete=" + complete +
                ", namespace='" + namespace + '\'' +
                '}';
    }
}
