package com.navettevatry.rem4u.common.utils.mapper.requests;

import com.navettevatry.rem4u.common.resources.dto.olacab.RideBookingRequest;
import com.navettevatry.rem4u.common.resources.dto.olacab.RideEstimateRequest;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorRequest;

import java.util.function.Function;

/**
 *
 * Created by Chakib Daii.
 * Updated by Wael Jlassi and Chakib DAII
 */
public class OlaCabRequestsMapper {
    public static Function<VTCComparatorRequest, RideEstimateRequest> VTCComparatorRequestToRideEstimateRequest
            = new Function<VTCComparatorRequest, RideEstimateRequest>() {
        @Override
        public RideEstimateRequest apply(VTCComparatorRequest vtcComparatorRequest) {
            RideEstimateRequest rideEstimateRequest = new RideEstimateRequest();
            rideEstimateRequest.setPickup_lat(vtcComparatorRequest.getDepartureLocation().getLatitude());
            rideEstimateRequest.setPickup_lng(vtcComparatorRequest.getDepartureLocation().getLongitude());
            rideEstimateRequest.setDrop_lat(vtcComparatorRequest.getArrivalLocation().getLatitude());
            rideEstimateRequest.setDrop_lng(vtcComparatorRequest.getArrivalLocation().getLongitude());
            //TODO: set Service type and Category
            rideEstimateRequest.setService_type(null);
            rideEstimateRequest.setCategory(null);

            return rideEstimateRequest;
        }

    };

    public static Function<VTCComparatorRequest, RideBookingRequest> VTCComparatorRequestToRideBookingRequest
            = new Function<VTCComparatorRequest, RideBookingRequest>() {
        @Override
        public RideBookingRequest apply(VTCComparatorRequest vtcComparatorRequest) {
            RideBookingRequest rideBookingRequest = new RideBookingRequest();
            rideBookingRequest.setPickup_lat(vtcComparatorRequest.getDepartureLocation().getLatitude());
            rideBookingRequest.setPickup_lng(vtcComparatorRequest.getDepartureLocation().getLongitude());
            rideBookingRequest.setDrop_lat(vtcComparatorRequest.getArrivalLocation().getLatitude());
            rideBookingRequest.setDrop_lng(vtcComparatorRequest.getArrivalLocation().getLongitude());
            //TODO: set fare id and pickup mode
            rideBookingRequest.setFare_id(null);
            rideBookingRequest.setPickup_mode(null);

            return rideBookingRequest;
        }

    };
}
