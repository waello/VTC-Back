package com.navettevatry.rem4u.common.resources.dto.lecab.updated;

import com.fasterxml.jackson.annotation.*;
import java.util.List;
import java.util.UUID;

public class Service {
    private String customerType;
    private UUID id;
    private String caption;
    private String description;
    private String code;
    private Object tariffDescription;
    private Object shortTariffDescription;
    private Object pricePrefix;
    private long passengerCount;
    private boolean offerService;
    private RouteSettings routeSettings;
    private boolean delivery;
    private List<String> availablePaymentTypes;
    private Object partner;
    private boolean enableAddressProposal;
    private Object proposedService;
    private boolean availableForAsap;
    private boolean availableForPrebook;
    private ServiceCategory serviceCategory;
    private Object parcelTypes;
    private boolean serviceDefault;

    @JsonProperty("customerType")
    public String getCustomerType() { return customerType; }
    @JsonProperty("customerType")
    public void setCustomerType(String value) { this.customerType = value; }

    @JsonProperty("id")
    public UUID getID() { return id; }
    @JsonProperty("id")
    public void setID(UUID value) { this.id = value; }

    @JsonProperty("caption")
    public String getCaption() { return caption; }
    @JsonProperty("caption")
    public void setCaption(String value) { this.caption = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("code")
    public String getCode() { return code; }
    @JsonProperty("code")
    public void setCode(String value) { this.code = value; }

    @JsonProperty("tariffDescription")
    public Object getTariffDescription() { return tariffDescription; }
    @JsonProperty("tariffDescription")
    public void setTariffDescription(Object value) { this.tariffDescription = value; }

    @JsonProperty("shortTariffDescription")
    public Object getShortTariffDescription() { return shortTariffDescription; }
    @JsonProperty("shortTariffDescription")
    public void setShortTariffDescription(Object value) { this.shortTariffDescription = value; }

    @JsonProperty("pricePrefix")
    public Object getPricePrefix() { return pricePrefix; }
    @JsonProperty("pricePrefix")
    public void setPricePrefix(Object value) { this.pricePrefix = value; }

    @JsonProperty("passengerCount")
    public long getPassengerCount() { return passengerCount; }
    @JsonProperty("passengerCount")
    public void setPassengerCount(long value) { this.passengerCount = value; }

    @JsonProperty("offerService")
    public boolean getOfferService() { return offerService; }
    @JsonProperty("offerService")
    public void setOfferService(boolean value) { this.offerService = value; }

    @JsonProperty("routeSettings")
    public RouteSettings getRouteSettings() { return routeSettings; }
    @JsonProperty("routeSettings")
    public void setRouteSettings(RouteSettings value) { this.routeSettings = value; }

    @JsonProperty("delivery")
    public boolean getDelivery() { return delivery; }
    @JsonProperty("delivery")
    public void setDelivery(boolean value) { this.delivery = value; }

    @JsonProperty("availablePaymentTypes")
    public List<String> getAvailablePaymentTypes() { return availablePaymentTypes; }
    @JsonProperty("availablePaymentTypes")
    public void setAvailablePaymentTypes(List<String> value) { this.availablePaymentTypes = value; }

    @JsonProperty("partner")
    public Object getPartner() { return partner; }
    @JsonProperty("partner")
    public void setPartner(Object value) { this.partner = value; }

    @JsonProperty("enableAddressProposal")
    public boolean getEnableAddressProposal() { return enableAddressProposal; }
    @JsonProperty("enableAddressProposal")
    public void setEnableAddressProposal(boolean value) { this.enableAddressProposal = value; }

    @JsonProperty("proposedService")
    public Object getProposedService() { return proposedService; }
    @JsonProperty("proposedService")
    public void setProposedService(Object value) { this.proposedService = value; }

    @JsonProperty("availableForAsap")
    public boolean getAvailableForAsap() { return availableForAsap; }
    @JsonProperty("availableForAsap")
    public void setAvailableForAsap(boolean value) { this.availableForAsap = value; }

    @JsonProperty("availableForPrebook")
    public boolean getAvailableForPrebook() { return availableForPrebook; }
    @JsonProperty("availableForPrebook")
    public void setAvailableForPrebook(boolean value) { this.availableForPrebook = value; }

    @JsonProperty("serviceCategory")
    public ServiceCategory getServiceCategory() { return serviceCategory; }
    @JsonProperty("serviceCategory")
    public void setServiceCategory(ServiceCategory value) { this.serviceCategory = value; }

    @JsonProperty("parcelTypes")
    public Object getParcelTypes() { return parcelTypes; }
    @JsonProperty("parcelTypes")
    public void setParcelTypes(Object value) { this.parcelTypes = value; }

    @JsonProperty("default")
    public boolean getServiceDefault() { return serviceDefault; }
    @JsonProperty("default")
    public void setServiceDefault(boolean value) { this.serviceDefault = value; }
}
