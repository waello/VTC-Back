package com.navettevatry.rem4u.common.utils.mapper.responses;

import com.navettevatry.rem4u.common.resources.dto.olacab.RideEstimateResponse;
import com.navettevatry.rem4u.common.resources.dto.snapcar.*;
import com.navettevatry.rem4u.common.resources.dto.snapcar.updated.SnapCarRequest;
import com.navettevatry.rem4u.common.resources.dto.snapcar.updated.SnapCarResponse;
import com.navettevatry.rem4u.common.resources.dto.standard.*;
import com.navettevatry.rem4u.common.resources.enumeration.standard.ComfortType;
import com.navettevatry.rem4u.common.resources.enumeration.standard.VTCPlatformName;
import com.navettevatry.rem4u.common.utils.enrichers.averageValue.BlocSansMarqueEconomique;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * Created by Chakib Daii.
 */
public class SnapCarResponsesMapper {
    //7achya response dima 3 rslt a3mml taalla 3al reponse snap car taw tefhm
    public static VTCComparatorResponse bookingPriceToVTCComparatorResponse(SnapCarResponse bookingPrice
            , VTCComparatorResponse vtcComparatorResponse){

        if(vtcComparatorResponse == null)
            vtcComparatorResponse = new VTCComparatorResponse(null,
                    null,
                    null,
                    null,
                    null,
                    new ArrayList<>());

        if(bookingPrice != null){
            vtcComparatorResponse.getOffers().add(
                    new Offer(VTCPlatformName.SNAPCAR,
                            new Driver(null,null,null,null),
                            new Vehicle(null,null,null,null,null, ComfortType.valueOf(""), (float) BlocSansMarqueEconomique.getAverageValue()),
                            new Price("euro", (float) 100),
                            null,
                            null,
                            null,
                            null,
                            null
                    )
            );
        }

        return vtcComparatorResponse;
    }
    public static VTCComparatorResponse finalSnap(SnapCarResponse etaResult
            , VTCComparatorResponse vtcComparatorResponse){
        String[] prodStr = etaResult.toString().split(",");
        System.out.println(prodStr[0].toString().replace(";","").replace("&","").replace("euro","")+"   hhhhhhhhhhhhhhhhhhhhhhhhhh");

        float price1 = Float.parseFloat(prodStr[0].toString().replace(";","").replace("&","").replace("euro",""));
        float price2 = Float.parseFloat(prodStr[1].toString().replace(";","").replace("&","").replace("euro",""));
        float price3 = Float.parseFloat(prodStr[2].toString().replace(";","").replace("&","").replace("euro",""));

        System.out.println(price1+"   hhhhhhhhhhhhhhhhhhhhhhhhhh");

        if(vtcComparatorResponse == null)
            vtcComparatorResponse = new VTCComparatorResponse(null,
                    null,
                    null,
                    null,
                    null,
                    new ArrayList<>());

        if(etaResult != null){


            //           vtcComparatorResponse.getOffers().get(vtcComparatorResponse.getOffers().size() -1)
 //                   .setWaitingTime(etaResult.getEta() != null ? Math.round(etaResult.getEta() / 60) : null);
            vtcComparatorResponse.getOffers().add(
                    new Offer(VTCPlatformName.SNAPCAR,
                            new Driver(null, null, null, null),
                            new Vehicle(null,
//                                    quotation.getName() != null ? quotation.getName()  : null,
                                    (int) 2, 1,
                                    null, null,
                                   ComfortType.ECO,
                                    (float) BlocSansMarqueEconomique.getAverageValue()),
                            new Price("euro",
                                    (float) price1), 10,
                            new VTCLocation(null, (float) 11,
                                    (float) 10,"10"),
                            new VTCLocation(null, (float) 2100, (float) 10, ""),
                            (float) 1,
                            null));
            vtcComparatorResponse.getOffers().add(
                    new Offer(VTCPlatformName.SNAPCAR,
                            new Driver(null, null, null, null),
                            new Vehicle(null,
//                                    quotation.getName() != null ? quotation.getName()  : null,
                                    (int) 2, 2,
                                    null, null,
                                    ComfortType.BERLIN,
                                    (float) BlocSansMarqueEconomique.getAverageValue()),
                            new Price("euro",
                                    (float) price2), 10,
                            new VTCLocation(null, (float) 11,
                                    (float) 10,"10"),
                            new VTCLocation(null, (float) 2100, (float) 10, ""),
                            (float) 1,
                            null));
            vtcComparatorResponse.getOffers().add(
                    new Offer(VTCPlatformName.SNAPCAR,
                            new Driver(null, null, null, null),
                            new Vehicle(null,
//                                    quotation.getName() != null ? quotation.getName()  : null,
                                    (int) 2, 4,
                                    null, null,
                                    ComfortType.VAN,
                                    (float) BlocSansMarqueEconomique.getAverageValue()),
                            new Price("euro",
                                    (float) price3), 10,
                            new VTCLocation(null, (float) 11,
                                    (float) 10,"10"),
                            new VTCLocation(null, (float) 2100, (float) 10, ""),
                            (float) 1,
                            null));}

        return vtcComparatorResponse;
    }

