package com.psl.project.model;

public class Product {
	private int productId;
	private String productName;	
	private double productPrice;
	private Stock stockId;
	
	public Product() {
		
	}

	public Product(int productId, String productName, double productPrice, Stock stockId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.stockId = stockId;
	}

	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the productPrice
	 */
	public double getProductPrice() {
		return productPrice;
	}

	/**
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	/**
	 * @return the stockId
	 */
	public Stock getStockId() {
		return stockId;
	}

	/**
	 * @param stockId the stockId to set
	 */
	public void setStockId(Stock stockId) {
		this.stockId = stockId;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", "
				+ (productName != null ? "productName=" + productName + ", " : "") + "productPrice=" + productPrice
				+ ", " + (stockId != null ? "stockId=" + stockId : "") + "]";
	}		
}