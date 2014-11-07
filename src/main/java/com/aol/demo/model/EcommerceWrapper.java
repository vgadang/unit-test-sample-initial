package com.aol.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class EcommerceWrapper {
	private String code;
	private String description;
	private Product product;
	private CmsBlock cmsBlock;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public CmsBlock getCmsBlock() {
		return cmsBlock;
	}
	public void setCmsBlock(CmsBlock cmsBlock) {
		this.cmsBlock = cmsBlock;
	}
}
