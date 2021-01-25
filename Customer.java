package com.psl.project.model;

import java.util.Arrays;

public class Customer {
	private int custID;
	private String custName;
	private String custEmail;
	private String custAddress;
	
	Order[] order = new Order[10];
	
	public Customer() {
		
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
	 * @return the order
	 */
	public Order[] getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(Order[] order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Customer [custID=" + custID + ", " + (custName != null ? "custName=" + custName + ", " : "")
				+ (custEmail != null ? "custEmail=" + custEmail + ", " : "")
				+ (custAddress != null ? "custAddress=" + custAddress + ", " : "")
				+ (order != null ? "order=" + Arrays.toString(order) : "") + "]";
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
