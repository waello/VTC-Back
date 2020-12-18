package com.navettevatry.rem4u.common.utils.restclient;

import com.navettevatry.rem4u.common.utils.response.GenericResponse;
import com.navettevatry.rem4u.common.utils.response.GenericResponseBody;
import com.navettevatry.rem4u.common.utils.response.GenericResponseHeader;
import com.navettevatry.rem4u.common.utils.response.body.BooleanResponse;
import com.navettevatry.rem4u.common.utils.response.body.ListResponse;
import com.navettevatry.rem4u.common.utils.response.body.ObjectResponse;
import com.navettevatry.rem4u.common.utils.response.body.PaginatedListResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * * @author Chakib Daii
 */
public class CustomRestTemplate {

    // Create a Rest template
    private RestTemplate restTemplate = RestTemplateBuilder.build();
    private final Logger LOGGER = LoggerFactory.getLogger(CustomRestTemplate.class);

    public BooleanResponse getBooleanResponse(String uri, HttpHeaders httpHeaders)  {
        return (BooleanResponse) getGenericResponseBody(uri, httpHeaders, new ParameterizedTypeReference<GenericResponse<BooleanResponse>>() {
        });
    }

    public <T> ObjectResponse getObjectResponse(String uri, HttpHeaders httpHeaders, Class<T> type)  {
        return (ObjectResponse<T>) getGenericResponseBody(uri, httpHeaders, new ParameterizedTypeReference<GenericResponse<ObjectResponse<T>>>() {
        });
    }

    public <T> ListResponse<T> getListResponse(String uri, HttpHeaders httpHeaders, Class<T> type, HashMap<String, String> filters)  {
        if (filters != null)
            uri += filtersToUri(filters);
        return (ListResponse<T>) getGenericResponseBody(uri, httpHeaders, new ParameterizedTypeReference<GenericResponse<ListResponse<T>>>() {
        });
    }

    public <T> PaginatedListResponse getPaginatedListResponse(String uri, HttpHeaders httpHeaders, Class T, HashMap<String, String> filters)  {
        if (filters != null)
            uri += filtersToUri(filters);
        return (PaginatedListResponse<T>) getGenericResponseBody(uri, httpHeaders, new ParameterizedTypeReference<GenericResponse<PaginatedListResponse<T>>>() {
        });
    }

    public <T> void delete(String uri, HttpHeaders httpHeaders)  {
        HttpEntity<T> httpEntity = new HttpEntity(RestTemplateBuilder.getHeaders(httpHeaders));
        HttpEntity<GenericResponse> genericResponse = restTemplate.exchange(uri, HttpMethod.DELETE, httpEntity, GenericResponse.class);
    }

    public <T> void putObject(String uri, T obj, HttpHeaders httpHeaders)  {
        HttpEntity<T> httpEntity = new HttpEntity(obj, RestTemplateBuilder.getHeaders(httpHeaders));
        HttpEntity<GenericResponse> genericResponse = restTemplate.exchange(uri, HttpMethod.PUT, httpEntity, GenericResponse.class);
    }

    public <T> void putParams(String uri, HttpHeaders httpHeaders)  {
        HttpEntity<T> httpEntity = new HttpEntity(RestTemplateBuilder.getHeaders(httpHeaders));
        HttpEntity<GenericResponse> genericResponse = restTemplate.exchange(uri, HttpMethod.PUT, httpEntity, GenericResponse.class);
    }

    public <T> void postObject(String uri, T obj, HttpHeaders httpHeaders)  {
        HttpEntity<T> httpEntity = new HttpEntity(obj, RestTemplateBuilder.getHeaders(httpHeaders));
        HttpEntity<GenericResponse> responseHttpEntity = restTemplate.exchange(uri, HttpMethod.POST, httpEntity, GenericResponse.class);
    }

    public <T, R> ListResponse<R> postObjectGetListResponse(String uri, HttpHeaders httpHeaders, T obj, Class R)  {
        return ((ListResponse<R>) postObjectGetGenericResponseBody(uri, httpHeaders, obj, new ParameterizedTypeReference<GenericResponse<ListResponse<R>>>() {
        }));
    }

