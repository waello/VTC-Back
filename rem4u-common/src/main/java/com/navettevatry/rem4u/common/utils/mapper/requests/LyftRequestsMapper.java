package com.navettevatry.rem4u.common.utils.mapper.requests;

import com.navettevatry.rem4u.common.resources.dto.lyft.CostEstimatesRequest;
import com.navettevatry.rem4u.common.resources.dto.lyft.DriversRequest;
import com.navettevatry.rem4u.common.resources.dto.lyft.EtasRequest;
import com.navettevatry.rem4u.common.resources.dto.lyft.RidetypesRequest;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorRequest;

import java.util.function.Function;

/**
 *
 * Created by Chakib Daii.
 * Updated by Wael Jlassi and Chakib DAII
 */
public class LyftRequestsMapper {
    public static Function<VTCComparatorRequest, CostEstimatesRequest> VTCComparatorRequestToCostEstimatesRequest
            = new Function<VTCComparatorRequest, CostEstimatesRequest>() {
        @Override
        public CostEstimatesRequest apply(VTCComparatorRequest vtcComparatorRequest) {
            CostEstimatesRequest costEstimatesRequest = new CostEstimatesRequest();
            costEstimatesRequest.setStartLatitude(vtcComparatorRequest.getDepartureLocation().getLatitude().doubleValue());
            costEstimatesRequest.setStartLongitude(vtcComparatorRequest.getDepartureLocation().getLongitude().doubleValue());
            costEstimatesRequest.setEndLatitude(vtcComparatorRequest.getArrivalLocation().getLatitude().doubleValue());
            costEstimatesRequest.setEndLongitude(vtcComparatorRequest.getArrivalLocation().getLongitude().doubleValue());
            //TODO: Set Ride Type
            costEstimatesRequest.setRideType(null/*vtcComparatorRequest.getTripType().getTripType()*/);

            return costEstimatesRequest;
        }

    };
    public static Function<VTCComparatorRequest, EtasRequest> VTCComparatorRequestToEtasRequest
            = new Function<VTCComparatorRequest, EtasRequest>() {
        @Override
        public EtasRequest apply(VTCComparatorRequest vtcComparatorRequest) {
            EtasRequest etasRequest = new EtasRequest();
            etasRequest.setLatitude(vtcComparatorRequest.getDepartureLocation().getLatitude().doubleValue());
            etasRequest.setLongitude(vtcComparatorRequest.getDepartureLocation().getLongitude().doubleValue());
            etasRequest.setDestinationLatitude(vtcComparatorRequest.getArrivalLocation().getLatitude().doubleValue());
            etasRequest.setDestinationLongitude(vtcComparatorRequest.getArrivalLocation().getLongitude().doubleValue());
            //TODO: Set Ride Type
            etasRequest.setRideType(null/*vtcComparatorRequest.getTripType().getTripType()*/);

            return etasRequest;
        }

    };
    public static Function<VTCComparatorRequest, DriversRequest> VTCComparatorRequestToDriversRequest
            = new Function<VTCComparatorRequest, DriversRequest>() {
        @Override
        public DriversRequest apply(VTCComparatorRequest vtcComparatorRequest) {
            DriversRequest driversRequest = new DriversRequest();
            driversRequest.setLatitude(vtcComparatorRequest.getDepartureLocation().getLatitude().doubleValue());
            driversRequest.setLongitude(vtcComparatorRequest.getDepartureLocation().getLongitude().doubleValue());

            return driversRequest;
        }

    };
    public static Function<VTCComparatorRequest, RidetypesRequest> VTCComparatorRequestToRidetypesRequest
            = new Function<VTCComparatorRequest, RidetypesRequest>() {
        @Override
        public RidetypesRequest apply(VTCComparatorRequest vtcComparatorRequest) {
            RidetypesRequest ridetypesRequest = new RidetypesRequest();
            ridetypesRequest.setLatitude(vtcComparatorRequest.getDepartureLocation().getLatitude().doubleValue());
            ridetypesRequest.setLongitude(vtcComparatorRequest.getDepartureLocation().getLongitude().doubleValue());
            //TODO: Set Ride Type
            ridetypesRequest.setRideType(null/*vtcComparatorRequest.getTripType().getTripType()*/);
            return ridetypesRequest;
        }

    };
}
