package com.navettevatry.rem4u.common.resources.dto.snapcar;

import java.io.Serializable;

/**
 *
 * Created by Chakib Daii.
 */
public class ServiceClass implements Serializable {
    private String id; /*Unique identifier*/
    private LocalizedText name; /*name for the service class*/

    public ServiceClass() {
    }

    public ServiceClass(String id, LocalizedText name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalizedText getName() {
        return name;
    }

    public void setName(LocalizedText name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ServiceClass{" +
                "id='" + id + '\'' +
                ", name=" + name +
                '}';
    }
}
