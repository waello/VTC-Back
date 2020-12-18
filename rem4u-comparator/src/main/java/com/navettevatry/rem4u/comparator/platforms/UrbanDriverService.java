package com.navettevatry.rem4u.comparator.platforms;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorRequest;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorResponse;
import com.navettevatry.rem4u.common.resources.dto.uber.updated.Estimate;
import com.navettevatry.rem4u.common.resources.dto.urbanDriver.*;
import com.navettevatry.rem4u.common.utils.mapper.requests.UrbainRequestMapper;
import com.navettevatry.rem4u.common.utils.mapper.responses.UrbnResponseMapper;
import com.navettevatry.rem4u.common.utils.restclient.RestTemplateBuilder;
import org.apache.commons.lang3.StringEscapeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.*;
import java.util.concurrent.CompletableFuture;

/**
 * Le Cab needed APIs Service Class
 * Created by Ahmed ferjani.
 * Updated by Chakib Daii.
 */

@Service
public class UrbanDriverService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UrbanDriverService.class);

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
    protected HttpHeaders httpHeadersd;

    @PostConstruct()
    void init() {
        LOGGER.debug("[UrbanDriverService] PostConsruct");
        this.httpHeaders = new HttpHeaders();
        this.httpHeaders.setContentType(MediaType.APPLICATION_JSON);
    }

    /**
     * Asynchronous Method to use to get UrbanDriver response
     * @param vtcComparatorRequest
     * @return @{@link CompletableFuture<VTCComparatorResponse>}
     */
    //TODO: test & verify
    @Async
    public CompletableFuture<VTCComparatorResponse> getUrbanDriverResponseAsync(VTCComparatorRequest vtcComparatorRequest) throws Exception {
        LOGGER.debug("[UrbanDriverService] getUrbanDriverResponseAsync");
        final long start = System.currentTimeMillis();

        VTCComparatorResponse vtcComparatorResponse = null;

        try{
            vtcComparatorResponse = UrbnResponseMapper
                    . VehicleTypeToVTCComparatorResponse(
                            this.urbanDriver0(UrbainRequestMapper
                                    .VTCComparatorRequestTopassenger_requests.apply(vtcComparatorRequest)),
                            null);
        }catch (Exception e){ LOGGER.debug(e.toString()); }

        LOGGER.debug("[UrbanDriverService] Elapsed time: {}", (System.currentTimeMillis() - start));

        return CompletableFuture.completedFuture(vtcComparatorResponse);
    }

    /**
     * Asynchronous Method to use to get UrbanDriver response
     * @param vtcComparatorRequest
     * @return @{@link VTCComparatorResponse}
     */
    public VTCComparatorResponse getUrbanDriverResponse(VTCComparatorRequest vtcComparatorRequest){
        LOGGER.debug("[UrbanDriverService] getUrbanDriverResponse");
        final long start = System.currentTimeMillis();

        VTCComparatorResponse vtcComparatorResponse = null;
//
//        try{
//            vtcComparatorResponse = UrbnResponseMapper
//                .urbanTrafficToVTCComparatorResponse(
//                        this.urbanDriverTraffic(UrbainRequestMapper
//                                .VTCComparatorRequestToRequest.apply(vtcComparatorRequest)),
//                        null);
//        }catch (Exception e){ LOGGER.debug(e.toString()); }


        try{
            vtcComparatorResponse = UrbnResponseMapper
                    . VehicleTypeToVTCComparatorResponse(
                            this.urbanDriver0(UrbainRequestMapper
                                    .VTCComparatorRequestTopassenger_requests.apply(vtcComparatorRequest)),
                            null);
        }catch (Exception e){ LOGGER.debug(e.toString()); }

        LOGGER.debug("[UrbanDriverService] Elapsed time: {}", (System.currentTimeMillis() - start));

        return vtcComparatorResponse;
    }

    //TODO: change request
    public TrafficResponse urbanDriverTraffic (UrbanDriverTrafficRequest urbanDriverTrafficRequest) {
        LOGGER.debug("[UrbanDriverService] UrbanDriverEstimate");

//        String uri = getUri("");
        String uri = "https://api.classnco.com/api/v3/Urbandriver/directions?" +
                "destination="+ urbanDriverTrafficRequest.getDestLat()+"," + urbanDriverTrafficRequest.getDestlng()+
                "&origin="+ urbanDriverTrafficRequest.getDepLat()+","+ urbanDriverTrafficRequest.getDepLng();

        this.httpHeaders = new HttpHeaders();
        this.httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        this.httpHeaders.put("Connection", Collections.singletonList("keep-alive"));
        this.httpHeaders.put("Accept", Arrays.asList("application/json", "text/plain", "*/*"));
        this.httpHeaders.put("Origin", Collections.singletonList("https://urbandriver.yusofleet.com"));
        this.httpHeaders.put("Sec-Fetch-Site", Collections.singletonList("cross-site"));
        this.httpHeaders.put("Sec-Fetch-Mode", Collections.singletonList("cors"));
        this.httpHeaders.put("Sec-Fetch-Dest", Collections.singletonList("empty"));
        this.httpHeaders.put("Referer", Collections.singletonList("https://urbandriver.yusofleet.com/"));
        this.httpHeaders.put("Accept-Language", Arrays.asList("fr-FR","fr;q=0.9","en-US;q=0.8","en;q=0.7"));
        this.httpHeaders.put("If-None-Match", Collections.singletonList("W/\"7918165bff38169763e0b5b029ff0882\""));

        HttpEntity entity = new HttpEntity<>(RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<TrafficResponse> tripCreateResponseResponse=
                apisRestTemplate.exchange(uri, HttpMethod.GET, entity, TrafficResponse.class);

            return  tripCreateResponseResponse.getBody();
    }

    public List<VehiculeResponse> urbanDriver (UrbanDriverRequest urbanDriverRequest) {
        LOGGER.debug("[UrbanDriverService] UrbanDriverEstimate");

//        String uri = getUri("");
        String uri = "https://api.classnco.com/api/v3/Urbandriver/vehicle_types?lat="+urbanDriverRequest.getDepLat()+"&long="+urbanDriverRequest.getDepLng();

        this.httpHeaders = new HttpHeaders();
        this.httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        this.httpHeaders.put("Connection", Collections.singletonList("keep-alive"));
        this.httpHeaders.put("Accept", Arrays.asList("application/json", "text/plain", "*/*"));
        this.httpHeaders.put("User-Agent", Collections.singletonList("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.183 Safari/537.36"));
        this.httpHeaders.put("Origin", Collections.singletonList("https://urbandriver.yusofleet.com"));
        this.httpHeaders.put("Sec-Fetch-Site", Collections.singletonList("cross-site"));
        this.httpHeaders.put("Sec-Fetch-Mode", Collections.singletonList("cors"));
        this.httpHeaders.put("Sec-Fetch-Dest", Collections.singletonList("empty"));
        this.httpHeaders.put("Referer", Collections.singletonList("https://urbandriver.yusofleet.com/"));
        this.httpHeaders.put("Accept-Language", Arrays.asList("fr-FR","fr;q=0.9","en-US;q=0.8","en;q=0.7"));
        this.httpHeaders.put("If-None-Match", Collections.singletonList("W/\"ab4fd759b05f3a3f50d9b2c94adcc33a\""));

        HttpEntity entity = new HttpEntity<>(RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<VehiculeResponse[]> tripCreateResponseResponse=
                apisRestTemplate.exchange(uri, HttpMethod.GET, entity, VehiculeResponse[].class);

        LOGGER.info(String.valueOf(tripCreateResponseResponse.getStatusCode()));

        return  Arrays.asList(tripCreateResponseResponse.getBody());
    }
    public List<PassengerRequestsResponse> urbanDriver0 (PassengerRequestsRequest passengerRequestsRequest) throws JsonProcessingException {
        LOGGER.debug("[UrbanDriverService] UrbanDriverEstimate");

//        String uri = getUri("");
        String uri = "https://api.classnco.com/api/v3/Urbandriver/vehicle_types?lat="+passengerRequestsRequest.getAddress_pick_up().getLat()+"&long="+passengerRequestsRequest.getAddress_pick_up().getLong();

        this.httpHeaders = new HttpHeaders();
        this.httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        this.httpHeaders.put("Connection", Collections.singletonList("keep-alive"));
        this.httpHeaders.put("Accept", Arrays.asList("application/json", "text/plain", "*/*"));
        this.httpHeaders.put("User-Agent", Collections.singletonList("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.183 Safari/537.36"));
        this.httpHeaders.put("Origin", Collections.singletonList("https://urbandriver.yusofleet.com"));
        this.httpHeaders.put("Sec-Fetch-Site", Collections.singletonList("cross-site"));
        this.httpHeaders.put("Sec-Fetch-Mode", Collections.singletonList("cors"));
        this.httpHeaders.put("Sec-Fetch-Dest", Collections.singletonList("empty"));
        this.httpHeaders.put("Referer", Collections.singletonList("https://urbandriver.yusofleet.com/"));
        this.httpHeaders.put("Accept-Language", Arrays.asList("fr-FR","fr;q=0.9","en-US;q=0.8","en;q=0.7"));
        this.httpHeaders.put("If-None-Match", Collections.singletonList("W/\"ab4fd759b05f3a3f50d9b2c94adcc33a\""));
        List<PassengerRequestsResponse> o = new ArrayList<>();
        HttpEntity entity = new HttpEntity<>(RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<VehiculeResponse[]> tripCreateResponseResponse=
                apisRestTemplate.exchange(uri, HttpMethod.GET, entity, VehiculeResponse[].class);
        for (VehiculeResponse Estim : Arrays.asList(tripCreateResponseResponse.getBody())){
            passengerRequestsRequest.setvehicle_type(Estim);
            ObjectMapper mapper = new ObjectMapper();
                String json = mapper.writeValueAsString(passengerRequestsRequest);


            String uri0 = "https://api.classnco.com/api/v3/Urbandriver/passenger_requests?locale=fr";

            this.httpHeadersd = new HttpHeaders();
            this.httpHeadersd.put("Connection", Collections.singletonList("keep-alive"));
            this.httpHeadersd.put("Content-Type", Collections.singletonList("application/json;charset=UTF-8"));
            this.httpHeadersd.put("User-Agent", Collections.singletonList("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.183 Safari/537.36"));
            this.httpHeadersd.put("Origin", Collections.singletonList("https://urbandriver.yusofleet.com"));
            this.httpHeadersd.put("Sec-Fetch-Site", Collections.singletonList("cross-site"));
            this.httpHeadersd.put("Sec-Fetch-Mode", Collections.singletonList("cors"));
            this.httpHeadersd.put("Sec-Fetch-Dest", Collections.singletonList("empty"));
            this.httpHeadersd.put("Referer", Collections.singletonList("https://urbandriver.yusofleet.com/"));
            this.httpHeadersd.put("Accept-Language", Arrays.asList("fr-FR","fr;q=0.9","en-US;q=0.8","en;q=0.7"));
            this.httpHeadersd.put("If-None-Match", Collections.singletonList("W/\"ab4fd759b05f3a3f50d9b2c94adcc33a\""));

            HttpEntity<String> entity0 = new HttpEntity<>(StringEscapeUtils.unescapeJava(json),RestTemplateBuilder.getHeaders(this.httpHeadersd));
            ResponseEntity<PassengerRequestsResponse> ghhhh=
                    apisRestTemplate.exchange(uri0, HttpMethod.POST, entity0, PassengerRequestsResponse.class);

o.add(ghhhh.getBody());


        }

        LOGGER.info(String.valueOf(tripCreateResponseResponse.getStatusCode()));

        return  o;
    }
    public PassengerRequestsResponse urbanDriverPassengerRequest (String tripCreateRequest) {
        LOGGER.debug("[UrbanDriverService] UrbanDriverEstimate");
        LOGGER.debug("");

//        String uri = getUri("");
        String uri = "https://api.classnco.com/api/v3/Urbandriver/passenger_requests?locale=fr";

        this.httpHeaders = new HttpHeaders();
        this.httpHeaders.put("Connection", Collections.singletonList("keep-alive"));
        this.httpHeaders.put("Content-Type", Collections.singletonList("application/json;charset=UTF-8"));
        this.httpHeaders.put("User-Agent", Collections.singletonList("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.183 Safari/537.36"));
        this.httpHeaders.put("Origin", Collections.singletonList("https://urbandriver.yusofleet.com"));
        this.httpHeaders.put("Sec-Fetch-Site", Collections.singletonList("cross-site"));
        this.httpHeaders.put("Sec-Fetch-Mode", Collections.singletonList("cors"));
        this.httpHeaders.put("Sec-Fetch-Dest", Collections.singletonList("empty"));
        this.httpHeaders.put("Referer", Collections.singletonList("https://urbandriver.yusofleet.com/"));
        this.httpHeaders.put("Accept-Language", Arrays.asList("fr-FR","fr;q=0.9","en-US;q=0.8","en;q=0.7"));
        this.httpHeaders.put("If-None-Match", Collections.singletonList("W/\"ab4fd759b05f3a3f50d9b2c94adcc33a\""));

        HttpEntity<String> entity = new HttpEntity<>(tripCreateRequest,RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<PassengerRequestsResponse> tripCreateResponseResponse=
                apisRestTemplate.exchange(uri, HttpMethod.POST, entity, PassengerRequestsResponse.class);
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
