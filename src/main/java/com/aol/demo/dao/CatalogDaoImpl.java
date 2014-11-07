package com.aol.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;

import com.aol.demo.model.EcommerceWrapper;
import com.aol.demo.model.Product;

@Service
public class CatalogDaoImpl implements CatalogDao {

	@Value("${ecommerce.endpoint}")
	private String ecommerceEndpoint;
	
	@Autowired
	private RestOperations restOperations;
	
	@Override
	public Product getProduct(String sku) {
		String url = String.format("%s/products/%s", ecommerceEndpoint, sku);
		EcommerceWrapper wrapper = restOperations.getForObject(url, EcommerceWrapper.class);
		return wrapper.getProduct();
	}

}
