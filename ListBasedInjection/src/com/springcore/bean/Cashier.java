package com.springcore.bean;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

public class Cashier {
	private String filePath;
	private String fileName;
	private double totalPrice;
	private PrintWriter printWriter;
	public Cashier(String filePath,String fileName){
		this.filePath = filePath;
		this.fileName = fileName;
		openStream();
	}
	public void openStream(){
		try {
			printWriter = new PrintWriter(filePath+"/"+fileName+".txt");
		} catch (FileNotFoundException e) {
			System.out.println("Exception Occured while Creating or Finding the File :: "+e.getMessage());
		}
	}
	public void findTotalPrice(ShoppingCart cart){
		List<Product> products = cart.getProducts();
		System.out.println("Class Name: "+products.getClass());
		for(Product product:products){
			writeToFile(product);
			totalPrice = totalPrice+product.getPrice();
		}
		System.out.println("Total Price : "+totalPrice);
		printWriter.println("---------------------------------------------------------------------------");
		printWriter.println("Total Price : "+totalPrice);
		printWriter.flush();
		System.out.println("Data Successfully written into the File...!!!!");
	}
	public void writeToFile(Product product){
		printWriter.println(product.getProductId()+"\t"+product.getProductName()+"\t"+product.getPrice()+"\t"+new Date());
	}
	
}
