package com.mall.addProduct.Impl;
import org.apache.log4j.Logger;

import org.apache.log4j.Logger;

import com.mall.Dao.ProductAddDAO;
import com.mall.Dao.Impl.ProductAddDAOImpl;
import com.mall.Exception.BusinessException;
import com.mall.model.Product;

import com.mall.addProduct.service.ProductAddService;

public class ProductAddServiceImpl implements ProductAddService  {
private ProductAddDAO productaddDAO=new ProductAddDAOImpl();
	
	private static Logger log = Logger.getLogger(ProductAddServiceImpl.class);

	@Override
	public int addProduct(Product product) throws BusinessException {
		try {
			if (productaddDAO.addProduct(product) == 1) {
				log.info(product);			
			}
		} catch (BusinessException e) {
			throw new BusinessException(e.getMessage());
		}
		return 1;
	}

}
