package com.navettevatry.rem4u.comparator.platforms;

import com.navettevatry.rem4u.common.resources.dto.bcvtc.EstimationRequest;
import com.navettevatry.rem4u.common.resources.dto.kapten.EstimatedPriceRequest;
import com.navettevatry.rem4u.common.resources.dto.kapten.EstimatedPriceResponseSuccess;
import com.navettevatry.rem4u.common.resources.dto.kapten.WaitingTimeRequest;
import com.navettevatry.rem4u.common.resources.dto.kapten.WaitingTimeResponseSuccess;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorRequest;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorResponse;
import com.navettevatry.rem4u.common.utils.mapper.requests.KaptenRequestsMapper;
import com.navettevatry.rem4u.common.utils.mapper.responses.KaptenResponsesMapper;
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
import java.util.Collections;
import java.util.concurrent.CompletableFuture;

/**
 * Kapted needed APIs Service Class
 * Created by Ahmed Ferjani.
 * Updated by Chakib DAII
 */

@Service
public class KaptenService {

    private static final Logger LOGGER = LoggerFactory.getLogger(KaptenService.class);

    @Value("${kapten.base-url}")
    private String BASE_URL;
    @Value("${kapten.client-id}")
    private String CLIENT_ID;
    @Value("${kapten.client-secret}")
    private String CLIENT_SECRET;
    @Value("${kapten.server-token}")
    private String SERVER_TOKEN;

    @Autowired
    protected RestTemplate apisRestTemplate;

    protected HttpHeaders httpHeaders;

    @PostConstruct()
    void init() {
        LOGGER.debug("[KaptenService] Post Construct");
        this.httpHeaders = new HttpHeaders();
        this.httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        this.httpHeaders.put("Authorization", Collections.singletonList("Token" + SERVER_TOKEN));
        this.httpHeaders.put("Accept-Language", Collections.singletonList("fr-FR"));
        this.httpHeaders.put("Content-Type", Collections.singletonList("application/json"));
    }

    /**
     * Asynchronous Method to use to get Kapten response
     * @param vtcComparatorRequest
     * @return @{@link CompletableFuture<VTCComparatorResponse>}
     */
    //TODO: test & verify
    @Async
    public CompletableFuture<VTCComparatorResponse> getKaptenResponseAsync(VTCComparatorRequest vtcComparatorRequest) throws Exception {
        LOGGER.debug("[KaptenService] getKaptenResponseAsync");
        final long start = System.currentTimeMillis();

        VTCComparatorResponse vtcComparatorResponse = null;
        try{
            vtcComparatorResponse = KaptenResponsesMapper
                .estimatedPriceResponseSuccessToVTCComparatorResponse(
                        this.getEstimatedPrice(KaptenRequestsMapper.VTCComparatorRequestToEstimatedPriceRequest.apply(vtcComparatorRequest)),
                        null);
        }catch (Exception e){ LOGGER.debug(e.toString()); }

        try{
            vtcComparatorResponse = KaptenResponsesMapper
                    .waitingTimeResponseSuccessToVTCComparatorResponse(
                            this.getWaitingTime(KaptenRequestsMapper.VTCComparatorRequestToWaitingTimeRequest.apply(vtcComparatorRequest)),
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }

        LOGGER.debug("[KaptenService] Elapsed time: {}", (System.currentTimeMillis() - start));

        return CompletableFuture.completedFuture(vtcComparatorResponse);
    }

    /**
     * Method to use to get Kapten response
     * @param vtcComparatorRequest
     * @return @{@link VTCComparatorResponse}
     */
    public VTCComparatorResponse getKaptenResponse(VTCComparatorRequest vtcComparatorRequest) throws Exception {
        LOGGER.debug("[KaptenService] getKaptenResponse");
        final long start = System.currentTimeMillis();

        VTCComparatorResponse vtcComparatorResponse = null;
        try{
            vtcComparatorResponse =KaptenResponsesMapper
                .estimatedPriceResponseSuccessToVTCComparatorResponse(
                        this.getEstimatedPrice(KaptenRequestsMapper.VTCComparatorRequestToEstimatedPriceRequest.apply(vtcComparatorRequest)),
                        null);
        }catch (Exception e){ LOGGER.debug(e.toString()); }

        try{
            vtcComparatorResponse = KaptenResponsesMapper
                    .waitingTimeResponseSuccessToVTCComparatorResponse(
                            this.getWaitingTime(KaptenRequestsMapper.VTCComparatorRequestToWaitingTimeRequest.apply(vtcComparatorRequest)),
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }

        LOGGER.debug("[KaptenService] Elapsed time: {}", (System.currentTimeMillis() - start));

        return vtcComparatorResponse;
    }

    /**
     * Get Waiting Time
     * @param waitingTimeRequest
     * @return @{@link WaitingTimeResponseSuccess}
     */
    public WaitingTimeResponseSuccess getWaitingTime(WaitingTimeRequest waitingTimeRequest) {
        LOGGER.debug("[KaptenService] getWaitingTime");
        String uri = getUri("eta") + "?";
        HttpEntity entity = new HttpEntity<>(RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<WaitingTimeResponseSuccess> timeResponseSuccessResponse =
                apisRestTemplate.exchange(uri, HttpMethod.GET, entity,WaitingTimeResponseSuccess.class);
        return  timeResponseSuccessResponse.getBody();
    }

    /**
     * Get estimated Price
     * @param estimatedPriceRequest
     * @return @{@link EstimatedPriceResponseSuccess}
     */
    public EstimatedPriceResponseSuccess getEstimatedPrice(EstimatedPriceRequest estimatedPriceRequest) {
        LOGGER.debug("[KaptenService] getEstimatedPrice");
        String uri = getUri("price") + "?";
        HttpEntity entity = new HttpEntity<>(RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<EstimatedPriceResponseSuccess> estimatedPriceResponseSuccessResponse =
                apisRestTemplate.exchange(uri, HttpMethod.GET, entity,EstimatedPriceResponseSuccess.class);
        return  estimatedPriceResponseSuccessResponse.getBody();

    }

    /**
     * @param service
     * @return @{@link String}
     */
    protected String getUri(String service) {
        return this.BASE_URL + "/" + service;
    }
}
