package com.order.manage.service;

import com.order.manage.model.OrdersModel;

public interface OrderService {

	public void createOrder(OrdersModel orderModel);

	public void updateOrder(OrdersModel ordersModel);

	public void deleteOrder(int orderId);

	public OrdersModel findByOrderId(int orderId);

}
