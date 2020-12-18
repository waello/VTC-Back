package com.navettevatry.rem4u.common.utils.mapper.requests;

import com.navettevatry.rem4u.common.resources.dto.lecab.*;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorRequest;
import com.navettevatry.rem4u.common.resources.enumeration.lecab.LocationsPresetRequestType;
import com.navettevatry.rem4u.common.resources.enumeration.lecab.PaymentType;
import com.navettevatry.rem4u.common.resources.enumeration.lecab.ServicesAvailableResponseType;

import java.util.function.Function;

/**
 *
 * Created by Chakib Daii.
 */
public class LeCabRequestsMapper {

    public static Function<VTCComparatorRequest, LocationsSearchRequest> VTCComparatorRequestToLocationsSearchRequest
            = new Function<VTCComparatorRequest, LocationsSearchRequest>() {
        @Override
        public LocationsSearchRequest apply(VTCComparatorRequest vtcComparatorRequest) {
            LocationsSearchRequest locationsSearchRequest = new LocationsSearchRequest();
            locationsSearchRequest.setLocation(
                    //TODO: Only one of this parameter should be set: id OR address OR (latitude AND longitude)
                    new LocationRequest(null /*vtcComparatorRequest.getDepartureLocation().getId()*/,
                            null /*vtcComparatorRequest.getDepartureLocation().getLatitude()*/,
                            null /*vtcComparatorRequest.getDepartureLocation().getLongitude()*/,
                            vtcComparatorRequest.getDepartureLocation().getAddress()));
            //TODO: Set LImit from Request
            locationsSearchRequest.setLimit(5);
            return locationsSearchRequest;
        }

    };

    public static Function<VTCComparatorRequest, LocationsPresetRequest> VTCComparatorRequestToLocationsPresetRequest
            = new Function<VTCComparatorRequest, LocationsPresetRequest>() {


        @Override
        public LocationsPresetRequest apply(VTCComparatorRequest vtcComparatorRequest) {
            LocationsPresetRequest locationsPresetRequest = new LocationsPresetRequest();
            //TODO: Set Id and Type
            locationsPresetRequest.setId("");
            locationsPresetRequest.setType(LocationsPresetRequestType.AIRPORT);
            return locationsPresetRequest;
        }
    };


    public static Function<VTCComparatorRequest, ServicesAvailableRequest> VTCComparatorRequestToServicesAvailableRequest
            = new Function<VTCComparatorRequest, ServicesAvailableRequest>() {


        @Override
        public ServicesAvailableRequest apply(VTCComparatorRequest vtcComparatorRequest) {
            ServicesAvailableRequest servicesAvailableRequest = new ServicesAvailableRequest();
            servicesAvailableRequest.setLocation(
                    //TODO: Only one of this parameter should be set: id OR address OR (latitude AND longitude)
                    new LocationRequest(vtcComparatorRequest.getDepartureLocation().getId(),
                            vtcComparatorRequest.getDepartureLocation().getLatitude(),
                            vtcComparatorRequest.getDepartureLocation().getLongitude(),
                            vtcComparatorRequest.getDepartureLocation().getAddress()));
            return servicesAvailableRequest;
        }

    };

    public static Function<VTCComparatorRequest, ServicesEstimateRequest> VTCComparatorRequestToServicesEstimateRequest
            = new Function<VTCComparatorRequest, ServicesEstimateRequest>() {


        @Override
        public ServicesEstimateRequest apply(VTCComparatorRequest vtcComparatorRequest) {
            ServicesEstimateRequest servicesEstimateRequest = new ServicesEstimateRequest();
            servicesEstimateRequest.setLocation(
                    //TODO: Only one of this parameter should be set: id OR address OR (latitude AND longitude)
                    new LocationRequest(vtcComparatorRequest.getDepartureLocation().getId(),
                            vtcComparatorRequest.getDepartureLocation().getLatitude(),
                            vtcComparatorRequest.getDepartureLocation().getLongitude(),
                            vtcComparatorRequest.getDepartureLocation().getAddress()));
            //TODO:Set Service and payment
            servicesEstimateRequest.setPayment(new PaymentShort(PaymentType.CARD));
            servicesEstimateRequest.setService(ServicesAvailableResponseType.FRANCE);
            return servicesEstimateRequest;
        }

    };


    public static Function<VTCComparatorRequest, JobsSearchRequest> VTCComparatorRequestToJobsSearchRequest
            = new Function<VTCComparatorRequest, JobsSearchRequest>() {


        @Override
        public JobsSearchRequest apply(VTCComparatorRequest vtcComparatorRequest) {
            JobsSearchRequest jobsSearchRequest = new JobsSearchRequest();
            //TODO:Set references
            jobsSearchRequest.setReferences(new CustomReferences());
            return jobsSearchRequest;
        }

    };

    public static Function<VTCComparatorRequest, JobsEstimateRequest> VTCComparatorRequestToJobsEstimateRequest
            = new Function<VTCComparatorRequest, JobsEstimateRequest>() {


        @Override
        public JobsEstimateRequest apply(VTCComparatorRequest vtcComparatorRequest) {
            JobsEstimateRequest jobsEstimateRequest = new JobsEstimateRequest();

            jobsEstimateRequest.setPickup(new StrictLocationRequest(null,vtcComparatorRequest.getDepartureLocation().getLatitude(),
                    vtcComparatorRequest.getDepartureLocation().getLongitude()));
            jobsEstimateRequest.setDrop(new StrictLocationRequest(null,vtcComparatorRequest.getArrivalLocation().getLatitude(),
                    vtcComparatorRequest.getArrivalLocation().getLongitude()));
            jobsEstimateRequest.setDate(vtcComparatorRequest.getDate());
            jobsEstimateRequest.setStops(null);
            jobsEstimateRequest.setPayment(new PaymentShort(PaymentType.CASH_AT_DROP)); // TODO: verify these sets
            jobsEstimateRequest.setService(ServicesAvailableResponseType.FRANCE); //TODO: verify dependency to available services
            jobsEstimateRequest.setDiscount(null);

            return jobsEstimateRequest;
        }

    };

}
