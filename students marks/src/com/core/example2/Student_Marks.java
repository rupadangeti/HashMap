package com.core.example2;

import java.util.Scanner;

public class Student_Marks {
	public static void main(String[] args) {
		int sub1=60;
		int sub2=70;
		
		int sub3=80;
		int sub4=40;
		int sub5=80;
		int sub6=70;

		int total= 0;
		for (int i=0;i<6;i++)
		{
			System.out.println("Enter Marrks for Subject"+(i+1));
			
			Scanner s = new Scanner(System.in);
			 
			 total= total+s.nextInt();
		}
		
		//int total= sub1+sub2+sub3+sub4+sub5+sub6;
		int avg=total/6;
		System.out.println("total student marks:" +total);
		System.out.println("average student marks: " +avg);
		
		
		
	}
		
	}


