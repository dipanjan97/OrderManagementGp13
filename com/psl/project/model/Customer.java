package com.psl.project.model;

import java.util.ArrayList;

public class Customer {
	private String custID;
	private String custName;
	private String custEmail;
	private String custAddress;
	ArrayList<PlacedOrder> order = new ArrayList<>();
	
	public Customer() {
		
	}
	
	public Customer(String custID, String custName, String custEmail, String custAddress, ArrayList<PlacedOrder> order) {
		this.custID = custID;
		this.custName = custName;
		this.custEmail = custEmail;
		this.custAddress = custAddress;
		this.order = order;
	}



	/**
	 * @return the custID
	 */
	public String getCustID() {
		return custID;
	}

	/**
	 * @param custID the custID to set
	 */
	public void setCustID(String custID) {
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
	 * @return the order
	 */
	public ArrayList<PlacedOrder> getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(ArrayList<PlacedOrder> order) {
		this.order = order;
	}
	
	@Override
	public String toString() {
		return "Customer [custID=" + custID + ", custName=" + custName + ", custEmail=" + custEmail + ", custAddress="
				+ custAddress + ", order=" + order + "]";
	}

	public boolean validate() {
		String regexName = "^[a-zA-Z]+$";
		String regexEmail = "^[a-zA-Z0-9-._]+@[a-zA-Z0-9.-]+$";
		
		if(this.custName.matches(regexName) && this.custEmail.matches(regexEmail))
			return true;

		return false;
	}
}
