package com.aol.demo.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.aol.demo.RestConfiguration;

@Configuration
@ImportResource({"classpath*:spring/properties-context.xml"})
@Import({RestConfiguration.class})
public class CatalogDaoIntegrationTestConfig {
	
	@Bean
	public CatalogDao catalogService() {
		return new CatalogDaoImpl();
	}
	
}