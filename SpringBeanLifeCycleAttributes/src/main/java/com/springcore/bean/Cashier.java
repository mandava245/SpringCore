package com.springcore.bean;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

public class Cashier {
	private String filePath;
	private String fileName;
	private double totalCost;
	private PrintWriter printWriter;
	
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		System.out.println("From setFilePath() Method...");
		this.filePath = filePath;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		System.out.println("From setFileName() Method");
		this.fileName = fileName;
	}
	public void openStream(){
		System.out.println("Opening the Stream");
		try {
			printWriter = new PrintWriter(filePath+"/"+fileName+".txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void writeProductToFile(Product product){
		printWriter.println(product.getProductName()+"\t"+product.getPrice()+"\t"+new Date());
	}
	public void calculateTotalPrice(ShoppingCart cart){
		List< Product> products = cart.getProducts();
		for(Product product : products){
			writeProductToFile(product);
			totalCost = totalCost+ product.getPrice();
			}
		printWriter.println("--------------------------------------------------------------");
		printWriter.println("Total Price : "+ totalCost );
		System.out.println("Total Price : "+ totalCost);
		printWriter.flush();

	}
	public void closeStream(){
		System.out.println("Closing the Stream");
		printWriter.close();
	}
		
}
