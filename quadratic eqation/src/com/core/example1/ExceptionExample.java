package com.core.example1;

public class ExceptionExample {
	public static void main(String[]args) {
		try {
		//int a=20,b=0;
		//int c =a/b;
		//System.out.println("result"  +c);
		String st=null;
		System.out.println("result"  +st.length());
		}
		
		catch(NullPointerException e) {
			System.out.println("error"  +e.getMessage());
		}
		
		catch(ArithmeticException e) {
			e.printStackTrace();
			
		}finally {
			System.out.println("finally block");
		}
		
		
		System.out.println("end of the program");
	}
	

}
