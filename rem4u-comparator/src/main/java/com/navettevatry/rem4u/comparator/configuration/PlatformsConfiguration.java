package com.navettevatry.rem4u.comparator.configuration;


import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.LaxRedirectStrategy;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.filter.CharacterEncodingFilter;

import java.nio.charset.Charset;
import java.util.Arrays;

/**
 * Created by Chakib Daii.
 */
@Configuration
//@ComponentScan(basePackageClasses = {AlloCabService.class, BcvtcService.class, KaptenService.class,
//        LeCabService.class, LyftService.class, OlaCabService.class, SnapCarService.class, UberService.class,
//        HereService.class, ComparisonService.class})
@ComponentScan(basePackages = "com.navettevatry.rem4u.comparator")
@PropertySource({"classpath:application.properties"})
public class PlatformsConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(PlatformsConfiguration.class);

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    @Primary
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }


    /**
     * Bean to make jackson automatically convert from
     * camelCase (java) to under_scores (json) in property names
     *
     * @return ObjectMapper that maps from Java camelCase to json under_score names
     */
    @Bean
    public ObjectMapper jacksonObjectMapper()
    {
        return new ObjectMapper().setPropertyNamingStrategy(propertyNamingStrategy());
    }

    @Bean
    public XmlMapper xmlMapper(){
        return new XmlMapper();
    }

    @Bean
    public PropertyNamingStrategy propertyNamingStrategy()
    {
        return new UpperCaseUnderscoreStrategy();
    }

    @Bean
    public RestTemplate apisRestTemplate(){

        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
        requestFactory.setReadTimeout(1000000);
        requestFactory.setConnectTimeout(1000000);
        HttpClient httpClient = HttpClientBuilder.create()
                .setRedirectStrategy(new LaxRedirectStrategy())
                .build();
        requestFactory.setHttpClient(httpClient);
        RestTemplate restTemplate = new RestTemplate(requestFactory);

		MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
		mappingJackson2HttpMessageConverter
				.setSupportedMediaTypes(Arrays.asList(MediaType.ALL,MediaType.APPLICATION_JSON, MediaType.APPLICATION_OCTET_STREAM
                        , MediaType.APPLICATION_XML,MediaType.TEXT_HTML,MediaType.APPLICATION_XHTML_XML, MediaType.TEXT_XML
                        ,MediaType.parseMediaType("application/xml;charset=utf-8"),MediaType.parseMediaType("text/html;charset=utf-8")
                ,new MediaType( "application" , "json" , Charset.forName( "UTF-8" ))));
		mappingJackson2HttpMessageConverter.getObjectMapper().configure(JsonParser.Feature.AUTO_CLOSE_SOURCE, true);
		mappingJackson2HttpMessageConverter.getObjectMapper().configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
        mappingJackson2HttpMessageConverter.getObjectMapper().configure(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER, true);
        mappingJackson2HttpMessageConverter.getObjectMapper().configure(JsonParser.Feature.ALLOW_MISSING_VALUES, true);
        mappingJackson2HttpMessageConverter.getObjectMapper().configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        mappingJackson2HttpMessageConverter.getObjectMapper().configure(JsonParser.Feature.IGNORE_UNDEFINED, true);
        mappingJackson2HttpMessageConverter.getObjectMapper().configure(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS, true);
        mappingJackson2HttpMessageConverter.getObjectMapper().configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        mappingJackson2HttpMessageConverter.getObjectMapper().configure(JsonParser.Feature.ALLOW_TRAILING_COMMA, true);
        mappingJackson2HttpMessageConverter.getObjectMapper().configure(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS, true);

        mappingJackson2HttpMessageConverter.getObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mappingJackson2HttpMessageConverter.getObjectMapper().configure(DeserializationFeature.READ_ENUMS_USING_TO_STRING, true);
        mappingJackson2HttpMessageConverter.getObjectMapper().configure(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE, true);
        mappingJackson2HttpMessageConverter.getObjectMapper().configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false);
        mappingJackson2HttpMessageConverter.getObjectMapper().configure(DeserializationFeature.FAIL_ON_TRAILING_TOKENS, false);
        mappingJackson2HttpMessageConverter.getObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        mappingJackson2HttpMessageConverter.getObjectMapper().configure(JsonGenerator.Feature.ESCAPE_NON_ASCII, true);

        restTemplate.getMessageConverters().add(mappingJackson2HttpMessageConverter);

        StringHttpMessageConverter stringHttpMessageConverter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
		stringHttpMessageConverter.setSupportedMediaTypes(Arrays.asList(MediaType.ALL,MediaType.APPLICATION_JSON, MediaType.APPLICATION_OCTET_STREAM
                , MediaType.APPLICATION_XML,MediaType.TEXT_HTML,MediaType.APPLICATION_XHTML_XML, MediaType.TEXT_XML
                ,MediaType.parseMediaType("application/xml;charset=utf-8"),MediaType.parseMediaType("text/html;charset=utf-8")
                ,new MediaType( "application" , "json" , Charset.forName( "UTF-8" ))));
		stringHttpMessageConverter.setWriteAcceptCharset(true);
        restTemplate.getMessageConverters().add(stringHttpMessageConverter);

        MappingJackson2HttpMessageConverter bcvtcMappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        bcvtcMappingJackson2HttpMessageConverter.setObjectMapper(jacksonObjectMapper());
        restTemplate.getMessageConverters().add(bcvtcMappingJackson2HttpMessageConverter);

        return  restTemplate;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setForceEncoding(true);
        characterEncodingFilter.setEncoding("UTF-8");
        registrationBean.setFilter(characterEncodingFilter);
        return registrationBean;
    }
}
