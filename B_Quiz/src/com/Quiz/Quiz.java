package com.Quiz;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

	public class Quiz{
		static Scanner sc=new Scanner(System.in);
	      static int getcorrectAnsCount=0;
	      static int getInCorrectAnsCount=0;
		  static String getGrade=null;
    	public static void logics() {
    		Questions q1= new Questions("Q. Who invented Java?","A. James WebWing","B. Oracle Inc","C. Oaks Inc","D.James Gosling");
    		Questions q2= new Questions("Q. Which component is responsible to run java program?","A. JVM","B. JDK","C. JIT","D.JRE");
    		Questions q3= new Questions("Q. Which of the below is invalid identifier with the main method?","A. Public","B. Static","C. Private","D.Final");
    		Questions q4= new Questions("Q. When does method overloading is determined?","A. At Runtime","B. Complile Time","C. At Coding Time","D. At Execution Time.");
    		Questions q5= new Questions("Q. Which exception is thrown when java is out of memory?","A. Memory Error EXception.","B. Out Of Memory Error Exception.","C. Memoery Out Of Bound Exception","D. Memory Full Exception");
    		Questions q6= new Questions("Q. Which of the following is a superclass of every class in Java?","A. ArrayList","B. MainClass","C. ObjectClass","D. AbstractClass");
    		Questions q7= new Questions("Q. How do you create a variable with the numeric value 5?","A. num X=5;.","B. X=5;","C. int X=5;","D. float X=5;");
    		Questions q8= new Questions("Q. Explicit Type Conversion in Java refers to ________?","A. Narraowing Type Conversion","B. Widening Type Conversion","C. No Type Conversion","D. All Of The Above");
    		Questions q9= new Questions("Q. Which of these keywords is used to define interfaces in Java?","A. intf","B. interface","C. Intf","D. Interface");
    		Questions q10= new Questions("Q. What is the output of the following program:\r\n" + 
    				"\r\n" + 
    				"public class testmeth\r\n" + 
    				"{\r\n" + 
    				"static int i = 1;\r\n" + 
    				"public static void main(String args[])\r\n" + 
    				"{\r\n" + 
    				"System.out.println(i+” , “);\r\n" + 
    				"m(i);\r\n" + 
    				"System.out.println(i);\r\n" + 
    				"}\r\n" + 
    				"public void m(int i)\r\n" + 
    				"{\r\n" + 
    				"i += 2;\r\n" + 
    				"}\r\n" + 
    				"}","A. 1,3.","B. 3,1.","C. 1,1.","D. None Of the Above");
    		
    		 Map<Questions,Character> hmap=new HashMap<>();
    		 
    	        hmap.put(q1,'D');
    	        hmap.put(q2,'D');
    	        hmap.put(q3,'C');
    	        hmap.put(q4,'B');
    	        hmap.put(q5,'B');
    	        hmap.put(q6,'C');
    	        hmap.put(q7,'C');
    	        hmap.put(q8,'A');
    	        hmap.put(q9,'D');
    	        hmap.put(q10,'C');
    	        for(Map.Entry<Questions,Character> map:hmap.entrySet()){
    	            System.out.println(map.getKey().getQuestion());
    	            System.out.println(map.getKey().getOption1());
    	            System.out.println(map.getKey().getOption2());
    	            System.out.println(map.getKey().getOption3());
    	            System.out.println(map.getKey().getOption4());

    	            System.out.println("Enter Your Answer: ");
    	            Character ans=sc.next().charAt(0);

    	            int cans=Character.compare(ans,map.getValue());
    	            if(cans==0){
    	                System.out.println("Correct");
    	                getcorrectAnsCount++;
    	            }
    	            else{
    	                System.out.println("Wrong");
    	                getInCorrectAnsCount++;
    	            }
    	        }

    	        System.out.println("");
    	        System.out.println("--------Result---------");
    	        System.out.println("Total Questions: "+hmap.size());
    	        System.out.println("Correct Answered Questions : "+getcorrectAnsCount);
    	        System.out.println("Wrong Answered Questions : "+getInCorrectAnsCount);
    	         System.out.println("You Got "+ getcorrectAnsCount+ "/10");
    	
    	         if(getcorrectAnsCount >8) {
    	        	 getGrade="A";
    	         	System.out.println("Grade A");	
    	         }
    	         else if(getcorrectAnsCount<5) {
    	        	 	 getGrade="Fail";
    	         	System.out.println("Fail");
    	         }
    	         else if(getcorrectAnsCount==5) {
    	        	 getGrade="C";
    	         	System.out.println("Grade C");
    	         }
    	         else {
    	        	 getGrade="B";
    	         	System.out.println("Grade B");
    	         }	
   }
}
	
