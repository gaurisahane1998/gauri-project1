package com.mall.customerRegister.service.Impl;
import com.mall.customerRegister.service.CustomerRegisterService;
import com.mall.Dao.CustomerRegisterDAO;
import com.mall.Dao.Impl.CustomerRegisterDAOImpl;
import com.mall.Exception.BusinessException;
import com.mall.model.Customer;
public class CustomerRegisterServiceImpl implements CustomerRegisterService{
	private CustomerRegisterDAO customerRegisterDAO=new CustomerRegisterDAOImpl();

	@Override
	public int registerCustomer(Customer customer) throws BusinessException {
		try {
			if (customerRegisterDAO.customerRegister(customer) == 1) {
				
		}
		} catch (BusinessException e) {
			throw new BusinessException(e.getMessage());
		}
		return 1;
	}

}
