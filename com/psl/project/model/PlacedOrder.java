package com.psl.project.model;

import java.sql.Date;
import java.util.ArrayList;

public class PlacedOrder {
	private String orderID;
	private ArrayList<OrderItem> orderItems = new ArrayList<>();
	private Date orderDate;
	private String status; //SHIPPED, ORDERED, DELIVERED
	
	public PlacedOrder() {
		
	}
	
	public PlacedOrder(String orderID, ArrayList<OrderItem> orderItems, Date orderDate, String status) {
		this.orderID = orderID;
		this.orderItems = orderItems;
		this.orderDate = orderDate;
		this.status = status;
	}


	/**
	 * @return the orderID
	 */
	public String getOrderID() {
		return orderID;
	}

	/**
	 * @param orderID the orderID to set
	 */
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	/**
	 * @return the orderItems
	 */
	public ArrayList<OrderItem> getOrderItems() {
		return orderItems;
	}

	/**
	 * @param orderItems the orderItems to set
	 */
	public void setOrderItems(ArrayList<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	/**
	 * @return the orderDate
	 */
	public Date getOrderDate() {
		return orderDate;
	}

	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status to set the status of delivery
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	

	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", orderItems=" + orderItems + ", orderDate=" + orderDate + ", status="
				+ status + "]";
	}
}
