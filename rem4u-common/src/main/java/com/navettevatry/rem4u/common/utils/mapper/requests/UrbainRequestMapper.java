package com.navettevatry.rem4u.common.utils.mapper.requests;

import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorRequest;
import com.navettevatry.rem4u.common.resources.dto.urbanDriver.*;

import java.util.function.Function;

public class UrbainRequestMapper {

    public static Function<VTCComparatorRequest, UrbanDriverTrafficRequest> VTCComparatorRequestToRequest
            = new Function<VTCComparatorRequest, UrbanDriverTrafficRequest>() {
        @Override
        public UrbanDriverTrafficRequest apply(VTCComparatorRequest vtcComparatorRequest) {

           UrbanDriverTrafficRequest urbanDriverTrafficRequest = new UrbanDriverTrafficRequest();
           urbanDriverTrafficRequest.setDepLng(vtcComparatorRequest.getDepartureLocation().getLongitude());
           urbanDriverTrafficRequest.setDepLat(vtcComparatorRequest.getDepartureLocation().getLatitude());
           urbanDriverTrafficRequest.setDestlng(vtcComparatorRequest.getArrivalLocation().getLongitude());
           urbanDriverTrafficRequest.setDestLat(vtcComparatorRequest.getArrivalLocation().getLatitude());
           return urbanDriverTrafficRequest;


        }

    };

    public static Function<VTCComparatorRequest, UrbanDriverRequest> VTCComparatorRequestToUrbanDriverRequest
            = new Function<VTCComparatorRequest, UrbanDriverRequest>() {
        @Override
        public UrbanDriverRequest apply(VTCComparatorRequest vtcComparatorRequest) {

            UrbanDriverRequest urbanDriverRequest = new UrbanDriverRequest();
            urbanDriverRequest.setDepLng(vtcComparatorRequest.getDepartureLocation().getLongitude());
            urbanDriverRequest.setDepLat(vtcComparatorRequest.getDepartureLocation().getLatitude());
            urbanDriverRequest.setLocale("fr");
            return urbanDriverRequest;


        }

    };
    // traffic request 4alta
    // te5ou 2 params /direction endpoint
    public static Function<VTCComparatorRequest, TrafficRequest> VTCComparatorRequestTodirections
            = new Function<VTCComparatorRequest, TrafficRequest>() {
        @Override
        public TrafficRequest apply(VTCComparatorRequest vtcComparatorRequest) {

            TrafficRequest Tr = new TrafficRequest();
            String params1 = vtcComparatorRequest.getDepartureLocation().getLatitude().toString()+","+vtcComparatorRequest.getDepartureLocation().getLongitude().toString();
            String params2 = vtcComparatorRequest.getArrivalLocation().getLatitude().toString()+","+vtcComparatorRequest.getArrivalLocation().getLongitude().toString();

            return null;


        }

    };
    public static Function<VTCComparatorRequest, PassengerRequestsRequest> VTCComparatorRequestTopassenger_requests
            = new Function<VTCComparatorRequest, PassengerRequestsRequest>() {
        @Override
        public PassengerRequestsRequest apply(VTCComparatorRequest vtcComparatorRequest) {

            PassengerRequestsRequest Tr = new PassengerRequestsRequest();
            Address ad1 = new Address ();
            ad1.setLong(vtcComparatorRequest.getDepartureLocation().getLongitude());
            ad1.setLat(vtcComparatorRequest.getDepartureLocation().getLatitude());
            ad1.setName(vtcComparatorRequest.getDepartureLocation().getAddress());
            Tr.setAddress_pick_up(ad1);
            Addresss ad2= new Addresss ();
            ad2.setLat(vtcComparatorRequest.getArrivalLocation().getLatitude());
            ad2.setlong(vtcComparatorRequest.getArrivalLocation().getLongitude());
            ad2.setName(vtcComparatorRequest.getArrivalLocation().getAddress());
            Tr.setAddress_drop_off(ad2);

            Tr.setType(1);
            Tr.setChannel(2);

            return Tr;


        }

    };
    // vvvehicule type   4alta
    // te5ou 3 params /direction endpoint
    /**
     lat www long mta3 depart
     lat:48.8476217
     locale:fr
     long:2.361093

     **/
    public static Function<VTCComparatorRequest, PassengerRequestsRequest> VTCComparatorRequestToVehicleType
            = new Function<VTCComparatorRequest, PassengerRequestsRequest>() {
        @Override
        public PassengerRequestsRequest apply(VTCComparatorRequest vtcComparatorRequest) {


            return null;


        }

    };
}
