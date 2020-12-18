package com.navettevatry.rem4u.comparator.enrichers;


import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.navettevatry.rem4u.common.resources.dto.Tomtom.TraficRequest;
import com.navettevatry.rem4u.common.resources.dto.Tomtom.TraficResponse;
import com.navettevatry.rem4u.common.utils.restclient.RestTemplateBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.io.IOException;

/**
 * Here needed APIs Service Class to extract
 * trafic
 * Created by Ichrak Ben Abdallah
 */

@Service
public class TomtomService {
    private static final Logger LOGGER = LoggerFactory.getLogger(TomtomService.class);

    @Value("${here.base-url}")
    private String BASE_URL;
    @Value("${tom.api-key}")
    private String API_KEY;

    @Autowired
    protected RestTemplate apisRestTemplate;

    @Autowired
    XmlMapper xmlMapper;

    protected HttpHeaders httpHeaders;

    @PostConstruct()
    void init() {
        LOGGER.debug("[TomtomService] PostConsruct");
        this.httpHeaders = new HttpHeaders();
    }
    /**
     * @param traficRequest
     * @return
     */
    public TraficResponse getTrafic(TraficRequest traficRequest) {
        LOGGER.debug(String.valueOf(traficRequest.getPoint().getLatitude()));
        LOGGER.debug("[TomtomService] getTrafic");
        String uri ="https://api.tomtom.com/traffic/services/4/flowSegmentData/absolute/10/json?"
                +"Key="+this.API_KEY
                +"&point="
               +traficRequest.getPoint().getLatitude()+","+traficRequest.getPoint().getLongitude();

        LOGGER.debug("uri: "+uri);
        ResponseEntity<TraficResponse> traficResponseResponseEntity =
                apisRestTemplate.exchange(uri, HttpMethod.GET, null,TraficResponse.class);

        LOGGER.debug("dia: "+traficResponseResponseEntity.getBody());

        return  traficResponseResponseEntity.getBody();
    }
}
