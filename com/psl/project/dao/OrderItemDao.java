package com.psl.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.psl.project.model.OrderItem;
import com.psl.project.model.Product;
import com.psl.project.util.DBConnectionUtil;

public class OrderItemDao {
	Connection cn=DBConnectionUtil.getConnection();
	ProductDao productDao = new ProductDao();
	
	/**
	 * @param orderItem 
	 * @param orderID
	 */
	public void insertOrderItem(OrderItem orderItem, String orderID){
		try {
				PreparedStatement pstmt = cn.prepareStatement("insert into OrderProdDetails values(?,?,?)");
				pstmt.setString(1, orderID);
				pstmt.setString(2, orderItem.getProduct().getProductID());
				pstmt.setInt(3, orderItem.getOrderedQuntity());
				pstmt.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	/**
	 * @param orderID orderID of placedOrder
	 * @return arrayList of OrderItem objects
	 */
	public ArrayList<OrderItem> getOrderItemByPlacedOrderId(String orderID){
		ArrayList<OrderItem> orderItems=new ArrayList<>();
		OrderItem o = null;
		Product product = null;
		try{
			Statement stmt=cn.createStatement();
			String qry="select * from OrderProdDetails where orderID='"+orderID+"'";
			ResultSet rs=stmt.executeQuery(qry);
			while(rs.next()){
				o=new OrderItem();
				String prodID = rs.getString(2);
				product = productDao.getProductById(prodID);
				o.setProduct(product);
				int quantity = rs.getInt(3);
				o.setOrderedQuntity(quantity);
				o.setTotalPrice(quantity*product.getPrice());
				orderItems.add(o);
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return orderItems;
	}
}
