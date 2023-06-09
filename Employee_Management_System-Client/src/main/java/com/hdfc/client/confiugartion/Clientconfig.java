package com.hdfc.client.confiugartion;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.util.ResourceUtils;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Clientconfig {
	
	@Bean
	RestTemplate restTemplate(RestTemplateBuilder builder) {
		
		return builder
				.requestFactory(()-> validateSSL())
				.build();
	
	}

	private HttpComponentsClientHttpRequestFactory validateSSL() {
		
		String location = "C:\\Users\\Neha\\OneDrive\\Desktop\\HDFC Project\\Clinic OPD Booking System\\Employee_Management_System\\src\\main\\resources\\javatechie.jks";
		
		String password = "neha1432";
		
		SSLContext sslContext = null;
		
		try {
			
			sslContext = SSLContextBuilder.create().loadTrustMaterial(ResourceUtils.getFile(location),password.toCharArray()).build();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext, new LocalHostnameVerifier());
		
		CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(csf).build();
		
		HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(httpClient);
		
		 return clientHttpRequestFactory;
		
		
	}
	private class LocalHostnameVerifier implements HostnameVerifier{

		@Override
		public boolean verify(String hostname, SSLSession session) {
			// TODO Auto-generated method stub
			return "localhost".equalsIgnoreCase(hostname) || "127.0.0.1".equals(hostname);
		}
		
	}
}
