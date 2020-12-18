package com.navettevatry.rem4u.common.utils.mapper.requests;

import com.navettevatry.rem4u.common.resources.dto.bcvtc.EstimationRequest;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorRequest;
import com.navettevatry.rem4u.common.utils.Rem4uUtils;

import java.util.function.Function;

/**
 *
 * Created by Chakib Daii.
 * Updated by Wael Jlassi and Chakib DAII
 */
public class BcvtcRequestsMapper {

    public static Function<VTCComparatorRequest, EstimationRequest> VTCComparatorRequestToLocationsSearchRequest
            = new Function<VTCComparatorRequest, EstimationRequest>() {
        @Override
        public EstimationRequest apply(VTCComparatorRequest vtcComparatorRequest) {
            EstimationRequest EstimationRequest = new EstimationRequest();
            //TODO: Set Email Address
            EstimationRequest.setEmail(null);
            EstimationRequest.setPickUp(vtcComparatorRequest.getDepartureLocation().getAddress());
            EstimationRequest.setDropOff(vtcComparatorRequest.getArrivalLocation().getAddress());
            //TODO: Set Hours
            EstimationRequest.setHours(0);        //TODO: Set Distance based on departure and arrival
            EstimationRequest.setKms(0);       //TODO: Set Trip Type
            EstimationRequest.setTripType(1.1f/*Float.valueOf(vtcComparatorRequest.getTripType().getTripType().getType())*/);
            return EstimationRequest;
        }

    };

    /**
    public static Function<VTCComparatorRequest, ForfaitResponse> VTCComparatorRequestToForfaitResponse
            = new Function<VTCComparatorRequest, ForfaitResponse>() {
        @Override
        public ForfaitResponse apply(VTCComparatorRequest vtcComparatorRequest) {
            ForfaitResponse ForfaitResponse = new ForfaitResponse();
            //a verifier
            ForfaitResponse.setMessage("");
            ForfaitResponse.setStatus("");
            // list forfait
            ForfaitResponse.setData(null);
            return ForfaitResponse;
        }

    };

    public static Function<VTCComparatorRequest, CarClassesResponse> VTCComparatorRequestToCarClassesResponse
            = new Function<VTCComparatorRequest, CarClassesResponse>() {
        @Override
        public CarClassesResponse apply(VTCComparatorRequest vtcComparatorRequest) {
            CarClassesResponse CarClassesResponse = new CarClassesResponse();
            //a verifier
            CarClassesResponse.setMessage("");
            CarClassesResponse.setStatus("");
           //list carcclass
            CarClassesResponse.setData(null);
            return CarClassesResponse;
        }

    };
    public static Function<VTCComparatorRequest, CarsResponse> VTCComparatorRequestToCarsResponse
            = new Function<VTCComparatorRequest, CarsResponse>() {
        @Override
        public CarsResponse apply(VTCComparatorRequest vtcComparatorRequest) {
            CarsResponse CarsResponse = new CarsResponse();
            //a verifier
            CarsResponse.setMessage("");
            CarsResponse.setStatus("");
            //list carcclass
            CarsResponse.setData(null);
            return CarsResponse;
        }

    };*/
}
