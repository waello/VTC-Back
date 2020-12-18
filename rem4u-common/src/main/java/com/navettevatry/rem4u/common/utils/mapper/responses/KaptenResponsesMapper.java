package com.navettevatry.rem4u.common.utils.mapper.responses;

import com.navettevatry.rem4u.common.resources.dto.kapten.EstimatedPriceResponseSuccess;
import com.navettevatry.rem4u.common.resources.dto.kapten.KaptenPriceEstimate;
import com.navettevatry.rem4u.common.resources.dto.kapten.WaitingTimeEstimate;
import com.navettevatry.rem4u.common.resources.dto.kapten.WaitingTimeResponseSuccess;
import com.navettevatry.rem4u.common.resources.dto.standard.*;
import com.navettevatry.rem4u.common.resources.enumeration.standard.ComfortType;
import com.navettevatry.rem4u.common.resources.enumeration.standard.VTCPlatformName;
import com.navettevatry.rem4u.common.utils.enrichers.averageValue.BlocSansMarqueEconomique;

import java.util.ArrayList;

/**
 *
 * Created by Chakib Daii.
 * Updated by Ahmed Ferjani & Chakib DAII
 */
public class KaptenResponsesMapper {

    public static VTCComparatorResponse waitingTimeResponseSuccessToVTCComparatorResponse(WaitingTimeResponseSuccess waitingTimeResponseSuccess
            , VTCComparatorResponse vtcComparatorResponse){

        if(vtcComparatorResponse == null)
                        vtcComparatorResponse = new VTCComparatorResponse(null,
                    null,
                    null,
                    null,
                    null,
                    new ArrayList<>());

        /*
        * TO BE verified if we need to use the waitingTimeResponseSuccess or not
        * because it returns information about the driver to get to the pickup location
        * not info related to the start location to the end location
        *
         */
        //vtcComparatorResponse.setEstimatedTime(Math.round(waitingTimeResponseSuccess.getEta_seconds() / 60));

        if(waitingTimeResponseSuccess != null){
            for (WaitingTimeEstimate waitingTimeEstimate : waitingTimeResponseSuccess.getEtaEstimates())
            vtcComparatorResponse.getOffers().add(
                    new Offer(VTCPlatformName.KAPTEN,
                            new Driver(null,null,null,null),
                            new Vehicle(null,null,null,null,null, ComfortType.STANDARD, (float) BlocSansMarqueEconomique.getAverageValue()),
                            new Price(null, null),
                            waitingTimeEstimate.getEtaSeconds() != null ? Math.round(waitingTimeEstimate.getEtaSeconds() / 60) : null,
                            //TODO: Verify these values
                            null /*vtcComparatorResponse.getDepartureLocation()*/,
                            null /*vtcComparatorResponse.getArrivalLocation()*/,
                            null /*vtcComparatorResponse.getEstimatedDistance()*/,
                            null /*vtcComparatorResponse.getEstimatedTime()*/));
        }

        return vtcComparatorResponse;
    }

    public static VTCComparatorResponse estimatedPriceResponseSuccessToVTCComparatorResponse(EstimatedPriceResponseSuccess estimatedPriceResponseSuccess
            , VTCComparatorResponse vtcComparatorResponse){

        if(vtcComparatorResponse == null)
            vtcComparatorResponse = new VTCComparatorResponse(null,
                    null,
                    null,
                    null,
                    null,
                    new ArrayList<>());

        if(estimatedPriceResponseSuccess != null){
//            vtcComparatorResponse.setEstimatedTime(estimatedPriceResponseSuccess.getPrices().get(0).getDurationSeconds());
//            vtcComparatorResponse.setEstimatedDistance((float)estimatedPriceResponseSuccess.getPrices().get(0).getDistanceMeters());

            //TODO: verify the price min or max
//            vtcComparatorResponse.getOffers().get(vtcComparatorResponse.getOffers().size() - 1)
//                    .setPrice(new Price(estimatedPriceResponseSuccess.getPrices().get(0).getCurrencyCode()/*"USD"*/,
//                            estimatedPriceResponseSuccess.getPrices().get(0).getPriceMaxCents() != null ? Float.valueOf(estimatedPriceResponseSuccess.getPrices().get(0).getPriceMaxCents() / 100) : null));
//            vtcComparatorResponse.getOffers().get(vtcComparatorResponse.getOffers().size() - 1)
//                    .setWaitingTime(estimatedPriceResponseSuccess.getPrices().get(0).getEtaSeconds() != null ? Math.round(estimatedPriceResponseSuccess.getPrices().get(0).getEtaSeconds() / 60) : null );
//            vtcComparatorResponse.getOffers().get(vtcComparatorResponse.getOffers().size() - 1)
//                    .setVTCProvidedEstimatedDistance(estimatedPriceResponseSuccess.getPrices().get(0).getDistanceMeters() != null ? Float.valueOf(estimatedPriceResponseSuccess.getPrices().get(0).getDistanceMeters() / 1000)  : null );
//            vtcComparatorResponse.getOffers().get(vtcComparatorResponse.getOffers().size() - 1)
//                    .setVTCProvidedEstimatedTime(estimatedPriceResponseSuccess.getPrices().get(0).getDurationSeconds() != null ? Math.round(estimatedPriceResponseSuccess.getPrices().get(0).getDurationSeconds() / 60) : null );
//
            for(KaptenPriceEstimate kaptenPriceEstimate: estimatedPriceResponseSuccess.getPrices()){
                int i =0;

                while(i < vtcComparatorResponse.getOffers().size()){
                    vtcComparatorResponse.getOffers().get(i)
                            .setPrice(new Price(kaptenPriceEstimate.getCurrencyCode()/*"USD"*/,
                                    kaptenPriceEstimate.getPriceMaxCents() != null ? Float.valueOf(kaptenPriceEstimate.getPriceMaxCents() / 100) : null));
                    vtcComparatorResponse.getOffers().get(vtcComparatorResponse.getOffers().size() - 1)
                            .setWaitingTime(kaptenPriceEstimate.getEtaSeconds() != null ? Math.round(kaptenPriceEstimate.getEtaSeconds() / 60) : null );
                    vtcComparatorResponse.getOffers().get(vtcComparatorResponse.getOffers().size() - 1)
                            .setVTCProvidedEstimatedDistance(kaptenPriceEstimate.getDistanceMeters() != null ? Float.valueOf(kaptenPriceEstimate.getDistanceMeters() / 1000)  : null );
                    vtcComparatorResponse.getOffers().get(vtcComparatorResponse.getOffers().size() - 1)
                            .setVTCProvidedEstimatedTime(kaptenPriceEstimate.getDurationSeconds() != null ? Math.round(kaptenPriceEstimate.getDurationSeconds() / 60) : null );

                    i++;
                }
            }
        }

        return vtcComparatorResponse;
    }
}
