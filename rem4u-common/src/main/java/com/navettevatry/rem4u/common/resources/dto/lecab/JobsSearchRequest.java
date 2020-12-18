package com.navettevatry.rem4u.common.resources.dto.lecab;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * Created by Chakib Daii.
 */
public class JobsSearchRequest implements Serializable {
    private CustomReferences references;

    public JobsSearchRequest() {
    }

    public JobsSearchRequest(CustomReferences references) {
        this.references = references;
    }

    public CustomReferences getReferences() {
        return references;
    }

    public void setReferences(CustomReferences references) {
        this.references = references;
    }

    @Override
    public String toString() {
        return "JobsSearchRequest{" +
                "references=" + references +
                '}';
    }
}
