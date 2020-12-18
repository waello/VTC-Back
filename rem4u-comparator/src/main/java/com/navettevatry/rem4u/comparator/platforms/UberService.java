package com.navettevatry.rem4u.comparator.platforms;

import com.google.api.client.auth.oauth2.Credential;
import com.navettevatry.rem4u.common.resources.dto.lecab.updated.estimate.EstimateRequest;
import com.navettevatry.rem4u.common.resources.dto.lecab.updated.estimate.EstimateResponse;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorRequest;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorResponse;
import com.navettevatry.rem4u.common.resources.dto.uber.Idresponse;
import com.navettevatry.rem4u.common.resources.dto.uber.PickupTimeEstimateRequest;
import com.navettevatry.rem4u.common.resources.dto.uber.PriceEstimatesPromotionRequest;
import com.navettevatry.rem4u.common.resources.dto.uber.ProductsRequest;
import com.navettevatry.rem4u.common.resources.dto.uber.updated.FareEstimateRange;
import com.navettevatry.rem4u.common.resources.dto.uber.updated.UberRequest;
import com.navettevatry.rem4u.common.resources.dto.uber.updated.UberResponse;
import com.navettevatry.rem4u.common.resources.enumeration.FrontDistance;
import com.navettevatry.rem4u.common.utils.mapper.requests.UberRequestsMapper;
import com.navettevatry.rem4u.common.utils.mapper.responses.UberResponsesMapper;
import com.navettevatry.rem4u.common.utils.restclient.RestTemplateBuilder;
import com.uber.sdk.core.auth.Scope;
import com.uber.sdk.rides.auth.OAuth2Credentials;
import com.uber.sdk.rides.client.CredentialsSession;
import com.uber.sdk.rides.client.ServerTokenSession;
import com.uber.sdk.rides.client.SessionConfiguration;
import com.uber.sdk.rides.client.UberRidesApi;
import com.uber.sdk.rides.client.model.*;
import com.uber.sdk.rides.client.services.RidesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import retrofit2.Response;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;


/**
 *  Uber needed APIs Service Class
 * Created by Chakib Daii.
 */

