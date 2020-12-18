package com.navettevatry.rem4u.common.utils.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * this class represents the response core. The response is composed by two
 * components:
 * <li>the {@link GenericResponseHeader}</li>
 * <li>the {@link GenericResponseBody}</li>
 *
 * @author Chakib Daii
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class GenericResponse<T extends GenericResponseBody> {

    protected GenericResponseHeader header;
    protected GenericResponseBody body;

    public GenericResponseHeader getHeader() {
        return header;
    }

    public void setHeader(GenericResponseHeader header) {
        this.header = header;
    }

    public T getBody() {
        return (T) body;
    }

    public void setBody(T body) {
        this.body = body;
    }

}
