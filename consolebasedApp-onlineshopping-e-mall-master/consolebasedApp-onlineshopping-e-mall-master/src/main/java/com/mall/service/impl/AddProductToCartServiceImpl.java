package com.mall.service.impl;
import org.apache.log4j.Logger;

import com.mall.Dao.AddProductToCartDAO;
import com.mall.Dao.Impl.AddProductToCartDAOImpl;
import com.mall.Exception.BusinessException;
import com.mall.model.Cart;
import com.mall.service.AddProductToCartService;

public class AddProductToCartServiceImpl implements AddProductToCartService {

	private static Logger log = Logger.getLogger(AddProductToCartServiceImpl.class);
	
	private AddProductToCartDAO addProductToCartDAO=new AddProductToCartDAOImpl();

	@Override
	public int addProductToCart(Cart cart) throws BusinessException {
		try {
			if (addProductToCartDAO.addProductToCart(cart)==1) {
				log.info("Product added successfully");
		}
		} catch (BusinessException e) {
			throw new BusinessException(e.getMessage());
		}
		return 1;
	}

}
