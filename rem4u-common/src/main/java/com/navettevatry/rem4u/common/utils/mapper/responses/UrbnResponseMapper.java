package com.navettevatry.rem4u.common.utils.mapper.responses;

import com.navettevatry.rem4u.common.resources.dto.standard.*;
import com.navettevatry.rem4u.common.resources.dto.urbanDriver.PassengerRequestsResponse;
import com.navettevatry.rem4u.common.resources.dto.urbanDriver.TrafficResponse;
import com.navettevatry.rem4u.common.resources.dto.urbanDriver.VehiculeResponse;
import com.navettevatry.rem4u.common.resources.enumeration.standard.ComfortType;
import com.navettevatry.rem4u.common.resources.enumeration.standard.VTCPlatformName;
import com.navettevatry.rem4u.common.utils.enrichers.averageValue.BlocSansMarqueEconomique;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UrbnResponseMapper {

    public static VTCComparatorResponse VehicleTypeToVTCComparatorResponse(List<PassengerRequestsResponse> vehiculeResponse

            , VTCComparatorResponse vtcComparatorResponse) {
        System.out.println("dsdsdsdds"+vehiculeResponse.toString());

        try{
            if (vtcComparatorResponse == null)
                vtcComparatorResponse = new VTCComparatorResponse(null,
                        null,
                        null,
                        null,
                        null,
                        new ArrayList<>());

                for(PassengerRequestsResponse bb : vehiculeResponse){

                    vtcComparatorResponse.getOffers().add(
                            new Offer(VTCPlatformName.URBAN_DRIVER,
                                    new Driver(null, null, null, null),
                                    new Vehicle( null,
                                            (int)bb.getVehicleType().getMax_places(),(int) bb.getVehicleType().getMax_luggages(), null, null,
                                            getComfortType(bb.getVehicleType().getDesignation()) ,
                                            (float) BlocSansMarqueEconomique.getAverageValue()),
                                    new Price("EURO", (float) bb.getCustomerPrice()/100),
                                    (int) bb.getVehicleType().getDelay_free_in_min(),
                                    null,
                                    null,
                                    null,
                                    (int) bb.getDuration()*60));
                }

        }catch(Exception e){System.out.println("3awed "+e.getMessage());}
        return vtcComparatorResponse;
    }


    public static VTCComparatorResponse urbanTrafficToVTCComparatorResponse(TrafficResponse response
            , VTCComparatorResponse vtcComparatorResponse) {

        try{
            if (vtcComparatorResponse == null)
                vtcComparatorResponse = new VTCComparatorResponse(null,
                        null,
                        null,
                        null,
                        null,
                        new ArrayList<>());

            if (response != null) {
                System.out.println(response);
            }
        }catch(Exception e){System.out.println("error in mapping response "+e.getMessage());}
        return vtcComparatorResponse;
    }

    protected static ComfortType getComfortType(String comfortType){
        if(comfortType.equals("Moto"))
            return ComfortType.STANDARD;
        else if(comfortType.equals("VAN"))
            return ComfortType.ECO;
        else if(comfortType.equals("Luxe"))
            return ComfortType.BUSINESS;
        else
            return ComfortType.ECO;
    }
}
