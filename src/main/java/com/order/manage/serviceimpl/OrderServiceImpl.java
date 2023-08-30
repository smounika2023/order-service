package com.order.manage.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.manage.entity.OrdersEntity;
import com.order.manage.exception.OrderNotFound;
import com.order.manage.mapper.OrdersEntityMapper;
import com.order.manage.mapper.OrdersModelMapper;
import com.order.manage.model.OrdersModel;
import com.order.manage.repository.OrdersRepository;
import com.order.manage.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrdersRepository ordersRepository;

	@Autowired
	private OrdersEntityMapper ordersEntityMapper;

	@Autowired
	private OrdersModelMapper ordersModelMapper;

	@Override
	public void createOrder(OrdersModel ordersModel) {
		ordersRepository.save(ordersEntityMapper.modelToOrdersEntity(ordersModel));
	}

	@Override
	public void updateOrder(OrdersModel ordersModel) {
		ordersRepository.save(ordersEntityMapper.modelToOrdersEntity(ordersModel));
	}

	@Override
	public void deleteOrder(int orderId) {
		ordersRepository.deleteById(orderId);

	}

	@Override
	public OrdersModel findByOrderId(int orderId) {
		OrdersModel ordersModel;
		Optional<OrdersEntity> ordersEntityOptional = ordersRepository.findById(orderId);
		if (ordersEntityOptional.isPresent()) {
			ordersModel = ordersModelMapper.entityToOrdersModel(ordersEntityOptional.get());
		} else {
			throw new OrderNotFound("ordersEntity is not found for given orderId" + orderId);
		}
		return ordersModel;
	}

}