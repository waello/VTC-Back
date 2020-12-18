package com.navettevatry.rem4u.common.utils.mapper.requests;

import com.navettevatry.rem4u.common.resources.dto.EureCab.CompanyResult.CompanyRequest;
import com.navettevatry.rem4u.common.resources.dto.EureCab.EuroCabRequest;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorRequest;

import java.util.function.Function;

public class EureCabRequestsMapper {

    public static Function<VTCComparatorRequest, EuroCabRequest>  VTCComparatorRequestToEuroCabRequest
            = new Function<VTCComparatorRequest, EuroCabRequest>() {

        @Override
        public EuroCabRequest apply(VTCComparatorRequest vtcComparatorRequest) {
            EuroCabRequest euroCabRequest = new EuroCabRequest();
//            euroCabRequest.setTypeVehicle(vtcComparatorRequest.getTripOptions().getFavoriteCarBrand());
            euroCabRequest.setFrom(vtcComparatorRequest.getDepartureLocation().getAddress());
            euroCabRequest.setTo(vtcComparatorRequest.getArrivalLocation().getAddress());
            euroCabRequest.setDate(vtcComparatorRequest.getDate());
            return euroCabRequest;
        }
    };


    public static Function<VTCComparatorRequest, CompanyRequest>  VTCComparatorRequestToCompanyRequest
            = new Function<VTCComparatorRequest, CompanyRequest>() {

        @Override
        public CompanyRequest apply(VTCComparatorRequest vtcComparatorRequest) {
            CompanyRequest companyRequest =  new CompanyRequest();
            companyRequest.setFrom(vtcComparatorRequest.getDepartureLocation().getAddress());
            companyRequest.setTo(vtcComparatorRequest.getArrivalLocation().getAddress());
            companyRequest.setDate(vtcComparatorRequest.getDate());
            return companyRequest;
        }
    };
}
