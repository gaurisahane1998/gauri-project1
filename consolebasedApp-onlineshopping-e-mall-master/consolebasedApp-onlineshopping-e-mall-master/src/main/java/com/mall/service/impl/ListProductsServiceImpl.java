package com.mall.service.impl;
import java.util.List;

import com.mall.Dao.ListProductsDAO;
import com.mall.Dao.Impl.ListProductsDAOImpl;
import com.mall.Exception.BusinessException;
import com.mall.model.Product;
import com.mall.service.ListProductsService;
public class ListProductsServiceImpl implements ListProductsService {
	private ListProductsDAO listProductsDAO=new ListProductsDAOImpl();

	@Override
	public List<Product> listProducts(Product product) throws BusinessException {
		List<Product> products = null;
		try {
			    products = listProductsDAO.listproducts(product);
				
		} catch (BusinessException e) {
			throw new BusinessException(e.getMessage());
		}
		return products;
	}
	
	


}
