package com.navettevatry.rem4u.common.utils.response.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.navettevatry.rem4u.common.utils.response.GenericResponseBody;


/**
 * this class is used to render a object response
 *
 * @author Chakib Daii
 */
public class ObjectResponse<T> extends GenericResponseBody {
    @JsonProperty(value = "result")
    private T object;

    public ObjectResponse() {

    }

    /**
     * @param object
     */
    public ObjectResponse(T object) {
        super();
        this.object = object;
    }

    /**
     * @return the object
     */
    public T getObject() {
        return object;
    }

    /**
     * @param object the object to set
     */
    public void setObject(T object) {
        this.object = object;
    }

}
