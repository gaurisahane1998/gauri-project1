package com.mall.service.impl;

import java.util.List;


import com.mall.Dao.ViewMyOrdersDAO;
import com.mall.Dao.Impl.ViewCartDAOImpl;
import com.mall.Dao.Impl.ViewMyOrdersDAOImpl;
import com.mall.Exception.BusinessException;
import com.mall.model.Order;
import com.mall.service.ViewMyOrdersService;
public class ViewMyOrdersServiceImpl implements ViewMyOrdersService {

	private ViewMyOrdersDAO viewMyOrdersDAO=new ViewMyOrdersDAOImpl();

	@Override
	public List<Order> viewMyOrders(Order order) throws BusinessException {
		List<Order> orderList = null;
		try {
			    orderList = viewMyOrdersDAO.viewMyOrders(order);
				
		} catch (BusinessException e) {
			throw new BusinessException(e.getMessage());
		}
		return orderList;
	}

	


}
