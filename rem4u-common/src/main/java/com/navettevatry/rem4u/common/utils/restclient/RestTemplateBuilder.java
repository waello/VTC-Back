package com.navettevatry.rem4u.common.utils.restclient;

import com.navettevatry.rem4u.common.utils.Rem4uUtils;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.protocol.HTTP;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.CharsetEncoder;
import java.util.*;

/**
 * * @author Chakib Daii
 */
public class RestTemplateBuilder {

	public static RestTemplate build(String username, String password) {
		HttpClient httpClient = createHttpClient(username, password);
		return securityRestTemplateBuilder(httpClient);
	}

	public static RestTemplate build() {
		HttpClient httpClient = createHttpClient();
		return securityRestTemplateBuilder(httpClient);
	}

	public static RestTemplate securityRestTemplateBuilder(HttpClient httpClient) {
//		HttpComponentsClientHttpRequestFactory requestFactory = createRequestFactory(httpClient);
		HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
		requestFactory.setReadTimeout(1000000);
		requestFactory.setConnectTimeout(1000000);
		RestTemplate restTemplate = new RestTemplate(requestFactory);
//		MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
//		mappingJackson2HttpMessageConverter
//				.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON, MediaType.APPLICATION_OCTET_STREAM));
//		restTemplate.getMessageConverters().add(mappingJackson2HttpMessageConverter);

		ClientHttpRequestInterceptor ri = new LoggingRequestInterceptor();
		List<ClientHttpRequestInterceptor> clientHttpRequestInterceptors = new ArrayList<ClientHttpRequestInterceptor>();
		clientHttpRequestInterceptors.add(ri);
		restTemplate.setInterceptors(clientHttpRequestInterceptors);
//		restTemplate.setRequestFactory(new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));
		return restTemplate;
	}

	private static HttpComponentsClientHttpRequestFactory createRequestFactory(HttpClient httpClient) {
		HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
		clientHttpRequestFactory.setHttpClient(httpClient);
		return clientHttpRequestFactory;
	}

	private static HttpClient createHttpClient(String username, String password) {
		CredentialsProvider provider = new BasicCredentialsProvider();
		UsernamePasswordCredentials credentials = new UsernamePasswordCredentials(username, password);
		provider.setCredentials(AuthScope.ANY, credentials);
		HttpClient client = HttpClientBuilder.create().setDefaultCredentialsProvider(provider).build();
		return client;
	}

	private static HttpClient createHttpClient() {
		CredentialsProvider provider = new BasicCredentialsProvider();
		HttpClient client = HttpClientBuilder.create().setDefaultCredentialsProvider(provider).build();
		return client;
	}

	public static HttpHeaders getHeaders() {
		HttpHeaders headers = new HttpHeaders();

		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		return headers;

	}

	public static HttpHeaders getHeaders(HttpHeaders httpHeaders) {
		HttpHeaders headers = new HttpHeaders();
		headers.addAll(httpHeaders);
		headers.setAccept(Arrays.asList(MediaType.ALL, MediaType.APPLICATION_JSON
				, MediaType.APPLICATION_XML,MediaType.TEXT_HTML,MediaType.APPLICATION_XHTML_XML
				,MediaType.parseMediaType("application/xml;charset=utf-8"),MediaType.parseMediaType("text/html;charset=utf-8")
				,MediaType.TEXT_PLAIN,MediaType.APPLICATION_OCTET_STREAM));
		headers.setCacheControl(CacheControl.noCache());
		headers.put("User-Agent", Collections.singletonList("Mozilla/5.0"));

		return headers;

	}
}
