package com.mall.Dao;
import java.util.List;

import com.mall.Exception.BusinessException;
import com.mall.model.Product;

	

public interface ListProductsDAO {
	public List<Product> listproducts(Product product) throws BusinessException;

	

}
