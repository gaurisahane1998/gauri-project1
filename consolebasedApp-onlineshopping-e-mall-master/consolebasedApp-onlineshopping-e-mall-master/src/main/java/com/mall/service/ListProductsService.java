package com.mall.service;
import com.mall.Exception.BusinessException;
import com.mall.model.Product;
import java.util.List;

public interface ListProductsService {
	public List<Product> listProducts(Product product) throws BusinessException;


}
