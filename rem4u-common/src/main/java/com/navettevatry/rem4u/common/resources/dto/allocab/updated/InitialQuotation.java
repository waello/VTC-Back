package com.navettevatry.rem4u.common.resources.dto.allocab.updated;

public class InitialQuotation {
    private long minimum;
    private long perKilometer;
    private long perMinute;
    private long waitingMinutes;
    private long pricePerMinutesWaiting;
    private long priceBase;
    private long pricePerHour;
    private long pricePerHourSup;
    private long onBoardPaymentFee;
    private long delayBeforeDepartureCancelFeesTriggerRegularInMinutes;
    private long gracePeriodAfterBookingInMinutes;
    private Total total;
    private long internalSurge;
    private boolean roundPrice;
    private boolean periodQuotation;
    private String panelNameKey;

    public long getMinimum() { return minimum; }
    public void setMinimum(long value) { this.minimum = value; }

    public long getPerKilometer() { return perKilometer; }
    public void setPerKilometer(long value) { this.perKilometer = value; }

    public long getPerMinute() { return perMinute; }
    public void setPerMinute(long value) { this.perMinute = value; }

    public long getWaitingMinutes() { return waitingMinutes; }
    public void setWaitingMinutes(long value) { this.waitingMinutes = value; }

    public long getPricePerMinutesWaiting() { return pricePerMinutesWaiting; }
    public void setPricePerMinutesWaiting(long value) { this.pricePerMinutesWaiting = value; }

    public long getPriceBase() { return priceBase; }
    public void setPriceBase(long value) { this.priceBase = value; }

    public long getPricePerHour() { return pricePerHour; }
    public void setPricePerHour(long value) { this.pricePerHour = value; }

    public long getPricePerHourSup() { return pricePerHourSup; }
    public void setPricePerHourSup(long value) { this.pricePerHourSup = value; }

    public long getOnBoardPaymentFee() { return onBoardPaymentFee; }
    public void setOnBoardPaymentFee(long value) { this.onBoardPaymentFee = value; }

    public long getDelayBeforeDepartureCancelFeesTriggerRegularInMinutes() { return delayBeforeDepartureCancelFeesTriggerRegularInMinutes; }
    public void setDelayBeforeDepartureCancelFeesTriggerRegularInMinutes(long value) { this.delayBeforeDepartureCancelFeesTriggerRegularInMinutes = value; }

    public long getGracePeriodAfterBookingInMinutes() { return gracePeriodAfterBookingInMinutes; }
    public void setGracePeriodAfterBookingInMinutes(long value) { this.gracePeriodAfterBookingInMinutes = value; }

    public Total getTotal() { return total; }
    public void setTotal(Total value) { this.total = value; }

    public long getInternalSurge() { return internalSurge; }
    public void setInternalSurge(long value) { this.internalSurge = value; }

    public boolean getRoundPrice() { return roundPrice; }
    public void setRoundPrice(boolean value) { this.roundPrice = value; }

    public boolean getPeriodQuotation() { return periodQuotation; }
    public void setPeriodQuotation(boolean value) { this.periodQuotation = value; }

    public String getPanelNameKey() { return panelNameKey; }
    public void setPanelNameKey(String value) { this.panelNameKey = value; }

    @Override
    public String toString() {
        return "InitialQuotation{" +
                "minimum=" + minimum +
                ", perKilometer=" + perKilometer +
                ", perMinute=" + perMinute +
                ", waitingMinutes=" + waitingMinutes +
                ", pricePerMinutesWaiting=" + pricePerMinutesWaiting +
                ", priceBase=" + priceBase +
                ", pricePerHour=" + pricePerHour +
                ", pricePerHourSup=" + pricePerHourSup +
                ", onBoardPaymentFee=" + onBoardPaymentFee +
                ", delayBeforeDepartureCancelFeesTriggerRegularInMinutes=" + delayBeforeDepartureCancelFeesTriggerRegularInMinutes +
                ", gracePeriodAfterBookingInMinutes=" + gracePeriodAfterBookingInMinutes +
                ", total=" + total +
                ", internalSurge=" + internalSurge +
                ", roundPrice=" + roundPrice +
                ", periodQuotation=" + periodQuotation +
                ", panelNameKey='" + panelNameKey + '\'' +
                '}';
    }
}
