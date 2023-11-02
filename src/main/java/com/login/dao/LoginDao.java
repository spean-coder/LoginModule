package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;

public class LoginDao {
	String url = "jdbc:mysql://localhost:3306/userdb";
	String user = "root";
	String pass = "Shubham@0498";
	String query = "select * from login where uname=? and pass = ?";
	
	public boolean validateUser(String uname, String password) {
			
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user,pass);
			
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, uname);
			st.setString(2, password);
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				return true;
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
		return false;
		
	}

}
