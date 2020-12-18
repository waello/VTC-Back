package com.navettevatry.rem4u.common.resources.dto.lecab;

import java.io.Serializable;
import java.util.HashMap;
/**
 *
 * Created by Chakib Daii.
 */
public class CustomReferences implements Serializable {
    private HashMap<String,String> reference_name;

    public CustomReferences() {
    }

    public CustomReferences(HashMap<String, String> reference_name) {
        this.reference_name = reference_name;
    }

    public HashMap<String, String> getReference_name() {
        return reference_name;
    }

    public void setReference_name(HashMap<String, String> reference_name) {
        this.reference_name = reference_name;
    }

    @Override
    public String toString() {
        return "CustomReferences{" +
                "reference_name=" + reference_name +
                '}';
    }
}
