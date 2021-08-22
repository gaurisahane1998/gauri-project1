package com.mall.Dao.Impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.mall.Dao.CustomerRegisterDAO;
import com.mall.dbutil.MysSqlDBconnection;
import com.mall.Exception.BusinessException;
import com.mall.model.Customer;

public class CustomerRegisterDAOImpl implements CustomerRegisterDAO {
	private static Logger log = Logger.getLogger(ProductAddDAOImpl.class);

	@Override
	public int customerRegister(Customer customer) throws BusinessException {
		int c=0;
		try(Connection connection=MysSqlDBconnection.getConnection()){
			String sql="insert into customers(customerId,customerName,customerEmail,customerPassword) values(?,?,?,?)";
			
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, customer.getCustomerId());
			preparedStatement.setString(2, customer.getCustomerName());
			preparedStatement.setString(3, customer.getCustomerEmail());
			preparedStatement.setString(4, customer.getCustomerPassword());
			//preparedStatement.setInt(5, customer.getOrderId());
		    c=preparedStatement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured");
		}
		return c;
		
	}
	
	

	
	

}
