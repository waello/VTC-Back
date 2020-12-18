package com.navettevatry.rem4u.comparator.platforms;

import com.navettevatry.rem4u.common.resources.dto.allocab.TripCreateRequest;
import com.navettevatry.rem4u.common.resources.dto.allocab.TripCreateResponse;
import com.navettevatry.rem4u.common.resources.dto.allocab.updated.AloCabRequest;
import com.navettevatry.rem4u.common.resources.dto.allocab.updated.AloCabResponse;
import com.navettevatry.rem4u.common.resources.dto.lecab.LocationsSearchRequest;
import com.navettevatry.rem4u.common.resources.dto.lecab.LocationsSearchResponse;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorRequest;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorResponse;
import com.navettevatry.rem4u.common.utils.mapper.requests.AlloCabRequestsMapper;
import com.navettevatry.rem4u.common.utils.mapper.responses.AlloCabResponsesMapper;
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
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

/**
 * Le Cab needed APIs Service Class
 * Created by Ahmed ferjani.
 * Updated by Chakib Daii.
 */

@Service
public class AlloCabService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AlloCabService.class);

    @Value("${allo-cab.base-url}")
    private String BASE_URL;
    @Value("${allo-cab.client-id}")
    private String CLIENT_ID;
    @Value("${allo-cab.client-secret}")
    private String CLIENT_SECRET;
    @Value("${allo-cab.server-token}")
    private String SERVER_TOKEN;

    @Autowired
    protected RestTemplate apisRestTemplate;

    protected HttpHeaders httpHeaders;

    @PostConstruct()
    void init() {
        LOGGER.debug("[AlloCabService] PostConsruct");
        this.httpHeaders = new HttpHeaders();
        this.httpHeaders.setContentType(MediaType.APPLICATION_JSON);
    }

    /**
     * Asynchronous Method to use to get allocab response
     * @param vtcComparatorRequest
     * @return @{@link CompletableFuture<VTCComparatorResponse>}
     */
    //TODO: test & verify
    @Async
    public CompletableFuture<VTCComparatorResponse> getAlloCabResponseAsync(VTCComparatorRequest vtcComparatorRequest) throws Exception {
        LOGGER.debug("[AlloCabService] getAlloCabResponseAsync");
        final long start = System.currentTimeMillis();

        VTCComparatorResponse vtcComparatorResponse = null;
       /** try{
            vtcComparatorResponse = AlloCabResponsesMapper
                .tripCreateRequestToVTCComparatorResponse(
                        this.CreateTrip(AlloCabRequestsMapper
                                .VTCComparatorRequestToTripCreateRequest.apply(vtcComparatorRequest)),
                        null);
        }catch (Exception e){ LOGGER.debug(e.toString()); }**/


        try{
            vtcComparatorResponse = AlloCabResponsesMapper
                    .tripCreateRequestToVTCComparatorResponse(
                            this.createBooking(AlloCabRequestsMapper
                                    .VTCComparatorRequestToAlloCabREquest.apply(vtcComparatorRequest)),
                            null);
        }catch (Exception e){ LOGGER.debug(e.toString()); }

        LOGGER.debug("[AlloCabService] Elapsed time: {}", (System.currentTimeMillis() - start));

        return CompletableFuture.completedFuture(vtcComparatorResponse);
    }

    /**
     * Asynchronous Method to use to get allocab response
     * @param vtcComparatorRequest
     * @return @{@link VTCComparatorResponse}
     */
    public VTCComparatorResponse getAlloCabResponse(VTCComparatorRequest vtcComparatorRequest){
        LOGGER.debug("[AlloCabService] getAlloCabResponse");
        final long start = System.currentTimeMillis();

        VTCComparatorResponse vtcComparatorResponse = null;

      /**  try{
            vtcComparatorResponse = AlloCabResponsesMapper
                .tripCreateRequestToVTCComparatorResponse(
                        this.CreateTrip(AlloCabRequestsMapper
                                .VTCComparatorRequestToTripCreateRequest.apply(vtcComparatorRequest)),
                        null);
        }catch (Exception e){ LOGGER.debug(e.toString()); }**/

      try{
            vtcComparatorResponse = AlloCabResponsesMapper
                .tripCreateRequestToVTCComparatorResponse(
                        this.createBooking(AlloCabRequestsMapper
                                .VTCComparatorRequestToAlloCabREquest.apply(vtcComparatorRequest)),
                        null);
        }catch (Exception e){ LOGGER.debug(e.toString()); }

        LOGGER.debug("[AlloCabService] Elapsed time: {}", (System.currentTimeMillis() - start));

        return vtcComparatorResponse;
    }

    /**
     *
     * @param tripCreateRequest
     * @return @{@link TripCreateResponse}
     */
    public TripCreateResponse CreateTrip (TripCreateRequest tripCreateRequest) {
        LOGGER.debug("[AlloCabService] CreateTrip");
        String uri = getUri("");
        HttpEntity<TripCreateRequest> entity = new HttpEntity<>(tripCreateRequest , RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<TripCreateResponse> tripCreateResponseResponse=
                apisRestTemplate.exchange(uri, HttpMethod.POST, entity, TripCreateResponse.class);
        return  tripCreateResponseResponse.getBody();
    }

    public AloCabResponse createBooking (AloCabRequest tripCreateRequest) {
        LOGGER.debug("[AlloCabService] CreateTrip");
//        String uri = getUri("");
        String uri = "https://www.allocab.com/api/passenger/v3/booking/create";

        this.httpHeaders = new HttpHeaders();
        MediaType mediaType = MediaType.parseMediaType("application/json");
        this.httpHeaders.setContentType( mediaType);
        this.httpHeaders.put("accept", Collections.singletonList("*/*"));
        this.httpHeaders.put("origin", Collections.singletonList("https://www.allocab.com"));
        this.httpHeaders.put("sec-fetch-site", Collections.singletonList("same-origin"));
        this.httpHeaders.put("sec-fetch-mode", Collections.singletonList("cors"));
        this.httpHeaders.put("sec-fetch-dest", Collections.singletonList("empty"));
        this.httpHeaders.put("accept-language", Arrays.asList("fr-FR","fr;q=0.9","en-US;q=0.8","en;q=0.7"));

        HttpEntity<AloCabRequest> entity = new HttpEntity<>(tripCreateRequest , RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<AloCabResponse> tripCreateResponseResponse=
                apisRestTemplate.exchange(uri, HttpMethod.POST, entity, AloCabResponse.class);
        return  tripCreateResponseResponse.getBody();
    }

    /**
     * @param service
     * @return @{@link String}
     */
    protected String getUri(String service) {
        return this.BASE_URL + "/" + service;
    }

}
