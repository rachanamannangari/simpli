package com.google;

public class practiceexception {
 public static void main(String[] args) {
	 try {
	 int a= 4/0;
	 }
	 catch(ArithmeticException e)
	 {
		 e.printStackTrace();
		 System.out.println(e.getMessage());
	 System.out.println("excception is arithmetic exception");
	 }
	 try
	 {
	int a[]= {1,2,3};
	System.out.println(a[3]);
	 }catch(IndexOutOfBoundsException e)
	 
	 {
		// e.printStackTrace();
		System.out.println(e.getMessage());
		 System.out.println("exception is indexoutofbound exception");
	 }
	 String str="rachana";
	 int a=Integer.valueOf(str);
	 System.out.println(a);
	 
}
}
