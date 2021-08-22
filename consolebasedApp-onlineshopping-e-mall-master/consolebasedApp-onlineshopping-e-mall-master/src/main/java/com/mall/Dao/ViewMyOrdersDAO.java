package com.mall.Dao;
import java.util.List;

import com.mall.Exception.BusinessException;
import com.mall.model.Order;

public interface ViewMyOrdersDAO {	
	public List<Order> viewMyOrders(Order order) throws BusinessException;


}
