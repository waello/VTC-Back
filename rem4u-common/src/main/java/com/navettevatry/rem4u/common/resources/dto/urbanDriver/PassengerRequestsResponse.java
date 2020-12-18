
package com.navettevatry.rem4u.common.resources.dto.urbanDriver;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PassengerRequestsResponse {
    private long id;
    private Object price;
    private Object taxIncludedMessage;
    private String createdAt;
    private AddressDropOff addressPickUp;
    private long distance;
    private String distanceUnit;
    private long co2;
    private String comment;
    private Object companyID;
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

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("price")
    public Object getPrice() { return price; }
    @JsonProperty("price")
    public void setPrice(Object value) { this.price = value; }

    @JsonProperty("tax_included_message")
    public Object getTaxIncludedMessage() { return taxIncludedMessage; }
    @JsonProperty("tax_included_message")
    public void setTaxIncludedMessage(Object value) { this.taxIncludedMessage = value; }

    @JsonProperty("created_at")
    public String getCreatedAt() { return createdAt; }
    @JsonProperty("created_at")
    public void setCreatedAt(String value) { this.createdAt = value; }

    @JsonProperty("address_pick_up")
    public AddressDropOff getAddressPickUp() { return addressPickUp; }
    @JsonProperty("address_pick_up")
    public void setAddressPickUp(AddressDropOff value) { this.addressPickUp = value; }

    @JsonProperty("distance")
    public long getDistance() { return distance; }
    @JsonProperty("distance")
    public void setDistance(long value) { this.distance = value; }

    @JsonProperty("distance_unit")
    public String getDistanceUnit() { return distanceUnit; }
    @JsonProperty("distance_unit")
    public void setDistanceUnit(String value) { this.distanceUnit = value; }

    @JsonProperty("co2")
    public long getCo2() { return co2; }
    @JsonProperty("co2")
    public void setCo2(long value) { this.co2 = value; }

    @JsonProperty("comment")
    public String getComment() { return comment; }
    @JsonProperty("comment")
    public void setComment(String value) { this.comment = value; }

    @JsonProperty("company_id")
    public Object getCompanyID() { return companyID; }
    @JsonProperty("company_id")
    public void setCompanyID(Object value) { this.companyID = value; }

    @JsonProperty("type")
    public long getType() { return type; }
    @JsonProperty("type")
    public void setType(long value) { this.type = value; }

    @JsonProperty("driver_note")
    public Object getDriverNote() { return driverNote; }
    @JsonProperty("driver_note")
    public void setDriverNote(Object value) { this.driverNote = value; }

    @JsonProperty("driver_id")
    public Object getDriverID() { return driverID; }
    @JsonProperty("driver_id")
    public void setDriverID(Object value) { this.driverID = value; }

    @JsonProperty("state")
    public String getState() { return state; }
    @JsonProperty("state")
    public void setState(String value) { this.state = value; }

    @JsonProperty("invoice_state")
    public Object getInvoiceState() { return invoiceState; }
    @JsonProperty("invoice_state")
    public void setInvoiceState(Object value) { this.invoiceState = value; }

    @JsonProperty("is_invoice_sent")
    public Object getIsInvoiceSent() { return isInvoiceSent; }
    @JsonProperty("is_invoice_sent")
    public void setIsInvoiceSent(Object value) { this.isInvoiceSent = value; }

    @JsonProperty("pick_up_date")
    public String getPickUpDate() { return pickUpDate; }
    @JsonProperty("pick_up_date")
    public void setPickUpDate(String value) { this.pickUpDate = value; }

    @JsonProperty("drop_off_date")
    public String getDropOffDate() { return dropOffDate; }
    @JsonProperty("drop_off_date")
    public void setDropOffDate(String value) { this.dropOffDate = value; }

    @JsonProperty("time_before_pick_up")
    public long getTimeBeforePickUp() { return timeBeforePickUp; }
    @JsonProperty("time_before_pick_up")
    public void setTimeBeforePickUp(long value) { this.timeBeforePickUp = value; }

    @JsonProperty("time_before_drop_off")
    public long getTimeBeforeDropOff() { return timeBeforeDropOff; }
    @JsonProperty("time_before_drop_off")
    public void setTimeBeforeDropOff(long value) { this.timeBeforeDropOff = value; }

    @JsonProperty("ride_date")
    public String getRideDate() { return rideDate; }
    @JsonProperty("ride_date")
    public void setRideDate(String value) { this.rideDate = value; }

    @JsonProperty("traffic_duration_minutes")
    public long getTrafficDurationMinutes() { return trafficDurationMinutes; }
    @JsonProperty("traffic_duration_minutes")
    public void setTrafficDurationMinutes(long value) { this.trafficDurationMinutes = value; }

    @JsonProperty("is_editable_by_customer")
    public boolean getIsEditableByCustomer() { return isEditableByCustomer; }
    @JsonProperty("is_editable_by_customer")
    public void setIsEditableByCustomer(boolean value) { this.isEditableByCustomer = value; }

    @JsonProperty("is_cancellable_by_customer")
    public boolean getIsCancellableByCustomer() { return isCancellableByCustomer; }
    @JsonProperty("is_cancellable_by_customer")
    public void setIsCancellableByCustomer(boolean value) { this.isCancellableByCustomer = value; }

    @JsonProperty("is_past_request")
    public boolean getIsPastRequest() { return isPastRequest; }
    @JsonProperty("is_past_request")
    public void setIsPastRequest(boolean value) { this.isPastRequest = value; }

    @JsonProperty("recurrent_request")
    public boolean getRecurrentRequest() { return recurrentRequest; }
    @JsonProperty("recurrent_request")
    public void setRecurrentRequest(boolean value) { this.recurrentRequest = value; }

    @JsonProperty("recurrent_request_id")
    public Object getRecurrentRequestID() { return recurrentRequestID; }
    @JsonProperty("recurrent_request_id")
    public void setRecurrentRequestID(Object value) { this.recurrentRequestID = value; }

    @JsonProperty("discount_code")
    public String getDiscountCode() { return discountCode; }
    @JsonProperty("discount_code")
    public void setDiscountCode(String value) { this.discountCode = value; }

    @JsonProperty("partner_id")
    public Object getPartnerID() { return partnerID; }
    @JsonProperty("partner_id")
    public void setPartnerID(Object value) { this.partnerID = value; }

    @JsonProperty("request_type")
    public String getRequestType() { return requestType; }
    @JsonProperty("request_type")
    public void setRequestType(String value) { this.requestType = value; }

    @JsonProperty("is_updatable_by_driver")
    public boolean getIsUpdatableByDriver() { return isUpdatableByDriver; }
    @JsonProperty("is_updatable_by_driver")
    public void setIsUpdatableByDriver(boolean value) { this.isUpdatableByDriver = value; }

    @JsonProperty("is_price_updatable_by_driver")
    public Object getIsPriceUpdatableByDriver() { return isPriceUpdatableByDriver; }
    @JsonProperty("is_price_updatable_by_driver")
    public void setIsPriceUpdatableByDriver(Object value) { this.isPriceUpdatableByDriver = value; }

    @JsonProperty("saas_company")
    public SaasCompany getSaasCompany() { return saasCompany; }
    @JsonProperty("saas_company")
    public void setSaasCompany(SaasCompany value) { this.saasCompany = value; }

    @JsonProperty("immediatly_driver_search_timeout")
    public long getImmediatlyDriverSearchTimeout() { return immediatlyDriverSearchTimeout; }
    @JsonProperty("immediatly_driver_search_timeout")
    public void setImmediatlyDriverSearchTimeout(long value) { this.immediatlyDriverSearchTimeout = value; }

    @JsonProperty("rounding_price_type")
    public long getRoundingPriceType() { return roundingPriceType; }
    @JsonProperty("rounding_price_type")
    public void setRoundingPriceType(long value) { this.roundingPriceType = value; }

    @JsonProperty("sendable_to_concur")
    public boolean getSendableToConcur() { return sendableToConcur; }
    @JsonProperty("sendable_to_concur")
    public void setSendableToConcur(boolean value) { this.sendableToConcur = value; }

    @JsonProperty("sendable_to_expensya")
    public Object getSendableToExpensya() { return sendableToExpensya; }
    @JsonProperty("sendable_to_expensya")
    public void setSendableToExpensya(Object value) { this.sendableToExpensya = value; }

    @JsonProperty("concur_expense_push_state")
    public Object getConcurExpensePushState() { return concurExpensePushState; }
    @JsonProperty("concur_expense_push_state")
    public void setConcurExpensePushState(Object value) { this.concurExpensePushState = value; }

    @JsonProperty("expensya_expense_push_state")
    public Object getExpensyaExpensePushState() { return expensyaExpensePushState; }
    @JsonProperty("expensya_expense_push_state")
    public void setExpensyaExpensePushState(Object value) { this.expensyaExpensePushState = value; }

    @JsonProperty("identical_request")
    public boolean getIdenticalRequest() { return identicalRequest; }
    @JsonProperty("identical_request")
    public void setIdenticalRequest(boolean value) { this.identicalRequest = value; }

    @JsonProperty("duration")
    public long getDuration() { return duration; }
    @JsonProperty("duration")
    public void setDuration(long value) { this.duration = value; }

    @JsonProperty("company_references")
    public CompanyReferences getCompanyReferences() { return companyReferences; }
    @JsonProperty("company_references")
    public void setCompanyReferences(CompanyReferences value) { this.companyReferences = value; }

    @JsonProperty("request_company_references")
    public List<Object> getRequestCompanyReferences() { return requestCompanyReferences; }
    @JsonProperty("request_company_references")
    public void setRequestCompanyReferences(List<Object> value) { this.requestCompanyReferences = value; }

    @JsonProperty("address_drop_off")
    public AddressDropOff getAddressDropOff() { return addressDropOff; }
    @JsonProperty("address_drop_off")
    public void setAddressDropOff(AddressDropOff value) { this.addressDropOff = value; }

    @JsonProperty("stops")
    public List<Object> getStops() { return stops; }
    @JsonProperty("stops")
    public void setStops(List<Object> value) { this.stops = value; }

    @JsonProperty("options")
    public List<Object> getOptions() { return options; }
    @JsonProperty("options")
    public void setOptions(List<Object> value) { this.options = value; }

    @JsonProperty("route")
    public List<Route> getRoute() { return route; }
    @JsonProperty("route")
    public void setRoute(List<Route> value) { this.route = value; }

    @JsonProperty("payment_type")
    public Object getPaymentType() { return paymentType; }
    @JsonProperty("payment_type")
    public void setPaymentType(Object value) { this.paymentType = value; }

    @JsonProperty("payment_page_url")
    public Object getPaymentPageURL() { return paymentPageURL; }
    @JsonProperty("payment_page_url")
    public void setPaymentPageURL(Object value) { this.paymentPageURL = value; }

    @JsonProperty("has_price")
    public boolean getHasPrice() { return hasPrice; }
    @JsonProperty("has_price")
    public void setHasPrice(boolean value) { this.hasPrice = value; }

    @JsonProperty("formatted_payment_type")
    public String getFormattedPaymentType() { return formattedPaymentType; }
    @JsonProperty("formatted_payment_type")
    public void setFormattedPaymentType(String value) { this.formattedPaymentType = value; }

    @JsonProperty("customer")
    public Object getCustomer() { return customer; }
    @JsonProperty("customer")
    public void setCustomer(Object value) { this.customer = value; }

    @JsonProperty("vehicle_type")
    public VehicleType getVehicleType() { return vehicleType; }
    @JsonProperty("vehicle_type")
    public void setVehicleType(VehicleType value) { this.vehicleType = value; }

    @JsonProperty("currency")
    public Currency getCurrency() { return currency; }
    @JsonProperty("currency")
    public void setCurrency(Currency value) { this.currency = value; }

    @JsonProperty("customer_price")
    public long getCustomerPrice() { return customerPrice; }
    @JsonProperty("customer_price")
    public void setCustomerPrice(long value) { this.customerPrice = value; }

    @JsonProperty("customer_price_string")
    public String getCustomerPriceString() { return customerPriceString; }
    @JsonProperty("customer_price_string")
    public void setCustomerPriceString(String value) { this.customerPriceString = value; }

    @JsonProperty("customer_price_before_credit")
    public long getCustomerPriceBeforeCredit() { return customerPriceBeforeCredit; }
    @JsonProperty("customer_price_before_credit")
    public void setCustomerPriceBeforeCredit(long value) { this.customerPriceBeforeCredit = value; }

    @JsonProperty("customer_price_before_credit_formatted")
    public String getCustomerPriceBeforeCreditFormatted() { return customerPriceBeforeCreditFormatted; }
    @JsonProperty("customer_price_before_credit_formatted")
    public void setCustomerPriceBeforeCreditFormatted(String value) { this.customerPriceBeforeCreditFormatted = value; }

    @JsonProperty("saas_company_discount")
    public long getSaasCompanyDiscount() { return saasCompanyDiscount; }
    @JsonProperty("saas_company_discount")
    public void setSaasCompanyDiscount(long value) { this.saasCompanyDiscount = value; }

    @JsonProperty("saas_company_discount_formatted")
    public String getSaasCompanyDiscountFormatted() { return saasCompanyDiscountFormatted; }
    @JsonProperty("saas_company_discount_formatted")
    public void setSaasCompanyDiscountFormatted(String value) { this.saasCompanyDiscountFormatted = value; }

    @JsonProperty("driver_discount")
    public long getDriverDiscount() { return driverDiscount; }
    @JsonProperty("driver_discount")
    public void setDriverDiscount(long value) { this.driverDiscount = value; }

    @JsonProperty("driver_discount_formatted")
    public String getDriverDiscountFormatted() { return driverDiscountFormatted; }
    @JsonProperty("driver_discount_formatted")
    public void setDriverDiscountFormatted(String value) { this.driverDiscountFormatted = value; }

    @JsonProperty("discount_code_discount")
    public long getDiscountCodeDiscount() { return discountCodeDiscount; }
    @JsonProperty("discount_code_discount")
    public void setDiscountCodeDiscount(long value) { this.discountCodeDiscount = value; }

    @JsonProperty("discount_code_discount_formatted")
    public String getDiscountCodeDiscountFormatted() { return discountCodeDiscountFormatted; }
    @JsonProperty("discount_code_discount_formatted")
    public void setDiscountCodeDiscountFormatted(String value) { this.discountCodeDiscountFormatted = value; }

    @JsonProperty("company_discount")
    public long getCompanyDiscount() { return companyDiscount; }
    @JsonProperty("company_discount")
    public void setCompanyDiscount(long value) { this.companyDiscount = value; }

    @JsonProperty("company_discount_formatted")
    public String getCompanyDiscountFormatted() { return companyDiscountFormatted; }
    @JsonProperty("company_discount_formatted")
    public void setCompanyDiscountFormatted(String value) { this.companyDiscountFormatted = value; }

    @JsonProperty("driver_discount_code_discount")
    public long getDriverDiscountCodeDiscount() { return driverDiscountCodeDiscount; }
    @JsonProperty("driver_discount_code_discount")
    public void setDriverDiscountCodeDiscount(long value) { this.driverDiscountCodeDiscount = value; }

    @JsonProperty("driver_discount_code_discount_in_subunit")
    public long getDriverDiscountCodeDiscountInSubunit() { return driverDiscountCodeDiscountInSubunit; }
    @JsonProperty("driver_discount_code_discount_in_subunit")
    public void setDriverDiscountCodeDiscountInSubunit(long value) { this.driverDiscountCodeDiscountInSubunit = value; }

    @JsonProperty("driver_discount_code_discount_formatted")
    public String getDriverDiscountCodeDiscountFormatted() { return driverDiscountCodeDiscountFormatted; }
    @JsonProperty("driver_discount_code_discount_formatted")
    public void setDriverDiscountCodeDiscountFormatted(String value) { this.driverDiscountCodeDiscountFormatted = value; }

    @JsonProperty("driver_price")
    public long getDriverPrice() { return driverPrice; }
    @JsonProperty("driver_price")
    public void setDriverPrice(long value) { this.driverPrice = value; }

    @JsonProperty("driver_price_string")
    public Object getDriverPriceString() { return driverPriceString; }
    @JsonProperty("driver_price_string")
    public void setDriverPriceString(Object value) { this.driverPriceString = value; }

    @JsonProperty("is_first_ride")
    public Object getIsFirstRide() { return isFirstRide; }
    @JsonProperty("is_first_ride")
    public void setIsFirstRide(Object value) { this.isFirstRide = value; }

    @JsonProperty("is_priority_request")
    public boolean getIsPriorityRequest() { return isPriorityRequest; }
    @JsonProperty("is_priority_request")
    public void setIsPriorityRequest(boolean value) { this.isPriorityRequest = value; }

    @JsonProperty("flight_number")
    public String getFlightNumber() { return flightNumber; }
    @JsonProperty("flight_number")
    public void setFlightNumber(String value) { this.flightNumber = value; }

    @JsonProperty("flight_id")
    public Object getFlightID() { return flightID; }
    @JsonProperty("flight_id")
    public void setFlightID(Object value) { this.flightID = value; }

    @Override
    public String toString() {
        return "PassengerRequestsResponse{" +
                "id=" + id +
                ", price=" + price +
                ", taxIncludedMessage=" + taxIncludedMessage +
                ", createdAt='" + createdAt + '\'' +
                ", addressPickUp=" + addressPickUp +
                ", distance=" + distance +
                ", distanceUnit='" + distanceUnit + '\'' +
                ", co2=" + co2 +
                ", comment='" + comment + '\'' +
                ", companyID=" + companyID +
                ", type=" + type +
                ", driverNote=" + driverNote +
                ", driverID=" + driverID +
                ", state='" + state + '\'' +
                ", invoiceState=" + invoiceState +
                ", isInvoiceSent=" + isInvoiceSent +
                ", pickUpDate='" + pickUpDate + '\'' +
                ", dropOffDate='" + dropOffDate + '\'' +
                ", timeBeforePickUp=" + timeBeforePickUp +
                ", timeBeforeDropOff=" + timeBeforeDropOff +
                ", rideDate='" + rideDate + '\'' +
                ", trafficDurationMinutes=" + trafficDurationMinutes +
                ", isEditableByCustomer=" + isEditableByCustomer +
                ", isCancellableByCustomer=" + isCancellableByCustomer +
                ", isPastRequest=" + isPastRequest +
                ", recurrentRequest=" + recurrentRequest +
                ", recurrentRequestID=" + recurrentRequestID +
                ", discountCode='" + discountCode + '\'' +
                ", partnerID=" + partnerID +
                ", requestType='" + requestType + '\'' +
                ", isUpdatableByDriver=" + isUpdatableByDriver +
                ", isPriceUpdatableByDriver=" + isPriceUpdatableByDriver +
                ", saasCompany=" + saasCompany +
                ", immediatlyDriverSearchTimeout=" + immediatlyDriverSearchTimeout +
                ", roundingPriceType=" + roundingPriceType +
                ", sendableToConcur=" + sendableToConcur +
                ", sendableToExpensya=" + sendableToExpensya +
                ", concurExpensePushState=" + concurExpensePushState +
                ", expensyaExpensePushState=" + expensyaExpensePushState +
                ", identicalRequest=" + identicalRequest +
                ", duration=" + duration +
                ", companyReferences=" + companyReferences +
                ", requestCompanyReferences=" + requestCompanyReferences +
                ", addressDropOff=" + addressDropOff +
                ", stops=" + stops +
                ", options=" + options +
                ", route=" + route +
                ", paymentType=" + paymentType +
                ", paymentPageURL=" + paymentPageURL +
                ", hasPrice=" + hasPrice +
                ", formattedPaymentType='" + formattedPaymentType + '\'' +
                ", customer=" + customer +
                ", vehicleType=" + vehicleType +
                ", currency=" + currency +
                ", customerPrice=" + customerPrice +
                ", customerPriceString='" + customerPriceString + '\'' +
                ", customerPriceBeforeCredit=" + customerPriceBeforeCredit +
                ", customerPriceBeforeCreditFormatted='" + customerPriceBeforeCreditFormatted + '\'' +
                ", saasCompanyDiscount=" + saasCompanyDiscount +
                ", saasCompanyDiscountFormatted='" + saasCompanyDiscountFormatted + '\'' +
                ", driverDiscount=" + driverDiscount +
                ", driverDiscountFormatted='" + driverDiscountFormatted + '\'' +
                ", discountCodeDiscount=" + discountCodeDiscount +
                ", discountCodeDiscountFormatted='" + discountCodeDiscountFormatted + '\'' +
                ", companyDiscount=" + companyDiscount +
                ", companyDiscountFormatted='" + companyDiscountFormatted + '\'' +
                ", driverDiscountCodeDiscount=" + driverDiscountCodeDiscount +
                ", driverDiscountCodeDiscountInSubunit=" + driverDiscountCodeDiscountInSubunit +
                ", driverDiscountCodeDiscountFormatted='" + driverDiscountCodeDiscountFormatted + '\'' +
                ", driverPrice=" + driverPrice +
                ", driverPriceString=" + driverPriceString +
                ", isFirstRide=" + isFirstRide +
                ", isPriorityRequest=" + isPriorityRequest +
                ", flightNumber='" + flightNumber + '\'' +
                ", flightID=" + flightID +
                ", passenger=" + passenger +
                ", dispachingResult=" + dispachingResult +
                '}';
    }

    @JsonProperty("passenger")
    public CompanyReferences getPassenger() { return passenger; }
    @JsonProperty("passenger")
    public void setPassenger(CompanyReferences value) { this.passenger = value; }

    @JsonProperty("dispaching_result")
    public CompanyReferences getDispachingResult() { return dispachingResult; }
    @JsonProperty("dispaching_result")
    public void setDispachingResult(CompanyReferences value) { this.dispachingResult = value; }
}