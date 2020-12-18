package com.navettevatry.rem4u.common.resources.dto.Tomtom;


/**
 * Created by Ichrak Ben Abdallah
 * */
public class TraficRequest {
    private Coordinate point;


    public  TraficRequest() {
    }



    public TraficRequest(Coordinate point) {
        this.point = point;
    }


    public Coordinate getPoint() {
        return point;
    }

    public void setPoint(Coordinate point) {
        this.point = point;
    }
    @Override
    public String toString() {
        return "TraficRequest{" +
                "point=" + point +
                '}';
    }
}
