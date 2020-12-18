
package com.navettevatry.rem4u.common.resources.dto.marcel;

import java.util.List;

public class MarcelREquest {
    private String locale;
    private Empty empty;
    private AddressDropOff addressDropOff;
    private List<Object> stops;
    private List<Object> packageTypes;
    private long channel;
    private long type;
    private String rideDate;
    private VehicleType vehicleType;
    private Customer customer;
    private List<Object> options;

    public String getLocale() { return locale; }
    public void setLocale(String value) { this.locale = value; }

    public Empty getEmpty() { return empty; }
    public void setEmpty(Empty value) { this.empty = value; }

    public AddressDropOff getAddressDropOff() { return addressDropOff; }
    public void setAddressDropOff(AddressDropOff value) { this.addressDropOff = value; }

    public List<Object> getStops() { return stops; }
    public void setStops(List<Object> value) { this.stops = value; }

    public List<Object> getPackageTypes() { return packageTypes; }
    public void setPackageTypes(List<Object> value) { this.packageTypes = value; }

    public long getChannel() { return channel; }
    public void setChannel(long value) { this.channel = value; }

    public long getType() { return type; }
    public void setType(long value) { this.type = value; }

    public String getRideDate() { return rideDate; }
    public void setRideDate(String value) { this.rideDate = value; }

    public VehicleType getVehicleType() { return vehicleType; }
    public void setVehicleType(VehicleType value) { this.vehicleType = value; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer value) { this.customer = value; }

    public List<Object> getOptions() { return options; }
    public void setOptions(List<Object> value) { this.options = value; }
}











