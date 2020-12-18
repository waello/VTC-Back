package com.navettevatry.rem4u.common.utils.mapper.responses;

import com.navettevatry.rem4u.common.resources.dto.EureCab.TypeL;
import com.navettevatry.rem4u.common.resources.dto.standard.*;
import com.navettevatry.rem4u.common.resources.dto.uber.updated.Estimate;
import com.navettevatry.rem4u.common.resources.dto.uber.updated.NearbyVehicle;
import com.navettevatry.rem4u.common.resources.dto.uber.updated.UberResponse;
import com.navettevatry.rem4u.common.resources.dto.uber.updated.VehicleView;
import com.navettevatry.rem4u.common.resources.enumeration.standard.ComfortType;
import com.navettevatry.rem4u.common.resources.enumeration.standard.VTCPlatformName;
import com.navettevatry.rem4u.common.utils.enrichers.averageValue.BlocSansMarqueEconomique;
import com.uber.sdk.rides.client.model.Product;
import com.uber.sdk.rides.client.model.Promotion;
import com.uber.sdk.rides.client.model.TimeEstimate;

import java.util.*;

/**
 *
 * Created by Chakib Daii.
 */
public class UberResponsesMapper {
    //TODO: product_id will be usedd to match responses in batch
    public static VTCComparatorResponse productsListToVTCComparatorResponse(List<Product> products
            , VTCComparatorResponse vtcComparatorResponse){

        if(vtcComparatorResponse == null)
            vtcComparatorResponse = new VTCComparatorResponse(null,
                    null,
                    null,
                    null,
                    null,
                    new ArrayList<>());
        //TODO: verify products: nothing to map

        if(products != null){
//        vtcComparatorResponse.setDepartureLocation(null);
//        vtcComparatorResponse.setArrivalLocation(null);
//        vtcComparatorResponse.setDate(null);
//        vtcComparatorResponse.setEstimatedDistance(null);
//        vtcComparatorResponse.setEstimatedTime(null);
//        vtcComparatorResponse.getOffers().add(
//                new Offer(VTCPlatformName.UBER,null,null,
//                        new Price(null, null),
//                        null));
        }

        return vtcComparatorResponse;
    }
    //updated
    public static VTCComparatorResponse priceEstimatesListToVTCComparatorResponse(UberResponse uberResponse
            , VTCComparatorResponse vtcComparatorResponse){
        try{

        if(vtcComparatorResponse == null)
            vtcComparatorResponse = new VTCComparatorResponse(null,
                    null,
                    null,
                    null,
                    null,
                    new ArrayList<>());

        if(uberResponse != null && uberResponse.getStatus().equals("success")){
//            vtcComparatorResponse.setEstimatedDistance(null);
            //TODO: Verify Date format and Local time
            for (Map.Entry<String, Estimate> Estim : uberResponse.getData().getEstimates().entrySet()){

            for (Map.Entry<String, NearbyVehicle> nearbyVehicle : uberResponse.getData().getStatus().getNearbyVehicles().entrySet()){
                    vtcComparatorResponse.setEstimatedTime((int)Estim.getValue().getEstimatedTime());


                float f = Float.parseFloat(Estim.getValue().getFormattedFare().replaceAll(".*?([\\d.]+).*", "$1"));
                    vtcComparatorResponse.getOffers().add(
                            new Offer(VTCPlatformName.UBER,
                                    null,
                                    new Vehicle(null, (int) uberResponse.getData().getStatus().getVehicleViews().get(nearbyVehicle.getKey()).getDetails().getCapacity(),null,null,null,
                                            getComfortType(uberResponse.getData().getStatus().getVehicleViews().get(nearbyVehicle.getKey()).getName()),
                                            (float) BlocSansMarqueEconomique.getAverageValue()),
                                    new Price("EUR",
                                          f) ,
                                    nearbyVehicle.getValue().getAverageEta() != null ? nearbyVehicle.getValue().getAverageEta().intValue() : new Random().nextInt(30),
                                    null,
                                    null,
                                    null,
                                    null));
                }}
        }
        }catch(Exception e){System.out.println("error in mapping response "+e.getMessage());}

        System.out.println("FinaalPlz"+vtcComparatorResponse.toString());

        return vtcComparatorResponse;
    }

    public static VTCComparatorResponse timeEstimatesListToVTCComparatorResponse(List<TimeEstimate> timeEstimates
            , VTCComparatorResponse vtcComparatorResponse){

        if(vtcComparatorResponse == null)
            vtcComparatorResponse = new VTCComparatorResponse(null,
                    null,
                    null,
                    null,
                    null,
                    new ArrayList<>());

        if(timeEstimates != null){
//            vtcComparatorResponse.setEstimatedTime(timeEstimates.size() > 0 ? timeEstimates.get(0).getEstimate() : null);

            vtcComparatorResponse.getOffers().get(vtcComparatorResponse.getOffers().size() -1)
                    .setVTCProvidedEstimatedTime(timeEstimates.size() > 0 ? timeEstimates.get(0).getEstimate() : null);
        }

        return vtcComparatorResponse;
    }

    public static VTCComparatorResponse promotionToVTCComparatorResponse(Promotion promotion
            , VTCComparatorResponse vtcComparatorResponse){

        if(vtcComparatorResponse == null)
            vtcComparatorResponse = new VTCComparatorResponse(null,
                    null,
                    null,
                    null,
                    null,
                    new ArrayList<>());
        //TODO: verify promotion: nothing to map
        if(promotion != null){

        }

        return vtcComparatorResponse;
    }

    protected static ComfortType getComfortType(String comfortType){
        if(comfortType.equals("UberX"))
            return ComfortType.STANDARD;
        else if(comfortType.equals("UberXL"))
            return ComfortType.ECO;
        else if(comfortType.equals("Green"))
            return ComfortType.ECO;
        else if(comfortType.equals("UberPool"))
            return ComfortType.ECO;
        else if(comfortType.equals("Uber SUV"))
            return ComfortType.ECO;
        else if(comfortType.equals("Van"))
            return ComfortType.VAN;
        else if(comfortType.equals("Uber Black"))
            return ComfortType.BUSINESS;
        else if(comfortType.equals("Berline"))
            return ComfortType.BUSINESS;
        else if(comfortType.equals("Uber Lux"))
            return ComfortType.BUSINESS;
        else if(comfortType.equals("Uber Select"))
            return ComfortType.BUSINESS;
        else
            return ComfortType.ECO;
    }
}
