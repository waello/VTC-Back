package com.navettevatry.rem4u.common.resources.dto.lecab;

import java.io.Serializable;
/**
 *
 * Created by Chakib Daii.
 */
public class JobsSearchResponse implements Serializable {
    private String id; /*Unique identifier*/

    public JobsSearchResponse() {
    }

    public JobsSearchResponse(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "JobsSearchResponse{" +
                "id='" + id + '\'' +
                '}';
    }
}
