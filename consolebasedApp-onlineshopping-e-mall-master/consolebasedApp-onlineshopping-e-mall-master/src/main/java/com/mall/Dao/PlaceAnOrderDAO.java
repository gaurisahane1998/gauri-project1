package com.mall.Dao;
import com.mall.Exception.BusinessException;
import com.mall.model.Cart;
public interface PlaceAnOrderDAO {
	public int placeAnOrder(Cart cart) throws BusinessException;


}
