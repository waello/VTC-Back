package com.navettevatry.rem4u.comparator.platforms;

import com.navettevatry.rem4u.common.resources.dto.allocab.TripCreateRequest;
import com.navettevatry.rem4u.common.resources.dto.allocab.TripCreateResponse;
import com.navettevatry.rem4u.common.resources.dto.marcel.MarcelREquest;
import com.navettevatry.rem4u.common.resources.dto.marcel.Welcome;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorRequest;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorResponse;
import com.navettevatry.rem4u.common.utils.mapper.requests.AlloCabRequestsMapper;
import com.navettevatry.rem4u.common.utils.mapper.responses.AlloCabResponsesMapper;
import com.navettevatry.rem4u.common.utils.restclient.RestTemplateBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.CompletableFuture;

/**
 * Le Cab needed APIs Service Class
 * Created by Ahmed ferjani.
 * Updated by Chakib Daii.
 */

@Service
public class MarcelService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MarcelService.class);

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
        LOGGER.debug("[MarcelService] PostConsruct");
        this.httpHeaders = new HttpHeaders();
        this.httpHeaders.setContentType(MediaType.APPLICATION_JSON);
    }

    /**
     * Asynchronous Method to use to get Marcel response
     * @param vtcComparatorRequest
     * @return @{@link CompletableFuture<VTCComparatorResponse>}
     */
    //TODO: test & verify
    @Async
    public CompletableFuture<VTCComparatorResponse> getMarcelResponseAsync(VTCComparatorRequest vtcComparatorRequest) throws Exception {
        LOGGER.debug("[MarcelService] getMarcelResponseAsync");
        final long start = System.currentTimeMillis();

        VTCComparatorResponse vtcComparatorResponse = null;
        try{
//            vtcComparatorResponse = MarcelResponsesMapper
//                .tripCreateRequestToVTCComparatorResponse(
//                        this.CreateTrip(MarcelRequestsMapper
//                                .VTCComparatorRequestToTripCreateRequest.apply(vtcComparatorRequest)),
//                        null);
        }catch (Exception e){ LOGGER.debug(e.toString()); }

        LOGGER.debug("[MarcelService] Elapsed time: {}", (System.currentTimeMillis() - start));

        return CompletableFuture.completedFuture(vtcComparatorResponse);
    }

    /**
     * Asynchronous Method to use to get Marcel response
     * @param vtcComparatorRequest
     * @return @{@link VTCComparatorResponse}
     */
    public VTCComparatorResponse getMarcelResponse(VTCComparatorRequest vtcComparatorRequest){
        LOGGER.debug("[MarcelService] getMarcelResponse");
        final long start = System.currentTimeMillis();

        VTCComparatorResponse vtcComparatorResponse = null;

        try{
//            vtcComparatorResponse = MarcelResponsesMapper
//                .tripCreateRequestToVTCComparatorResponse(
//                        this.CreateTrip(MarcelRequestsMapper
//                                .VTCComparatorRequestToTripCreateRequest.apply(vtcComparatorRequest)),
//                        null);
        }catch (Exception e){ LOGGER.debug(e.toString()); }

        LOGGER.debug("[MarcelService] Elapsed time: {}", (System.currentTimeMillis() - start));

        return vtcComparatorResponse;
    }

    //TODO: change request
    public Welcome marcelEstimate (MarcelREquest tripCreateRequest) {
        LOGGER.debug("[MarcelService] MarcelEstimate");

//        String uri = getUri("");
        String uri = "https://api.classnco.com/api/v3/Marcel/customers/1144406/passenger_requests?locale=fr";
        this.httpHeaders = new HttpHeaders();
        this.httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        this.httpHeaders.put("Connection", Collections.singletonList("keep-alive"));
        this.httpHeaders.put("Accept", Arrays.asList("application/json", "text/plain", "/"));
        this.httpHeaders.put("Authorization", Collections.singletonList("eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2MDQ5OTY3ODgsImZyb250X2VuZF91c2VyIjp7ImlkIjoxMTUxMTQ3LCJjdXN0b21lcl9pZCI6MTE0NDQwNiwiZmlyc3RfbmFtZSI6Ik1heXNzYSIsImxhc3RfbmFtZSI6IkJlbiBrYWhsYSJ9LCJpYXQiOjE2MDQ5NTY3ODgsImp3dF92YWxpZGl0eV90b2tlbiI6IjA2N2VhNTg4ZTk1OWZlN2I0MGZlODIwMzk0ZWNlMDQwIiwic2NvcGUiOiJhcGlfdjMiLCJzdWIiOiJmcm9udF9lbmRfdXNlciJ9.D1ojbCUHPDu2b-RW5JNRMG6fI446ZWOIeszsDLB6pg4WoOwjbu4znbbqHga3nVUrVCRZuCEwjqxGS5K1JYATrJ8WDf3DN44foE-4JTntK_Y7WZVK4rW6xYoEP73ywaLAceRTicviYAmI0o3v7QfrPQ7dZDKr99yUoFGUi2BEX5A"));
        this.httpHeaders.put("Origin", Collections.singletonList("https://reservation.marcel.cab"));
        this.httpHeaders.put("Sec-Fetch-Site", Collections.singletonList("cross-site"));
        this.httpHeaders.put("Sec-Fetch-Mode", Collections.singletonList("cors"));
        this.httpHeaders.put("Sec-Fetch-Dest", Collections.singletonList("empty"));
        this.httpHeaders.put("Referer", Collections.singletonList("https://reservation.marcel.cab/"));
        this.httpHeaders.put("Accept-Language", Arrays.asList("fr-FR","fr;q=0.9","en-US;q=0.8","en;q=0.7"));

        HttpEntity<MarcelREquest> entity = new HttpEntity<>(tripCreateRequest , RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<Welcome> tripCreateResponseResponse=
                apisRestTemplate.exchange(uri, HttpMethod.POST, entity, Welcome.class);
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
