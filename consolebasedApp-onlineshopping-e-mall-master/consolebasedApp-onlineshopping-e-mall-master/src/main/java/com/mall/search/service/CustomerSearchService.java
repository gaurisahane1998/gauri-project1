package com.mall.search.service;
import java.util.List;

import com.mall.Exception.BusinessException;
import com.mall.model.Customer;
import com.mall.model.OrderId;
public interface CustomerSearchService {
	public Customer getCustomerById(int id) throws BusinessException;
	public List<Customer> getCustomerByName(String customerName) throws BusinessException;
	public Customer getCustomerByEmail (String customerEmail) throws BusinessException;
	public OrderId getCustomerByOrderId(int orderId) throws BusinessException; 

	

}
