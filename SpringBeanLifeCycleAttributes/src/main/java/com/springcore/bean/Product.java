package com.springcore.bean;

public class Product {
	
	private int productId;
	private String productName;
	private double price;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		System.out.println("From setProductId() Method");
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		System.out.println("From setProductName() Method");
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		System.out.println("From setPrice() Method");
		this.price = price;
	}
	
}
