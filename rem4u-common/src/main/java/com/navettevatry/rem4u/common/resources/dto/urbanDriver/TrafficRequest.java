// TrafficRequest.java

package com.navettevatry.rem4u.common.resources.dto.urbanDriver;

import java.util.List;

public class TrafficRequest {
    private Object price;
    private Object taxIncludedMessage;
    private String createdAt;
    private AddressDropOff addressPickUp;
    private long distance;
    private String distanceUnit;
    private long co2;
    private String comment;
    private long type;
    private Object driverNote;
    private Object driverID;
    private String state;
    private Object invoiceState;
    private Object isInvoiceSent;
    private String pickUpDate;
    private String dropOffDate;
    private long timeBeforePickUp;
    private long timeBeforeDropOff;
    private String rideDate;
    private long trafficDurationMinutes;
    private boolean isEditableByCustomer;
    private boolean isCancellableByCustomer;
    private boolean isPastRequest;
    private boolean recurrentRequest;
    private Object recurrentRequestID;
    private String discountCode;
    private Object partnerID;
    private String requestType;
    private boolean isUpdatableByDriver;
    private Object isPriceUpdatableByDriver;
    private SaasCompany saasCompany;
    private long immediatlyDriverSearchTimeout;
    private long roundingPriceType;
    private boolean sendableToConcur;
    private Object sendableToExpensya;
    private Object concurExpensePushState;
    private Object expensyaExpensePushState;
    private boolean identicalRequest;
    private long duration;
    private CompanyReferences companyReferences;
    private List<Object> requestCompanyReferences;
    private AddressDropOff addressDropOff;
    private List<Object> stops;
    private List<Object> options;
    private List<Route> route;
    private Object paymentType;
    private Object paymentPageURL;
    private boolean hasPrice;
    private String formattedPaymentType;
    private Object customer;
    private VehicleType vehicleType;
    private Currency currency;
    private long customerPrice;
    private String customerPriceString;
    private long customerPriceBeforeCredit;
    private String customerPriceBeforeCreditFormatted;
    private long saasCompanyDiscount;
    private String saasCompanyDiscountFormatted;
    private long driverDiscount;
    private String driverDiscountFormatted;
    private long discountCodeDiscount;
    private String discountCodeDiscountFormatted;
    private long companyDiscount;
    private String companyDiscountFormatted;
    private long driverDiscountCodeDiscount;
    private long driverDiscountCodeDiscountInSubunit;
    private String driverDiscountCodeDiscountFormatted;
    private long driverPrice;
    private Object driverPriceString;
    private Object isFirstRide;
    private boolean isPriorityRequest;
    private String flightNumber;
    private Object flightID;
    private CompanyReferences passenger;
    private CompanyReferences dispachingResult;
    private List<Object> packageTypes;
    private boolean activeFreeRide;
    private long channel;

    public Object getPrice() { return price; }
    public void setPrice(Object value) { this.price = value; }

    public Object getTaxIncludedMessage() { return taxIncludedMessage; }
    public void setTaxIncludedMessage(Object value) { this.taxIncludedMessage = value; }

    public String getCreatedAt() { return createdAt; }
    public void setCreatedAt(String value) { this.createdAt = value; }

    public AddressDropOff getAddressPickUp() { return addressPickUp; }
    public void setAddressPickUp(AddressDropOff value) { this.addressPickUp = value; }

    public long getDistance() { return distance; }
    public void setDistance(long value) { this.distance = value; }

    public String getDistanceUnit() { return distanceUnit; }
    public void setDistanceUnit(String value) { this.distanceUnit = value; }

    public long getCo2() { return co2; }
    public void setCo2(long value) { this.co2 = value; }

    public String getComment() { return comment; }
    public void setComment(String value) { this.comment = value; }

    public long getType() { return type; }
    public void setType(long value) { this.type = value; }

    public Object getDriverNote() { return driverNote; }
    public void setDriverNote(Object value) { this.driverNote = value; }

    public Object getDriverID() { return driverID; }
    public void setDriverID(Object value) { this.driverID = value; }

    public String getState() { return state; }
    public void setState(String value) { this.state = value; }

    public Object getInvoiceState() { return invoiceState; }
    public void setInvoiceState(Object value) { this.invoiceState = value; }

    public Object getIsInvoiceSent() { return isInvoiceSent; }
    public void setIsInvoiceSent(Object value) { this.isInvoiceSent = value; }

    public String getPickUpDate() { return pickUpDate; }
    public void setPickUpDate(String value) { this.pickUpDate = value; }

    public String getDropOffDate() { return dropOffDate; }
    public void setDropOffDate(String value) { this.dropOffDate = value; }