@Service
public class UberService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UberService.class);

    @Value("${uber.client-id}")
    private String CLIENT_ID;
    @Value("${uber.client-secret}")
    private String CLIENT_SECRET;
    @Value("${uber.server-token}")
    private String SERVER_TOKEN;
    @Value("${uber.authorization-code}")
    private String AUTH_CODE;
    @Value("${uber.user-id}")
    private String USER_ID;

    private RidesService ridesService;


    @Autowired
    protected RestTemplate apisRestTemplate;

    protected HttpHeaders httpHeaders;

    @PostConstruct()
    void init() {
        LOGGER.debug("[UberService] Post Construct");
        this.httpHeaders = new HttpHeaders();
        this.httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        SessionConfiguration config = new SessionConfiguration.Builder()
                .setClientId(CLIENT_ID)
//                .setClientSecret(CLIENT_SECRET)
                .setServerToken(SERVER_TOKEN)
                .build();

        ServerTokenSession session = new ServerTokenSession(config);

//        List<Scope> scopes = new ArrayList<>();
//        scopes.add(Scope.ALL_TRIPS); //just an example
//
//        SessionConfiguration config = new SessionConfiguration.Builder()
//                .setClientId(CLIENT_ID)
//                .setClientSecret(CLIENT_SECRET)
//                .setScopes(scopes)
//                .setRedirectUri("http://localhost:9091/")
//                .build();
//
//        OAuth2Credentials credentials = new OAuth2Credentials.Builder()
//                .setSessionConfiguration(config)
//                .build();
//
//        try {
//            String authorizationUrl = credentials.getAuthorizationUrl();
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//        Credential credential = credentials.authenticate(AUTH_CODE, USER_ID);
//        CredentialsSession session = new CredentialsSession(config, credential);

        this.ridesService = UberRidesApi.with(session).build().createService();
    }

    /**
     * Asynchronous Method to use to get Uber response
     * @param vtcComparatorRequest
     * @return @{@link CompletableFuture<VTCComparatorResponse>}
     */
    //TODO: test & verify
    @Async
    public CompletableFuture<VTCComparatorResponse> getUberResponseAsync(VTCComparatorRequest vtcComparatorRequest) throws Exception {
        LOGGER.debug("[UberService] getUberResponseAsync");
        final long start = System.currentTimeMillis();

        VTCComparatorResponse vtcComparatorResponse = null;
//        try{
//            vtcComparatorResponse = UberResponsesMapper
//                .productsListToVTCComparatorResponse(
//                        this.getProducts(UberRequestsMapper.VTCComparatorRequestToProductsRequest.apply(vtcComparatorRequest)),
//                null);
//        }catch (Exception e){ LOGGER.debug(e.toString()); }
//
//        try{
//            vtcComparatorResponse = UberResponsesMapper
//                    .priceEstimatesListToVTCComparatorResponse(
//                            this.getPriceEstimates(UberRequestsMapper.VTCComparatorRequestToPriceEstimatesPromotionRequest.apply(vtcComparatorRequest)),
//                            vtcComparatorResponse);
//        }catch (Exception e){ LOGGER.debug(e.toString()); }
//        try{
//            vtcComparatorResponse = UberResponsesMapper
//                    .timeEstimatesListToVTCComparatorResponse(
//                            this.getPickupTimeEstimate(UberRequestsMapper.VTCComparatorRequestToPickupTimeEstimateRequest.apply(vtcComparatorRequest)),
//                            vtcComparatorResponse);
//        }catch (Exception e){ LOGGER.debug(e.toString()); }
//        try{
//            vtcComparatorResponse = UberResponsesMapper
//                    .promotionToVTCComparatorResponse(
//                            this.getPromotion(UberRequestsMapper.VTCComparatorRequestToPriceEstimatesPromotionRequest.apply(vtcComparatorRequest)),
//                            vtcComparatorResponse);
//        }catch (Exception e){ LOGGER.debug(e.toString()); }

//        try{
//            vtcComparatorResponse = UberResponsesMapper
//                    .priceEstimatesListToVTCComparatorResponse(
//                            this.getPriceEstimates(UberRequestsMapper.VTCComparatorRequestToPriceEstimatesPromotionRequest.apply(vtcComparatorRequest)),
//                            vtcComparatorResponse);
//        }catch (Exception e){ LOGGER.debug(e.toString()); }
//        try{
//            vtcComparatorResponse = UberResponsesMapper
//                    .timeEstimatesListToVTCComparatorResponse(
//                            this.getPickupTimeEstimate(UberRequestsMapper.VTCComparatorRequestToPickupTimeEstimateRequest.apply(vtcComparatorRequest)),
//                            vtcComparatorResponse);
//        }catch (Exception e){ LOGGER.debug(e.toString()); }

        try{
            vtcComparatorResponse = UberResponsesMapper
                    .priceEstimatesListToVTCComparatorResponse(
                            this.getFareEstimates(UberRequestsMapper.VTCComparatorRequestToUberRequest.apply(vtcComparatorRequest)),
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }

        LOGGER.debug("[UberService] Elapsed time: {}", (System.currentTimeMillis() - start));

        return CompletableFuture.completedFuture(vtcComparatorResponse);
    }

    /**
     * Method to use to get Uber response
     * @param vtcComparatorRequest
     * @return @{@link VTCComparatorResponse}
     */
    public VTCComparatorResponse getUberResponse(VTCComparatorRequest vtcComparatorRequest) throws Exception {
        LOGGER.debug("[UberService] getUberResponse");
        final long start = System.currentTimeMillis();

        VTCComparatorResponse vtcComparatorResponse = null;
        /**try{
            vtcComparatorResponse = UberResponsesMapper
                    .productsListToVTCComparatorResponse(
                            this.getProducts(UberRequestsMapper.VTCComparatorRequestToProductsRequest.apply(vtcComparatorRequest)),
                            null);
        }catch (Exception e){ LOGGER.debug(e.toString()); }
        try{
            vtcComparatorResponse = UberResponsesMapper
                    .priceEstimatesListToVTCComparatorResponse(
                            this.getPriceEstimates(UberRequestsMapper.VTCComparatorRequestToPriceEstimatesPromotionRequest.apply(vtcComparatorRequest)),
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }**/
//        try{
//            vtcComparatorResponse = UberResponsesMapper
//                    .timeEstimatesListToVTCComparatorResponse(
//                            this.getPickupTimeEstimate(UberRequestsMapper.VTCComparatorRequestToPickupTimeEstimateRequest.apply(vtcComparatorRequest)),
//                            vtcComparatorResponse);
//        }catch (Exception e){ LOGGER.debug(e.toString()); }
//        try{
//            vtcComparatorResponse = UberResponsesMapper
//                    .promotionToVTCComparatorResponse(
//                            this.getPromotion(UberRequestsMapper.VTCComparatorRequestToPriceEstimatesPromotionRequest.apply(vtcComparatorRequest)),
//                            vtcComparatorResponse);
//        }catch (Exception e){ LOGGER.debug(e.toString()); }

        try{
            vtcComparatorResponse = UberResponsesMapper
                    .priceEstimatesListToVTCComparatorResponse(
                            this.getFareEstimates(UberRequestsMapper.VTCComparatorRequestToUberRequest.apply(vtcComparatorRequest)),
                            vtcComparatorResponse);
        }catch (Exception e){ LOGGER.debug(e.toString()); }

        LOGGER.debug("[UberService] Elapsed time: {}", (System.currentTimeMillis() - start));

        return vtcComparatorResponse;
    }

    /**
     * get available uber products
     * @param productsRequest
     * @return @{@link List<Product>}
     */
    public List<Product> getProducts(ProductsRequest productsRequest){
        LOGGER.debug("[UberService] getProducts");
        List<Product> products = null;
        try {
            Response<ProductsResponse> response = ridesService.getProducts(productsRequest.getLatitude(),
                    productsRequest.getLongitude()).execute();
            products = response.body().getProducts();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }

    /**
     * get Price estimates
     * @param priceEstimatesPromotionRequest
     * @return @{@link List<PriceEstimate>}
     */
    public List<PriceEstimate> getPriceEstimates(PriceEstimatesPromotionRequest priceEstimatesPromotionRequest){
        LOGGER.debug("[UberService] getPriceEstimates");
        List<PriceEstimate> priceEstimates = null;
        try {
            Response<PriceEstimatesResponse> response =
                    ridesService.getPriceEstimates(priceEstimatesPromotionRequest.getStartLatitude(),
                            priceEstimatesPromotionRequest.getStartLongitude(),priceEstimatesPromotionRequest.getEndLatitude(),
                            priceEstimatesPromotionRequest.getEndLongitude()).execute();
            priceEstimates = response.body().getPrices();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return priceEstimates;
    }

    /**
     * get Time estimates
     * @param pickupTimeEstimateRequest
     * @return @{@link List<TimeEstimate>}
     */
    public List<TimeEstimate> getPickupTimeEstimate(PickupTimeEstimateRequest pickupTimeEstimateRequest){
        LOGGER.debug("[UberService] getPickupTimeEstimate");
        List<TimeEstimate> timeEstimates = null;
        try {
            Response<TimeEstimatesResponse> response =
                    ridesService.getPickupTimeEstimate(pickupTimeEstimateRequest.getStartLatitude(),
                            pickupTimeEstimateRequest.getStartLongitude(), pickupTimeEstimateRequest.getProductId())
                            .execute();
            timeEstimates = response.body().getTimes();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return timeEstimates;
    }

    /**
     * get Promotion
     * @param priceEstimatesPromotionRequest
     * @return @{@link Promotion}
     */
    public Promotion getPromotion(PriceEstimatesPromotionRequest priceEstimatesPromotionRequest){
        Promotion promotion = null;
        try {
            Response<Promotion> response =
                    ridesService.getPromotions(priceEstimatesPromotionRequest.getStartLatitude(),
                            priceEstimatesPromotionRequest.getStartLongitude(),
                            priceEstimatesPromotionRequest.getEndLatitude(),
                            priceEstimatesPromotionRequest.getEndLongitude()).execute();
            promotion = response.body();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return promotion;
    }


    public UberResponse getFareEstimates(UberRequest uberRequest){
        LOGGER.debug("[UberService] getFareEstimates");
        this.httpHeaders = new HttpHeaders();
        MediaType mediaType = MediaType.parseMediaType("application/json");
        this.httpHeaders.setContentType( mediaType);
        this.httpHeaders.put("x-csrf-token", Collections.singletonList("x"));
        this.httpHeaders.put("accept", Collections.singletonList("*/*"));
            this.httpHeaders.put("sec-fetch-site", Collections.singletonList("same-origin"));
        this.httpHeaders.put("sec-fetch-mode", Collections.singletonList("cors"));
        this.httpHeaders.put("sec-fetch-dest", Collections.singletonList("empty"));
        this.httpHeaders.put("accept-language", Arrays.asList("fr-FR","fr;q=0.9","en-US;q=0.8","en;q=0.7"));
        this.httpHeaders.put("cookie", Collections.singletonList("optimizelyEndUserId=oeu1605474971963r0.291040914684048; OPTOUTMULTI=; segmentCookie=b; CONSENTMGR=ts:1605474974358%7Cconsent:true; _gcl_au=1.1.1888077550.1605474975; AMP_TOKEN=%24NOT_FOUND; _ga=GA1.2.493732917.1605474978; _gid=GA1.2.462715865.1605474978; _fbp=fb.1.1605474978999.742556129; _ua={\\\"session_id\\\":\\\"8c191875-6921-442b-8040-df8db8a676ee\\\",\\\"session_time_ms\\\":1605475089770}; udi-id=l4e7fgELkppoceRaRYaccv4nIjaZu1eKShEzVne0ZDqgUni2+XZwJT8QyWEwmJvu7IMqtrk3VU3sBOjO9a8q6Y9fYXizYmudnmk2ZA+OSDEk+QLf7nq+OgC7b1VPVs7xK4W6Wj1j1yoCa5O0Aac59xXSPSlHmE0CQo8XLQ4OzW78wj06fELweZ4rVPSp15dOJ5zLjQ6l4tFvyPDUYfJ6Ew==mpEVj1MPNxtHmhSczQr7bQ==nqnd00xloGYGO7Ce0RUgb13igubLC9euLkIjMGXa7po=; jwt-session=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpYXQiOjE2MDU0NzUwOTAsImV4cCI6MTYwNTU2MTQ5MH0.2NjbdNUX-CEjDV7UjpOg9VC65oVafyux6wZSU4hS9-c; _cc=ARzawPwPoKZ11MY8VhhBYgak; newVsReturning=undefined; sid=QA.CAESEA6dUQkAe0RJkNaawGO1rikYu9Lk_gUiATEqJGQwMjEwNDhjLTQ4OWMtNDg4OS1iZTAyLTMxM2JhOGNkMzgwMzJANOzcTOpZwJVW4VKGMMhj-td_R-VpDFZBo6K3LsxlFGtcE4xEJCCFWF_u7BIYuWo8SgpL9jxHpP6GxsFBhGYWazoBMUIIdWJlci5jb20.a-VOFmA9Zi19tDoNtW17w39dPPta47NzE0PGI3sQjbk; csid=1.1608067393170.teClzn6/4T9BKyV1JFZ+dZCMH63Zs4l5yiSPyEKdH6U=; fsid=e2555afk-ejlp-jopr-vzmp-sru3327906z3; utag_main=v_id:0175cdc3f6d6001a61d586e4759f03073002706b0086e$_sn:1$_ss:0$_st:1605477335675$ses_id:1605474973401%3Bexp-session$_pn:5%3Bexp-session$_se:3; udi-fingerprint=xaNQq2EegsUR12d58FOes+qAdwhK6fGfXUU9zjO/IL9MjwA+q4p8Ga4IOX+og+xB5i0bz1U2T3dicaVyVFDXPA==TivHcI+0DvHfIYzbF2nd5MEd+KL9Xw7Mso7tEr7ZI04=optimizelyEndUserId=oeu1605474971963r0.291040914684048; OPTOUTMULTI=; segmentCookie=b; CONSENTMGR=ts:1605474974358%7Cconsent:true; _gcl_au=1.1.1888077550.1605474975; AMP_TOKEN=%24NOT_FOUND; _ga=GA1.2.493732917.1605474978; _gid=GA1.2.462715865.1605474978; _fbp=fb.1.1605474978999.742556129; _ua={\\\"session_id\\\":\\\"8c191875-6921-442b-8040-df8db8a676ee\\\",\\\"session_time_ms\\\":1605475089770}; udi-id=l4e7fgELkppoceRaRYaccv4nIjaZu1eKShEzVne0ZDqgUni2+XZwJT8QyWEwmJvu7IMqtrk3VU3sBOjO9a8q6Y9fYXizYmudnmk2ZA+OSDEk+QLf7nq+OgC7b1VPVs7xK4W6Wj1j1yoCa5O0Aac59xXSPSlHmE0CQo8XLQ4OzW78wj06fELweZ4rVPSp15dOJ5zLjQ6l4tFvyPDUYfJ6Ew==mpEVj1MPNxtHmhSczQr7bQ==nqnd00xloGYGO7Ce0RUgb13igubLC9euLkIjMGXa7po=; jwt-session=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpYXQiOjE2MDU0NzUwOTAsImV4cCI6MTYwNTU2MTQ5MH0.2NjbdNUX-CEjDV7UjpOg9VC65oVafyux6wZSU4hS9-c; _cc=ARzawPwPoKZ11MY8VhhBYgak; newVsReturning=undefined; sid=QA.CAESEA6dUQkAe0RJkNaawGO1rikYu9Lk_gUiATEqJGQwMjEwNDhjLTQ4OWMtNDg4OS1iZTAyLTMxM2JhOGNkMzgwMzJANOzcTOpZwJVW4VKGMMhj-td_R-VpDFZBo6K3LsxlFGtcE4xEJCCFWF_u7BIYuWo8SgpL9jxHpP6GxsFBhGYWazoBMUIIdWJlci5jb20.a-VOFmA9Zi19tDoNtW17w39dPPta47NzE0PGI3sQjbk; csid=1.1608067393170.teClzn6/4T9BKyV1JFZ+dZCMH63Zs4l5yiSPyEKdH6U=; fsid=e2555afk-ejlp-jopr-vzmp-sru3327906z3; utag_main=v_id:0175cdc3f6d6001a61d586e4759f03073002706b0086e$_sn:1$_ss:0$_st:1605477335675$ses_id:1605474973401%3Bexp-session$_pn:5%3Bexp-session$_se:3; udi-fingerprint=xaNQq2EegsUR12d58FOes+qAdwhK6fGfXUU9zjO/IL9MjwA+q4p8Ga4IOX+og+xB5i0bz1U2T3dicaVyVFDXPA==TivHcI+0DvHfIYzbF2nd5MEd+KL9Xw7Mso7tEr7ZI04=optimizelyEndUserId=oeu1605474971963r0.291040914684048; OPTOUTMULTI=; segmentCookie=b; CONSENTMGR=ts:1605474974358%7Cconsent:true; _gcl_au=1.1.1888077550.1605474975; AMP_TOKEN=%24NOT_FOUND; _ga=GA1.2.493732917.1605474978; _gid=GA1.2.462715865.1605474978; _fbp=fb.1.1605474978999.742556129; _ua={\\\"session_id\\\":\\\"8c191875-6921-442b-8040-df8db8a676ee\\\",\\\"session_time_ms\\\":1605475089770}; udi-id=l4e7fgELkppoceRaRYaccv4nIjaZu1eKShEzVne0ZDqgUni2+XZwJT8QyWEwmJvu7IMqtrk3VU3sBOjO9a8q6Y9fYXizYmudnmk2ZA+OSDEk+QLf7nq+OgC7b1VPVs7xK4W6Wj1j1yoCa5O0Aac59xXSPSlHmE0CQo8XLQ4OzW78wj06fELweZ4rVPSp15dOJ5zLjQ6l4tFvyPDUYfJ6Ew==mpEVj1MPNxtHmhSczQr7bQ==nqnd00xloGYGO7Ce0RUgb13igubLC9euLkIjMGXa7po=; jwt-session=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpYXQiOjE2MDU0NzUwOTAsImV4cCI6MTYwNTU2MTQ5MH0.2NjbdNUX-CEjDV7UjpOg9VC65oVafyux6wZSU4hS9-c; _cc=ARzawPwPoKZ11MY8VhhBYgak; newVsReturning=undefined; sid=QA.CAESEA6dUQkAe0RJkNaawGO1rikYu9Lk_gUiATEqJGQwMjEwNDhjLTQ4OWMtNDg4OS1iZTAyLTMxM2JhOGNkMzgwMzJANOzcTOpZwJVW4VKGMMhj-td_R-VpDFZBo6K3LsxlFGtcE4xEJCCFWF_u7BIYuWo8SgpL9jxHpP6GxsFBhGYWazoBMUIIdWJlci5jb20.a-VOFmA9Zi19tDoNtW17w39dPPta47NzE0PGI3sQjbk; csid=1.1608067393170.teClzn6/4T9BKyV1JFZ+dZCMH63Zs4l5yiSPyEKdH6U=; fsid=e2555afk-ejlp-jopr-vzmp-sru3327906z3; utag_main=v_id:0175cdc3f6d6001a61d586e4759f03073002706b0086e$_sn:1$_ss:0$_st:1605477335675$ses_id:1605474973401%3Bexp-session$_pn:5%3Bexp-session$_se:3; udi-fingerprint=xaNQq2EegsUR12d58FOes+qAdwhK6fGfXUU9zjO/IL9MjwA+q4p8Ga4IOX+og+xB5i0bz1U2T3dicaVyVFDXPA==TivHcI+0DvHfIYzbF2nd5MEd+KL9Xw7Mso7tEr7ZI04=; marketing_vistor_id=7e2105fc-063e-4749-91e1-0f224a296aab; fsid=e2555afk-ejlp-jopr-vzmp-sru3327906z3; _ua={\"session_id\":\"be8e3f14-f16b-4ced-8f2c-4d4f67ded7f0\",\"session_time_ms\":1605479096334}"));     System.out.println( this.httpHeaders.get("Cookie"));
        System.out.println( "erere");
        System.out.println( uberRequest.toString());
        System.out.println("rayen"+uberRequest.getDestination().getID());

        String uri = "https://m.uber.com/api/getFareEstimates";

        HttpEntity<UberRequest> entity = new HttpEntity<>(uberRequest , this.httpHeaders);
        ResponseEntity<UberResponse> jobsEstimateResponseResponse =
                apisRestTemplate.exchange(uri, HttpMethod.POST, entity, UberResponse.class);
        System.out.println( "yy"+jobsEstimateResponseResponse.getStatusCode().toString());
        System.out.println( "yzy"+jobsEstimateResponseResponse.getBody().toString());

        return  jobsEstimateResponseResponse.getBody();

    }
    public FrontDistance distance(VTCComparatorRequest vtc) {
        System.out.println( "jhjhjjj"+vtc.toString());

        this.httpHeaders = new HttpHeaders();

        this.httpHeaders.put("authority", Collections.singletonList("maps.googleapis.com"));
        this.httpHeaders.put("cache-control", Collections.singletonList("max-age=0"));
        this.httpHeaders.put("upgrade-insecure-requests", Collections.singletonList("1"));
        this.httpHeaders.put("user-agent", Collections.singletonList("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.138 Safari/537.36 OPR/68.0.3618.150"));
        this.httpHeaders.put("accept", Collections.singletonList("text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9"));
        this.httpHeaders.put("sec-fetch-site", Collections.singletonList("none"));
        this.httpHeaders.put("sec-fetch-mode", Collections.singletonList("navigate"));
        this.httpHeaders.put("sec-fetch-user", Collections.singletonList("?1"));
        this.httpHeaders.put("sec-fetch-dest", Collections.singletonList("document"));
        this.httpHeaders.put("accept-language", Collections.singletonList("en-US,en;q=0.9,fr;q=0.8"));

        String uri ="https://maps.googleapis.com/maps/api/distancematrix/json?origins="+vtc.getDepartureLocation().getLatitude().toString()+","+vtc.getDepartureLocation().getLongitude().toString()+"&destinations="+vtc.getArrivalLocation().getLatitude().toString()+","+vtc.getArrivalLocation().getLongitude().toString()+"&mode=driving&language=en-EN&sensor=false&key=AIzaSyDkJjmwF0PRX3IKKGwIn3v8j4uoHvjnWl0";
        HttpEntity entity = new HttpEntity<>( this.httpHeaders);
        ResponseEntity<FrontDistance> jobsEstimateResponseResponse =
                apisRestTemplate.exchange(uri, HttpMethod.POST, entity, FrontDistance.class);
        System.out.println( "jhjhjjj"+jobsEstimateResponseResponse.getStatusCode().toString());

        return  jobsEstimateResponseResponse.getBody();
    }
    public Idresponse getIDdep(VTCComparatorRequest uberRequest){
        this.httpHeaders = new HttpHeaders();

        this.httpHeaders.put("authority", Collections.singletonList("maps.googleapis.com"));
        this.httpHeaders.put("cache-control", Collections.singletonList("max-age=0"));
        this.httpHeaders.put("upgrade-insecure-requests", Collections.singletonList("1"));
        this.httpHeaders.put("user-agent", Collections.singletonList("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.138 Safari/537.36 OPR/68.0.3618.150"));
        this.httpHeaders.put("accept", Collections.singletonList("text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9"));
        this.httpHeaders.put("sec-fetch-site", Collections.singletonList("none"));
        this.httpHeaders.put("sec-fetch-mode", Collections.singletonList("navigate"));
        this.httpHeaders.put("sec-fetch-user", Collections.singletonList("?1"));
        this.httpHeaders.put("sec-fetch-dest", Collections.singletonList("document"));
        this.httpHeaders.put("accept-language", Collections.singletonList("en-US,en;q=0.9,fr;q=0.8"));

        String uri = "https://maps.googleapis.com/maps/api/geocode/json?latlng="+uberRequest.getDepartureLocation().getLatitude()+","+uberRequest.getDepartureLocation().getLongitude()+"&key=AIzaSyDkJjmwF0PRX3IKKGwIn3v8j4uoHvjnWl0";

        HttpEntity<VTCComparatorRequest> entity = new HttpEntity<>(uberRequest , this.httpHeaders);
        ResponseEntity<Idresponse> jobsEstimateResponseResponse =
                apisRestTemplate.exchange(uri, HttpMethod.GET, entity, Idresponse.class);
        System.out.println( "yy"+jobsEstimateResponseResponse.getStatusCode().toString());

        return  jobsEstimateResponseResponse.getBody();

    }
    public Idresponse getIDArr(VTCComparatorRequest uberRequest){
        this.httpHeaders = new HttpHeaders();

        this.httpHeaders.put("authority", Collections.singletonList("maps.googleapis.com"));
        this.httpHeaders.put("cache-control", Collections.singletonList("max-age=0"));
        this.httpHeaders.put("upgrade-insecure-requests", Collections.singletonList("1"));
        this.httpHeaders.put("user-agent", Collections.singletonList("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.138 Safari/537.36 OPR/68.0.3618.150"));
        this.httpHeaders.put("accept", Collections.singletonList("text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9"));
        this.httpHeaders.put("sec-fetch-site", Collections.singletonList("none"));
        this.httpHeaders.put("sec-fetch-mode", Collections.singletonList("navigate"));
        this.httpHeaders.put("sec-fetch-user", Collections.singletonList("?1"));
        this.httpHeaders.put("sec-fetch-dest", Collections.singletonList("document"));
        this.httpHeaders.put("accept-language", Collections.singletonList("en-US,en;q=0.9,fr;q=0.8"));

        String uri = "https://maps.googleapis.com/maps/api/geocode/json?latlng="+uberRequest.getArrivalLocation().getLatitude()+","+uberRequest.getArrivalLocation().getLongitude()+"&key=AIzaSyDkJjmwF0PRX3IKKGwIn3v8j4uoHvjnWl0";

        HttpEntity<VTCComparatorRequest> entity = new HttpEntity<>(uberRequest , this.httpHeaders);
        ResponseEntity<Idresponse> jobsEstimateResponseResponse =
                apisRestTemplate.exchange(uri, HttpMethod.GET, entity, Idresponse.class);
        System.out.println( "yy"+jobsEstimateResponseResponse.getStatusCode().toString());

        return  jobsEstimateResponseResponse.getBody();

    }
}
