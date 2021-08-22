package com.mall.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mall.Dao.MarkOrderStatusDAO;
import com.mall.dbutil.MysSqlDBconnection;
import com.mall.Exception.BusinessException;
import com.mall.model.Order;
public class MarkOrderStatusDAOImpl implements MarkOrderStatusDAO {
	@Override
	public int markOrderStatus(Order order) throws BusinessException {
		int c = 0;
		//int d = 0;
		try(Connection connection=MysSqlDBconnection.getConnection()){
			String sql="update orders set orderStatus = 'received' where customerId = ? and orderId = ?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, order.getCustomerId());
			preparedStatement.setInt(2, order.getOrderId());
			c = preparedStatement.executeUpdate();
			
			
//			String sqL="delete from orders where orderStatus = 'received'";
//			PreparedStatement preparedSTatement=connection.prepareStatement(sqL);
//			d = preparedSTatement.executeUpdate();
			
		
		} catch (ClassNotFoundException | SQLException e) {
			//log.error(e);
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		return c;
	}


}
