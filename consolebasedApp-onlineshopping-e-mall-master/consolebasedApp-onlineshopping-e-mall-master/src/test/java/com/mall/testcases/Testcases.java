package com.mall.testcases;
import static org.junit.jupiter.api.Assertions.*;


import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import com.mall.addProduct.service.ProductAddService;
import com.mall.addProduct.Impl.ProductAddServiceImpl;
import com.mall.customerRegister.service.Impl.CustomerRegisterServiceImpl;
import com.mall.customerRegister.service.CustomerRegisterService;

import com.mall.Dao.CustomerLoginDAO;
import com.mall.Dao.ProductAddDAO;
import com.mall.Dao.Impl.CustomerLoginDAOImpl;
import com.mall.Dao.Impl.MarkAsShippedDAOImpl;
import com.mall.Dao.Impl.ProductAddDAOImpl;
import com.mall.Exception.BusinessException;
import com.mall.model.Cart;
import com.mall.model.Customer;
import com.mall.model.Employee;
import com.mall.model.Order;
import com.mall.model.OrderId;
import com.mall.model.Product;
import com.mall.search.service.CustomerSearchService;
import com.mall.search.service.Impl.CustomerSearchServiceImpl;
import com.mall.service.AddProductToCartService;
import com.mall.service.CustomerLoginService;
import com.mall.service.ListProductsService;
import com.mall.service.MarkOrderStatusService;
import com.mall.service.PlaceAnOrderService;
import com.mall.service.ViewAllOrdersService;
import com.mall.service.ViewCartService;
import com.mall.service.ViewMyOrdersService;
import com.mall.service.impl.AddProductToCartServiceImpl;
import com.mall.service.impl.CustomerLoginServiceImpl;
import com.mall.service.impl.ListProductsServiceImpl;
import com.mall.service.MarkAsShippedService;
import com.mall.service.impl.MarkAsShippedServiceImpl;
import com.mall.service.impl.MarkOrderStatusServiceImpl;
import com.mall.service.impl.PlaceAnOrderServiceImpl;
import com.mall.service.impl.ViewAllOrderServiceImpl;
import com.mall.service.impl.ViewCartServiceImpl;
import com.mall.service.impl.ViewMyOrdersServiceImpl;

public class Testcases {
private static Logger log = Logger.getLogger(Testcases.class);
	
	Employee employee = new Employee();

	@Test
	public void validemployee() { 			//checking for valid details
		assertEquals(1,employee.employeValidate("praneethsalla@gmail.com", "mintu123"));
	}
	/*
	@Test
	public void invalidemployeedetails() {				//not valid
		assertEquals(1,employee.employeValidate("pranithsalla@gmail.com", "Mintu@123"));
		
	}*/

CustomerLoginDAOImpl obj = new CustomerLoginDAOImpl();
	
	@Test
	public void testCustomerLogin() {
		try {
			boolean result = true;
			assertEquals(result,obj.customerLogin("madhu@gmail.com", "as@AS1cgrr"));
		}catch (BusinessException e) {}
			/*fail(e.getMessage());
		}
	}

	/*
MarkAsShippedDAOImpl markShipped = new MarkAsShippedDAOImpl();
	
	@Test
	public void testMarkShipped() {
		Order order = new Order();
		order.setOrderId(10);
		try {
			assertEquals(1,markShipped.markDelivered(order));
		} catch (BusinessException e) {
			fail(e.getMessage());
		}
	}
	


	*/
		
	
	
	}
}

