package com.mall.service;
import java.util.List;

import com.mall.Exception.BusinessException;
import com.mall.model.Cart;

public interface ViewCartService {
	public List<Cart> viewCart(Cart cart) throws BusinessException;


}
