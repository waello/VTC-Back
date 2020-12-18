package com.navettevatry.rem4u.common.utils.response.body;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.navettevatry.rem4u.common.utils.response.GenericResponseBody;

/**
 * this class is used to render a boolean response
 *
 * @author Chakib Daii
 */
public class BooleanResponse extends GenericResponseBody {
    @JsonProperty(value = "result")
    private boolean success;

    public BooleanResponse() {
        super();
    }

    public BooleanResponse(boolean success) {
        this.setSuccess(success);
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
