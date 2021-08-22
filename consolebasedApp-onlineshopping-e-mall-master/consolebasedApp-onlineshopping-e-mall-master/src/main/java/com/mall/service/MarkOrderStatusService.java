package com.mall.service;

import com.mall.Exception.BusinessException;
import com.mall.model.Cart;
import com.mall.model.Order;
public interface MarkOrderStatusService {
	public int markOrderStatus(Order order) throws BusinessException;


}
