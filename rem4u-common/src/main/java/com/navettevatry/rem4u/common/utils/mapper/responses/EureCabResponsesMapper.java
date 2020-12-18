package com.navettevatry.rem4u.common.utils.mapper.responses;

import com.navettevatry.rem4u.common.resources.dto.EureCab.*;
import com.navettevatry.rem4u.common.resources.dto.EureCab.CompanyResult.CompanyResponse;
import com.navettevatry.rem4u.common.resources.dto.standard.Vehicle;
import com.navettevatry.rem4u.common.resources.dto.standard.*;
import com.navettevatry.rem4u.common.resources.enumeration.eurecab.EureCabProvider;
import com.navettevatry.rem4u.common.resources.enumeration.standard.ComfortType;
import com.navettevatry.rem4u.common.resources.enumeration.standard.VTCPlatformName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class EureCabResponsesMapper {

    public static VTCComparatorResponse euroCabResponseToVTCComparatorResponse(EuroCabResponse euroCabResponse
            , VTCComparatorResponse vtcComparatorResponse){

        if(vtcComparatorResponse == null)
            vtcComparatorResponse = new VTCComparatorResponse(null,
                    null,
                    null,
                    null,
                    null,
                    new ArrayList<>());
        if(euroCabResponse != null){
            for(ResultsDatum resultsData : euroCabResponse.getResults().getData()){
                vtcComparatorResponse.getOffers().add(
                        new Offer(getVTCPlatform(resultsData.getId()),
                                new Driver(
                                        resultsData.getName(),
                                        null,
                                        resultsData.getProfilePic(),
                                        resultsData.getRankScore()
                                ),
                                new Vehicle(
                                        resultsData.getVehicle().getModel(),
                                        resultsData.getVehicle().getPassenger().intValue(),
                                        resultsData.getVehicle().getLuggage().intValue(),
                                        resultsData.getCarSeat(),
                                        false,
                                        getComfortType(resultsData.getVehicle().getTypeLabel()),
                                        null
//                                        (float) QuantiteCo2Total.Ztotal(resultsData.getVehicle().getPassenger().intValue(), getComfortType(resultsData.getVehicle().getTypeLabel()))
                                ),
                                new Price("EUR",resultsData.getPriceFinal()),
                                euroCabResponse.getValueShortDelay()
                        ));
            }

            for(CentralsDatum resultsData : euroCabResponse.getCentrals().getData()){
                for(VehiclesDatum vehicle : resultsData.getVehicles().getData()){
                    vtcComparatorResponse.getOffers().add(
                            new Offer(getVTCPlatform(resultsData.getId()),
                                    new Driver(
                                            null,
                                            null,
                                            resultsData.getProfilePic(),
                                            resultsData.getVoteAverage()
                                    ),
                                    new Vehicle(
                                            null,
                                            vehicle.getNbPassenger(),
                                            vehicle.getNbLuggage(),
                                            resultsData.getCarSeat(),
                                            false,
                                            getComfortType(vehicle.getTypeLiteral()),
                                            null
//                                            (float) QuantiteCo2Total.Ztotal(vehicle.getNbPassenger(), getComfortType(vehicle.getTypeLiteral()))
                                    ),
                                    new Price("EUR", Float.parseFloat(vehicle.getModPrice())),
                                    euroCabResponse.getValueShortDelay(),
                                    null,
                                    null,
                                    null,
                                    null
                            ));
                }
            }
        }

        return vtcComparatorResponse;
    }


    public static VTCComparatorResponse companyResponseToVTCComparatorResponse(CompanyResponse companyResponse
            , VTCComparatorResponse vtcComparatorResponse){

        if(vtcComparatorResponse == null)
            vtcComparatorResponse = new VTCComparatorResponse(null,
                    null,
                    null,
                    null,
                    null,
                    new ArrayList<>());
        if(companyResponse != null){

        }

        return vtcComparatorResponse;
    }

    protected static VTCPlatformName getVTCPlatform(Integer providerId){
        Optional<EureCabProvider> optionalEureCabProvider = Arrays.stream(EureCabProvider.values())
                .filter( eureCabProvider -> eureCabProvider.getProviderId().equals(providerId))
                .findFirst();
        if(optionalEureCabProvider.isPresent()){
            return VTCPlatformName.valueOf(optionalEureCabProvider.get().name());
        }
        return VTCPlatformName.COMPANY;
    }

    protected static ComfortType getComfortType(TypeL comfortType){
        if(comfortType.getType().equals(TypeL.AFFAIRES.getType()))
            return ComfortType.BUSINESS;
        else if(comfortType.getType().equals(TypeL.ECONOMIQUE.getType()))
            return ComfortType.ECO;
        else if(comfortType.getType().equals(TypeL.MOTO.getType()))
            return ComfortType.STANDARD;
        else if(comfortType.getType().equals(TypeL.VAN_7_PLACES.getType()))
            return ComfortType.STANDARD;
        else
            return ComfortType.ECO;
    }
}
