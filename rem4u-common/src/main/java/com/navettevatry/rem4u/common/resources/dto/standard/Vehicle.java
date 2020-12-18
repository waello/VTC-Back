package com.navettevatry.rem4u.common.resources.dto.standard;

import com.navettevatry.rem4u.common.resources.enumeration.standard.ComfortType;

import java.io.Serializable;

/**
 *
 * Created by Chakib Daii.
 */
public class Vehicle implements Serializable {
    private String carBrand; //TODO: has to be more realistic
    private Integer seats;
    private Integer luggage;
    private Boolean carSeat;
    private Boolean seatBooster;
    private ComfortType comfort;
    private Float co2Emission;

    public Vehicle() {
    }

    public Vehicle(String carBrand, Integer seats, Integer luggage, Boolean carSeat, Boolean seatBooster,
                   ComfortType comfort, Float co2Emission) {
        this.carBrand = carBrand;
        this.seats = seats;
        this.luggage = luggage;
        this.carSeat = carSeat;
        this.seatBooster = seatBooster;
        this.comfort = comfort;
        this.co2Emission = co2Emission;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public Integer getLuggage() {
        return luggage;
    }

    public void setLuggage(Integer luggage) {
        this.luggage = luggage;
    }

    public Boolean getCarSeat() {
        return carSeat;
    }

    public void setCarSeat(Boolean carSeat) {
        this.carSeat = carSeat;
    }

    public Boolean getSeatBooster() {
        return seatBooster;
    }

    public void setSeatBooster(Boolean seatBooster) {
        this.seatBooster = seatBooster;
    }

    public ComfortType getComfort() {
        return comfort;
    }

    public void setComfort(ComfortType comfort) {
        this.comfort = comfort;
    }

    public Float getCo2Emission() {
        return co2Emission;
    }

    public void setCo2Emission(Float co2Emission) {
        this.co2Emission = co2Emission;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "carBrand='" + carBrand + '\'' +
                ", seats=" + seats +
                ", luggage=" + luggage +
                ", carSeat=" + carSeat +
                ", seatBooster=" + seatBooster +
                ", comfort=" + comfort +
                ", co2Emission=" + co2Emission +
                '}';
    }


//    public static int compareByCo2Emission(Vehicle o1, Vehicle o2) {
//        return (int) (o1.getCo2Emission() - o2.getCo2Emission());
//    }
//
//    public static int compareByComfort(Vehicle o1, Vehicle o2) {
//        return (int) (o1.getComfort().compare(o1.getComfort(),o2.getComfort()));
//    }
}
