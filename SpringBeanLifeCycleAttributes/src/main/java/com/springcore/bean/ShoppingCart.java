package com.springcore.bean;

import java.util.List;

public class ShoppingCart {
	private List<Product > products;

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		System.out.println("From setProducts() Method");
		this.products = products;
	}
	
}
