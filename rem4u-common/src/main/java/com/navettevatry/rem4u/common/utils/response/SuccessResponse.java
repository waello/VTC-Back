package com.navettevatry.rem4u.common.utils.response;


/**
 *
 * @author Chakib Daii
 */
public class SuccessResponse extends RuntimeException{
    GenericResponse genericResponse;

    SuccessResponse(GenericResponse genericResponse){
        this.genericResponse = genericResponse;
    }

    public GenericResponse getGenericResponse() {
        return genericResponse;
    }

    public void setGenericResponse(GenericResponse genericResponse) {
        this.genericResponse = genericResponse;
    }
}
