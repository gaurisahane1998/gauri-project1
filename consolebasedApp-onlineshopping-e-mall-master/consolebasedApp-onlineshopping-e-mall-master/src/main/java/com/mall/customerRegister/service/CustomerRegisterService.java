package com.mall.customerRegister.service;
import com.mall.Exception.BusinessException;
import com.mall.model.Customer;
public interface CustomerRegisterService {
	public int registerCustomer(Customer customer) throws BusinessException;


}
