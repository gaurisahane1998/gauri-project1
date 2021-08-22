package com.mall.Dao;
import com.mall.Exception.BusinessException;
import com.mall.model.Customer;

public interface CustomerRegisterDAO {
	public int customerRegister(Customer customer) throws BusinessException;


}
