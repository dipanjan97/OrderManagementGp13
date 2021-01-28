package com.psl.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.psl.project.model.Customer;
import com.psl.project.model.Product;
import com.psl.project.model.Stock;
import com.psl.project.util.DBConnectionUtil;

public class ProductDao {
	Connection cn=DBConnectionUtil.getConnection();
	StockDao stockDao = new StockDao();
	
	public void insertProduct(Product p){
		ArrayList<Stock> stock = p.getStock();
		try {
				PreparedStatement pstmt = cn.prepareStatement("insert into product values(?,?,?)");
				pstmt.setString(1, p.getProductID());
				pstmt.setString(2, p.getName());
				pstmt.setLong(3, p.getPrice());
				pstmt.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (Stock s : stock) {
			stockDao.insertStock(s, p.getProductID());
		}
	}
	
	/**
	 * @param productID productID of Product
	 * @return
	 */
	public Product getProductById(String productID){
		Product p=null;
		try{
			Statement stmt=cn.createStatement();
			String qry="select * from product where productID='"+productID+"'";
			ResultSet rs=stmt.executeQuery(qry);
			if(rs.next()){
				p=new Product();
				p.setProductID(rs.getString(1));
				p.setName(rs.getString(2));
				p.setPrice(rs.getInt(3));
				ArrayList<Stock> stock = stockDao.getStockByProductId(productID);
				p.setStock(stock);
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return p;
	}
}
