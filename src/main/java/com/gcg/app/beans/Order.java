package com.gcg.app.beans;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Order {

	private int orderId;
	private int userId;
	private float amount;
	private String status;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date orderDate;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date lastUpdated;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
}
