package com.navettevatry.rem4u.common.utils.enrichers.averageValue;

import com.navettevatry.rem4u.common.resources.dto.here.Observation;
import com.navettevatry.rem4u.common.resources.dto.here.Summary;
import com.navettevatry.rem4u.common.resources.dto.standard.Passengers;
import com.navettevatry.rem4u.common.resources.enumeration.standard.ComfortType;

public class QuantiteCo2Total {

    public static double Ztotal(Passengers passengers, ComfortType comfortType, Observation observation, Summary summary){
        int nbPersonne=passengers.getTotal();
        double Ztotal=0;
        Ztotal= (QuantiteCo2Marque.gamme(comfortType, observation, summary)+PoidsCo2.pco2(passengers))/nbPersonne;

        return Ztotal; //Emission Total
    }

    public static double Ztotal(Integer nbPassengers, ComfortType comfortType, Observation observation, Summary summary){
        double Ztotal=0;
        Ztotal= (QuantiteCo2Marque.gamme(comfortType, observation, summary)+PoidsCo2.pco2(nbPassengers))/(nbPassengers+1);

        return Ztotal; //Emission Total
    }
}
