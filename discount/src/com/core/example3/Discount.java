package com.core.example3;
import java.util.Scanner;

public class Discount 
	
	{
		public static void main(String args[])
		{
	 
		double  dis,amount,price,s;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter price ");	
	               
		price=sc.nextDouble();
	 
	        System.out.println("enter discount percentage ");	
	               
		dis=sc.nextDouble();			
		
	        s=100-dis;
	 
		amount= (s*price)/100;
	 
		System.out.println("amount after discount="+amount);
	 
		}
	}
	


