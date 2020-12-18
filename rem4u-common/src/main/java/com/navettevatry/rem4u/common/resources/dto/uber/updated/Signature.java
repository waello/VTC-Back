package com.navettevatry.rem4u.common.resources.dto.uber.updated;

public class Signature {
    private long expiresAt;
    private long issuedAt;
    private String signature;
    private String version;

    public long getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(long value) {
        this.expiresAt = value;
    }

    public long getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(long value) {
        this.issuedAt = value;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String value) {
        this.signature = value;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String value) {
        this.version = value;
    }

    @Override
    public String toString() {
        return "Signature{" +
                "expiresAt=" + expiresAt +
                ", issuedAt=" + issuedAt +
                ", signature='" + signature + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
