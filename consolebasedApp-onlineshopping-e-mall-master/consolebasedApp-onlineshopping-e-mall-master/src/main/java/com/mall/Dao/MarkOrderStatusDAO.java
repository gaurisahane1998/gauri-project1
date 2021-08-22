package com.mall.Dao;
import com.mall.Exception.BusinessException;
import com.mall.model.Order;
public interface MarkOrderStatusDAO {
	public int markOrderStatus(Order order) throws BusinessException;


}
