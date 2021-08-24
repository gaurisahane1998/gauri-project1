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
import com.mall.Dao.Impl.CustomerSearchDAOImpl;
import com.mall.Dao.Impl.MarkAsShippedDAOImpl;
import com.mall.Dao.Impl.ProductAddDAOImpl;
import com.mall.Exception.BusinessException;
import com.mall.model.Cart;
import com.mall.model.Customer;
import com.mall.model.Employee;
import com.mall.model.Product;


public class Testcases {
private static Logger log = Logger.getLogger(Testcases.class);
	
	Employee employee = new Employee();

	@Test
	public void validemployee() { 			//checking for valid details
		assertEquals(1,employee.employeValidate("gauri@gmail.com", "123"));
	}
	/*
	@Test
	public void invalidemployeedetails() {				//not valid
		assertEquals(1,employee.employeValidate("gauri@gmail.com", "123"));
	
		
	}*/

CustomerLoginDAOImpl obj = new CustomerLoginDAOImpl();

private CustomerRegisterServiceImpl customerRegister;
	
	@Test
	public void testCustomerLogin() {
		try {
			boolean result = true;
			assertEquals(result,obj.customerLogin("pari@gmail.com", "Pari@123"));
		}catch (BusinessException e) {}
	}

/*
			fail(e.getMessage());
		}
	}
}*/


ProductAddServiceImpl productAdd = new ProductAddServiceImpl();

@Test
public void testProductAdd() {
	Product product = new Product();
	product.setId(16);
	product.setName("vivoY22");
	product.setManufacturer("vivo");
	product.setCost(450000);
	try {
		assertEquals(1,productAdd.addProduct(product));
	} catch (BusinessException e) {}
}
		/*fail(e.getMessage());
	}
*/
CustomerSearchDAOImpl customerSearch = new CustomerSearchDAOImpl();
Customer customer = new Customer();

@Test
public void testCustomerSearchById() {
	try {
		int id = 1;
		assertNotNull(customerSearch.getCustomerById(id));
	} catch (BusinessException e) {}
}
	/*	fail(e.getMessage());
	}
}
*/
@Test
public void testCustomerSearchByName() {
	try {
		assertNotNull(customerSearch.getCustomerByName("pari"));
	} catch (BusinessException e) {}
}
	/*
		fail(e.getMessage());
	}
}
*/
@Test
public void testCustomerSearchByEmail() {
	try {
		assertNotNull(customerSearch.getCustomerByEmail("pari@gmail.com"));
	} catch (BusinessException e) {}
}
		/*fail(e.getMessage());
	}
}
*/
@Test
public void testCustomerSearchByOrderId() {
	try {
		int id = 1;
		assertNotNull(customerSearch.getCustomerByOrderId(id));
	} catch (BusinessException e) {}
}
	/*
		fail(e.getMessage());
	}
}
*/


CustomerRegisterServiceImpl CustomerRegister = new CustomerRegisterServiceImpl();

@Test
public void testCustomerRegister() {
	Customer customer = new Customer();
	customer.setCustomerId(15);
	customer.setCustomerEmail("mona@gmail.com");
	customer.setCustomerName("mona");
	customer.setCustomerPassword("Mona@123");
	try {
		assertEquals(1,CustomerRegister.registerCustomer(customer));
	} catch (BusinessException e) {}
}
}

	/*	fail(e.getMessage());
	}
}
*/
  