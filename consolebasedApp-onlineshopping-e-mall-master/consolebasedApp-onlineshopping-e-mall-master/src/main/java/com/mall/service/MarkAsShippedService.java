package com.mall.service;
import com.mall.Exception.BusinessException;
import com.mall.model.Order;

public interface MarkAsShippedService {
	public int markDelivered(Order order) throws BusinessException;

	

}
