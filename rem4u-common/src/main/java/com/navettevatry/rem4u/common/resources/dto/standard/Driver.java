package com.navettevatry.rem4u.common.resources.dto.standard;

import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 *
 * Created by Chakib Daii.
 */
public class Driver implements Serializable {
    private String name;
    @Pattern(regexp="^\\+(?:[0-9] ?){6,14}[0-9]$",message="Invalid International Phone Number")
    private String phoneNumber;
    private String pictureUrl;
    private Float rating;

    public Driver() {
    }

    public Driver(String name,
                  @Pattern(regexp = "^\\+(?:[0-9] ?){6,14}[0-9]$", message = "Invalid International Phone Number") String phoneNumber,
                  String pictureUrl, Float rating) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.pictureUrl = pictureUrl;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", pictureUrl='" + pictureUrl + '\'' +
                ", rating=" + rating +
                '}';
    }
}
