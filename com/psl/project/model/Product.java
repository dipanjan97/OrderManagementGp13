package com.psl.project.model;

import java.util.ArrayList;

public class Product {
	private String productID;
	private String name;
	private long price; 
	private ArrayList<Stock> stock = new ArrayList<>();
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String productID, String name, long price, ArrayList<Stock> stock) {
		this.productID = productID;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public ArrayList<Stock> getStock() {
		return stock;
	}

	public void setStock(ArrayList<Stock> stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Product [productID=" + productID + ", name=" + name + ", price=" + price + ", stock=" + stock + "]";
	}

	
}
