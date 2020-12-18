package com.navettevatry.rem4u.common.utils.mapper.responses;

import com.navettevatry.rem4u.common.resources.dto.bcvtc.Car;
import com.navettevatry.rem4u.common.resources.dto.bcvtc.CarClass;
import com.navettevatry.rem4u.common.resources.dto.bcvtc.Estimation;
import com.navettevatry.rem4u.common.resources.dto.bcvtc.Forfait;
import com.navettevatry.rem4u.common.resources.dto.standard.*;
import com.navettevatry.rem4u.common.resources.enumeration.standard.ComfortType;
import com.navettevatry.rem4u.common.resources.enumeration.standard.VTCPlatformName;
import com.navettevatry.rem4u.common.utils.enrichers.averageValue.BlocSansMarqueEconomique;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by Chakib Daii.
 */
public class BcvtcResponsesMapper {

    public static VTCComparatorResponse estimationToVTCComparatorResponse(Estimation estimation
            , VTCComparatorResponse vtcComparatorResponse){

        if(vtcComparatorResponse == null)
                        vtcComparatorResponse = new VTCComparatorResponse(null,
                    null,
                    null,
                    null,
                    null,
                    new ArrayList<>());

        if(estimation != null){
//            vtcComparatorResponse.setDepartureLocation(
//                    new VTCLocation(null,null,null,estimation.getPickUpAddress()));
//            vtcComparatorResponse.setArrivalLocation(
//                    new VTCLocation(null,null,null,estimation.getDropOffAddress()));
//            vtcComparatorResponse.setDate(null);
//            vtcComparatorResponse.setEstimatedDistance(estimation.getDistanceValue() != null ? Float.valueOf(estimation.getDistanceValue() / 1000) : null);
//            vtcComparatorResponse.setEstimatedTime(estimation.getDurationValue() != null ? Math.round(estimation.getDurationValue() / 60) : null);
            //TODO: refine Offer with enricherrs
//            vtcComparatorResponse.getOffers().add(
//                    new Offer(VTCPlatformName.BCVTC,
//                            new Driver(null,null,null,null),
//                            new Vehicle(null,(estimation.getPrices() != null && estimation.getPrices().size() > 0) ? Integer.parseInt(estimation.getPrices().get(0).getPaxesVolume()): null,null,null,null, ComfortType.STANDARD, (float) BlocSansMarqueEconomique.getAverageValue()),
//                            new Price("EURO", (estimation.getPrices() != null && estimation.getPrices().size() > 0) ? estimation.getPrices().get(0).getPrice() : null),
//                            null,
//                            new VTCLocation(null,null,null,estimation.getPickUpAddress()),
//                            new VTCLocation(null,null,null,estimation.getDropOffAddress()),
//                            estimation.getDistanceValue() != null ? Float.valueOf(estimation.getDistanceValue() / 1000) : null,
//                            estimation.getDurationValue() != null ? Math.round(estimation.getDurationValue() / 60) : null));
//        }

        for(com.navettevatry.rem4u.common.resources.dto.bcvtc.Price price : estimation.getPrices()){
            vtcComparatorResponse.getOffers().add(
                    new Offer(VTCPlatformName.BCVTC,
                            new Driver(null,null,null,null),
                            new Vehicle(null,(price.getPaxesVolume() != null ) ? Integer.parseInt(price.getPaxesVolume()): null,null,null,null, ComfortType.STANDARD, (float) BlocSansMarqueEconomique.getAverageValue()),
                            new Price("EURO", (price.getPrice() != null ) ? price.getPrice() : null),
                            null,
                            new VTCLocation(null,null,null,estimation.getPickUpAddress()),
                            new VTCLocation(null,null,null,estimation.getDropOffAddress()),
                            estimation.getDistanceValue() != null ? Float.valueOf(estimation.getDistanceValue() / 1000) : null,
                            estimation.getDurationValue() != null ? Math.round(estimation.getDurationValue() / 60) : null));
        }

    }

        return vtcComparatorResponse;
    }

    public static VTCComparatorResponse forfaitsListToVTCComparatorResponse(List<Forfait> forfaits
            , VTCComparatorResponse vtcComparatorResponse){

        if(vtcComparatorResponse == null)
                        vtcComparatorResponse = new VTCComparatorResponse(null,
                    null,
                    null,
                    null,
                    null,
                    new ArrayList<>());

        if(forfaits != null){

        }

        return vtcComparatorResponse;
    }

    public static VTCComparatorResponse carClassesListToVTCComparatorResponse(List<CarClass> carClasses
            , VTCComparatorResponse vtcComparatorResponse){

        if(vtcComparatorResponse == null)
                        vtcComparatorResponse = new VTCComparatorResponse(null,
                    null,
                    null,
                    null,
                    null,
                    new ArrayList<>());

        if(carClasses != null){

        }

        return vtcComparatorResponse;
    }

    public static VTCComparatorResponse carsListToVTCComparatorResponse(List<Car> cars
            , VTCComparatorResponse vtcComparatorResponse){

        if(vtcComparatorResponse == null)
                        vtcComparatorResponse = new VTCComparatorResponse(null,
                    null,
                    null,
                    null,
                    null,
                    new ArrayList<>());

        if(cars != null){

        }

        return vtcComparatorResponse;
    }
}
