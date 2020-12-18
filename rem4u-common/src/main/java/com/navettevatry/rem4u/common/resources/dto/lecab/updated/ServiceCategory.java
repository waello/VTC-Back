package com.navettevatry.rem4u.common.resources.dto.lecab.updated;

import com.fasterxml.jackson.annotation.*;
import java.util.UUID;

public class ServiceCategory {
    private UUID id;
    private String name;
    private boolean serviceCategoryDefault;

    @JsonProperty("id")
    public UUID getID() { return id; }
    @JsonProperty("id")
    public void setID(UUID value) { this.id = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("default")
    public boolean getServiceCategoryDefault() { return serviceCategoryDefault; }
    @JsonProperty("default")
    public void setServiceCategoryDefault(boolean value) { this.serviceCategoryDefault = value; }
}
