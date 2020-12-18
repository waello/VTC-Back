package com.navettevatry.rem4u.common.resources.dto.allocab.updated;

public class Category {
    private String category;
    private String startAirport;
    private String endTrainStation;

    public String getCategory() { return category; }
    public void setCategory(String value) { this.category = value; }

    public String getStartAirport() { return startAirport; }
    public void setStartAirport(String value) { this.startAirport = value; }

    public String getEndTrainStation() { return endTrainStation; }
    public void setEndTrainStation(String value) { this.endTrainStation = value; }

    @Override
    public String toString() {
        return "Category{" +
                "category='" + category + '\'' +
                ", startAirport='" + startAirport + '\'' +
                ", endTrainStation='" + endTrainStation + '\'' +
                '}';
    }
}
