package com.mall.service;
import java.util.List;

import com.mall.Exception.BusinessException;
import com.mall.model.Order;

public interface ViewAllOrdersService {
	public List<Order> viewAllOrders(Order order) throws BusinessException;

}
