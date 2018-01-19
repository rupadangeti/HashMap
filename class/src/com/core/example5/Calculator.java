package com.core.example5;
import java.util.Scanner;

public class Calculator {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your first integer value:");
		
	
int first = sc.nextInt();
System.out.println("Enter your second integer value: ");
int second = sc.nextInt();

int plus = first + second;
int minus = first - second;
int multiply = first * second;
int divide = first / second;

System.out.println("Summation for " + first + " and " + second
        + " is: " + plus);
System.out.println("Subtraction for " + first + " and " + second
        + " is: " + minus);
System.out.println("Multiplication for " + first + " and " + second
        + " is: " + multiply);
System.out.println("Division for " + first + " and " + second
        + " is: " + divide);
}
}