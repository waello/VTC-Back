package com.navettevatry.rem4u.comparator.platforms;

import com.navettevatry.rem4u.common.resources.dto.TaxiMetre.TaxiMetreRequest;
import com.navettevatry.rem4u.common.resources.dto.TaxiMetre.TaxiResponse;
import com.navettevatry.rem4u.common.resources.dto.allocab.TripCreateResponse;
import com.navettevatry.rem4u.common.utils.restclient.RestTemplateBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@Service
public class TaxiMetreService {
    @Value("${taximetre.base-url}")
    private String BASE_URL;


    private static final Logger LOGGER = LoggerFactory.getLogger(EureCabService.class);
    protected HttpHeaders httpHeaders;

    @Autowired
    protected RestTemplate apisRestTemplate;

    @PostConstruct()
    void init() {

    }

    /**
     *
     * @param TaxiMetreRequest
     * @return @{@link TripCreateResponse}
     */
    public TaxiResponse GetData (TaxiMetreRequest TaxiMetreRequest) {
        LOGGER.debug("[TaxiMetreService] GetData");
        String uri = this.BASE_URL;
        HttpEntity<TaxiMetreRequest> entity = new HttpEntity<>(TaxiMetreRequest , RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<TaxiResponse> TaxiMetreResponse=
                apisRestTemplate.exchange(uri, HttpMethod.POST, entity, TaxiResponse.class);
        return  TaxiMetreResponse.getBody();
    }


}
