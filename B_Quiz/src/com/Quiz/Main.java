package com.Quiz;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args)  {
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("-----------------------****WelCome To Group_B_Quiz****------------------");
		 System.out.println("Note:- Student should type Answers in UPPER_CASE");
		 System.out.println("***ALL THE BEST***");
		System.out.println("To Get Result Press 1");
		System.out.println("To Start Quiz Press 2");
		int a=sc.nextInt();
		if(a==1) {
			RetriveData rd= new RetriveData();
			rd.FetchData();
		}else {
		 System.out.println("Please Enter your Id");
		 int student_id =sc.nextInt();
		 System.out.println("Please Enter your Name");
		 String student_name=sc.next();
		 Quiz q=new Quiz();
	        q.logics();
	        
			try {
				PreparedStatement pst;
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/b_quiz?characterEncoding=utf8";
			    Connection con=DriverManager.getConnection(url,"root","Priyansh@1993");
				String query = "insert into quizresult(student_id,student_name,student_marks,student_grade)values(?,?,?,?)";
				pst=con.prepareStatement(query);
				pst.setInt(1, student_id);
				pst.setString(2, student_name);
				Quiz Q = new Quiz();
				int student_marks =q.getcorrectAnsCount;
				pst.setInt(3, student_marks);
				String student_grade= q.getGrade;
				pst.setString(4, student_grade);
				int record=pst.executeUpdate();
				System.out.println("Your Record has been Inserted in Data Base Successfully");
				
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}	
		
	}



