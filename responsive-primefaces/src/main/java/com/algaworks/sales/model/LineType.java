package com.algaworks.sales.model;

public enum LineType {

	PRODUCT("Product"),
	SERVICE("Service");
	
	private String description;

	LineType(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
}