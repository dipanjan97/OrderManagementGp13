package com.psl.project.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {
	static Connection cn=null;
	
	/**
	 * Object of this class may not be created
	 */
	private DBConnectionUtil(){
		
	}
	//static String driverClass="com.mysql.jdbc.Driver";
	//static String url="jdbc:mysql://localhost/test";
	static String driverClass="oracle.jdbc.driver.OracleDriver";
	static String url="jdbc:oracle:thin:@localhost:1521:orcl";
	static String username="system";
	static String password="Suraj1323";
	
	
	/**
	 * @return Connection of Database
	 */
	public static Connection getConnection(){
		if(cn==null){
			try {
				Class.forName(driverClass);
				cn=DriverManager.getConnection(url,username,password);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
					}
		
		return cn;
		
	
	}
	
	/**
	 * Method to close the Connection to Database
	 */
	public void closeConnection(){
		try {
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
