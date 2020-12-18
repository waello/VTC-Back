package com.navettevatry.rem4u.comparator.platforms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.navettevatry.rem4u.common.resources.dto.lecab.*;
import com.navettevatry.rem4u.common.resources.dto.lecab.updated.estimate.EstimateRequest;
import com.navettevatry.rem4u.common.resources.dto.lecab.updated.estimate.EstimateResponse;
import com.navettevatry.rem4u.common.resources.dto.lecab.updated.price.PriceRequest;
import com.navettevatry.rem4u.common.resources.dto.lecab.updated.price.PriceResponse;
import com.navettevatry.rem4u.common.resources.dto.snapcar.SpecialArea;
import com.navettevatry.rem4u.common.resources.dto.standard.Price;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorRequest;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorResponse;
import com.navettevatry.rem4u.common.utils.mapper.requests.LeCabRequestsMapper;
import com.navettevatry.rem4u.common.utils.mapper.responses.LeCabResponsesMapper;
import com.navettevatry.rem4u.common.utils.response.GenericResponse;
import com.navettevatry.rem4u.common.utils.response.body.ObjectResponse;
import com.navettevatry.rem4u.common.utils.restclient.CustomRestTemplate;
import com.navettevatry.rem4u.common.utils.restclient.RestTemplateBuilder;
import okhttp3.OkHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

/**
 * Le Cab needed APIs Service Class
 * Created by Chakib Daii.
 */

@Service
public class LeCabService {

    private static final Logger LOGGER = LoggerFactory.getLogger(LeCabService.class);

//    @Autowired
//    ObjectMapper mapper;

//    @Value("${le-cab.test-base-url}")
    @Value("${le-cab.production-base-url}")
    private String BASE_URL;
    @Value("${le-cab.test-api-key}")
    private String TEST_API_KEY;
    @Value("${le-cab.client-id}")
    private String CLIENT_ID;
    @Value("${le-cab.client-secret}")
    private String CLIENT_SECRET;
    @Value("${le-cab.server-token}")
    private String SERVER_TOKEN;

//    protected CustomRestTemplate customRestTemplate;
    @Autowired
    protected RestTemplate apisRestTemplate;

    protected HttpHeaders httpHeaders;

    @PostConstruct()
    void init() {
        LOGGER.debug("[LeCabService] Post Construct");
//        this.customRestTemplate = new CustomRestTemplate();
        this.httpHeaders = new HttpHeaders();
        this.httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        //add headers based on the API
//        this.httpHeaders.put("Authorization", Collections.singletonList("X-Api-Key " + this.TEST_API_KEY)); //API key authentication
        //Or
        //this.httpHeaders.put("Authorization", "Bearer "+this.SERVER_TOKEN); //OAuth 2.0 authentication

        LOGGER.debug(this.httpHeaders.values().toString());
    }

