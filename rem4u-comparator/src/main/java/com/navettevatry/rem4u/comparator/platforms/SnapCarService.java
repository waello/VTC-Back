package com.navettevatry.rem4u.comparator.platforms;

import com.navettevatry.rem4u.common.resources.dto.snapcar.*;
import com.navettevatry.rem4u.common.resources.dto.snapcar.updated.SnapCarRequest;
import com.navettevatry.rem4u.common.resources.dto.snapcar.updated.SnapCarResponse;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorRequest;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorResponse;
import com.navettevatry.rem4u.common.resources.dto.uber.updated.UberRequest;
import com.navettevatry.rem4u.common.resources.dto.uber.updated.UberResponse;
import com.navettevatry.rem4u.common.resources.enumeration.FrontDistance;
import com.navettevatry.rem4u.common.utils.mapper.requests.SnapCarRequestsMapper;
import com.navettevatry.rem4u.common.utils.mapper.responses.SnapCarResponsesMapper;
import com.navettevatry.rem4u.common.utils.restclient.RestTemplateBuilder;
import okhttp3.RequestBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.CompletableFuture;


/**
 * Snap Car needed APIs Service Class
 * Created by Chakib Daii.
 */

@Service
public class SnapCarService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SnapCarService.class);

    @Value("${snap-car.base-url}")
    private String BASE_URL;
    @Value("${snap-car.client-id}")
    private String CLIENT_ID;
    @Value("${snap-car.client-secret}")
    private String CLIENT_SECRET;
    @Value("${snap-car.server-token}")
    private String SERVER_TOKEN;

    @Autowired
    protected RestTemplate apisRestTemplate;

    protected HttpHeaders httpHeaders;

    @PostConstruct()
    void init() {
        LOGGER.debug("[SnapCarService] Post Construct");
        this.httpHeaders = new HttpHeaders();
        this.httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        //add headers based on the API
    }

    /**
     * method to acquire Server token
     * @param client_id
     * @param client_secret
     * @return @{@link SnapCarToken}
     */
    public SnapCarToken authorize(String client_id, String client_secret){
        LOGGER.debug("[SnapCarService] Authorize");
        String uri = getUri("auth/authorize ");
        HttpEntity entity = new HttpEntity<>(RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<SnapCarToken> snapCarTokenResponse =
                apisRestTemplate.exchange(uri, HttpMethod.GET, entity, SnapCarToken.class);
        //TODO: set the token variable
        return  snapCarTokenResponse.getBody();
    }

    /**
     * Asynchronous Method to use to get SnapCar response
     * @param vtcComparatorRequest
     * @return @{@link CompletableFuture<VTCComparatorResponse>}
     */
    //TODO: test & verify
    @Async
    public CompletableFuture<VTCComparatorResponse> getSnapCarResponseAsync(VTCComparatorRequest vtcComparatorRequest) throws Exception {
        LOGGER.debug("[SnapCarService] getAlloCabResponseAsync");
        final long start = System.currentTimeMillis();

        VTCComparatorResponse vtcComparatorResponse = null;
       /** try{
            vtcComparatorResponse = SnapCarResponsesMapper
                .bookingPriceToVTCComparatorResponse(
                        this.getBookingPrices(SnapCarRequestsMapper.VTCComparatorRequestToBookingPricesRequest.apply(vtcComparatorRequest)),
                        null);
        }catch (Exception e){ LOGGER.debug(e.toString()); }**/

        try{
            vtcComparatorResponse = SnapCarResponsesMapper
                    .finalSnap(
                            this.getDataa(SnapCarRequestsMapper.VTCComparatorRequestTosnapCarRequest.apply(vtcComparatorRequest)),
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }


        LOGGER.debug("[SnapCarService] Elapsed time: {}", (System.currentTimeMillis() - start));

        return CompletableFuture.completedFuture(vtcComparatorResponse);
    }
    UberService uberService;

    /**
     * Method to use to get SnapCar response
     * @param vtcComparatorRequest
     * @return @{@link VTCComparatorResponse}
     */
    public VTCComparatorResponse getSnapCarResponse(VTCComparatorRequest vtcComparatorRequest) throws Exception {
        LOGGER.debug("[SnapCarService] getAlloCabResponse");
        final long start = System.currentTimeMillis();

        VTCComparatorResponse vtcComparatorResponse = null;
/**
        try{
            vtcComparatorResponse = SnapCarResponsesMapper
                    .bookingPriceToVTCComparatorResponse(
                            this.getBookingPrices(SnapCarRequestsMapper.VTCComparatorRequestToBookingPricesRequest.apply(vtcComparatorRequest)),
                            null);
        }catch (Exception e){ LOGGER.debug(e.toString()); }**/
        try{
            vtcComparatorResponse = SnapCarResponsesMapper
                    .finalSnap(
                            this.getDataa(SnapCarRequestsMapper.VTCComparatorRequestTosnapCarRequest.apply(vtcComparatorRequest)),
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        try{
            vtcComparatorResponse = SnapCarResponsesMapper
                    .etaResultToVTCComparatorResponse(
                            this.getEta(SnapCarRequestsMapper.VTCComparatorRequestToInfoRequest.apply(vtcComparatorRequest)),
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        try{
            vtcComparatorResponse = SnapCarResponsesMapper
                    .specialAreaToVTCComparatorResponse(
                            this.getMeetingPoints(SnapCarRequestsMapper.VTCComparatorRequestToInfoRequest.apply(vtcComparatorRequest)),
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        try{
            vtcComparatorResponse = SnapCarResponsesMapper
                    .serviceClassToVTCComparatorResponse(
                            this.getServiceClasses(SnapCarRequestsMapper.VTCComparatorRequestToInfoRequest.apply(vtcComparatorRequest)),
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }

        LOGGER.debug("[SnapCarService] Elapsed time: {}", (System.currentTimeMillis() - start));
        FrontDistance estimsatedDistance =  uberService.distance(vtcComparatorRequest);

        return vtcComparatorResponse;
    }

    /**
     * get Booking prices
     * @param bookingPricesRequest
     * @return @{@link BookingPrice}
     */
    public BookingPrice getBookingPrices(BookingPricesRequest bookingPricesRequest){
        LOGGER.debug("[SnapCarService] getBookingPrices");
        String uri = getUri("info/bookings/prices") + "/";
        HttpEntity entity = new HttpEntity<>(RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<BookingPrice> snapCarTokenResponse =
                apisRestTemplate.exchange(uri, HttpMethod.POST, entity, BookingPrice.class);
        return  snapCarTokenResponse.getBody();
    }

    /**
     * get time estimation
     * @param infoRequest
     * @return @{@link ETAResult}
     */
    public ETAResult getEta(InfoRequest infoRequest){
        //api_id and api_secret are required
        LOGGER.debug("[SnapCarService] getEta");
        String uri = getUri("info/eta") + "/";
        HttpEntity entity = new HttpEntity<>(RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<ETAResult> etaResultResponse =
                apisRestTemplate.exchange(uri, HttpMethod.POST, entity, ETAResult.class);
        return  etaResultResponse.getBody();
    }

    /**
     * get meetin points
     * @param infoRequest
     * @return @{@link SpecialArea}
     */
    public SpecialArea getMeetingPoints(InfoRequest infoRequest){
        //api_id and api_secret are required
        LOGGER.debug("[SnapCarService] getMeetingPoints");
        String uri = getUri("info/meeting_points") + "/";
        HttpEntity entity = new HttpEntity<>(RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<SpecialArea> specialAreaResponse =
                apisRestTemplate.exchange(uri, HttpMethod.POST, entity, SpecialArea.class);
        return  specialAreaResponse.getBody();
    }

    /**
     * get service classes
     * @param infoRequest
     * @return @{@link ServiceClass}
     */
    public ServiceClass getServiceClasses(InfoRequest infoRequest){
        //api_id and api_secret are required
        LOGGER.debug("[SnapCarService] getServiceClasses");
        String uri = getUri("info/service_classes") + "/";
        HttpEntity entity = new HttpEntity<>(RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<ServiceClass> serviceClassResponse =
                apisRestTemplate.exchange(uri, HttpMethod.POST, entity, ServiceClass.class);
        return  serviceClassResponse.getBody();

    }
    public SnapCarResponse getDataa(SnapCarRequest infoRequest){

        this.httpHeaders = new HttpHeaders();



        this.httpHeaders.put("authority", Collections.singletonList("www.snapcar.com"));
                 this.httpHeaders.put("accept", Collections.singletonList("*/*"));
                 this.httpHeaders.put("x-requested-with", Collections.singletonList("XMLHttpRequest"));
                 this.httpHeaders.put("user-agent", Collections.singletonList("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.183 Safari/537.36"));
                 this.httpHeaders.put("content-type", Collections.singletonList("application/x-www-form-urlencoded; charset=UTF-8"));
                 this.httpHeaders.put("origin", Collections.singletonList("https://www.snapcar.com"));
                 this.httpHeaders.put("sec-fetch-site", Collections.singletonList("same-origin"));
                 this.httpHeaders.put("sec-fetch-mode", Collections.singletonList("cors"));
                 this.httpHeaders.put("sec-fetch-dest", Collections.singletonList("empty"));
                 this.httpHeaders.put("referer", Collections.singletonList("https://www.snapcar.com/"));
                 this.httpHeaders.put("accept-language", Collections.singletonList("fr-FR,fr;q=0.9,en-US;q=0.8,en;q=0.7"));
                 this.httpHeaders.put("cookie", Collections.singletonList("_ga=GA1.2.97570626.1602924906; _fbp=fb.1.1602924914501.326712092; __adroll_fpc=1d7bd5fa5953a84740ac7c999d3b2680-1602924917075; PHPSESSID=pto60id5rdt9665umee8668lt1; _gid=GA1.2.174934667.1604744064; _gat=1; __ar_v4=XXDLW73RU5AF5J6TKJIKNJ^%^3A20201016^%^3A11^%^7C47ZYYYKQF5HQHJ6Z3LRAXN^%^3A20201016^%^3A11^%^7CGKLFUSQEYFBCJI25W725QF^%^3A20201016^%^3A11"));

        String uri = "https://www.snapcar.com/price.php";
        String e =infoRequest.toString() ;

        HttpEntity entity = new HttpEntity<>(e,this.httpHeaders);
        System.out.println( "rrrr"+entity.getBody());


        ResponseEntity<SnapCarResponse> jobsEstimateResponseResponse =
                apisRestTemplate.exchange(uri, HttpMethod.resolve("POST"),entity, SnapCarResponse.class);
        System.out.println( "yy"+jobsEstimateResponseResponse.getStatusCode().toString());

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
