package com.mall.Dao;
import com.mall.Exception.BusinessException;
import com.mall.model.Product;
public interface ProductAddDAO {

	public int addProduct(Product product) throws BusinessException;

}