    public <T, R> ObjectResponse<R> postObjectGetObjectResponse(String uri, HttpHeaders httpHeaders, T obj, Class R)  {
        return ((ObjectResponse<R>) postObjectGetGenericResponseBody(uri, httpHeaders, obj, new ParameterizedTypeReference<GenericResponse<ObjectResponse<R>>>() {
        }));
    }

    public <T, R extends GenericResponseBody> GenericResponseBody postObjectGetGenericResponseBody(String uri, HttpHeaders httpHeaders, T obj, ParameterizedTypeReference<GenericResponse<R>> typeReference)  {
        HttpEntity<T> httpEntity = new HttpEntity(obj, RestTemplateBuilder.getHeaders(httpHeaders));
        LOGGER.debug(httpEntity.toString());
        HttpEntity<GenericResponse<R>> responseHttpEntity = restTemplate.exchange(uri, HttpMethod.POST, httpEntity, typeReference);
        LOGGER.debug(responseHttpEntity.toString());
        return responseHttpEntity.getBody().getBody();
    }

    public <T, R extends GenericResponseBody> GenericResponseBody putObjectGetGenericResponseBody(String uri, HttpHeaders httpHeaders, T obj, ParameterizedTypeReference<GenericResponse<R>> typeReference)  {
        HttpEntity<T> httpEntity = new HttpEntity(obj, RestTemplateBuilder.getHeaders(httpHeaders));
        HttpEntity<GenericResponse<R>> responseHttpEntity = restTemplate.exchange(uri, HttpMethod.PUT, httpEntity, typeReference);
        return responseHttpEntity.getBody().getBody();
    }

    public <T, R extends GenericResponseBody> GenericResponseBody putObjectGetGenericResponse(String uri, HttpHeaders httpHeaders, ParameterizedTypeReference<GenericResponse<R>> typeReference)  {
        HttpEntity<T> httpEntity = new HttpEntity(RestTemplateBuilder.getHeaders(httpHeaders));
        HttpEntity<GenericResponse<R>> responseHttpEntity = restTemplate.exchange(uri, HttpMethod.PUT, httpEntity, typeReference);
        return responseHttpEntity.getBody().getBody();
    }

    public <T extends GenericResponseBody> GenericResponseBody getGenericResponseBody(String uri, HttpHeaders httpHeaders, ParameterizedTypeReference<GenericResponse<T>> typeReference)  {
        HttpEntity<String> httpEntity = new HttpEntity(RestTemplateBuilder.getHeaders(httpHeaders));
        ResponseEntity<GenericResponse<T>> responseEntity = restTemplate.exchange(uri, HttpMethod.GET, httpEntity, typeReference);
        GenericResponse<T> genericResponse = responseEntity.getBody();
        return genericResponse.getBody();
    }

    public <T, R extends GenericResponseBody> GenericResponseBody deleteObjectGetGenericResponseBody(String uri, HttpHeaders httpHeaders, T obj, ParameterizedTypeReference<GenericResponse<R>> typeReference)  {
        HttpEntity<T> httpEntity = new HttpEntity(obj, RestTemplateBuilder.getHeaders(httpHeaders));
        HttpEntity<GenericResponse<R>> responseHttpEntity = restTemplate.exchange(uri, HttpMethod.DELETE, httpEntity, typeReference);
        return responseHttpEntity.getBody().getBody();
    }
    public <T, R extends GenericResponseBody> GenericResponseBody deleteObjectGetGenericResponse(String uri, HttpHeaders httpHeaders, ParameterizedTypeReference<GenericResponse<R>> typeReference)  {
        HttpEntity<T> httpEntity = new HttpEntity(RestTemplateBuilder.getHeaders(httpHeaders));
        HttpEntity<GenericResponse<R>> responseHttpEntity = restTemplate.exchange(uri, HttpMethod.DELETE, httpEntity, typeReference);
        return responseHttpEntity.getBody().getBody();
    }

    public String filtersToUri(HashMap<String, String> filters) {
        String params = "";
        if (filters.size() > 0) {
            boolean first = true;
            for (Map.Entry<String, String> entry : filters.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (first) {
                    params += "?" + key + "=" + value;
                    first = false;
                } else {
                    params += "&" + key + "=" + value;
                }
            }
        }
        return params;
    }
}
