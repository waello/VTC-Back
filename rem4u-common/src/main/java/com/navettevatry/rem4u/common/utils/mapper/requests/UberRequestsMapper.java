package com.navettevatry.rem4u.common.utils.mapper.requests;

import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorRequest;
import com.navettevatry.rem4u.common.resources.dto.uber.*;
import com.navettevatry.rem4u.common.resources.dto.uber.PickupTimeEstimateRequest;
import com.navettevatry.rem4u.common.resources.dto.uber.PriceEstimatesPromotionRequest;
import com.navettevatry.rem4u.common.resources.dto.uber.updated.*;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 *
 * Created by Chakib Daii.
 * Updated by Wael Jlassi and Chakib DAII
 */
public class UberRequestsMapper {
    //updated
    public static Function<VTCComparatorRequest, UberRequest> VTCComparatorRequestToUberRequest
            = new Function<VTCComparatorRequest, UberRequest>() {
        @Override
        public UberRequest apply(VTCComparatorRequest vtcComparatorRequest) {
//            OkHttpClient client = new OkHttpClient().newBuilder()
//                    .build();
//            Request request = new Request.Builder()
//                    .url("https://maps.googleapis.com/maps/api/geocode/json?latlng="+vtcComparatorRequest.getDepartureLocation().getLatitude()+","+vtcComparatorRequest.getDepartureLocation().getLongitude()+"&key=AIzaSyDkJjmwF0PRX3IKKGwIn3v8j4uoHvjnWl0")
//                    .method("GET", null)
//                    .addHeader("authority", "maps.googleapis.com")
//                    .addHeader("cache-control", "max-age=0")
//                    .addHeader("upgrade-insecure-requests", "1")
//                    .addHeader("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.138 Safari/537.36 OPR/68.0.3618.150")
//                    .addHeader("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
//                    .addHeader("sec-fetch-site", "none")
//                    .addHeader("sec-fetch-mode", "navigate")
//                    .addHeader("sec-fetch-user", "?1")
//                    .addHeader("sec-fetch-dest", "document")
//                    .addHeader("accept-language", "en-US,en;q=0.9,fr;q=0.8")
//                    .build();
//            try {
//                 Response response = client.newCall(request).execute();
//                System.out.println("wael");
//                System.out.println(response.body().contentType().toString());
//
//                System.out.println(response.body().string());
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }

            UberRequest uberRequest = new UberRequest();
            PickupLocation p = new PickupLocation();
            Destination d = new Destination();
            List<String> departureAddressSplit = Arrays.asList(vtcComparatorRequest.getDepartureLocation().getAddress().split(","));
            p.setAddressLine1(departureAddressSplit.get(0));
            p.setAddressLine2(vtcComparatorRequest.getDepartureLocation().getAddress());
            p.setLatitude(vtcComparatorRequest.getDepartureLocation().getLatitude());
            p.setLongitude(vtcComparatorRequest.getDepartureLocation().getLongitude());
            p.setID(vtcComparatorRequest.getArrivalLocation().getId());
            p.setProvider("google_places");
            p.setLocale("fr");
            uberRequest.setPickupLocation(p);
            uberRequest.setLocale("fr-FR");

            List<String> destinationAddressSplit = Arrays.asList(vtcComparatorRequest.getArrivalLocation().getAddress().split(","));
            d.setAddressLine1(destinationAddressSplit.get(0));
            d.setAddressLine2(vtcComparatorRequest.getArrivalLocation().getAddress());
//            d.setLatitude(vtcComparatorRequest.getArrivalLocation().getLatitude());
//            d.setLongitude(vtcComparatorRequest.getArrivalLocation().getLongitude());
            d.setID(vtcComparatorRequest.getArrivalLocation().getId());
            d.setProvider("google_places");
            d.setLocale("fr-FR");
            uberRequest.setDestination(d);
//            UberRequestStatus uberRequestStatus = new UberRequestStatus();
//            StatusStatus statusStatus = new StatusStatus();
//            statusStatus.setMetadata();
//            uberRequestStatus.setStatus();
//            uberRequest.setStatus();
            System.out.println("rayen"+uberRequest.getDestination().getID());
            return uberRequest;
        }

    };

    public static Function<VTCComparatorRequest, PriceEstimatesPromotionRequest> VTCComparatorRequestToPriceEstimatesPromotionRequest
            = new Function<VTCComparatorRequest, PriceEstimatesPromotionRequest>() {
        @Override
        public PriceEstimatesPromotionRequest apply(VTCComparatorRequest vtcComparatorRequest) {
            PriceEstimatesPromotionRequest priceEstimatesPromotionRequest = new PriceEstimatesPromotionRequest();
            priceEstimatesPromotionRequest.setStartLatitude(vtcComparatorRequest.getDepartureLocation().getLatitude());
            priceEstimatesPromotionRequest.setStartLongitude(vtcComparatorRequest.getDepartureLocation().getLongitude());
            priceEstimatesPromotionRequest.setEndLatitude(vtcComparatorRequest.getArrivalLocation().getLatitude());
            priceEstimatesPromotionRequest.setEndLongitude(vtcComparatorRequest.getArrivalLocation().getLongitude());

            return priceEstimatesPromotionRequest;
        }

    };
    public static Function<VTCComparatorRequest, PickupTimeEstimateRequest> VTCComparatorRequestToPickupTimeEstimateRequest
            = new Function<VTCComparatorRequest, PickupTimeEstimateRequest>() {
        @Override
        public PickupTimeEstimateRequest apply(VTCComparatorRequest vtcComparatorRequest) {
            PickupTimeEstimateRequest pickupTimeEstimateRequest = new PickupTimeEstimateRequest();
            pickupTimeEstimateRequest.setStartLatitude(vtcComparatorRequest.getDepartureLocation().getLatitude());
            pickupTimeEstimateRequest.setStartLongitude(vtcComparatorRequest.getDepartureLocation().getLongitude());
            //TODO: Set Product Id
            pickupTimeEstimateRequest.setProductId(null);
            return pickupTimeEstimateRequest;
        }

    };

}
