package com.mall.service.impl;
import java.util.List;

import com.mall.Dao.ViewAllOrdersDAO;
import com.mall.Dao.Impl.ViewAllOrdersDAOImpl;
import com.mall.Exception.BusinessException;
import com.mall.model.Order;
import com.mall.service.ViewAllOrdersService;

public class ViewAllOrderServiceImpl implements ViewAllOrdersService{
	private ViewAllOrdersDAO viewAllOrdersDAO=new ViewAllOrdersDAOImpl();

	@Override
	public List<Order> viewAllOrders(Order order) throws BusinessException {
		List<Order> orderList = null;
		try {
			    orderList = viewAllOrdersDAO.viewAllOrders(order);
				
		} catch (BusinessException e) {
			throw new BusinessException(e.getMessage());
		}
		return orderList;
	}

	
	

}
