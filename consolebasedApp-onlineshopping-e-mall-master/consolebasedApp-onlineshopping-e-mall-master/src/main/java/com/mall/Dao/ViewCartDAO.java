package com.mall.Dao;
import java.util.List;

import com.mall.Exception.BusinessException;
import com.mall.model.Cart;

public interface ViewCartDAO {
	public List<Cart> viewCart(Cart cart) throws BusinessException;


}
