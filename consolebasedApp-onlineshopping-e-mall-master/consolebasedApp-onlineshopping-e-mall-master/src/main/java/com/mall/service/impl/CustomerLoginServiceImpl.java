package com.mall.service.impl;
import com.mall.Dao.CustomerLoginDAO;
import com.mall.Dao.Impl.CustomerLoginDAOImpl;
import com.mall.Exception.BusinessException;
import com.mall.service.*;
public class CustomerLoginServiceImpl implements CustomerLoginService {

	private CustomerLoginDAO customerLoginDAO= new CustomerLoginDAOImpl();

	@Override
	public boolean customerLogin(String email, String password) throws BusinessException {
		boolean w = false;
		try {
			if (customerLoginDAO.customerLogin(email,password)) {
				w = true;
				
		}
		} catch (BusinessException e) {
			throw new BusinessException(e.getMessage());
		}
		return w;
	}
	

}
