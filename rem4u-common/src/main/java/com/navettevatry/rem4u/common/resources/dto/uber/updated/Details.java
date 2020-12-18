package com.navettevatry.rem4u.common.resources.dto.uber.updated;

public class Details {
    private String description;
    private long capacity;
    private String baseFare;
    private String bookingFee;
    private String minimumFare;
    private String cancellationFee;
    private String perMinute;
    private double perMinuteValue;
    private String perWaitMinute;
    private double perWaitMinuteValue;
    private long cancellationValue;
    private String perDistanceUnit;
    private String distanceUnit;
    private boolean canChangeDestination;

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long value) {
        this.capacity = value;
    }

    public String getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(String value) {
        this.baseFare = value;
    }

    public String getBookingFee() {
        return bookingFee;
    }

    public void setBookingFee(String value) {
        this.bookingFee = value;
    }

    public String getMinimumFare() {
        return minimumFare;
    }

    public void setMinimumFare(String value) {
        this.minimumFare = value;
    }

    public String getCancellationFee() {
        return cancellationFee;
    }

    public void setCancellationFee(String value) {
        this.cancellationFee = value;
    }

    public String getPerMinute() {
        return perMinute;
    }

    public void setPerMinute(String value) {
        this.perMinute = value;
    }

    public double getPerMinuteValue() {
        return perMinuteValue;
    }

    public void setPerMinuteValue(double value) {
        this.perMinuteValue = value;
    }

    public String getPerWaitMinute() {
        return perWaitMinute;
    }

    public void setPerWaitMinute(String value) {
        this.perWaitMinute = value;
    }

    public double getPerWaitMinuteValue() {
        return perWaitMinuteValue;
    }

    public void setPerWaitMinuteValue(double value) {
        this.perWaitMinuteValue = value;
    }

    public long getCancellationValue() {
        return cancellationValue;
    }

    public void setCancellationValue(long value) {
        this.cancellationValue = value;
    }

    public String getPerDistanceUnit() {
        return perDistanceUnit;
    }

    public void setPerDistanceUnit(String value) {
        this.perDistanceUnit = value;
    }

    public String getDistanceUnit() {
        return distanceUnit;
    }

    public void setDistanceUnit(String value) {
        this.distanceUnit = value;
    }

    public boolean getCanChangeDestination() {
        return canChangeDestination;
    }

    public void setCanChangeDestination(boolean value) {
        this.canChangeDestination = value;
    }

    @Override
    public String toString() {
        return "Details{" +
                "description='" + description + '\'' +
                ", capacity=" + capacity +
                ", baseFare='" + baseFare + '\'' +
                ", bookingFee='" + bookingFee + '\'' +
                ", minimumFare='" + minimumFare + '\'' +
                ", cancellationFee='" + cancellationFee + '\'' +
                ", perMinute='" + perMinute + '\'' +
                ", perMinuteValue=" + perMinuteValue +
                ", perWaitMinute='" + perWaitMinute + '\'' +
                ", perWaitMinuteValue=" + perWaitMinuteValue +
                ", cancellationValue=" + cancellationValue +
                ", perDistanceUnit='" + perDistanceUnit + '\'' +
                ", distanceUnit='" + distanceUnit + '\'' +
                ", canChangeDestination=" + canChangeDestination +
                '}';
    }
}
