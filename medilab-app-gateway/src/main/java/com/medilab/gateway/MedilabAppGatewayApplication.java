package com.medilab.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class MedilabAppGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedilabAppGatewayApplication.class, args);
	}
	
	@Bean
	public GatewayFilter gatewayFilter() {
		return new GatewayFilter();
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
