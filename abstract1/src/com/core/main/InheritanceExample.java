package com.core.main;

public class InheritanceExample {
public static void main(String[]args){
	Animal animal=new Animal("white");
	animal.display();
	Dog dog= new Dog();
	dog.color="Black";
	dog.display();
	
}
}
class Animal{
	String color;
	public Animal() {
		super();
	}
	public void display() {
		// TODO Auto-generated method stub
		
	}
	public Animal(String color) {
		super();
		this.color=color;
	}
	
}
class Dog extends Animal{
 public void display() {
		
		System.out.println(" "+color);
	}
	
}