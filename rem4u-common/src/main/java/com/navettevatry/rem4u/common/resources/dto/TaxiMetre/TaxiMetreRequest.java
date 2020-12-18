package com.navettevatry.rem4u.common.resources.dto.TaxiMetre;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class TaxiMetreRequest implements Serializable {
    private String rideAddressPickUpLat;
    private String rideAddressPickUpLong;
    private String rideAddressPickUp;
    private String flightNumber;
    private String rideAddressDropOffLat;
    private String rideAddressDropOffLong;
    private String rideAddressDropOff;
    private long numberPassenger;
    private String rideDate;
    private String rideTime;
    private long vehicleType;
    private String partnerID;
    private String rideRequestImmediately;

    @JsonProperty("ride_address_pick_up_lat")
    public String getRideAddressPickUpLat() { return rideAddressPickUpLat; }
    @JsonProperty("ride_address_pick_up_lat")
    public void setRideAddressPickUpLat(String value) { this.rideAddressPickUpLat = value; }

    @JsonProperty("ride_address_pick_up_long")
    public String getRideAddressPickUpLong() { return rideAddressPickUpLong; }
    @JsonProperty("ride_address_pick_up_long")
    public void setRideAddressPickUpLong(String value) { this.rideAddressPickUpLong = value; }

    @JsonProperty("ride_address_pick_up")
    public String getRideAddressPickUp() { return rideAddressPickUp; }
    @JsonProperty("ride_address_pick_up")
    public void setRideAddressPickUp(String value) { this.rideAddressPickUp = value; }

    @JsonProperty("flight_number")
    public String getFlightNumber() { return flightNumber; }
    @JsonProperty("flight_number")
    public void setFlightNumber(String value) { this.flightNumber = value; }

    @JsonProperty("ride_address_drop_off_lat")
    public String getRideAddressDropOffLat() { return rideAddressDropOffLat; }
    @JsonProperty("ride_address_drop_off_lat")
    public void setRideAddressDropOffLat(String value) { this.rideAddressDropOffLat = value; }

    @JsonProperty("ride_address_drop_off_long")
    public String getRideAddressDropOffLong() { return rideAddressDropOffLong; }
    @JsonProperty("ride_address_drop_off_long")
    public void setRideAddressDropOffLong(String value) { this.rideAddressDropOffLong = value; }

    @JsonProperty("ride_address_drop_off")
    public String getRideAddressDropOff() { return rideAddressDropOff; }
    @JsonProperty("ride_address_drop_off")
    public void setRideAddressDropOff(String value) { this.rideAddressDropOff = value; }

    @JsonProperty("number_passenger")
    public long getNumberPassenger() { return numberPassenger; }
    @JsonProperty("number_passenger")
    public void setNumberPassenger(long value) { this.numberPassenger = value; }

    @JsonProperty("ride_date")
    public String getRideDate() { return rideDate; }
    @JsonProperty("ride_date")
    public void setRideDate(String value) { this.rideDate = value; }

    @JsonProperty("ride_time")
    public String getRideTime() { return rideTime; }
    @JsonProperty("ride_time")
    public void setRideTime(String value) { this.rideTime = value; }

    @JsonProperty("vehicle_type")
    public long getVehicleType() { return vehicleType; }
    @JsonProperty("vehicle_type")
    public void setVehicleType(long value) { this.vehicleType = value; }

    @JsonProperty("partner_id")
    public String getPartnerID() { return partnerID; }
    @JsonProperty("partner_id")
    public void setPartnerID(String value) { this.partnerID = value; }

    @JsonProperty("ride_request_immediately")
    public String getRideRequestImmediately() { return rideRequestImmediately; }
    @JsonProperty("ride_request_immediately")
    public void setRideRequestImmediately(String value) { this.rideRequestImmediately = value; }
}
