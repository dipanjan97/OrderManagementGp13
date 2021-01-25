package com.psl.project.model;

public class Stock {
	private int itemNumber;
	private String itemDescription;
	private double itemPrice;
	
	public Stock() {
		
	}
	
	
	/**
	 * @return the itemNumber
	 */
	public int getItemNumber() {
		return itemNumber;
	}
	/**
	 * @param itemNumber the itemNumber to set
	 */
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	/**
	 * @return the itemDescription
	 */
	public String getItemDescription() {
		return itemDescription;
	}
	/**
	 * @param itemDescription the itemDescription to set
	 */
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	/**
	 * @return the itemPrice
	 */
	public double getItemPrice() {
		return itemPrice;
	}
	/**
	 * @param itemPrice the itemPrice to set
	 */
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	@Override
	public String toString() {
		return "Stock [itemNumber=" + itemNumber + ", "
				+ (itemDescription != null ? "itemDescription=" + itemDescription + ", " : "") + "itemPrice="
				+ itemPrice + "]";
	}
	
	
	public boolean checkAvailability() {				
		
		return false;
	}
	
	
}
