package com.navettevatry.rem4u.comparator.platforms;

import com.navettevatry.rem4u.common.resources.dto.lecab.LocationsSearchRequest;
import com.navettevatry.rem4u.common.resources.dto.lecab.LocationsSearchResponse;
import com.navettevatry.rem4u.common.resources.dto.olacab.RideBooking;
import com.navettevatry.rem4u.common.resources.dto.olacab.RideBookingRequest;
import com.navettevatry.rem4u.common.resources.dto.olacab.RideEstimateRequest;
import com.navettevatry.rem4u.common.resources.dto.olacab.RideEstimateResponse;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorRequest;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorResponse;
import com.navettevatry.rem4u.common.utils.mapper.requests.OlaCabRequestsMapper;
import com.navettevatry.rem4u.common.utils.mapper.responses.OlaCabResponsesMapper;
import com.navettevatry.rem4u.common.utils.response.GenericResponse;
import com.navettevatry.rem4u.common.utils.response.body.ObjectResponse;
import com.navettevatry.rem4u.common.utils.restclient.CustomRestTemplate;
import com.navettevatry.rem4u.common.utils.restclient.RestTemplateBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;


/**
 * OlaCab needed APIs Service Class
 * Created by jlassi wael
 * Updated by Chakib Daii.
 */

@Service
public class OlaCabService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OlaCabService.class);

    @Value("${ola-cab.base-url}")
    private String BASE_URL;
    @Value("${ola-cab.client-id}")
    private String CLIENT_ID;
    @Value("${ola-cab.client-secret}")
    private String CLIENT_SECRET;
    @Value("${ola-cab.server-token}")
    private String SERVER_TOKEN;

    @Autowired
    protected RestTemplate apisRestTemplate;

    protected HttpHeaders httpHeaders;

    @PostConstruct()
    void init() {
        LOGGER.debug("[OlaCabService] Post Construct");
        this.httpHeaders = new HttpHeaders();
        this.httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        //add headers based on the API
    }

    /**
     * Asynchronous Method to use to get OlaCab response
     * @param vtcComparatorRequest
     * @return @{@link CompletableFuture<VTCComparatorResponse>}
     */
    //TODO: test & verify
    @Async
    public CompletableFuture<VTCComparatorResponse> getOlaCabResponseAsync(VTCComparatorRequest vtcComparatorRequest) throws Exception {
        LOGGER.debug("[AlloCabService] getAlloCabResponseAsync");
        final long start = System.currentTimeMillis();

        VTCComparatorResponse vtcComparatorResponse = null;
        try{
            vtcComparatorResponse = OlaCabResponsesMapper
                .rideEstimateResponseToVTCComparatorResponse(
                        this.getRideEstimate(OlaCabRequestsMapper.VTCComparatorRequestToRideEstimateRequest.apply(vtcComparatorRequest)),
                null);
        }catch (Exception e){ LOGGER.debug(e.toString()); }

        LOGGER.debug("[AlloCabService] Elapsed time: {}", (System.currentTimeMillis() - start));
        return CompletableFuture.completedFuture(vtcComparatorResponse);
    }

    /**
     * Method to use to get OlaCab response
     * @param vtcComparatorRequest
     * @return @{@link VTCComparatorResponse}
     */
    public VTCComparatorResponse getOlaCabResponse(VTCComparatorRequest vtcComparatorRequest) throws Exception {
        LOGGER.debug("[AlloCabService] getAlloCabResponse");
        final long start = System.currentTimeMillis();

        VTCComparatorResponse vtcComparatorResponse = null;
        try{
            vtcComparatorResponse = OlaCabResponsesMapper
                .rideEstimateResponseToVTCComparatorResponse(
                        this.getRideEstimate(OlaCabRequestsMapper.VTCComparatorRequestToRideEstimateRequest.apply(vtcComparatorRequest)),
                        null);
        }catch (Exception e){ LOGGER.debug(e.toString()); }

        LOGGER.debug("[AlloCabService] Elapsed time: {}", (System.currentTimeMillis() - start));
        return vtcComparatorResponse;
    }

        /**
         * get ride estimate
         * @param rideEstimateRequest
         * @return @{@link RideEstimateResponse}
         */
    public RideEstimateResponse getRideEstimate(RideEstimateRequest rideEstimateRequest){
        LOGGER.debug("[OlaCabService] getRideEstimate");
        String uri = getUri("v1/products") + "/";
        HttpEntity entity = new HttpEntity<>(RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<RideEstimateResponse> rideEstimateResponseResponse =
                apisRestTemplate.exchange(uri, HttpMethod.GET, entity, RideEstimateResponse.class);
        return  rideEstimateResponseResponse.getBody();
    }

    /**
     * get Ride bookings
     * @param rideBookingRequest
     * @return @{@link RideBooking}
     */
    public RideBooking RideBookingPost(RideBookingRequest rideBookingRequest){
        LOGGER.debug("[OlaCabService] Cab Ride Booking");
        String uri = getUri("v1.5/bookings/create") + "/" ;
        HttpEntity entity = new HttpEntity<>(RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<RideBooking> rideBookingResponse =
                apisRestTemplate.exchange(uri, HttpMethod.GET, entity, RideBooking.class);
        return  rideBookingResponse.getBody();
    }

    /**
     *
     * @param service
     * @return @{@link String}
     */
    protected String getUri(String service) {
        return this.BASE_URL + "/" + service;
    }

}
