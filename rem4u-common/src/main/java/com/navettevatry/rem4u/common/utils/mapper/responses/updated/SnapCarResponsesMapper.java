package com.navettevatry.rem4u.common.utils.mapper.responses.updated;

import com.navettevatry.rem4u.common.resources.dto.snapcar.ETAResult;
import com.navettevatry.rem4u.common.resources.dto.snapcar.ServiceClass;
import com.navettevatry.rem4u.common.resources.dto.snapcar.SpecialArea;
import com.navettevatry.rem4u.common.resources.dto.snapcar.updated.SnapCarResponse;
import com.navettevatry.rem4u.common.resources.dto.standard.*;
import com.navettevatry.rem4u.common.resources.enumeration.standard.VTCPlatformName;
import com.navettevatry.rem4u.common.utils.enrichers.averageValue.BlocSansMarqueEconomique;

import java.util.ArrayList;

/**
 *
 * Created by Chakib Daii.
 */
public class SnapCarResponsesMapper {
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
                            new Vehicle(null,null,null,null,null,
                                    /*bookingPrice.getExecutive()*/ null, (float) BlocSansMarqueEconomique.getAverageValue()),
                            new Price("euro", Float.parseFloat(String.valueOf(bookingPrice))),
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
