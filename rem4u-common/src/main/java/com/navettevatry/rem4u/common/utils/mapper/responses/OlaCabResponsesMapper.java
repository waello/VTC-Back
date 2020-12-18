package com.navettevatry.rem4u.common.utils.mapper.responses;

import com.navettevatry.rem4u.common.resources.dto.olacab.RideBooking;
import com.navettevatry.rem4u.common.resources.dto.olacab.RideEstimateResponse;
import com.navettevatry.rem4u.common.resources.dto.standard.*;
import com.navettevatry.rem4u.common.resources.enumeration.standard.ComfortType;
import com.navettevatry.rem4u.common.resources.enumeration.standard.VTCPlatformName;
import com.navettevatry.rem4u.common.utils.enrichers.averageValue.BlocSansMarqueEconomique;

import java.util.ArrayList;

/**
 *
 * Created by Chakib Daii.
 */
public class OlaCabResponsesMapper {

    public static VTCComparatorResponse rideEstimateResponseToVTCComparatorResponse(RideEstimateResponse rideEstimateResponse
            , VTCComparatorResponse vtcComparatorResponse){

        if(vtcComparatorResponse == null)
                        vtcComparatorResponse = new VTCComparatorResponse(null,
                    null,
                    null,
                    null,
                    null,
                    new ArrayList<>());

        if(rideEstimateResponse != null){
            //HotspotZone
//            vtcComparatorResponse.setDepartureLocation(
//                    new VTCLocation(String.valueOf(
//                            (rideEstimateResponse.getHotspot_zone() != null && rideEstimateResponse.getHotspot_zone().getPickup_points() != null
//                                    && rideEstimateResponse.getHotspot_zone().getPickup_points().size() > 0) ? rideEstimateResponse.getHotspot_zone().getPickup_points().get(0).getId() : null),
//                            (rideEstimateResponse.getHotspot_zone() != null && rideEstimateResponse.getHotspot_zone().getPickup_points() != null
//                                    && rideEstimateResponse.getHotspot_zone().getPickup_points().size() > 0) ? rideEstimateResponse.getHotspot_zone().getPickup_points().get(0).getLat() : null,
//                            (rideEstimateResponse.getHotspot_zone() != null && rideEstimateResponse.getHotspot_zone().getPickup_points() != null
//                                    && rideEstimateResponse.getHotspot_zone().getPickup_points().size() > 0) ? rideEstimateResponse.getHotspot_zone().getPickup_points().get(0).getLng() : null,
//                            (rideEstimateResponse.getHotspot_zone() != null && rideEstimateResponse.getHotspot_zone().getPickup_points() != null
//                                    && rideEstimateResponse.getHotspot_zone().getPickup_points().size() > 0) ? rideEstimateResponse.getHotspot_zone().getPickup_points().get(0).getName() : null)
//            );
//            vtcComparatorResponse.setArrivalLocation(
//                    new VTCLocation(null,
//                            (rideEstimateResponse.getHotspot_zone() != null && rideEstimateResponse.getHotspot_zone().getHotspot_boundary() != null
//                                    && rideEstimateResponse.getHotspot_zone().getHotspot_boundary().size() > 0) ? rideEstimateResponse.getHotspot_zone().getHotspot_boundary().get(0).get(0) : null,
//                            (rideEstimateResponse.getHotspot_zone() != null && rideEstimateResponse.getHotspot_zone().getHotspot_boundary() != null
//                                    && rideEstimateResponse.getHotspot_zone().getHotspot_boundary().size() > 0) ? rideEstimateResponse.getHotspot_zone().getHotspot_boundary().get(0).get(1) : null,
//                            null)
//            );
//
            //Category
            vtcComparatorResponse.getOffers().add(
                    new Offer(VTCPlatformName.OLACAB,
                            new Driver(null,null,null,null),
                            new Vehicle(/*rideEstimateResponse.getCategories().get(0).getDisplay_name()*/ null,null,null,null,null, ComfortType.STANDARD, (float) BlocSansMarqueEconomique.getAverageValue()),
                            new Price((rideEstimateResponse.getCategories() != null && rideEstimateResponse.getCategories().size() > 0) ? rideEstimateResponse.getCategories().get(0).getCurrency() : null,
                                    (rideEstimateResponse.getRide_estimate() != null && rideEstimateResponse.getRide_estimate().size() > 0) ? Float.valueOf(rideEstimateResponse.getRide_estimate().get(0).getAmount_max()) : null),
                            (rideEstimateResponse.getCategories() != null && rideEstimateResponse.getCategories().size() > 0) ? rideEstimateResponse.getCategories().get(0).getEta() : null,
                            new VTCLocation(String.valueOf(
                                    (rideEstimateResponse.getHotspot_zone() != null && rideEstimateResponse.getHotspot_zone().getPickup_points() != null
                                            && rideEstimateResponse.getHotspot_zone().getPickup_points().size() > 0) ? rideEstimateResponse.getHotspot_zone().getPickup_points().get(0).getId(): null),
                                    (rideEstimateResponse.getHotspot_zone() != null && rideEstimateResponse.getHotspot_zone().getPickup_points() != null
                                            && rideEstimateResponse.getHotspot_zone().getPickup_points().size() > 0) ?  rideEstimateResponse.getHotspot_zone().getPickup_points().get(0).getLat(): null,
                                    (rideEstimateResponse.getHotspot_zone() != null && rideEstimateResponse.getHotspot_zone().getPickup_points() != null
                                            && rideEstimateResponse.getHotspot_zone().getPickup_points().size() > 0) ? rideEstimateResponse.getHotspot_zone().getPickup_points().get(0).getLng(): null,
                                    (rideEstimateResponse.getHotspot_zone() != null && rideEstimateResponse.getHotspot_zone().getPickup_points() != null
                                            && rideEstimateResponse.getHotspot_zone().getPickup_points().size() > 0) ? rideEstimateResponse.getHotspot_zone().getPickup_points().get(0).getName(): null),
                            new VTCLocation(null,
                                    (rideEstimateResponse.getHotspot_zone() != null && rideEstimateResponse.getHotspot_zone().getHotspot_boundary() != null
                                            && rideEstimateResponse.getHotspot_zone().getHotspot_boundary().size() > 0) ? rideEstimateResponse.getHotspot_zone().getHotspot_boundary().get(0).get(0) : null,
                                    (rideEstimateResponse.getHotspot_zone() != null && rideEstimateResponse.getHotspot_zone().getHotspot_boundary() != null
                                            && rideEstimateResponse.getHotspot_zone().getHotspot_boundary().size() > 0) ? rideEstimateResponse.getHotspot_zone().getHotspot_boundary().get(0).get(1) : null,
                                    null),
                            (rideEstimateResponse.getRide_estimate() != null && rideEstimateResponse.getRide_estimate().size() > 0) ? Float.valueOf(rideEstimateResponse.getRide_estimate().get(0).getDistance()): null,
                            (rideEstimateResponse.getRide_estimate() != null && rideEstimateResponse.getRide_estimate().size() > 0) ? Math.round(rideEstimateResponse.getRide_estimate().get(0).getTravel_time_in_minutes()): null));

//            vtcComparatorResponse.setEstimatedDistance(Float.valueOf(rideEstimateResponse.getCategories().get(0).getDistance_unit()));
//            vtcComparatorResponse.setEstimatedTime(Integer.parseInt(rideEstimateResponse.getCategories().get(0).getTime_unit()));

//            vtcComparatorResponse.setEstimatedDistance((rideEstimateResponse.getRide_estimate() != null
//                    && rideEstimateResponse.getRide_estimate().size() > 0) ? Float.valueOf(rideEstimateResponse.getRide_estimate().get(0).getDistance()) : null);
//            vtcComparatorResponse.setEstimatedTime((rideEstimateResponse.getRide_estimate() != null
//                    && rideEstimateResponse.getRide_estimate().size() > 0) ? Math.round(rideEstimateResponse.getRide_estimate().get(0).getTravel_time_in_minutes()) : null);

//            vtcComparatorResponse.getOffers().add(
//                    new Offer(VTCPlatformName.OLACAB,
//                            new Driver(null,null,rideEstimateResponse.getCategories().get(0).getImage(),null),
//                            null,
//                            null,
//                            null,
//                            null,
//                            null,
//                            null,
//                            null));
        }

        return vtcComparatorResponse;
    }

    public static VTCComparatorResponse rideBookingToVTCComparatorResponse(RideBooking rideBooking
            , VTCComparatorResponse vtcComparatorResponse){

        if(vtcComparatorResponse == null)
                        vtcComparatorResponse = new VTCComparatorResponse(null,
                    null,
                    null,
                    null,
                    null,
                    new ArrayList<>());

        if(rideBooking != null){
            //            vtcComparatorResponse.getOffers().add(
            //                    new Offer(VTCPlatformName.OLACAB,
            //                            null,
            //                            null,
            //                            null,
            //                            rideBooking.getBooking_timeout()));

        }

        return vtcComparatorResponse;
    }
}
