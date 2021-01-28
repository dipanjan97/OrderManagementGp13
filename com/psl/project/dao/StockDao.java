package com.psl.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.psl.project.model.Stock;
import com.psl.project.util.DBConnectionUtil;

public class StockDao {
	Connection cn=DBConnectionUtil.getConnection();
	public void insertStock(Stock s, String productID){
		try {
				PreparedStatement pstmt = cn.prepareStatement("insert into stock values(?,?,?,?,?,?)");
				pstmt.setString(1, s.getStockID());
				pstmt.setDate(2, s.getMfgDate());
				pstmt.setDate(3, s.getExpDate());
				pstmt.setInt(4, s.getQuantityBought());
				pstmt.setInt(5, s.getQuantityAvailable());
				pstmt.setString(6, productID);
				pstmt.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	/**
	 * @param productID productID of product
	 * @return
	 */
	public ArrayList<Stock> getStockByProductId(String productID){
		ArrayList<Stock> stock = new ArrayList<>();
		Stock s = null;
		try{
			Statement stmt=cn.createStatement();
			//String qry = "select * from stock where productID='P011'";
			String qry = "select * from stock where productID='"+productID+"'";
			ResultSet rs=stmt.executeQuery(qry);
			while(rs.next()){
				s=new Stock();
				s.setStockID(rs.getString(1));
				s.setMfgDate(rs.getDate(2));
				s.setExpDate(rs.getDate(3));
				s.setQuantityBought(rs.getInt(4));
				s.setQuantityAvailable(rs.getInt(5));
				stock.add(s);
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return stock;
	}
}