    /**
     * Asynchromous Method to use to get LeCab response
     * @param vtcComparatorRequest
     * @return @{@link CompletableFuture<VTCComparatorResponse>}
     */
    //TODO: test & verify
    @Async
    public CompletableFuture<VTCComparatorResponse> getLeCabResponseAsync(VTCComparatorRequest vtcComparatorRequest) throws Exception {
        LOGGER.debug("[LeCabService] getAlloCabResponseAsync");
        final long start = System.currentTimeMillis();

        VTCComparatorResponse vtcComparatorResponse = null;
        try{
            vtcComparatorResponse = LeCabResponsesMapper
                .locationsSearchResponseToVTCComparatorResponse(
                        this.searchLocations(LeCabRequestsMapper.VTCComparatorRequestToLocationsSearchRequest.apply(vtcComparatorRequest))
                ,null);
        }catch (Exception e){ LOGGER.debug(e.toString()); }

        //TODO: verify use
        try{
            vtcComparatorResponse = LeCabResponsesMapper
                    .locationsSearchResponseToVTCComparatorResponse(
                            this.presetLocations(LeCabRequestsMapper.VTCComparatorRequestToLocationsPresetRequest.apply(vtcComparatorRequest))
                            ,vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        try{
            vtcComparatorResponse = LeCabResponsesMapper
                    .servicesAvailableResponseToVTCComparatorResponse(
                            this.availableServices(LeCabRequestsMapper.VTCComparatorRequestToServicesAvailableRequest.apply(vtcComparatorRequest))
                            ,vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        try{
            vtcComparatorResponse = LeCabResponsesMapper
                    .servicesEstimateResponseToVTCComparatorResponse(
                            this.servicesEstimate(LeCabRequestsMapper.VTCComparatorRequestToServicesEstimateRequest.apply(vtcComparatorRequest))
                            ,vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        try{
            vtcComparatorResponse = LeCabResponsesMapper
                    .jobsSearchResponseToVTCComparatorResponse(
                            this.jobsSearch(LeCabRequestsMapper.VTCComparatorRequestToJobsSearchRequest.apply(vtcComparatorRequest))
                            ,vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        try{
            vtcComparatorResponse = LeCabResponsesMapper
                    .jobsEstimateResponseToVTCComparatorResponse(
                            this.jobsEstimate(LeCabRequestsMapper.VTCComparatorRequestToJobsEstimateRequest.apply(vtcComparatorRequest))
                            ,vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        try{
            vtcComparatorResponse = LeCabResponsesMapper
                    .jobsEstimateResponseToVTCComparatorResponse(
                            this.jobsQuote(LeCabRequestsMapper.VTCComparatorRequestToJobsEstimateRequest.apply(vtcComparatorRequest))
                            ,vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }

        LOGGER.debug("[LeCabService] Elapsed time: {}", (System.currentTimeMillis() - start));

        return CompletableFuture.completedFuture(vtcComparatorResponse);
    }

    /**
     * Method to use to get LeCab response
     * @param vtcComparatorRequest
     * @return @{@link VTCComparatorResponse}
     */
    public VTCComparatorResponse getLeCabResponse(VTCComparatorRequest vtcComparatorRequest){
        LOGGER.debug("[LeCabService] getAlloCabResponse");
        final long start = System.currentTimeMillis();

        VTCComparatorResponse vtcComparatorResponse = null;
        try {
            vtcComparatorResponse = LeCabResponsesMapper
                    .locationsSearchResponseToVTCComparatorResponse(
                            this.searchLocations(LeCabRequestsMapper.VTCComparatorRequestToLocationsSearchRequest.apply(vtcComparatorRequest))
                            , null);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        //TODO: verify use
        try{
            vtcComparatorResponse = LeCabResponsesMapper
                    .locationsSearchResponseToVTCComparatorResponse(
                            this.presetLocations(LeCabRequestsMapper.VTCComparatorRequestToLocationsPresetRequest.apply(vtcComparatorRequest))
                            ,vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        try{
            vtcComparatorResponse = LeCabResponsesMapper
                    .servicesAvailableResponseToVTCComparatorResponse(
                            this.availableServices(LeCabRequestsMapper.VTCComparatorRequestToServicesAvailableRequest.apply(vtcComparatorRequest))
                            ,vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        try{
            vtcComparatorResponse = LeCabResponsesMapper
                    .servicesEstimateResponseToVTCComparatorResponse(
                            this.servicesEstimate(LeCabRequestsMapper.VTCComparatorRequestToServicesEstimateRequest.apply(vtcComparatorRequest))
                            ,vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        try{
            vtcComparatorResponse = LeCabResponsesMapper
                    .jobsSearchResponseToVTCComparatorResponse(
                            this.jobsSearch(LeCabRequestsMapper.VTCComparatorRequestToJobsSearchRequest.apply(vtcComparatorRequest))
                            ,vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        try{
            vtcComparatorResponse = LeCabResponsesMapper
                    .jobsEstimateResponseToVTCComparatorResponse(
                            this.jobsEstimate(LeCabRequestsMapper.VTCComparatorRequestToJobsEstimateRequest.apply(vtcComparatorRequest))
                            ,vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        try{
            vtcComparatorResponse = LeCabResponsesMapper
                    .jobsEstimateResponseToVTCComparatorResponse(
                            this.jobsQuote(LeCabRequestsMapper.VTCComparatorRequestToJobsEstimateRequest.apply(vtcComparatorRequest))
                            ,vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }

        LOGGER.debug("[LeCabService] Elapsed time: {}", (System.currentTimeMillis() - start));

        return vtcComparatorResponse;
    }
        /**
        * This method allows you to search for a set of locations
        * by address (usually used for autocomplete feature) or a precise location by coordinates or id.
        * @param locationsSearchRequest
        * @return @{@link LocationsSearchResponse}
        */
    public LocationsSearchResponse searchLocations(LocationsSearchRequest locationsSearchRequest){
        LOGGER.debug("[LeCabService] searchLocations");
        String uri = getUri("locations/search") /*+ "/"*/;
        HttpEntity<LocationsSearchRequest> entity = new HttpEntity<>(locationsSearchRequest , RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<LocationsSearchResponse> locationsSearchResponse =
                apisRestTemplate.exchange(uri, HttpMethod.POST, entity, LocationsSearchResponse.class);
        return  locationsSearchResponse.getBody();
    }

    /**
     * Get Preset locations
     * @param locationsPresetRequest
     * @return @{@link LocationsSearchResponse}
     */
    public LocationsSearchResponse presetLocations(LocationsPresetRequest locationsPresetRequest){
        LOGGER.debug("[LeCabService] presetLocations");
        String uri = getUri("locations/preset") /*+ "/"*/;
        HttpEntity<LocationsPresetRequest> entity = new HttpEntity<>(locationsPresetRequest , RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<LocationsSearchResponse> locationsSearchResponse =
                apisRestTemplate.exchange(uri, HttpMethod.POST, entity, LocationsSearchResponse.class);
        return  locationsSearchResponse.getBody();
    }

    /**
     * Get Available Services
     * @param servicesAvailableRequest
     * @return @{@link ServicesAvailableResponse}
     */
    public ServicesAvailableResponse availableServices(ServicesAvailableRequest servicesAvailableRequest){
        LOGGER.debug("[LeCabService] availableServices");
        String uri = getUri("services/available") /*+ "/"*/;
        HttpEntity<ServicesAvailableRequest> entity = new HttpEntity<>(servicesAvailableRequest , RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<ServicesAvailableResponse> servicesAvailableResponseResponse =
                apisRestTemplate.exchange(uri, HttpMethod.POST, entity, ServicesAvailableResponse.class);
        return  servicesAvailableResponseResponse.getBody();
    }


    /**
     * Get Services estimations
     * @param servicesEstimateRequest
     * @return @{@link ServicesEstimateResponse}
     */
    public ServicesEstimateResponse servicesEstimate(ServicesEstimateRequest servicesEstimateRequest){
        LOGGER.debug("[LeCabService] servicesEstimate");
        String uri = getUri("services/estimate") /*+ "/"*/;
        HttpEntity<ServicesEstimateRequest> entity = new HttpEntity<>(servicesEstimateRequest , RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<ServicesEstimateResponse> servicesEstimateResponseResponse =
                apisRestTemplate.exchange(uri, HttpMethod.POST, entity, ServicesEstimateResponse.class);
        return  servicesEstimateResponseResponse.getBody();
    }


    /**
     * Search for jobs
     * @param jobsSearchRequest
     * @return @{@link JobsSearchResponse}
     */
    public JobsSearchResponse jobsSearch(JobsSearchRequest jobsSearchRequest){
        LOGGER.debug("[LeCabService] jobsSearch");
        String uri = getUri("jobs/search") /*+ "/"*/;
        HttpEntity<JobsSearchRequest> entity = new HttpEntity<>(jobsSearchRequest , RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<JobsSearchResponse> jobsSearchResponseResponse =
                apisRestTemplate.exchange(uri, HttpMethod.POST, entity, JobsSearchResponse.class);
        return  jobsSearchResponseResponse.getBody();
    }


    /**
     * Get Jobs Estimates
     * @param jobsEstimateRequest
     * @return @{@link JobsEstimateResponse}
     */
    public JobsEstimateResponse jobsEstimate(JobsEstimateRequest jobsEstimateRequest){
        LOGGER.debug("[LeCabService] jobsEstimate");
        String uri = getUri("jobs/estimate") /*+ "/"*/;
        HttpEntity<JobsEstimateRequest> entity = new HttpEntity<>(jobsEstimateRequest , RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<JobsEstimateResponse> jobsEstimateResponseResponse =
                apisRestTemplate.exchange(uri, HttpMethod.POST, entity, JobsEstimateResponse.class);
        return  jobsEstimateResponseResponse.getBody();

    }

    /**
     * Get Jobs Estimates
     * @param jobsEstimateRequest
     * @return
     */
    public EstimateResponse estimate(EstimateRequest jobsEstimateRequest){
        LOGGER.debug("[LeCabService] jobsEstimate");
        this.httpHeaders = new HttpHeaders();
        this.httpHeaders.setContentType(MediaType.APPLICATION_JSON);
//        this.httpHeaders.put("authority", Collections.singletonList("api.lecab.fr"));
        this.httpHeaders.put("accept", Collections.singletonList("*/*"));
//        this.httpHeaders.put("origin", Collections.singletonList("https://www.lecab.fr"));
        this.httpHeaders.put("sec-fetch-site", Collections.singletonList("same-site"));
        this.httpHeaders.put("sec-fetch-mode", Collections.singletonList("cors"));
        this.httpHeaders.put("sec-fetch-dest", Collections.singletonList("empty"));
//        this.httpHeaders.put("referer", Collections.singletonList("https://www.lecab.fr/"));
        this.httpHeaders.put("accept-language", Arrays.asList("fr-FR","fr;q=0.9","en-US;q=0.8","en;q=0.7"));
//        this.httpHeaders.put("cookie", Collections.singletonList("__cfduid=df690b96ca0bb6113657dfb9637af669d1604880604"));

        String uri = getUri("jobs/estimate") /*+ "/"*/;
        HttpEntity<EstimateRequest> entity = new HttpEntity<>(jobsEstimateRequest , RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<EstimateResponse> jobsEstimateResponseResponse =
                apisRestTemplate.exchange(uri, HttpMethod.POST, entity, EstimateResponse.class);
        return  jobsEstimateResponseResponse.getBody();

    }

    public PriceResponse calculatePrice(PriceRequest priceRequest){
        LOGGER.debug("[LeCabService] jobsEstimate");
//        String uri = getUri("jobs/estimate") /*+ "/"*/;
        String uri = "https://book.lecab.fr/sherbook/calculate/price";
        this.httpHeaders = new HttpHeaders();
        this.httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        this.httpHeaders.put("authority", Collections.singletonList("book.lecab.fr"));
        this.httpHeaders.put("accept", Arrays.asList("application/json", "text/plain", "*/*"));
        this.httpHeaders.put("api-version", Collections.singletonList("2.3"));
        this.httpHeaders.put("session-token", Collections.singletonList("eyJhbGciOiJIUzUxMiJ9.eyJDTElFTlRfVFlQRSI6IldQIiwiUkFORE9NIjoiZmRiMjIwNmYtMTE2NC00NGI5LTg5MWMtNjM4YWJkOWJlMmIxIiwiQ1VTVE9NRVJfVFlQRSI6IlJFVEFJTCIsIlNFU1NJT05fSU5GT19JRCI6IjA1ZmRjOGUwLWUyNjgtMThmMi00ZTg2LWRlNTVlMzk3NzVjMiIsIlRZUEUiOiJhY2Nlc3MiLCJSRUZSRVNIX1RPS0VOX0lEIjoiNTg2MGIzMjctNWVkZi00MTI0LTkxOTUtOTk3NjJmZTZjMjliIn0.o5w5-lvEbCVVsA36o4uuS_fAvqN_xSoMdokDgfQAhVA2sb_cdxSKu4tq0LPPH1KnbS2Z7QuZwZZaYnevG0B4gQ"));
        this.httpHeaders.put("origin", Collections.singletonList("https://book.lecab.fr"));
        this.httpHeaders.put("referer", Collections.singletonList("https://book.lecab.fr/portal/?source=https%3A%2F%2Fwww.lecab.fr%2F"));
        this.httpHeaders.put("accept-language", Arrays.asList("fr-FR","fr;q=0.9","en-US;q=0.8","en;q=0.7"));

        HttpEntity<PriceRequest> entity = new HttpEntity<>(priceRequest , RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<PriceResponse> priceResponseResponseEntity =
                apisRestTemplate.exchange(uri, HttpMethod.POST, entity, PriceResponse.class);
        return  priceResponseResponseEntity.getBody();
    }

    /**
     * Get Jobs Estimates (Quote)
     * @param jobsEstimateRequest
     * @return @{@link JobsEstimateResponse}
     */
    public JobsEstimateResponse jobsQuote(JobsEstimateRequest jobsEstimateRequest){
        LOGGER.debug("[LeCabService] jobsQuote");
        String uri = getUri("jobs/quote") /*+ "/"*/;
        HttpEntity<JobsEstimateRequest> entity = new HttpEntity<>(jobsEstimateRequest , RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<JobsEstimateResponse> jobsEstimateResponseResponse =
                apisRestTemplate.exchange(uri, HttpMethod.POST, entity, JobsEstimateResponse.class);
        return  jobsEstimateResponseResponse.getBody();
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
