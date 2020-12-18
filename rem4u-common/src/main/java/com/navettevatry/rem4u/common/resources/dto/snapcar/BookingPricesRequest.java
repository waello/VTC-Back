package com.navettevatry.rem4u.common.resources.dto.snapcar;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * Created by Chakib Daii.
 */
public class BookingPricesRequest implements Serializable {
    private Float startLatitude;
    private Float startLongitude;
    private Float endLatitude;
    private Float endLongitude;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private Date date;
    private Integer nameBoard;

    public BookingPricesRequest() {
    }

    public BookingPricesRequest(Float startLatitude, Float startLongitude, Float endLatitude, Float endLongitude,
                                Date date, Integer nameBoard) {
        this.startLatitude = startLatitude;
        this.startLongitude = startLongitude;
        this.endLatitude = endLatitude;
        this.endLongitude = endLongitude;
        this.date = date;
        this.nameBoard = nameBoard;
    }

    public Float getStartLatitude() {
        return startLatitude;
    }

    public void setStartLatitude(Float startLatitude) {
        this.startLatitude = startLatitude;
    }

    public Float getStartLongitude() {
        return startLongitude;
    }

    public void setStartLongitude(Float startLongitude) {
        this.startLongitude = startLongitude;
    }

    public Float getEndLatitude() {
        return endLatitude;
    }

    public void setEndLatitude(Float endLatitude) {
        this.endLatitude = endLatitude;
    }

    public Float getEndLongitude() {
        return endLongitude;
    }

    public void setEndLongitude(Float endLongitude) {
        this.endLongitude = endLongitude;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getNameBoard() {
        return nameBoard;
    }

    public void setNameBoard(Integer nameBoard) {
        this.nameBoard = nameBoard;
    }

    @Override
    public String toString() {
        return "BookingPricesRequest{" +
                "startLatitude=" + startLatitude +
                ", startLongitude=" + startLongitude +
                ", endLatitude=" + endLatitude +
                ", endLongitude=" + endLongitude +
                ", date=" + date +
                ", nameBoard=" + nameBoard +
                '}';
    }
}
