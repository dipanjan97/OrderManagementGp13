package com.psl.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.psl.project.model.OrderItem;
import com.psl.project.model.PlacedOrder;
import com.psl.project.util.DBConnectionUtil;

public class PlacedOrderDao {
	Connection cn=DBConnectionUtil.getConnection();
	OrderItemDao orderItemDao = new OrderItemDao();
	
	public void insertPlacedORder(PlacedOrder order, String custID){
		ArrayList<OrderItem> orderItem = order.getOrderItems();
		try {
				PreparedStatement pstmt = cn.prepareStatement("insert into placedOrder values(?,?,?,?)");
				pstmt.setString(1, order.getOrderID());
				pstmt.setDate(2, order.getOrderDate());
				pstmt.setString(3, order.getStatus());
				pstmt.setString(4, custID);
				pstmt.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (OrderItem o : orderItem) {
			orderItemDao.insertOrderItem(o, order.getOrderID());
		}
		
	}
	
	/**
	 * @param custID custID of Customer
	 * @return arrayList of placedOrder
	 */
	public ArrayList<PlacedOrder> getPlacedOrderBycustId(String custID){
		ArrayList<PlacedOrder> placedOrders=new ArrayList<>();
		PlacedOrder p = null;
		ArrayList<OrderItem> o = new ArrayList<>();
		try{
			Statement stmt=cn.createStatement();
			String qry="select * from placedOrder where custID='"+custID+"'";
			ResultSet rs=stmt.executeQuery(qry);
			while(rs.next()){
				p=new PlacedOrder();
				String orderID = rs.getString(1);
				p.setOrderID(orderID);
				p.setOrderDate(rs.getDate(2));
				p.setStatus(rs.getString(3));
				o = orderItemDao.getOrderItemByPlacedOrderId(orderID);
				p.setOrderItems(o);
				placedOrders.add(p);
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return placedOrders;
	}
}
