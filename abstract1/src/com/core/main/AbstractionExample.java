package com.core.main;

public class AbstractionExample {
public static void main(String[] args) {
	Shape shape=new Circle(10);
	System.out.println("Circle Area:"+shape.area());
	shape=new Square(10);
	System.out.println("Square Area:"+shape.area());
	
	
}
}
abstract class Shape{
	abstract double area();
}
 class Circle extends Shape{
	double r;
	public Circle(int i) {
		this.r=r;
	}
	 //@Override
	double area() {
		return Math.PI*r*r;
	}
	}
	
class Square extends Shape{
	double s;
	public Square(double s) {
		this.s=s;
	}
	
}