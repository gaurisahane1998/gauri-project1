package com.mall.Dao;
import java.util.List;

import com.mall.Exception.BusinessException;
import com.mall.model.Order;
public interface ViewAllOrdersDAO {
	public List<Order> viewAllOrders(Order order) throws BusinessException;


}
