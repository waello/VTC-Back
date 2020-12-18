package com.navettevatry.rem4u.common.utils.enrichers.averageValue;

import com.navettevatry.rem4u.common.resources.dto.here.Observation;
import com.navettevatry.rem4u.common.resources.dto.here.Summary;
import com.navettevatry.rem4u.common.resources.dto.standard.Vehicle;
import com.navettevatry.rem4u.common.resources.enumeration.standard.ComfortType;

import static com.navettevatry.rem4u.common.resources.enumeration.standard.ComfortType.*;


public class QuantiteCo2Marque {

    public static double gamme(ComfortType gamme, Observation observation, Summary summary) {
        double Zgamme = 0;
        int[] y = new int[]{10, 20, 30};
//        float N = Summary.getLength(); //distance
        float N = summary.getLength(); //distance
        double mSum = Mweather.Msum(observation,summary);

        if (gamme == ECO) {
            Zgamme = (y[0] * ((N / 1000) / mSum) * 100) / BlocSansMarqueEconomique.getAverageValue();
        }
        if (gamme == BERLIN) {
            Zgamme = (y[1] * ((N / 1000) / mSum) * 100) / BlocSansMarqueBerline.getAverageValue();
        }
        if (gamme == HAUTE_GAMME) {
            Zgamme = (y[2] * ((N / 1000) / mSum) * 100) / BlocSansMarqueVip.getAverageValue();
        }
        if (gamme == BUSINESS) {
            Zgamme = (y[2] * ((N / 1000) / mSum) * 100) / BlocSansMarqueBusiness.getAverageValue();
        }
        if (gamme == STANDARD) {
            Zgamme = (y[0] * ((N / 1000) / mSum) * 100) / BlocSansMarqueBerline.getAverageValue();
        }

        return Zgamme;


    }


}
