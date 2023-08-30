package com.order.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.manage.entity.OrdersEntity;
import com.order.manage.model.OrdersModel;
import com.order.manage.service.OrderService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/orders")
public class OrdersController {

	@Autowired
	private OrderService orderService;

	@PostMapping("/create")
	public void createOrder(@Valid @RequestBody OrdersModel orderModel) {
		orderService.createOrder(orderModel);
	}

	@PutMapping("/update")
	public void updateOrder(@Valid @RequestBody OrdersModel ordersModel) {
		orderService.updateOrder(ordersModel);
	}

	@DeleteMapping("/deleteByOrderId/{orderId}")
	public void deleteByOrderId(int orderId) {
		orderService.findByOrderId(orderId);

	}

	@GetMapping("/findByOrderId/{orderId}")
	public OrdersModel findByOrderId(int orderId) {
		return orderService.findByOrderId(orderId);

	}
}
