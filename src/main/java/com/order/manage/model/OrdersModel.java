package com.order.manage.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.validation.constraints.NotBlank;

public class OrdersModel {

	private int orderId;

	@NotBlank(message = "description should not be null")
	private String description;

	private LocalDate orderDate;

	private double orderTotalAmount;

	private int totalItems;

	private List<OrderItemModel> orderItemList;

	private OrderStatusModel orderStatusModel;

	private PaymentStatusModel paymentStatusModel;

	private ShipmentStatusModel shipmentStatusModel;

	public OrdersModel() {

	}

	public OrdersModel(int orderId, String description, LocalDate orderDate, double orderTotalAmount, int totalItems,
			List<OrderItemModel> orderItemList, OrderStatusModel orderStatusModel,
			PaymentStatusModel paymentStatusModel, ShipmentStatusModel shipmentStatusModel) {
		super();
		this.orderId = orderId;
		this.description = description;
		this.orderDate = orderDate;
		this.orderTotalAmount = orderTotalAmount;
		this.totalItems = totalItems;
		this.orderItemList = orderItemList;
		this.orderStatusModel = orderStatusModel;
		this.paymentStatusModel = paymentStatusModel;
		this.shipmentStatusModel = shipmentStatusModel;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public double getOrderTotalAmount() {
		return orderTotalAmount;
	}

	public void setOrderTotalAmount(double orderTotalAmount) {
		this.orderTotalAmount = orderTotalAmount;
	}

	public int getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}

	public List<OrderItemModel> getOrderItemList() {
		return orderItemList;
	}

	public void setOrderItemList(List<OrderItemModel> orderItemList) {
		this.orderItemList = orderItemList;
	}

	public OrderStatusModel getOrderStatusModel() {
		return orderStatusModel;
	}

	public void setOrderStatusModel(OrderStatusModel orderStatusModel) {
		this.orderStatusModel = orderStatusModel;
	}

	public PaymentStatusModel getPaymentStatusModel() {
		return paymentStatusModel;
	}

	public void setPaymentStatusModel(PaymentStatusModel paymentStatusModel) {
		this.paymentStatusModel = paymentStatusModel;
	}

	public ShipmentStatusModel getShipmentStatusModel() {
		return shipmentStatusModel;
	}

	public void setShipmentStatusModel(ShipmentStatusModel shipmentStatusModel) {
		this.shipmentStatusModel = shipmentStatusModel;
	}

}
