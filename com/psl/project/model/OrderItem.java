package com.psl.project.model;

public class OrderItem {
	private Product product;
	private int orderedQuntity;
	private long totalPrice; // derived field orderedQuantity * product.price

	public OrderItem() {
		// TODO Auto-generated constructor stub
	}

	public OrderItem(Product product, int orderedQuntity, long totalPrice) {
		this.product = product;
		this.orderedQuntity = orderedQuntity;
		this.totalPrice = totalPrice;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getOrderedQuntity() {
		return orderedQuntity;
	}

	public void setOrderedQuntity(int orderedQuntity) {
		this.orderedQuntity = orderedQuntity;
	}

	public long getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(long total) {
		this.totalPrice = total;
	}

	@Override
	public String toString() {
		return "OrderItem [Product=" + product + ", orderedQuntity="
				+ orderedQuntity + ", total=" + totalPrice + "]";
	}
}
