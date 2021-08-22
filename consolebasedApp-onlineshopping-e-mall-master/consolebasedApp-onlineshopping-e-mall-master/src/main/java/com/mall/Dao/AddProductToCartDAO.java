package com.mall.Dao;

import com.mall.Exception.BusinessException;
import com.mall.model.Cart;
public interface AddProductToCartDAO {
	public int addProductToCart(Cart cart) throws BusinessException;


}
