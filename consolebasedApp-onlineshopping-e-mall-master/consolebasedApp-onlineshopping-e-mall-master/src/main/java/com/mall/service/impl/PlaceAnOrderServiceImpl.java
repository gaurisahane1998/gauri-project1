package com.mall.service.impl;

import com.mall.Dao.PlaceAnOrderDAO;
import com.mall.Dao.Impl.PlaceAnOrderDAOImpl;
import com.mall.Exception.BusinessException;
import com.mall.model.Cart;
import com.mall.service.PlaceAnOrderService;

public class PlaceAnOrderServiceImpl implements PlaceAnOrderService{
	private PlaceAnOrderDAO placeAnOrderDAO=new PlaceAnOrderDAOImpl();

	@Override
	public int placeAnOrder(Cart cart) throws BusinessException {
		try {
			if (placeAnOrderDAO.placeAnOrder(cart)==1) {
				
		}
		} catch (BusinessException e) {
			throw new BusinessException(e.getMessage());
		}
		return 1;
	}

}
