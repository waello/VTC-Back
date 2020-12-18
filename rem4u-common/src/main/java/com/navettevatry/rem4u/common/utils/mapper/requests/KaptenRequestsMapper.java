package com.navettevatry.rem4u.common.utils.mapper.requests;

import com.navettevatry.rem4u.common.resources.dto.kapten.EstimatedPriceRequest;
import com.navettevatry.rem4u.common.resources.dto.kapten.WaitingTimeRequest;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorRequest;

import java.util.function.Function;

/**
 *
 * Created by Chakib Daii.
 * Updated by Wael Jlassi and Chakib DAII
 */
public class KaptenRequestsMapper {

    public static Function<VTCComparatorRequest, EstimatedPriceRequest> VTCComparatorRequestToEstimatedPriceRequest
            = new Function<VTCComparatorRequest, EstimatedPriceRequest>() {
        @Override
        public EstimatedPriceRequest apply(VTCComparatorRequest vtcComparatorRequest) {
            EstimatedPriceRequest estimatedPriceRequest = new EstimatedPriceRequest();
            estimatedPriceRequest.setStart_lat(vtcComparatorRequest.getDepartureLocation().getLatitude());
            estimatedPriceRequest.setStart_lng(vtcComparatorRequest.getDepartureLocation().getLongitude());
            estimatedPriceRequest.setEnd_lat(vtcComparatorRequest.getArrivalLocation().getLatitude());
            estimatedPriceRequest.setEnd_lng(vtcComparatorRequest.getArrivalLocation().getLongitude());
            return estimatedPriceRequest;
        }

    };

    public static Function<VTCComparatorRequest, WaitingTimeRequest> VTCComparatorRequestToWaitingTimeRequest
            = new Function<VTCComparatorRequest, WaitingTimeRequest>() {
        @Override
        public WaitingTimeRequest apply(VTCComparatorRequest vtcComparatorRequest) {
            WaitingTimeRequest waitingTimeRequest = new WaitingTimeRequest();
            waitingTimeRequest.setLat(vtcComparatorRequest.getDepartureLocation().getLatitude());
            waitingTimeRequest.setLng(vtcComparatorRequest.getDepartureLocation().getLongitude());
            return waitingTimeRequest;
        }

    };
}
