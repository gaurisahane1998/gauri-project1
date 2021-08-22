package com.mall.service.impl;

import java.util.List;


import com.mall.Dao.ViewCartDAO;
import com.mall.Dao.Impl.ViewCartDAOImpl;
import com.mall.Exception.BusinessException;
import com.mall.model.Cart;
import com.mall.service.ViewCartService;
public class ViewCartServiceImpl implements ViewCartService {
	
	private ViewCartDAO viewCartDAO=new ViewCartDAOImpl();

	@Override
	public List<Cart> viewCart(Cart cart) throws BusinessException {
		List<Cart> cartList = null;
		try {
			    cartList = viewCartDAO.viewCart(cart);
				
				
		} catch (BusinessException e) {
			throw new BusinessException(e.getMessage());
		}
		return cartList;
	}

}
