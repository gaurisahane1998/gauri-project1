package com.mall.service.impl;

import com.mall.Dao.MarkOrderStatusDAO;
import com.mall.Dao.Impl.MarkOrderStatusDAOImpl;
import com.mall.Exception.BusinessException;
import com.mall.model.Order;
import com.mall.service.MarkOrderStatusService;
public class MarkOrderStatusServiceImpl implements MarkOrderStatusService {
	
	private MarkOrderStatusDAO markOrderDAO=new MarkOrderStatusDAOImpl();

	@Override
	public int markOrderStatus(Order order) throws BusinessException {
		try {
			if (markOrderDAO.markOrderStatus(order)==1) {
				
		}
		} catch (BusinessException e) {
			throw new BusinessException(e.getMessage());
		}
		return 1;
	}

}
