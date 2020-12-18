package com.navettevatry.rem4u.common.utils.enrichers.averageValue;

import com.navettevatry.rem4u.common.resources.dto.standard.Passengers;

public class PoidsCo2 {

    public static double pco2(Passengers passengers){
        int nbadulte= passengers.getAdults();
        int nbbebe= passengers.getBabies();
        int nbenfant= passengers.getChildren();

        double Zp = (double)(((((nbadulte+1) * 70)+(nbbebe*7)+(nbenfant*40))*4.5) / 100);

        return Zp;
    }

    public static double pco2(Integer NbPssengers){

        double Zp = (double)((((NbPssengers+1) * 70)*4.5) / 100);

        return Zp;
    }

}
