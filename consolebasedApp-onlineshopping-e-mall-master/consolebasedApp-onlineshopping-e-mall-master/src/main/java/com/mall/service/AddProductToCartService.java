package com.mall.service;
import com.mall.Exception.BusinessException;
import com.mall.model.Cart;

	

public interface AddProductToCartService {
	public int addProductToCart(Cart cart) throws BusinessException;


}
