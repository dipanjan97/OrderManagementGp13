package com.psl.project.model;

import java.util.ArrayList;
import java.util.Arrays;

public class PlacedOrder {
	private int orderID;
	private ArrayList<Product> product;
	private String orderDate;
	private ArrayList<String> statusList = new ArrayList<String>();	
	
	public PlacedOrder() {
		statusList.add("Shipped");
		statusList.add("Ordered");
		statusList.add("Delivered");
	}	

	public PlacedOrder(int orderID, ArrayList<String> orderItems, String orderDate, ArrayList<String> statusList) {
		super();
		this.orderID = orderID;
		this.product = product;
		this.orderDate = orderDate;
		this.statusList = statusList;
	}

	/**
	 * @return the orderID
	 */
	public int getOrderID() {
		return orderID;
	}

	/**
	 * @param orderID the orderID to set
	 */
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	/**
	 * @return the orderItems
	 */
	public ArrayList<Product> getProduct() {
		return product;
	}

	/**
	 * @param orderItems the orderItems to set
	 */
	public void setProduct(ArrayList<Product> product) {
		this.product = product;
	}

	/**
	 * @return the statusList
	 */
	public ArrayList<String> getStatusList() {
		return statusList;
	}

	/**
	 * @param statusList the statusList to set
	 */
	public void setStatusList(ArrayList<String> statusList) {
		this.statusList = statusList;
	}

	/**
	 * @return the orderDate
	 */
	public String getOrderDate() {
		return orderDate;
	}

	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "PlacedOrder [orderID=" + orderID + ", " + (product != null ? "orderItems=" + product + ", " : "")
				+ (orderDate != null ? "orderDate=" + orderDate + ", " : "")
				+ (statusList != null ? "statusList=" + statusList : "") + "]";
	}	
}
