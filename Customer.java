package com.psl.project.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Customer {
	private int custID;
	private String custName;
	private String custEmail;
	private String custAddress;	
	private ArrayList<PlacedOrder> placedOrder; 
	private ArrayList<Product> product;
	
	public Customer() {
		
	}
	
	public Customer(int custID, String custName, String custEmail, String custAddress,
		ArrayList<PlacedOrder> placedOrder, ArrayList<Product> product) {
		super();
		this.custID = custID;
		this.custName = custName;
		this.custEmail = custEmail;
		this.custAddress = custAddress;
		this.placedOrder = placedOrder;
		this.product = product;
	}



	/**
	 * @return the product
	 */
	public ArrayList<Product> getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(ArrayList<Product> product) {
		this.product = product;
	}



	/**
	 * @return the custID
	 */
	public int getCustID() {
		return custID;
	}

	/**
	 * @param custID the custID to set
	 */
	public void setCustID(int custID) {
		this.custID = custID;
	}

	/**
	 * @return the custName
	 */
	public String getCustName() {
		return custName;
	}

	/**
	 * @param custName the custName to set
	 */
	public void setCustName(String custName) {
		this.custName = custName;
	}

	/**
	 * @return the custEmail
	 */
	public String getCustEmail() {
		return custEmail;
	}

	/**
	 * @param custEmail the custEmail to set
	 */
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	/**
	 * @return the custAddress
	 */
	public String getCustAddress() {
		return custAddress;
	}

	/**
	 * @param custAddress the custAddress to set
	 */
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	
	

	/**
	 * @return the placedOrder
	 */
	public ArrayList<PlacedOrder> getPlacedOrder() {
		return placedOrder;
	}

	/**
	 * @param placedOrder the placedOrder to set
	 */
	public void setPlacedOrder(ArrayList<PlacedOrder> placedOrder) {
		this.placedOrder = placedOrder;
	}	
	
	@Override
	public String toString() {
		return "Customer [custID=" + custID + ", " + (custName != null ? "custName=" + custName + ", " : "")
				+ (custEmail != null ? "custEmail=" + custEmail + ", " : "")
				+ (custAddress != null ? "custAddress=" + custAddress + ", " : "")
				+ (placedOrder != null ? "placedOrder=" + placedOrder : "") + "]";
	}

	public boolean validate() {
		String regexName = "^[a-zA-Z]+$";
		String regexEmail = "^[a-zA-Z0-9-._]+@[a-zA-Z0-9.-]+$";
		
		if(this.custName.matches(regexName))
			return true;
		if(this.custEmail.matches(regexEmail))
			return true;
		
		return false;
	}
}
