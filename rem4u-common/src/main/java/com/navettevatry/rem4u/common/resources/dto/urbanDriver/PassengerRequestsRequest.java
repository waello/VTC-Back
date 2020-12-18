// PassengerRequestsRequest.java

package com.navettevatry.rem4u.common.resources.dto.urbanDriver;

public class PassengerRequestsRequest {
    private Address address_pick_up;
    private long type;
    private Addresss address_drop_off;

    public Address getAddress_pick_up() {
        return address_pick_up;
    }

    public void setAddress_pick_up(Address address_pick_up) {
        this.address_pick_up = address_pick_up;
    }

    public long getType() {
        return type;
    }

    public void setType(long type) {
        this.type = type;
    }

    public Addresss getAddress_drop_off() {
        return address_drop_off;
    }

    public void setAddress_drop_off(Addresss address_drop_off) {
        this.address_drop_off = address_drop_off;
    }

    public VehiculeResponse getvehicle_type() {
        return vehicle_type;
    }

    public void setvehicle_type(VehiculeResponse vehicleType) {
        this.vehicle_type = vehicleType;
    }

    public long getChannel() {
        return channel;
    }

    public void setChannel(long channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "{" +
                "address_pick_up=" + address_pick_up +
                ", type=" + type +
                ", address_drop_off=" + address_drop_off +
                "," + vehicle_type +
                ", channel=" + channel +
                '}';
    }

    private VehiculeResponse vehicle_type;
    private long channel;


}

