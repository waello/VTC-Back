package com.navettevatry.rem4u.common.utils.mapper.responses;

import com.lyft.networking.apiObjects.CostEstimate;
import com.lyft.networking.apiObjects.Eta;
import com.lyft.networking.apiObjects.NearbyDriversByRideType;
import com.lyft.networking.apiObjects.RideType;
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
public class LyftResponsesMapper {

    public static VTCComparatorResponse costEstimatesListToVTCComparatorResponse(List<CostEstimate> costEstimates
            , VTCComparatorResponse vtcComparatorResponse){

        if(vtcComparatorResponse == null)
                        vtcComparatorResponse = new VTCComparatorResponse(null,
                    null,
                    null,
                    null,
                    null,
                    new ArrayList<>());
        //TODO: will set this using our functions
        if(costEstimates != null){
//            vtcComparatorResponse.setEstimatedDistance(
//                    (costEstimates.size() > 0 && costEstimates.get(0).estimated_distance_miles != null) ? Float.valueOf((float)(costEstimates.get(0).estimated_distance_miles * 1.60934) / 1000) : null);
//            vtcComparatorResponse.setEstimatedTime(
//                    (costEstimates.size() > 0 && costEstimates.get(0).estimated_duration_seconds != null) ? Math.round(costEstimates.get(0).estimated_duration_seconds / 60) : null);

//            vtcComparatorResponse.getOffers().add(
//                    new Offer(VTCPlatformName.LYFT,
//                            new Driver(null,null,null,null),
//                            new Vehicle(null,null,null,null,null, ComfortType.STANDARD, (float) BlocSansMarqueEconomique.getAverageValue()),
//                            //TODO: Verfiy min and max
//                            new Price(/*"USD"*/ costEstimates.size() > 0 ? costEstimates.get(0).currency : null,
//                                    (costEstimates.size() > 0 && costEstimates.get(0).estimated_cost_cents_max != null) ?Float.valueOf(costEstimates.get(0).estimated_cost_cents_max / 100) : null),
//                            null,
//                            null,
//                            null,
//                            (costEstimates.size() > 0 && costEstimates.get(0).estimated_distance_miles != null) ? Float.valueOf((float)(costEstimates.get(0).estimated_distance_miles * 1.60934) / 1000) : null,
//                            (costEstimates.size() > 0 && costEstimates.get(0).estimated_duration_seconds != null) ? Math.round(costEstimates.get(0).estimated_duration_seconds / 60): null)
//            );

            for( CostEstimate costEstimate : costEstimates){
                vtcComparatorResponse.getOffers().add(
                        new Offer(VTCPlatformName.LYFT,
                                new Driver(null,null,null,null),
                                new Vehicle(null,null,null,null,null, ComfortType.STANDARD, (float) BlocSansMarqueEconomique.getAverageValue()),
                                //TODO: Verfiy min and max
                                new Price(/*"USD"*/  costEstimate.currency != null ? costEstimate.currency : null,
                                        (costEstimate.estimated_cost_cents_max != null) ?Float.valueOf(costEstimate.estimated_cost_cents_max / 100) : null),
                                null,
                                null,
                                null,
                                (costEstimate.estimated_distance_miles != null) ? Float.valueOf((float)(costEstimate.estimated_distance_miles * 1.60934) / 1000) : null,
                                (costEstimate.estimated_duration_seconds != null) ? Math.round(costEstimate.estimated_duration_seconds / 60): null)
                );
            }

        }

        return vtcComparatorResponse;
    }

    public static VTCComparatorResponse etasListToVTCComparatorResponse(List<Eta> etas
            , VTCComparatorResponse vtcComparatorResponse){

        if(vtcComparatorResponse == null)
                        vtcComparatorResponse = new VTCComparatorResponse(null,
                    null,
                    null,
                    null,
                    null,
                    new ArrayList<>());

        if(etas != null){
//            vtcComparatorResponse.getOffers().get(vtcComparatorResponse.getOffers().size()-1)
//                    .setWaitingTime((etas.size() > 0 && etas.get(0).eta_seconds != null) ? Math.round(etas.get(0).eta_seconds / 60) : null);
            for(Eta eta : etas){
                int i =0;

                while(i < vtcComparatorResponse.getOffers().size()){
                    vtcComparatorResponse.getOffers().get(i)
                            .setWaitingTime((eta.eta_seconds != null) ? Math.round(eta.eta_seconds / 60) : null);

                    i++;
                }
            }
        }

        return vtcComparatorResponse;
    }

    public static VTCComparatorResponse nearbyDriversByRideTypesListToVTCComparatorResponse(List<NearbyDriversByRideType> nearbyDriversByRideTypes
            , VTCComparatorResponse vtcComparatorResponse){

        if(vtcComparatorResponse == null)
                        vtcComparatorResponse = new VTCComparatorResponse(null,
                    null,
                    null,
                    null,
                    null,
                    new ArrayList<>());

        //TODO: verify the use of this method via tests
        if(nearbyDriversByRideTypes != null){
            //can be used to caculate estimation of delay
            //nearbyDriversByRideTypes.get(0).drivers.get(0).locations.get(0).lat;
            // nearbyDriversByRideTypes.get(0).drivers.get(0).locations.get(0).lng;
        }

         return vtcComparatorResponse;
    }

    public static VTCComparatorResponse rideTypesListToVTCComparatorResponse(List<RideType> rideTypes
            , VTCComparatorResponse vtcComparatorResponse){

        if(vtcComparatorResponse == null)
                        vtcComparatorResponse = new VTCComparatorResponse(null,
                    null,
                    null,
                    null,
                    null,
                    new ArrayList<>());
        //TODO: Verify Car Type and the use of attributes via tests
        if(rideTypes != null){
            // Can be used for car type
            // rideTypes.get(0).seats;
            // rideTypes.get(0).display_name;
            // rideTypes.get(0).seats;
            // rideTypes.get(0).image_url;
            // rideTypes.get(0).pricing_details;
        }

        return vtcComparatorResponse;
    }
}
