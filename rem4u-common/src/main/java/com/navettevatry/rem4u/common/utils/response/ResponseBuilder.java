package com.navettevatry.rem4u.common.utils.response;

import com.navettevatry.rem4u.common.resources.enumeration.IProvider;
import com.navettevatry.rem4u.common.resources.enumeration.Provider;


/**
 * a generic helper to be used to build uniform response
 *
 * @author Chakib Daii
 */
public class ResponseBuilder {

    private static String BACK_END_SUCCESS_CODE = "000";
    private static String SUCCESS = "Success";

    public static GenericResponse buildSuccessResponse(GenericResponseBody body, Provider provider) {
        GenericResponseHeader header = buildResponseHeader(BACK_END_SUCCESS_CODE,  "","" ,SUCCESS, provider, "");
        GenericResponse response = new GenericResponse();
        response.setBody(body);
        response.setHeader(header);

        return response;
    }

    public static GenericResponse buildErrorResponse(String errorCode, String errorMsg,  String key, String errorDescription,
                                                     IProvider provider, String messageType, String... errors) {
        GenericResponseHeader header = buildResponseHeader(errorCode, errorMsg, key, errorDescription, provider, messageType, errors);

        GenericResponse response = new GenericResponse();
        response.setBody(null);
        response.setHeader(header);

        return response;
    }

    public static GenericResponseHeader buildResponseHeader(String statusCode, String errorMsg, String key, String statusDescription,
                                                            IProvider provider, String messageType, String... errors) {
        GenericResponseHeader header = new GenericResponseHeader();
        header.setStatusCode(statusCode);
        header.setErrorMsg(errorMsg);
        header.setKey(key);
        header.setDescription(statusDescription);
        header.setProviderCode(provider.getCode());
        header.setProviderDescription(provider.getDescription());
        header.setMessageType(messageType);
        if (errors.length > 0)
            header.setErrors(errors);
        return header;
    }
}
