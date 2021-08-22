package com.mall.Dao;

import com.mall.Exception.BusinessException;
import com.mall.model.Customer;
public interface CustomerLoginDAO {
	public boolean customerLogin(String email, String password) throws BusinessException;


}
