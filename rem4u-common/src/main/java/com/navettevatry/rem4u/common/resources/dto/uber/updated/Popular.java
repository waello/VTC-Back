package com.navettevatry.rem4u.common.resources.dto.uber.updated;

import java.util.List;

public class Popular {
    private String name;
    private List<Long> viewIDS;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public List<Long> getViewIDS() {
        return viewIDS;
    }

    public void setViewIDS(List<Long> value) {
        this.viewIDS = value;
    }

    @Override
    public String toString() {
        return "Popular{" +
                "name='" + name + '\'' +
                ", viewIDS=" + viewIDS +
                '}';
    }
}
