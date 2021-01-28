package com.psl.project.model;

import java.util.Arrays;

public class Order {
	private int orderID;
	private OrderItems[] orderItems;
	private String orderDate;
	private String status;
	
	public Order() {
		
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
	public OrderItems[] getOrderItems() {
		return orderItems;
	}

	/**
	 * @param orderItems the orderItems to set
	 */
	public void setOrderItems(OrderItems[] orderItems) {
		this.orderItems = orderItems;
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

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", "
				+ (orderItems != null ? "orderItems=" + Arrays.toString(orderItems) + ", " : "")
				+ (orderDate != null ? "orderDate=" + orderDate + ", " : "")
				+ (status != null ? "status=" + status : "") + "]";
	}
	
	
}
