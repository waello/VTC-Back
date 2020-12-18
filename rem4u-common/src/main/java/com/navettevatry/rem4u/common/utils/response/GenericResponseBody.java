package com.navettevatry.rem4u.common.utils.response;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.navettevatry.rem4u.common.utils.response.body.BooleanResponse;
import com.navettevatry.rem4u.common.utils.response.body.ListResponse;
import com.navettevatry.rem4u.common.utils.response.body.ObjectResponse;
import com.navettevatry.rem4u.common.utils.response.body.PaginatedListResponse;


/**
 *
 * @author Chakib Daii
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = BooleanResponse.class, name = "BOOLEAN_RESPONSE"),
        @JsonSubTypes.Type(value = ListResponse.class, name = "LIST_RESPONSE"),
        @JsonSubTypes.Type(value = ObjectResponse.class, name = "OBJECT_RESPONSE"),
        @JsonSubTypes.Type(value = PaginatedListResponse.class, name = "PAGINATED_LIST_RESPONSE")}
)
public abstract class GenericResponseBody {
    protected ResponseEnum type;
}
