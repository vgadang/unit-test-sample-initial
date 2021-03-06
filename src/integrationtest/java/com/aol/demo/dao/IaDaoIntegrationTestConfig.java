package com.aol.demo.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.aol.demo.RestConfiguration;

@Configuration
@ImportResource({"classpath*:spring/properties-context.xml"})
@Import({RestConfiguration.class})
public class IaDaoIntegrationTestConfig {
	
	@Bean
	public IaDao iaDao() {
		return new IaDaoImpl();
	}
	
}