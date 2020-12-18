package com.navettevatry.rem4u.common.utils.mapper.responses;

import com.navettevatry.rem4u.common.resources.dto.lecab.*;
import com.navettevatry.rem4u.common.resources.dto.standard.*;
import com.navettevatry.rem4u.common.resources.enumeration.standard.ComfortType;
import com.navettevatry.rem4u.common.resources.enumeration.standard.VTCPlatformName;
import com.navettevatry.rem4u.common.utils.enrichers.averageValue.BlocSansMarqueEconomique;

import java.util.ArrayList;

/**
 *
 * Created by Chakib Daii.
 * Updated by Ahmed Ferjani
 */
public class LeCabResponsesMapper {

    public static VTCComparatorResponse locationsSearchResponseToVTCComparatorResponse(LocationsSearchResponse locationsSearchResponse
            , VTCComparatorResponse vtcComparatorResponse){

        if(vtcComparatorResponse == null)
                        vtcComparatorResponse = new VTCComparatorResponse(null,
                    null,
                    null,
                    null,
                    null,
                    new ArrayList<>());

        //No need to use the locationsSearchResponse
        //it gives a result like the google api autocomplete
        //vtcComparatorResponse.setDepartureLocation(new VTCLocation(locationsSearchResponse.getLocations().get(0).getId(), locationsSearchResponse.getLocations().get(0).getLatitude(), locationsSearchResponse.getLocations().get(0).getLongitude(), locationsSearchResponse.getLocations().get(0).getAddress()));
        //TODO: verify with tests
        if(locationsSearchResponse != null){
//            vtcComparatorResponse.setArrivalLocation(new VTCLocation(
//                    (locationsSearchResponse.getLocations() != null && locationsSearchResponse.getLocations().size() >= 0) ? locationsSearchResponse.getLocations().get(0).getId() : null,
//                    (locationsSearchResponse.getLocations() != null && locationsSearchResponse.getLocations().size() >= 0) ? locationsSearchResponse.getLocations().get(0).getLatitude() : null,
//                    (locationsSearchResponse.getLocations() != null && locationsSearchResponse.getLocations().size() >= 0) ? locationsSearchResponse.getLocations().get(0).getLongitude() : null,
//                    (locationsSearchResponse.getLocations() != null && locationsSearchResponse.getLocations().size() >= 0) ? locationsSearchResponse.getLocations().get(0).getAddress() : null));
//            vtcComparatorResponse.getOffers().add(
//
//            );
        }

        return vtcComparatorResponse;
    }

    public static VTCComparatorResponse servicesAvailableResponseToVTCComparatorResponse(ServicesAvailableResponse servicesAvailableResponse
            , VTCComparatorResponse vtcComparatorResponse){

        if(vtcComparatorResponse == null)
                        vtcComparatorResponse = new VTCComparatorResponse(null,
                    null,
                    null,
                    null,
                    null,
                    new ArrayList<>());

        //TODO: verify with tests
//        if(servicesAvailableResponse != null){
//            vtcComparatorResponse.setDepartureLocation(new VTCLocation(
//                    servicesAvailableResponse.getLocation() != null ? servicesAvailableResponse.getLocation().getId() : null,
//                    servicesAvailableResponse.getLocation() != null ? servicesAvailableResponse.getLocation().getLatitude() : null,
//                    servicesAvailableResponse.getLocation() != null ? servicesAvailableResponse.getLocation().getLongitude() : null,
//                    servicesAvailableResponse.getLocation() != null ? servicesAvailableResponse.getLocation().getAddress() : null));
//        }

        //TODO: check service from the ServiceAvailableResponse
        return vtcComparatorResponse;
    }

    public static VTCComparatorResponse servicesEstimateResponseToVTCComparatorResponse(ServicesEstimateResponse servicesEstimateResponse
            , VTCComparatorResponse vtcComparatorResponse){

        if(vtcComparatorResponse == null)
                        vtcComparatorResponse = new VTCComparatorResponse(null,
                    null,
                    null,
                    null,
                    null,
                    new ArrayList<>());

        if(servicesEstimateResponse != null){
//            vtcComparatorResponse.setDepartureLocation(new VTCLocation(
//                    servicesEstimateResponse.getLocation() != null ? servicesEstimateResponse.getLocation().getId() : null,
//                    servicesEstimateResponse.getLocation() != null ? servicesEstimateResponse.getLocation().getLatitude() : null,
//                    servicesEstimateResponse.getLocation() != null ? servicesEstimateResponse.getLocation().getLongitude() : null,
//                    servicesEstimateResponse.getLocation() != null ? servicesEstimateResponse.getLocation().getAddress() : null));
////        vtcComparatorResponse.setEstimatedTime(servicesEstimateResponse.getDelay());

        }

        return vtcComparatorResponse;
    }

