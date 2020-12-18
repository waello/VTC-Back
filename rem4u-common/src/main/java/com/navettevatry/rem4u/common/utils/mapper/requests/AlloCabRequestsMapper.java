package com.navettevatry.rem4u.common.utils.mapper.requests;

import com.navettevatry.rem4u.common.resources.dto.allocab.Trip;
import com.navettevatry.rem4u.common.resources.dto.allocab.TripCreateRequest;
import com.navettevatry.rem4u.common.resources.dto.allocab.updated.AloCabRequest;
import com.navettevatry.rem4u.common.resources.dto.allocab.updated.Direction;
import com.navettevatry.rem4u.common.resources.dto.allocab.updated.Position;
import com.navettevatry.rem4u.common.resources.dto.allocab.updated.Session;
import com.navettevatry.rem4u.common.resources.dto.lecab.JobsSearchRequest;
import com.navettevatry.rem4u.common.resources.dto.lecab.LocationRequest;
import com.navettevatry.rem4u.common.resources.dto.lecab.LocationsSearchRequest;
import com.navettevatry.rem4u.common.resources.dto.allocab.*;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorRequest;

import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;

/**
 *
 * Created by Chakib Daii.
 * Updated by Wael Jlassi and Chakib DAII
 */
public class AlloCabRequestsMapper {


    //new
    public static Function<VTCComparatorRequest, AloCabRequest> VTCComparatorRequestToAlloCabREquest
            = new Function<VTCComparatorRequest, AloCabRequest>() {
        @Override
        public AloCabRequest apply(VTCComparatorRequest vtcComparatorRequest) {
            AloCabRequest aloCabRequest = new AloCabRequest();
            aloCabRequest.setSession(new Session(5935629444071424l,
                    UUID.fromString("a7f0a5c8-1943-4351-aafc-f0b01e13ec13"),
                    UUID.fromString("7b19e707-2b58-4c29-bba4-4c1b58408604"),
                    "ag5zfmFsbG9jYWItcHJvZHIuCxIQUGFzc2VuZ2VyYWNjb3VudBiAgP6B5sbhCwwLEgRVc2VyGICA_qHKy9UIDA",
                    "Passenger"
            ));
            Direction fdepart = new Direction();
            Position pdepart = new Position();
            fdepart.setFormattedAddress(vtcComparatorRequest.getDepartureLocation().getAddress());
//            fdepart.setType(vtcComparatorRequest.getTripType().getTripType().getType());

            pdepart.setLat(vtcComparatorRequest.getDepartureLocation().getLatitude());
            pdepart.setLng(vtcComparatorRequest.getDepartureLocation().getLongitude());
            pdepart.setLat(vtcComparatorRequest.getDepartureLocation().getLatitude());
            pdepart.setLng(vtcComparatorRequest.getDepartureLocation().getLongitude());
            fdepart.setPosition(pdepart);

            Direction farriv = new Direction();
            Position parriv = new Position();
            farriv.setFormattedAddress(vtcComparatorRequest.getArrivalLocation().getAddress());
//            farriv.setType(vtcComparatorRequest.getTripType().getTripType().getType());

            parriv.setLat(vtcComparatorRequest.getArrivalLocation().getLatitude());
            parriv.setLng(vtcComparatorRequest.getArrivalLocation().getLongitude());
            parriv.setLat(vtcComparatorRequest.getArrivalLocation().getLatitude());
            parriv.setLng(vtcComparatorRequest.getArrivalLocation().getLongitude());
            farriv.setPosition(parriv);

            List<Direction> ls = new ArrayList<>();
            ls.add(fdepart);

            ls.add(farriv);
            aloCabRequest.setPeriod(0);
            aloCabRequest.setDepartureAt(vtcComparatorRequest.getDate());
            aloCabRequest.setDirection(ls);
            aloCabRequest.setReception(false);
            aloCabRequest.setSource("WEBAPPV3");
            //TODO: Set NameBoard

            return aloCabRequest;
        }

    };



    public static Function<VTCComparatorRequest, TripCreateRequest> VTCComparatorRequestToTripCreateRequest
            = new Function<VTCComparatorRequest, TripCreateRequest>() {


        @Override
        public TripCreateRequest apply(VTCComparatorRequest vtcComparatorRequest) {
            TripCreateRequest tripCreateRequest = new TripCreateRequest();
            try {
                tripCreateRequest.setTrip(
                        new Trip(vtcComparatorRequest.getDepartureLocation().getAddress(),
                                vtcComparatorRequest.getArrivalLocation().getAddress(),
                                vtcComparatorRequest.getDate(),
                                null,//TODO : Set Vehicle : Optional
                                null /*vtcComparatorRequest.getTripType().getTripNumber()*/));
                //TODO: Set api key
                tripCreateRequest.setAccess(null);
            }catch(Exception e){System.out.println("error in mapping request "+e.getMessage());}
            return tripCreateRequest;
        }

    };

}
