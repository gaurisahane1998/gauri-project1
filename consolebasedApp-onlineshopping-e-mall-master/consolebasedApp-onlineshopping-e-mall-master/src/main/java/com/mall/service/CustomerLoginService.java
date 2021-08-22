package com.mall.service;
import com.mall.Exception.BusinessException;
import com.mall.model.Customer;

public interface CustomerLoginService {
	public boolean customerLogin(String email, String password) throws BusinessException;


}
