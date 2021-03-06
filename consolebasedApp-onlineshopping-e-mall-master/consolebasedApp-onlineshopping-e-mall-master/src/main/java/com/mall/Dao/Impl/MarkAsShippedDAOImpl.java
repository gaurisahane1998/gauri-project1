package com.mall.Dao.Impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mall.Dao.MarkAsShippedDAO;
import com.mall.dbutil.MysSqlDBconnection;
import com.mall.Exception.BusinessException;
import com.mall.model.Order;
public class MarkAsShippedDAOImpl implements MarkAsShippedDAO {
	@Override
	public int markDelivered(Order order) throws BusinessException {
		int c = 0;
		try(Connection connection=MysSqlDBconnection.getConnection()){
			String sql="update orders set orderStatus = 'shipped' where orderId =?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, order.getOrderId());
			c = preparedStatement.executeUpdate();
		
		} catch (ClassNotFoundException | SQLException e) {
			//log.error(e);
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		return c;
	}



}
