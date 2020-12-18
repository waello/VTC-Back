package com.navettevatry.rem4u.comparator.platforms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.navettevatry.rem4u.common.resources.dto.bcvtc.*;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorRequest;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorResponse;
import com.navettevatry.rem4u.common.utils.Rem4uUtils;
import com.navettevatry.rem4u.common.utils.mapper.requests.BcvtcRequestsMapper;
import com.navettevatry.rem4u.common.utils.mapper.responses.BcvtcResponsesMapper;
import com.navettevatry.rem4u.common.utils.restclient.RestTemplateBuilder;
import net.minidev.json.JSONObject;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;


/**
 * Snap Car needed APIs Service Class
 * Created by jlassi wael
 * Updated By Chakib DAII
 */
@Service
public class BcvtcService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BcvtcService.class);

    @Value("${bcvtc.base-url}")
    private String BASE_URL;
    @Value("${bcvtc.api-key}")
    private String API_KEY;
    @Value("${bcvtc.e-mail}")
    private String E_MAIL;


    @Autowired
    protected RestTemplate apisRestTemplate;

    protected HttpHeaders httpHeaders;

    @PostConstruct()
    void init() {
        LOGGER.debug("[BcvtcService] Post Construct");
        this.httpHeaders = new HttpHeaders();
        this.httpHeaders.setContentType(MediaType.APPLICATION_JSON);
    }

    /**
     * Asynchronous Method to use to get Bcvtc response
     * @param vtcComparatorRequest
     * @return @{@link CompletableFuture<VTCComparatorResponse>}
     */
    //TODO: test & verify
    @Async
    public CompletableFuture<VTCComparatorResponse> getBcvtcResponseAsync(VTCComparatorRequest vtcComparatorRequest) throws Exception {
        LOGGER.debug("[BcvtcService] getBcvtcResponseAsync");
        final long start = System.currentTimeMillis();

        VTCComparatorResponse vtcComparatorResponse = null;
        try{
            vtcComparatorResponse = BcvtcResponsesMapper
                .estimationToVTCComparatorResponse(
                        this.getEstimation(BcvtcRequestsMapper
                                .VTCComparatorRequestToLocationsSearchRequest.apply(vtcComparatorRequest)),
                        null);
        }catch (Exception e){ LOGGER.debug(e.toString()); }

        LOGGER.debug("[BcvtcService] Elapsed time: {}", (System.currentTimeMillis() - start));

        return CompletableFuture.completedFuture(vtcComparatorResponse);
    }

    /**
     * Method to use to get Bcvtc response
     * @param vtcComparatorRequest
     * @return @{@link VTCComparatorResponse}
     */
    public VTCComparatorResponse getBcvtcResponse(VTCComparatorRequest vtcComparatorRequest) throws Exception {
        LOGGER.debug("[BcvtcService] getBcvtcResponse");
        final long start = System.currentTimeMillis();

        VTCComparatorResponse vtcComparatorResponse = null;
        try{
            vtcComparatorResponse = BcvtcResponsesMapper
                .estimationToVTCComparatorResponse(
                        this.getEstimation(BcvtcRequestsMapper
                                .VTCComparatorRequestToLocationsSearchRequest.apply(vtcComparatorRequest)),
                        null);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        LOGGER.debug("[BcvtcService] Elapsed time: {}", (System.currentTimeMillis() - start));

        return vtcComparatorResponse;
    }

    /**
     * Method to get estimation
     * @param estimationRequest
     * @return @{@link Estimation}
     */
    public Estimation getEstimation(EstimationRequest estimationRequest){
        LOGGER.debug("[BcvtcService] Demande d'estimation");
        String uri = getUri("driver/fare/"+this.API_KEY);
        estimationRequest.setEmail(this.E_MAIL);

        HttpEntity<EstimationRequest> entity = new HttpEntity<>(estimationRequest,RestTemplateBuilder.getHeaders(this.httpHeaders));

        ResponseEntity<EstimationResponse> estimationResponseResponse =
                apisRestTemplate.exchange(uri, HttpMethod.POST, entity, EstimationResponse.class);
        return estimationResponseResponse.getBody().getData();
    }

    /**
     * Method to get driver's forfaits
     * @return @{@link List<Forfait>}
     */
    public List<Forfait> getForfaits(){
        LOGGER.debug("[BcvtcService] Demande de Forfaits");
        String uri = getUri("driver/flats/"+this.API_KEY);

        JSONObject forfaitsRequest = new JSONObject();
        forfaitsRequest.put("Email", this.E_MAIL);

        HttpEntity<JSONObject> entity = new HttpEntity<>(forfaitsRequest,RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<ForfaitResponse> ForfaitResponseResponse =
                apisRestTemplate.exchange(uri, HttpMethod.POST, entity, ForfaitResponse.class);
        return  ForfaitResponseResponse.getBody().getData();
    }

    /**
     * Method to get driver's Classes
     * @return @{@link List<CarClass>}
     */
    public List<CarClass> getClasses(){
        LOGGER.debug("[BcvtcService] Demande de Classes");
        String uri = getUri("driver/classes/"+this.API_KEY);

        JSONObject classesRequest = new JSONObject();
        classesRequest.put("Email", this.E_MAIL);

        HttpEntity<JSONObject> entity = new HttpEntity<>(classesRequest,RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<CarClassesResponse> CarClassesResponseResponse =
                apisRestTemplate.exchange(uri, HttpMethod.POST, entity,CarClassesResponse.class);
        return  CarClassesResponseResponse.getBody().getData();
    }

    /**
     * Method to get driver's cars
     * @return @{@link List<Car>}
     */
    public List<Car> getCars(){
        LOGGER.debug("[BcvtcService] Demande de cars");
        String uri = getUri("driver/cars/"+this.API_KEY);

        JSONObject carsRequest = new JSONObject();
        carsRequest.put("Email", this.E_MAIL);

        HttpEntity<JSONObject> entity = new HttpEntity<>(carsRequest,RestTemplateBuilder.getHeaders(this.httpHeaders));

        ResponseEntity<CarsResponse> CarsResponseResponse =
                apisRestTemplate.exchange(uri, HttpMethod.POST, entity, CarsResponse.class);
        return  CarsResponseResponse.getBody().getData();
    }


    /**
     * @param service
     * @return @{@link String}
     */
    protected String getUri(String service) {
        return this.BASE_URL + "/" + service;
    }

}