    public long getTimeBeforePickUp() { return timeBeforePickUp; }
    public void setTimeBeforePickUp(long value) { this.timeBeforePickUp = value; }

    public long getTimeBeforeDropOff() { return timeBeforeDropOff; }
    public void setTimeBeforeDropOff(long value) { this.timeBeforeDropOff = value; }

    public String getRideDate() { return rideDate; }
    public void setRideDate(String value) { this.rideDate = value; }

    public long getTrafficDurationMinutes() { return trafficDurationMinutes; }
    public void setTrafficDurationMinutes(long value) { this.trafficDurationMinutes = value; }

    public boolean getIsEditableByCustomer() { return isEditableByCustomer; }
    public void setIsEditableByCustomer(boolean value) { this.isEditableByCustomer = value; }

    public boolean getIsCancellableByCustomer() { return isCancellableByCustomer; }
    public void setIsCancellableByCustomer(boolean value) { this.isCancellableByCustomer = value; }

    public boolean getIsPastRequest() { return isPastRequest; }
    public void setIsPastRequest(boolean value) { this.isPastRequest = value; }

    public boolean getRecurrentRequest() { return recurrentRequest; }
    public void setRecurrentRequest(boolean value) { this.recurrentRequest = value; }

    public Object getRecurrentRequestID() { return recurrentRequestID; }
    public void setRecurrentRequestID(Object value) { this.recurrentRequestID = value; }

    public String getDiscountCode() { return discountCode; }
    public void setDiscountCode(String value) { this.discountCode = value; }

    public Object getPartnerID() { return partnerID; }
    public void setPartnerID(Object value) { this.partnerID = value; }

    public String getRequestType() { return requestType; }
    public void setRequestType(String value) { this.requestType = value; }

    public boolean getIsUpdatableByDriver() { return isUpdatableByDriver; }
    public void setIsUpdatableByDriver(boolean value) { this.isUpdatableByDriver = value; }

    public Object getIsPriceUpdatableByDriver() { return isPriceUpdatableByDriver; }
    public void setIsPriceUpdatableByDriver(Object value) { this.isPriceUpdatableByDriver = value; }

    public SaasCompany getSaasCompany() { return saasCompany; }
    public void setSaasCompany(SaasCompany value) { this.saasCompany = value; }

    public long getImmediatlyDriverSearchTimeout() { return immediatlyDriverSearchTimeout; }
    public void setImmediatlyDriverSearchTimeout(long value) { this.immediatlyDriverSearchTimeout = value; }

    public long getRoundingPriceType() { return roundingPriceType; }
    public void setRoundingPriceType(long value) { this.roundingPriceType = value; }

    public boolean getSendableToConcur() { return sendableToConcur; }
    public void setSendableToConcur(boolean value) { this.sendableToConcur = value; }

    public Object getSendableToExpensya() { return sendableToExpensya; }
    public void setSendableToExpensya(Object value) { this.sendableToExpensya = value; }

    public Object getConcurExpensePushState() { return concurExpensePushState; }
    public void setConcurExpensePushState(Object value) { this.concurExpensePushState = value; }

    public Object getExpensyaExpensePushState() { return expensyaExpensePushState; }
    public void setExpensyaExpensePushState(Object value) { this.expensyaExpensePushState = value; }

    public boolean getIdenticalRequest() { return identicalRequest; }
    public void setIdenticalRequest(boolean value) { this.identicalRequest = value; }

    public long getDuration() { return duration; }
    public void setDuration(long value) { this.duration = value; }

    public CompanyReferences getCompanyReferences() { return companyReferences; }
    public void setCompanyReferences(CompanyReferences value) { this.companyReferences = value; }

    public List<Object> getRequestCompanyReferences() { return requestCompanyReferences; }
    public void setRequestCompanyReferences(List<Object> value) { this.requestCompanyReferences = value; }

    public AddressDropOff getAddressDropOff() { return addressDropOff; }
    public void setAddressDropOff(AddressDropOff value) { this.addressDropOff = value; }

    public List<Object> getStops() { return stops; }
    public void setStops(List<Object> value) { this.stops = value; }

    public List<Object> getOptions() { return options; }
    public void setOptions(List<Object> value) { this.options = value; }

    public List<Route> getRoute() { return route; }
    public void setRoute(List<Route> value) { this.route = value; }

    public Object getPaymentType() { return paymentType; }
    public void setPaymentType(Object value) { this.paymentType = value; }

    public Object getPaymentPageURL() { return paymentPageURL; }
    public void setPaymentPageURL(Object value) { this.paymentPageURL = value; }

    public boolean getHasPrice() { return hasPrice; }
    public void setHasPrice(boolean value) { this.hasPrice = value; }

