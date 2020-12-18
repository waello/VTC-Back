package com.navettevatry.rem4u.common.utils.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * this class will represent the header part in the {@link GenericResponse}
 *
 * @author Chakib Daii
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class GenericResponseHeader {

    private String statusCode;
    private String errorMsg;
    private String key;
    private String description;
    private String providerCode;
    private String providerDescription;
    private String[] errors;
    private String messageType;

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public String getProviderDescription() {
        return providerDescription;
    }

    public void setProviderDescription(String providerDescription) {
        this.providerDescription = providerDescription;
    }

    public String[] getErrors() {
        return errors;
    }

    public void setErrors(String[] errors) {
        this.errors = errors;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }
}
