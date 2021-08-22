package com.mall.service;
import com.mall.Exception.BusinessException;
import com.mall.model.Cart;
public interface PlaceAnOrderService {
	public int placeAnOrder(Cart cart) throws BusinessException;


}