    public String getFormattedPaymentType() { return formattedPaymentType; }
    public void setFormattedPaymentType(String value) { this.formattedPaymentType = value; }

    public Object getCustomer() { return customer; }
    public void setCustomer(Object value) { this.customer = value; }

    public VehicleType getVehicleType() { return vehicleType; }
    public void setVehicleType(VehicleType value) { this.vehicleType = value; }

    public Currency getCurrency() { return currency; }
    public void setCurrency(Currency value) { this.currency = value; }

    public long getCustomerPrice() { return customerPrice; }
    public void setCustomerPrice(long value) { this.customerPrice = value; }

    public String getCustomerPriceString() { return customerPriceString; }
    public void setCustomerPriceString(String value) { this.customerPriceString = value; }

    public long getCustomerPriceBeforeCredit() { return customerPriceBeforeCredit; }
    public void setCustomerPriceBeforeCredit(long value) { this.customerPriceBeforeCredit = value; }

    public String getCustomerPriceBeforeCreditFormatted() { return customerPriceBeforeCreditFormatted; }
    public void setCustomerPriceBeforeCreditFormatted(String value) { this.customerPriceBeforeCreditFormatted = value; }

    public long getSaasCompanyDiscount() { return saasCompanyDiscount; }
    public void setSaasCompanyDiscount(long value) { this.saasCompanyDiscount = value; }

    public String getSaasCompanyDiscountFormatted() { return saasCompanyDiscountFormatted; }
    public void setSaasCompanyDiscountFormatted(String value) { this.saasCompanyDiscountFormatted = value; }

    public long getDriverDiscount() { return driverDiscount; }
    public void setDriverDiscount(long value) { this.driverDiscount = value; }

    public String getDriverDiscountFormatted() { return driverDiscountFormatted; }
    public void setDriverDiscountFormatted(String value) { this.driverDiscountFormatted = value; }

    public long getDiscountCodeDiscount() { return discountCodeDiscount; }
    public void setDiscountCodeDiscount(long value) { this.discountCodeDiscount = value; }

    public String getDiscountCodeDiscountFormatted() { return discountCodeDiscountFormatted; }
    public void setDiscountCodeDiscountFormatted(String value) { this.discountCodeDiscountFormatted = value; }

    public long getCompanyDiscount() { return companyDiscount; }
    public void setCompanyDiscount(long value) { this.companyDiscount = value; }

    public String getCompanyDiscountFormatted() { return companyDiscountFormatted; }
    public void setCompanyDiscountFormatted(String value) { this.companyDiscountFormatted = value; }

    public long getDriverDiscountCodeDiscount() { return driverDiscountCodeDiscount; }
    public void setDriverDiscountCodeDiscount(long value) { this.driverDiscountCodeDiscount = value; }

    public long getDriverDiscountCodeDiscountInSubunit() { return driverDiscountCodeDiscountInSubunit; }
    public void setDriverDiscountCodeDiscountInSubunit(long value) { this.driverDiscountCodeDiscountInSubunit = value; }

    public String getDriverDiscountCodeDiscountFormatted() { return driverDiscountCodeDiscountFormatted; }
    public void setDriverDiscountCodeDiscountFormatted(String value) { this.driverDiscountCodeDiscountFormatted = value; }

    public long getDriverPrice() { return driverPrice; }
    public void setDriverPrice(long value) { this.driverPrice = value; }

    public Object getDriverPriceString() { return driverPriceString; }
    public void setDriverPriceString(Object value) { this.driverPriceString = value; }

    public Object getIsFirstRide() { return isFirstRide; }
    public void setIsFirstRide(Object value) { this.isFirstRide = value; }

    public boolean getIsPriorityRequest() { return isPriorityRequest; }
    public void setIsPriorityRequest(boolean value) { this.isPriorityRequest = value; }

    public String getFlightNumber() { return flightNumber; }
    public void setFlightNumber(String value) { this.flightNumber = value; }

    public Object getFlightID() { return flightID; }
    public void setFlightID(Object value) { this.flightID = value; }

    public CompanyReferences getPassenger() { return passenger; }
    public void setPassenger(CompanyReferences value) { this.passenger = value; }

    public CompanyReferences getDispachingResult() { return dispachingResult; }
    public void setDispachingResult(CompanyReferences value) { this.dispachingResult = value; }

    public List<Object> getPackageTypes() { return packageTypes; }
    public void setPackageTypes(List<Object> value) { this.packageTypes = value; }

    public boolean getActiveFreeRide() { return activeFreeRide; }
    public void setActiveFreeRide(boolean value) { this.activeFreeRide = value; }

    public long getChannel() { return channel; }
    public void setChannel(long value) { this.channel = value; }
}

