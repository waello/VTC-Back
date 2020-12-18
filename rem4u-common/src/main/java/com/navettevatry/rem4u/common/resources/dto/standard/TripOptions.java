package com.navettevatry.rem4u.common.resources.dto.standard;

import java.io.Serializable;

/**
 *
 * Created by Chakib Daii.
 */
public class TripOptions implements Serializable {
    private Boolean carSeat;
    private Boolean seatBooster;
    private Integer luggage;
    private String favoriteCarBrand;

    public TripOptions() {
    }

    public TripOptions(Boolean carSeat, Boolean seatBooster, Integer luggage, String favoriteCarBrand) {
        this.carSeat = carSeat;
        this.seatBooster = seatBooster;
        this.luggage = luggage;
        this.favoriteCarBrand = favoriteCarBrand;
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

    public Integer getLuggage() {
        return luggage;
    }

    public void setLuggage(Integer luggage) {
        this.luggage = luggage;
    }

    public String getFavoriteCarBrand() {
        return favoriteCarBrand;
    }

    public void setFavoriteCarBrand(String favoriteCarBrand) {
        this.favoriteCarBrand = favoriteCarBrand;
    }

    @Override
    public String toString() {
        return "TripOptions{" +
                "carSeat=" + carSeat +
                ", seatBooster=" + seatBooster +
                ", luggage=" + luggage +
                ", favoriteCarBrand='" + favoriteCarBrand + '\'' +
                '}';
    }
}
