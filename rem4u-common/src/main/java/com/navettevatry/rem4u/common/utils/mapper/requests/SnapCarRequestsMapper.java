package com.navettevatry.rem4u.common.utils.mapper.requests;

import com.navettevatry.rem4u.common.resources.dto.snapcar.BookingPricesRequest;
import com.navettevatry.rem4u.common.resources.dto.snapcar.InfoRequest;
import com.navettevatry.rem4u.common.resources.dto.snapcar.updated.SnapCarRequest;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorRequest;

import java.util.function.Function;

/**
 *
 * Created by Chakib Daii.
 * Updated by Wael Jlassi and Chakib DAII
 */
public class SnapCarRequestsMapper {
    //new
    public static Function<VTCComparatorRequest, SnapCarRequest> VTCComparatorRequestTosnapCarRequest
            = new Function<VTCComparatorRequest, SnapCarRequest>() {
        @Override
        public SnapCarRequest apply(VTCComparatorRequest vtcComparatorRequest) {
            SnapCarRequest SnapCarRequest = new SnapCarRequest();
            SnapCarRequest.setStart_lat(vtcComparatorRequest.getDepartureLocation().getLatitude());
            SnapCarRequest.setStart_lng(vtcComparatorRequest.getDepartureLocation().getLongitude());
            SnapCarRequest.setEnd_lat(vtcComparatorRequest.getArrivalLocation().getLatitude());
            SnapCarRequest.setEnd_lng(vtcComparatorRequest.getArrivalLocation().getLongitude());
            //TODO: Set NameBoard

            return SnapCarRequest;
        }

    };




    public static Function<VTCComparatorRequest, BookingPricesRequest> VTCComparatorRequestToBookingPricesRequest
            = new Function<VTCComparatorRequest, BookingPricesRequest>() {
        @Override
        public BookingPricesRequest apply(VTCComparatorRequest vtcComparatorRequest) {
            BookingPricesRequest bookingPricesRequest = new BookingPricesRequest();
            bookingPricesRequest.setStartLatitude(vtcComparatorRequest.getDepartureLocation().getLatitude());
            bookingPricesRequest.setStartLongitude(vtcComparatorRequest.getDepartureLocation().getLongitude());
            bookingPricesRequest.setEndLatitude(vtcComparatorRequest.getArrivalLocation().getLongitude());
            bookingPricesRequest.setEndLongitude(vtcComparatorRequest.getArrivalLocation().getLongitude());
            bookingPricesRequest.setDate(vtcComparatorRequest.getDate());
            //TODO: Set NameBoard
            bookingPricesRequest.setNameBoard(null);

            return bookingPricesRequest;
        }

    };

    public static Function<VTCComparatorRequest, InfoRequest> VTCComparatorRequestToInfoRequest
            = new Function<VTCComparatorRequest, InfoRequest>() {
        @Override
        public InfoRequest apply(VTCComparatorRequest vtcComparatorRequest) {
            InfoRequest infoRequest = new InfoRequest();
            infoRequest.setLatitude(vtcComparatorRequest.getDepartureLocation().getLatitude());
            infoRequest.setLongitude(vtcComparatorRequest.getDepartureLocation().getLongitude());
            return infoRequest;
        }

    };

    /**
     public static Function<VTCComparatorRequest, ETAResult> VTCComparatorRequestToETAResult
     = new Function<VTCComparatorRequest, ETAResult>() {
    @Override
    public ETAResult apply(VTCComparatorRequest vtcComparatorRequest) {
    ETAResult ETAResult = new ETAResult();
    // lkol a verifier
    ETAResult.setEta(0);
    ETAResult.setService_class(null);
    ETAResult.setStatus("");
    return ETAResult;
    }

    };
     public static Function<VTCComparatorRequest, SpecialArea> VTCComparatorRequestToSpecialArea
     = new Function<VTCComparatorRequest, SpecialArea>() {
    @Override
    public SpecialArea apply(VTCComparatorRequest vtcComparatorRequest) {
    SpecialArea SpecialArea = new SpecialArea();
    // lkol a verifier
    SpecialArea.setArea_type(null);
    SpecialArea.setId(null);
    SpecialArea.setMeeting_points(null);
    SpecialArea.setMeeting_points_nameboard(null);
    SpecialArea.setMenu_name(null);
    SpecialArea.setSelection_required(null);
    return SpecialArea;
    }

    };
     **/
}
