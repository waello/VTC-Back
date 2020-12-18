package com.navettevatry.rem4u.comparator.platforms;

import com.navettevatry.rem4u.common.resources.dto.EureCab.CompanyResult.CompanyRequest;
import com.navettevatry.rem4u.common.resources.dto.EureCab.CompanyResult.CompanyResponse;
import com.navettevatry.rem4u.common.resources.dto.EureCab.EuroCabRequest;
import com.navettevatry.rem4u.common.resources.dto.EureCab.EuroCabResponse;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorRequest;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorResponse;
import com.navettevatry.rem4u.common.resources.enumeration.eurecab.EureCabProvider;
import com.navettevatry.rem4u.common.utils.mapper.requests.EureCabRequestsMapper;
import com.navettevatry.rem4u.common.utils.mapper.requests.KaptenRequestsMapper;
import com.navettevatry.rem4u.common.utils.mapper.responses.EureCabResponsesMapper;
import com.navettevatry.rem4u.common.utils.mapper.responses.KaptenResponsesMapper;
import com.navettevatry.rem4u.common.utils.restclient.RestTemplateBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.text.SimpleDateFormat;

@Service
public class EureCabService {

    @Value("${eurecab.base-url}")
    private String BASE_URL;
    @Value("${eurecab.base-url.company}")
    private String BASE_URL2;

    private static final Logger LOGGER = LoggerFactory.getLogger(EureCabService.class);

    protected HttpHeaders httpHeaders;

    @Autowired
    protected RestTemplate apisRestTemplate;

    @PostConstruct()
    void init() {
        LOGGER.debug("[EuroCabService] PostConsruct");
        this.httpHeaders = new HttpHeaders();
        this.httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        this.httpHeaders.add("authority", "www.eurecab.com");
        this.httpHeaders.add("x-requested-with","XMLHttpRequest");
        this.httpHeaders.add("accept-language", "en");
        this.httpHeaders.add("sec-fetch-site", "same-origin");
        this.httpHeaders.add("sec-fetch-mode", "cors");
        this.httpHeaders.add("sec-fetch-dest", "empty");
        this.httpHeaders.add("referer", "https://www.eurecab.com/en/search");
    }

    public VTCComparatorResponse getEureCabResponse(VTCComparatorRequest vtcComparatorRequest) throws Exception {
        LOGGER.debug("[EureCabService] getEureCabResponse");
        final long start = System.currentTimeMillis();

        VTCComparatorResponse vtcComparatorResponse = null;
        try{
            vtcComparatorResponse = EureCabResponsesMapper
                    .euroCabResponseToVTCComparatorResponse(
                            this.getData(EureCabRequestsMapper.VTCComparatorRequestToEuroCabRequest.apply(vtcComparatorRequest))
                            ,null);
        }catch (Exception e){ LOGGER.debug(e.toString()); }

        LOGGER.debug("[EureCabService] Elapsed time: {}", (System.currentTimeMillis() - start));

        return vtcComparatorResponse;
    }

    /**
     *
     * @param companyRequest
     * @param eureCabProvider
     * @return
     */
    public CompanyResponse getData(CompanyRequest companyRequest, EureCabProvider eureCabProvider) {
        LOGGER.debug("[EuroCabService_CompanyResponse] GetData");
//        String uri = getUrii("/{id}/estimate?");
        String uri = this.BASE_URL2+"/"+ eureCabProvider.getProviderId()+"/estimate?";
        HttpEntity entity = new HttpEntity<>(RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<CompanyResponse> CompanyResponse=
                apisRestTemplate.exchange(uri, HttpMethod.GET, entity, CompanyResponse.class);
        return  CompanyResponse.getBody();
    }

    /**
     *
     * @param euroCabRequest
     */
    public EuroCabResponse getData(EuroCabRequest euroCabRequest) {
        LOGGER.debug("[EuroCabService] GetData");
//        String uri = getUri("");
        String uri = this.BASE_URL+"?"
                +"type_vehicle="+ (euroCabRequest.getTypeVehicle() != null ? euroCabRequest.getTypeVehicle(): "")
                +"&from="+ euroCabRequest.getFrom()
                +"&to=" + euroCabRequest.getTo()
                +"&date="+ new SimpleDateFormat("dd/MM/yyyy hh:mm").format(euroCabRequest.getDate());
        LOGGER.debug(uri);
        HttpEntity entity = new HttpEntity<>(RestTemplateBuilder.getHeaders(this.httpHeaders));
        ResponseEntity<EuroCabResponse> euroCabResponse=
                apisRestTemplate.exchange(uri, HttpMethod.GET, entity, EuroCabResponse.class);
        return  euroCabResponse.getBody();
    }

    /**
     * @param service
     * @return @{@link String}
     */
//    protected String getUri(String service) {
//        return this.BASE_URL + "" + service;
//    }
//    protected String getUrii(String service) {
//        return this.BASE_URL2 + "" + service;
//    }
}
