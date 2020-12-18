package com.navettevatry.rem4u.common.utils.mapper.responses;
import com.navettevatry.rem4u.common.resources.dto.EureCab.TypeL;
import com.navettevatry.rem4u.common.resources.dto.allocab.updated.AloCabResponse;
import com.navettevatry.rem4u.common.resources.dto.allocab.updated.Quotation;
import com.navettevatry.rem4u.common.resources.dto.standard.*;
import com.navettevatry.rem4u.common.resources.enumeration.standard.ComfortType;
import com.navettevatry.rem4u.common.resources.enumeration.standard.VTCPlatformName;
import com.navettevatry.rem4u.common.utils.enrichers.averageValue.BlocSansMarqueEconomique;

import java.util.ArrayList;
import java.util.Random;


/**
 *
 * Created by Chakib Daii.
 */
public class AlloCabResponsesMapper {

    public static VTCComparatorResponse tripCreateRequestToVTCComparatorResponse(AloCabResponse aloCabResponse
            , VTCComparatorResponse vtcComparatorResponse) {

        try{
            if (vtcComparatorResponse == null)
                vtcComparatorResponse = new VTCComparatorResponse(null,
                        null,
                        null,
                        null,
                        null,
                        new ArrayList<>());

            if (aloCabResponse != null) {
                //TODO: we can get Arrival and departure from VTCrequest
//            vtcComparatorResponse.setDepartureLocation(
//                    new VTCLocation(null, null, null,
//                            tripCreateResponse.getTrip() != null ? tripCreateResponse.getTrip().getPickUpAddress() : null));
//            vtcComparatorResponse.setArrivalLocation(
//                    new VTCLocation(null, null, null,
//                            tripCreateResponse.getTrip() != null ? tripCreateResponse.getTrip().getDropOffAddress() : null));
//            vtcComparatorResponse.setDate(tripCreateResponse.getTrip() != null ? tripCreateResponse.getTrip().getDepartureAt() : null);
//            vtcComparatorResponse.setEstimatedDistance(tripCreateResponse.getTrip() != null ? tripCreateResponse.getTrip().getDistance() : null);
//            vtcComparatorResponse.setEstimatedTime(tripCreateResponse.getTrip() != null ? Math.round(tripCreateResponse.getTrip().getDuration()) : null);
                //TODO: refine Offer with enricherrs
//            vtcComparatorResponse.getOffers().add(
//                    new Offer(VTCPlatformName.ALLOCAB,
//                            new Driver(null, null, null, null),
//                            new Vehicle(null, null, null, null, null, ComfortType.STANDARD, (float) BlocSansMarqueEconomique.getAverageValue()),
//                            new Price("EURO", tripCreateResponse.getTrip() != null ? tripCreateResponse.getTrip().getPrice() : null),
//                            null,
//                            new VTCLocation(null, null, null, tripCreateResponse.getTrip() != null ? tripCreateResponse.getTrip().getPickUpAddress() : null),
//                            new VTCLocation(null, null, null, tripCreateResponse.getTrip() != null ? tripCreateResponse.getTrip().getDropOffAddress() : null),
//                            tripCreateResponse.getTrip() != null ? tripCreateResponse.getTrip().getDistance() : null,
//                            tripCreateResponse.getTrip() != null ? Math.round(tripCreateResponse.getTrip().getDuration()) : null));
                for(Quotation quotation : aloCabResponse.getResult().getQuotations()){
                    vtcComparatorResponse.getOffers().add(
                            new Offer(VTCPlatformName.ALLOCAB,
                                    new Driver(null, null, null, null),
                                    new Vehicle(null,
//                                    quotation.getName() != null ? quotation.getName()  : null,
                                            (int) quotation.getNbPassengers(), (int) quotation.getNbBagages(),
                                            null, null,
                                            getComfortType(quotation.getName()),
                                            (float) BlocSansMarqueEconomique.getAverageValue()),
                                    new Price(quotation.getPrice().getTotal().getCurrency() != null ? quotation.getPrice().getTotal().getCurrency() : null,
                                            (quotation.getPrice()) != null ? ((float) quotation.getPrice().getTotal().getAmountWithTax()/100) : null),
                                    (int) quotation.getPrice().getWaitingMinutes(),
                                    new VTCLocation(null, (float) aloCabResponse.getResult().getDirectionResume().getStart().getPosition().getLat(),
                                            (float) aloCabResponse.getResult().getDirectionResume().getStart().getPosition().getLng(),aloCabResponse.getResult().getDirectionResume()!= null ?aloCabResponse.getResult().getDirectionResume().getStart().getFormattedAddress() : null),
                                    new VTCLocation(null, (float) aloCabResponse.getResult().getDirectionResume().getEnd().getPosition().getLat(), (float) aloCabResponse.getResult().getDirectionResume().getEnd().getPosition().getLng(), aloCabResponse.getResult().getDirectionResume()!= null ? aloCabResponse.getResult().getDirectionResume().getEnd().getFormattedAddress() : null),
                                    aloCabResponse.getResult().getDirectionResume() != null ? (float)aloCabResponse.getResult().getDirectionResume().getDistance() : null,
                                    aloCabResponse.getResult().getDirectionResume() != null ? Math.round(aloCabResponse.getResult().getDirectionResume().getDuration()) : null));
                }
            }
        }catch(Exception e){System.out.println("error in mapping response "+e.getMessage());}
        return vtcComparatorResponse;
    }


    protected static ComfortType getComfortType(String comfortType){
        if(comfortType.equals("Berline classe affaires"))
            return ComfortType.BERLIN;
        else if(comfortType.equals("X_TO_X"))
            return ComfortType.STANDARD;
        else if(comfortType.equals("Van classe éco"))
            return ComfortType.ECO;
        else
            return ComfortType.ECO;
    }

}