    public static VTCComparatorResponse jobsSearchResponseToVTCComparatorResponse(JobsSearchResponse jobsSearchResponse
            , VTCComparatorResponse vtcComparatorResponse){

        if(vtcComparatorResponse == null)
                        vtcComparatorResponse = new VTCComparatorResponse(null,
                    null,
                    null,
                    null,
                    null,
                    new ArrayList<>());
        //no need to use the JobsSearchResponse
        //TODO: Job Id will bes used in other endpoints
//        jobsSearchResponse.getId();
        if(jobsSearchResponse != null){

        }

        return vtcComparatorResponse;
    }

    public static VTCComparatorResponse jobsEstimateResponseToVTCComparatorResponse(JobsEstimateResponse jobsEstimateResponse
            , VTCComparatorResponse vtcComparatorResponse){

        if(vtcComparatorResponse == null)
                        vtcComparatorResponse = new VTCComparatorResponse(null,
                    null,
                    null,
                    null,
                    null,
                    new ArrayList<>());

        if(jobsEstimateResponse != null){
//            vtcComparatorResponse.setDepartureLocation(new VTCLocation(
//                    jobsEstimateResponse.getPickup() != null ? jobsEstimateResponse.getPickup().getId() : null,
//                    jobsEstimateResponse.getPickup() != null ? (float) jobsEstimateResponse.getPickup().getLatitude() : null,
//                    jobsEstimateResponse.getPickup() != null ? (float) jobsEstimateResponse.getPickup().getLongitude() : null,
//                    jobsEstimateResponse.getPickup() != null ? jobsEstimateResponse.getPickup().getAddress() : null));
//
//            vtcComparatorResponse.setArrivalLocation(new VTCLocation(
//                    jobsEstimateResponse.getDrop() != null ? jobsEstimateResponse.getDrop().getId() : null,
//                    jobsEstimateResponse.getDrop() != null ? (float) jobsEstimateResponse.getDrop().getLatitude() : null,
//                    jobsEstimateResponse.getDrop() != null ? (float) jobsEstimateResponse.getDrop().getLongitude() : null,
//                    jobsEstimateResponse.getDrop() != null ? jobsEstimateResponse.getDrop().getAddress() : null));
//
//            vtcComparatorResponse.setEstimatedTime(jobsEstimateResponse.getDelay());

            vtcComparatorResponse.getOffers().add(new Offer(VTCPlatformName.LECAB,
                    new Driver(null,null,null,null),
                    new Vehicle(null,null,null,null,null, ComfortType.STANDARD, (float) BlocSansMarqueEconomique.getAverageValue()),
                    //TODO: Convert to all to Euro or USD
                    new Price("Euro", jobsEstimateResponse.getPrice()),
                    jobsEstimateResponse.getDelay(),
                    new VTCLocation(
                            jobsEstimateResponse.getPickup() != null ? jobsEstimateResponse.getPickup().getId() : null,
                            jobsEstimateResponse.getPickup() != null ? (float) jobsEstimateResponse.getPickup().getLatitude() : null,
                            jobsEstimateResponse.getPickup() != null ? (float) jobsEstimateResponse.getPickup().getLongitude() : null,
                            jobsEstimateResponse.getPickup() != null ? jobsEstimateResponse.getPickup().getAddress() : null),
                    new VTCLocation(
                            jobsEstimateResponse.getDrop() != null ? jobsEstimateResponse.getDrop().getId() : null,
                            jobsEstimateResponse.getDrop() != null ? (float) jobsEstimateResponse.getDrop().getLatitude() : null,
                            jobsEstimateResponse.getDrop() != null ? (float) jobsEstimateResponse.getDrop().getLongitude() : null,
                            jobsEstimateResponse.getDrop() != null ? jobsEstimateResponse.getDrop().getAddress() : null),
                    null,
                    jobsEstimateResponse.getDuration_max()));
        }

        return vtcComparatorResponse;
    }

}
