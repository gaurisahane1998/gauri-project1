package com.mall.service.impl;

import com.mall.Dao.MarkAsShippedDAO;
import com.mall.Dao.Impl.MarkAsShippedDAOImpl;
import com.mall.Exception.BusinessException;
import com.mall.model.Order;
import com.mall.service.MarkAsShippedService;
public class MarkAsShippedServiceImpl implements MarkAsShippedService {
	private MarkAsShippedDAO markDeliveredDAO=new MarkAsShippedDAOImpl();

	@Override
	public int markDelivered(Order order) throws BusinessException {
		try {
			if (markDeliveredDAO.markDelivered(order)==1) {
				
		}
		} catch (BusinessException e) {
			throw new BusinessException(e.getMessage());
		}
		return 1;
	}

}
