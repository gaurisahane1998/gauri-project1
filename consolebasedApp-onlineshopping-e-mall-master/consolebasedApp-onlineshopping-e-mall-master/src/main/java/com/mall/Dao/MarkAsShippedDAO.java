package com.mall.Dao;
import com.mall.Exception.BusinessException;
import com.mall.model.Order;

public interface MarkAsShippedDAO {
	public int markDelivered(Order order) throws BusinessException;


}
