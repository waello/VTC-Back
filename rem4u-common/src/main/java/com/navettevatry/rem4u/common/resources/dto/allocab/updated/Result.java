package com.navettevatry.rem4u.common.resources.dto.allocab.updated;

import com.navettevatry.rem4u.common.resources.dto.allocab.updated.Quotation;

import java.util.List;
import java.util.UUID;

public class Result {
    private long id;
    private boolean flash;
    private long took;
    private String initiator;
    private String bookingDelay;
    private long minutesBeforeDeparture;
    private DirectionResume directionResume;
    private List<Quotation> quotations;
    private long departureAt;
    private String timezone;
    private String bookStep;
    private String priceMode;
    private String flashCallState;
    private long createdAt;
    private long updatedAt;
    private long expiresAt;
    private UUID token;
    private String source;
    private boolean hasCarrier;
    private boolean reception;
    private double surge;
    private List<Object> promoCodeToUse;
    private long period;
    private String operator;
    private boolean eligibleToTaxiPrice;
    private boolean useTaxiPrice;
    private List<InitialQuotation> initialQuotations;
    private List<InitialQuotation> taxiPriceQuotations;
    private long trafficDuration;
    private boolean displayPrice;
    private Category category;
    private boolean signAvailable;
    private boolean anonymousQuotation;
    private boolean confirmationNeeded;
    private String department;
    private ReservedFareKey reservedFareKey;
    private long reservedFareID;
    private String humanReference;

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public boolean getFlash() { return flash; }
    public void setFlash(boolean value) { this.flash = value; }

    public long getTook() { return took; }
    public void setTook(long value) { this.took = value; }

    public String getInitiator() { return initiator; }
    public void setInitiator(String value) { this.initiator = value; }

    public String getBookingDelay() { return bookingDelay; }
    public void setBookingDelay(String value) { this.bookingDelay = value; }

    public long getMinutesBeforeDeparture() { return minutesBeforeDeparture; }
    public void setMinutesBeforeDeparture(long value) { this.minutesBeforeDeparture = value; }

    public DirectionResume getDirectionResume() { return directionResume; }
    public void setDirectionResume(DirectionResume value) { this.directionResume = value; }

    public List<Quotation> getQuotations() { return quotations; }
    public void setQuotations(List<Quotation> value) { this.quotations = value; }

    public long getDepartureAt() { return departureAt; }
    public void setDepartureAt(long value) { this.departureAt = value; }

    public String getTimezone() { return timezone; }
    public void setTimezone(String value) { this.timezone = value; }

    public String getBookStep() { return bookStep; }
    public void setBookStep(String value) { this.bookStep = value; }

    public String getPriceMode() { return priceMode; }
    public void setPriceMode(String value) { this.priceMode = value; }

    public String getFlashCallState() { return flashCallState; }
    public void setFlashCallState(String value) { this.flashCallState = value; }

    public long getCreatedAt() { return createdAt; }
    public void setCreatedAt(long value) { this.createdAt = value; }

    public long getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(long value) { this.updatedAt = value; }

    public long getExpiresAt() { return expiresAt; }
    public void setExpiresAt(long value) { this.expiresAt = value; }

    public UUID getToken() { return token; }
    public void setToken(UUID value) { this.token = value; }

    public String getSource() { return source; }
    public void setSource(String value) { this.source = value; }

    public boolean getHasCarrier() { return hasCarrier; }
    public void setHasCarrier(boolean value) { this.hasCarrier = value; }

    public boolean getReception() { return reception; }
    public void setReception(boolean value) { this.reception = value; }

    public double getSurge() { return surge; }
    public void setSurge(double value) { this.surge = value; }

    public List<Object> getPromoCodeToUse() { return promoCodeToUse; }
    public void setPromoCodeToUse(List<Object> value) { this.promoCodeToUse = value; }

    public long getPeriod() { return period; }
    public void setPeriod(long value) { this.period = value; }

