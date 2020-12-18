package com.navettevatry.rem4u.common.utils.enrichers.averageValue;

import com.navettevatry.rem4u.common.resources.dto.here.Observation;
import com.navettevatry.rem4u.common.resources.dto.here.Summary;

public class Mweather {


//    float T = Observation.getTemperature();
//    float P = Observation.getPrecipitation24H();
//    float W = Observation.getWindSpeed();
//    String S = Observation.getSnowCover();
//    static float Mconso = Summary.getConsumption();

    public static double tep(Observation observation) {
        float T = observation.getTemperature();
        double Mt = 0;

        if (T >= 25 && T <= 45 || T >=-20 && T<=15 ) {
            Mt =  0.065;

        }


        return Mt ;
    }
    public static double snow(Observation observation){
        double Ms = 0;
        String S = observation.getSnowCover();
        if ( S != "*") {
            Ms =  0.165;
        }
        return Ms ;
    }
    public static double preci(Observation observation){
        double Mp = 0;
        float p = observation.getPrecipitation24H();
        if ( p >=40 && p <=100 ){
            Mp =  0.065 ;
        }
        return Mp ;
    }
    public static double wind(Observation observation){
        double Mw = 0;
        float W = observation.getWindSpeed();
        if ( W >=30 && W <=50 ){
            Mw =  0.025 ;
        }
        return Mw ;
    }


    public static double Msum(Observation observation, Summary summary){
//        double Msum = Mconso;
        double Msum = summary.getConsumption();

        Msum = Msum + preci(observation) + wind(observation) + tep(observation) + snow(observation) ;
        return Msum ;
    }

}








