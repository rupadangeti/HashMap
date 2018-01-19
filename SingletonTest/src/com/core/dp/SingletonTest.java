package com.core.dp;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton singleton=new Singleton();
	}
}
class Singleton{
	int count;
	static Singleton singleton;
	private Singleton() {}
	public static Singleton getInstance() {
		
	
	return singleton;
	}
	
}


