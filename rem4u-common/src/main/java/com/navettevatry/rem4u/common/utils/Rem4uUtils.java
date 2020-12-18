package com.navettevatry.rem4u.common.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCComparatorRequest;
import com.navettevatry.rem4u.common.resources.dto.uber.Idresponse;
import com.navettevatry.rem4u.common.resources.enumeration.FrontDistance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.security.MessageDigest;
import java.util.Collections;
import java.util.UUID;

/**
 * * @author Chakib Daii
 */
public class Rem4uUtils {
    @Autowired
    protected RestTemplate apisRestTemplate;

    protected HttpHeaders httpHeaders;
    private static final Logger LOGGER = LoggerFactory.getLogger(Rem4uUtils.class);

    public static Double AVERAGE_SPEED1 = 50.0; //average speed in km
    public static Double AVERAGE_SPEED2 = 90.0; //average speed in km
    public static Double AVERAGE_SPEED3 = 120.0; //average speed in km

    public static Double AVERAGE_SPEED = 4.5; //average speed in km

    /**
     * isEmptyOrNull
     *
     * @param strValue
     * @return boolean
     * <p>
     * This method returns true if the given string is null or empty string,
     * otherwise returns false
     */
    public static boolean isEmptyOrNull(String strValue) {
        if (strValue == null || strValue.trim().length() == 0) {
            return true;
        }
        return false;
    }

    public static String valueOf(String str) {
        return (isEmptyOrNull(str)) ? "" : str;
    }



    /**
     * This method used  to convert json to required Class
     *
     * @param json
     * @param classType
     * @return
     */
    public static Object convertJsonToClassObject(String json, Class classType) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(json, classType);
        } catch (Exception e) {
            LOGGER.error("an exception have been occurred in 'convertJsonToClassObject' method :", e);
            return null;
        }
    }

    /**
     * Used to convert an object to Json
     *
     * @param object
     * @return
     */
    public static String convertToJson(Object object) {
        ObjectMapper objectMapper = new ObjectMapper();
        String json = "";
        try {
            json = objectMapper.writeValueAsString(object);
        } catch (Exception e) {
            LOGGER.error("an exception have been occurred in 'convertToJson' method :", e);
        }
        return json;
    }
    
    static final String PSWD_SEPARATOR = "^$~(";
    static final String SHARED_PRIVATE_KEY = "10d1b5ae-3c39-4d";

    /**
     * Used to hashing Uuid (according to given digest (SHA-512))
     *
     * @return
     */
    public static String encodeUuid(String uuid) {
        String hashCode = "";
        try {
            if (uuid != null) {
                hashCode = uuid + PSWD_SEPARATOR + SHARED_PRIVATE_KEY;
                MessageDigest digest = MessageDigest.getInstance("SHA-512");

                digest.update(hashCode.getBytes());

                byte[] bytes = digest.digest();
                StringBuffer buffer = new StringBuffer();

                for (int i = 0; i < bytes.length; i++) {
                    int b = bytes[i] & 0xff;

                    if (b < 16) {
                        buffer.append("0");
                    }
                    buffer.append(Integer.toHexString(b));
                }
                hashCode = buffer.toString();
            }
        } catch (Exception e) {
            LOGGER.error("an exception have been occurred in 'encodeUuid' method :", e);

        }
        return hashCode.toUpperCase();
    }

    public  FrontDistance distance(VTCComparatorRequest vtc) {

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

        String uri ="https://maps.googleapis.com/maps/api/distancematrix/json?origins=54.406505,18.67708&destinations=54.446251,18.570993&mode=driving&language=en-EN&sensor=false&key=AIzaSyDkJjmwF0PRX3IKKGwIn3v8j4uoHvjnWl0";
                HttpEntity<VTCComparatorRequest> entity = new HttpEntity<>( this.httpHeaders);
        ResponseEntity<FrontDistance> jobsEstimateResponseResponse =
                apisRestTemplate.exchange(uri, HttpMethod.GET, entity, FrontDistance.class);
        System.out.println( "yy"+jobsEstimateResponseResponse.getStatusCode().toString());

        return  jobsEstimateResponseResponse.getBody();
    }
}
