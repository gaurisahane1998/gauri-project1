package com.mall.addProduct.service;

import com.mall.Exception.BusinessException;
import com.mall.model.Product;
public interface ProductAddService {
	public int addProduct(Product product) throws BusinessException;
	

}
