package com.mall.service;
import java.util.List;

import com.mall.Exception.BusinessException;
import com.mall.model.Order;
public interface ViewMyOrdersService {
	public List<Order> viewMyOrders(Order order) throws BusinessException;


}
