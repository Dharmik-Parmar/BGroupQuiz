package com.Quiz;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	
	public static Connection getConnection() {
	Connection con=null;
	
		 try {
		
		 
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/b_quiz?characterEncoding=utf8";
			
			 con=DriverManager.getConnection(url,"root","Priyansh@1993");
			
		 }catch (Exception e){
			 
			 e.printStackTrace();
			 
		 }
		
		
		
		return con;

	}

}
