package com.Quiz;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.sql.Statement;
import java.util.Scanner; 

public class RetriveData { 
 
    public PreparedStatement FetchData() { 
    Connection conn= DBUtil.getConnection();
  
    Scanner sc= new Scanner(System.in);
    System.out.println("Please enter student_id");
    int student_id=sc.nextInt();
    String sql = "select * from quizresult where Student_id=?"; 
    try{ 
    	PreparedStatement pst=conn.prepareStatement(sql);
    	pst.setInt(1,student_id);
    	ResultSet rs= pst.executeQuery(); 
    
      while(rs.next()){ 
        System.out.println("Student_id>>"+rs.getInt(1)); 
       System.out.println("student_name>>"+rs.getString(2)); 
        System.out.println("Student_marks>>"+rs.getInt(3)); 
        System.out.println("Student_grade>>"+rs.getString(4)); 

      } 
       
    }catch(Exception e){ 
          
         e.printStackTrace(); 
    }
	return null;
	           
    }   
         
  }
