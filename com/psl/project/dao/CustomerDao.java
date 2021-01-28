package com.psl.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.psl.project.model.Customer;
import com.psl.project.model.PlacedOrder;
import com.psl.project.util.DBConnectionUtil;

public class CustomerDao {
	Connection cn=DBConnectionUtil.getConnection();
	PlacedOrderDao placedOrderDao = new PlacedOrderDao();
	
	/**
	 * Method to insert customer into Database
	 * @param c Object of Customer
	 */
	public void insertCustomer(Customer c){
		ArrayList<PlacedOrder> orders = c.getOrder();
		try {
				PreparedStatement pstmt = cn.prepareStatement("insert into customer values(?,?,?,?)");
				pstmt.setString(1, c.getCustID());
				pstmt.setString(2, c.getCustName());
				pstmt.setString(3, c.getCustEmail());
				pstmt.setString(4, c.getCustAddress());
				pstmt.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (PlacedOrder order : orders) {
			placedOrderDao.insertPlacedORder(order, c.getCustID());
		}
	}
	
	/**
	 * @param custID Customer ID
	 * @return Customer Object
	 */
	public Customer getCustomerById(String custID){
		Customer c=null;
		try{
			Statement stmt=cn.createStatement();
			String qry="select * from customer where custID='"+custID+"'";
			ResultSet rs=stmt.executeQuery(qry);
			if(rs.next()){
				c=new Customer();
				c.setCustID(rs.getString(1));
				c.setCustName(rs.getString(2));
				c.setCustEmail(rs.getString(3));
				c.setCustAddress(rs.getString(4));
				c.setOrder(placedOrderDao.getPlacedOrderBycustId(custID));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
}
