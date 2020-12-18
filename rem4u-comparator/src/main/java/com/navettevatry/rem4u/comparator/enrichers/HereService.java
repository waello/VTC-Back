package com.navettevatry.rem4u.comparator.enrichers;

import com.navettevatry.rem4u.common.resources.dto.here.ConsumptionRequest;
import com.navettevatry.rem4u.common.resources.dto.here.ConsumptionResponse;
import com.navettevatry.rem4u.common.resources.dto.here.WeatherRequest;
import com.navettevatry.rem4u.common.resources.dto.here.WeatherResponse;
import com.navettevatry.rem4u.common.resources.dto.kapten.WaitingTimeResponseSuccess;
import com.navettevatry.rem4u.common.utils.restclient.RestTemplateBuilder;
import com.navettevatry.rem4u.comparator.platforms.BcvtcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.annotation.PostConstruct;

/**
 * Here needed APIs Service Class to extract
 * marque , trajet , trafic, méteo, poids
 * Created by Chakib Daii.
 */

@Service
public class HereService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BcvtcService.class);

    @Value("${here.base-url}")
    private String BASE_URL;
    @Value("${here.app-id}")
    private String APP_ID;
    @Value("${here.app-code}")
    private String APP_CODE;
    @Value("${here.api-key}")
    private String API_KEY;

    @Autowired
    protected RestTemplate apisRestTemplate;

    protected HttpHeaders httpHeaders;

    @PostConstruct()
    void init() {
        LOGGER.debug("[HereService] PostConsruct");
        this.httpHeaders = new HttpHeaders();
    }

    /**
     * Method to get car Consumption from Here service
     * @param consumptionRequest
     * @return @{@link ConsumptionResponse}
     */
    public ConsumptionResponse getConsumption(ConsumptionRequest consumptionRequest){
        LOGGER.debug("[HereService] getConsumption");
        this.httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        String uri = "https://router.hereapi.com/v8/routes?"
                +"apiKey="+this.API_KEY
                +"&origin="+consumptionRequest.getOrigin().getLat()+","+consumptionRequest.getOrigin().getLng()
                +"&transportMode="+consumptionRequest.getTransportMode()
                +"&destination=" +consumptionRequest.getDestination().getLat()+","+consumptionRequest.getDestination().getLng()
                +"&return="+consumptionRequest.getReturnn()
                +"&ev[freeFlowSpeedTable]="+ consumptionRequest.getFreeFlowSpeedTable().toString().replace("[","").replace("]","").replace(" ","")
                +"&ev[trafficSpeedTable]="+ consumptionRequest.getTrafficSpeedTable().toString().replace("[","").replace("]","").replace(" ","")
                +"&ev[auxiliaryConsumption]="+consumptionRequest.getAuxiliaryConsumption()
                +"&ev[ascent]="+ consumptionRequest.getAscent().intValue()
                +"&ev[descent]="+consumptionRequest.getDescent()
                ;
        LOGGER.debug("uri: "+uri);

        HttpEntity entity = new HttpEntity<>(RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<ConsumptionResponse> consumptionResponseResponseEntity =
                apisRestTemplate.exchange(uri, HttpMethod.GET, entity,ConsumptionResponse.class);
        return  consumptionResponseResponseEntity.getBody();

    }

    /**
     * Method to get weather from Here service
     * @param weatherRequest
     * @return @{@link WeatherResponse}
     */
    public WeatherResponse getWeather(WeatherRequest weatherRequest){
        LOGGER.debug("[HereService] getWeather");
        this.httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        String uri ="https://weather.ls.hereapi.com/weather/1.0/report.json?"
                +"apiKey="+this.API_KEY
                +"&product="+ weatherRequest.getProduct()
                +"&name="+weatherRequest.getName();
        LOGGER.debug("uri: "+uri);

        HttpEntity entity = new HttpEntity<>(RestTemplateBuilder.getHeaders(this.httpHeaders));
            ResponseEntity<WeatherResponse> WeatherResponseResponseEntity =
                apisRestTemplate.exchange(uri, HttpMethod.GET, entity,WeatherResponse.class);
        return  WeatherResponseResponseEntity.getBody();
    }

}