    public String getOperator() { return operator; }
    public void setOperator(String value) { this.operator = value; }

    public boolean getEligibleToTaxiPrice() { return eligibleToTaxiPrice; }
    public void setEligibleToTaxiPrice(boolean value) { this.eligibleToTaxiPrice = value; }

    public boolean getUseTaxiPrice() { return useTaxiPrice; }
    public void setUseTaxiPrice(boolean value) { this.useTaxiPrice = value; }

    public List<InitialQuotation> getInitialQuotations() { return initialQuotations; }
    public void setInitialQuotations(List<InitialQuotation> value) { this.initialQuotations = value; }

    public List<InitialQuotation> getTaxiPriceQuotations() { return taxiPriceQuotations; }
    public void setTaxiPriceQuotations(List<InitialQuotation> value) { this.taxiPriceQuotations = value; }

    public long getTrafficDuration() { return trafficDuration; }
    public void setTrafficDuration(long value) { this.trafficDuration = value; }

    public boolean getDisplayPrice() { return displayPrice; }
    public void setDisplayPrice(boolean value) { this.displayPrice = value; }

    public Category getCategory() { return category; }
    public void setCategory(Category value) { this.category = value; }

    public boolean getSignAvailable() { return signAvailable; }
    public void setSignAvailable(boolean value) { this.signAvailable = value; }

    public boolean getAnonymousQuotation() { return anonymousQuotation; }
    public void setAnonymousQuotation(boolean value) { this.anonymousQuotation = value; }

    public boolean getConfirmationNeeded() { return confirmationNeeded; }
    public void setConfirmationNeeded(boolean value) { this.confirmationNeeded = value; }

    public String getDepartment() { return department; }
    public void setDepartment(String value) { this.department = value; }

    public ReservedFareKey getReservedFareKey() { return reservedFareKey; }
    public void setReservedFareKey(ReservedFareKey value) { this.reservedFareKey = value; }

    public long getReservedFareID() { return reservedFareID; }
    public void setReservedFareID(long value) { this.reservedFareID = value; }

    public String getHumanReference() { return humanReference; }
    public void setHumanReference(String value) { this.humanReference = value; }

    @Override
    public String toString() {
        return "Result{" +
                "id=" + id +
                ", flash=" + flash +
                ", took=" + took +
                ", initiator='" + initiator + '\'' +
                ", bookingDelay='" + bookingDelay + '\'' +
                ", minutesBeforeDeparture=" + minutesBeforeDeparture +
                ", directionResume=" + directionResume +
                ", quotations=" + quotations +
                ", departureAt=" + departureAt +
                ", timezone='" + timezone + '\'' +
                ", bookStep='" + bookStep + '\'' +
                ", priceMode='" + priceMode + '\'' +
                ", flashCallState='" + flashCallState + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", expiresAt=" + expiresAt +
                ", token=" + token +
                ", source='" + source + '\'' +
                ", hasCarrier=" + hasCarrier +
                ", reception=" + reception +
                ", surge=" + surge +
                ", promoCodeToUse=" + promoCodeToUse +
                ", period=" + period +
                ", operator='" + operator + '\'' +
                ", eligibleToTaxiPrice=" + eligibleToTaxiPrice +
                ", useTaxiPrice=" + useTaxiPrice +
                ", initialQuotations=" + initialQuotations +
                ", taxiPriceQuotations=" + taxiPriceQuotations +
                ", trafficDuration=" + trafficDuration +
                ", displayPrice=" + displayPrice +
                ", category=" + category +
                ", signAvailable=" + signAvailable +
                ", anonymousQuotation=" + anonymousQuotation +
                ", confirmationNeeded=" + confirmationNeeded +
                ", department='" + department + '\'' +
                ", reservedFareKey=" + reservedFareKey +
                ", reservedFareID=" + reservedFareID +
                ", humanReference='" + humanReference + '\'' +
                '}';
    }
}
