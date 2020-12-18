package com.navettevatry.rem4u.common.utils.response.body;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.navettevatry.rem4u.common.utils.response.GenericResponseBody;

import java.util.List;

/**
 * this class is used to render a list of objects response
 *
 * @author Chakib Daii
 */
public class ListResponse<T extends Object> extends GenericResponseBody {
    @JsonProperty(value = "result")
    private List<T> list;

    public ListResponse() {
        super();
    }

    /**
     * @param list
     */
    public ListResponse(List<T> list) {
        super();
        this.list = list;
    }

    /**
     * @return the list
     */
    public List<T> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(List<T> list) {
        this.list = list;
    }

}