    public static VTCComparatorResponse etaResultToVTCComparatorResponse(ETAResult etaResult
            , VTCComparatorResponse vtcComparatorResponse){

        if(vtcComparatorResponse == null)
            vtcComparatorResponse = new VTCComparatorResponse(null,
                    null,
                    null,
                    null,
                    null,
                    new ArrayList<>());

        if(etaResult != null){
            vtcComparatorResponse.getOffers().get(vtcComparatorResponse.getOffers().size() -1)
                    .setWaitingTime(etaResult.getEta() != null ? Math.round(etaResult.getEta() / 60) : null);
        }

        return vtcComparatorResponse;
    }


    public static VTCComparatorResponse specialAreaToVTCComparatorResponse(SpecialArea specialArea
            , VTCComparatorResponse vtcComparatorResponse){

        if(vtcComparatorResponse == null)
            vtcComparatorResponse = new VTCComparatorResponse(null,
                    null,
                    null,
                    null,
                    null,
                    new ArrayList<>());

        //TODO: verify with tests
        if(specialArea != null){
//            vtcComparatorResponse.setDepartureLocation(
//                    new VTCLocation(null ,null,null ,specialArea.getName() != null ? specialArea.getName().getEn() : null)
//            );
//            vtcComparatorResponse.setArrivalLocation(
//                    new VTCLocation(null,null,null,specialArea.getMenu_name() != null ? specialArea.getMenu_name().getEn() : null)
//            );
            vtcComparatorResponse.getOffers().get(vtcComparatorResponse.getOffers().size() -1)
                    .setVTCProvidedDepartureLocation(new VTCLocation(null,null,null, specialArea.getName() != null ? specialArea.getName().getEn() : null));
            vtcComparatorResponse.getOffers().get(vtcComparatorResponse.getOffers().size() -1)
                    .setVTCProvidedArrivalLocation(new VTCLocation(null,null,null, specialArea.getMenu_name() != null ? specialArea.getMenu_name().getEn() : null));
//            vtcComparatorResponse.setDepartureLocation(
//                new VTCLocation(null ,null,null ,specialArea.getArea_type())
//            );
        }

        return vtcComparatorResponse;
    }

    public static VTCComparatorResponse serviceClassToVTCComparatorResponse(ServiceClass serviceClass
            , VTCComparatorResponse vtcComparatorResponse){

        if(vtcComparatorResponse == null)
            vtcComparatorResponse = new VTCComparatorResponse(null,
                    null,
                    null,
                    null,
                    null,
                    new ArrayList<>());


        return vtcComparatorResponse;
    }

}
