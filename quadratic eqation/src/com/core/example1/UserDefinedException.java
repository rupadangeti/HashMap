package com.core.example1;

 class InvalidInputException extends Exception{
	 InvalidInputException(String s){
		 super(s);
		 }
		 
	 }
	
	

public class UserDefinedException {
	
	static void validate(int val) throws  InvalidInputException{
		if(val < 0) {
			
			throw new InvalidInputException ("Invalid Input values");
			}
		
			
			else
			
				System.out.println("valid input values:");
		}
			 		
				
	public static void main(String [] args)	{
		try {
			validate(-6);
			
		}
		catch(Exception c) {
			System.out.println("Exception occered: " +c);
			
		}
	}
			
		
			
	}


