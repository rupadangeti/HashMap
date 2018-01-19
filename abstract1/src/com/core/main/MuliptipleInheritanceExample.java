package com.core.main;

public class MuliptipleInheritanceExample {
public static void main(String[] args) {
Child child=new Child("object");
}
}
class Father{
	String name;
	public Father(String name) {
		this.name=name;
	}
}

interface Mother{
	String name="mother;";
	void display();
	
}

class Child extends Father implements Mother{

	public Child(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void display() {
		System.out.println("inside the child class");
		
	}
	
}
