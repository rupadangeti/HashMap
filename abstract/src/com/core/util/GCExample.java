package com.core.util;

public class GCExample {
	public static void main(String[] args) {
		GCExample gcExample1= new GCExample();
		GCExample gcExample2= new GCExample();
		gcExample1=null;
		gcExample2=null;
		
		System.gc();
		
		
		
	}
	
	protected void finalize() {
		System.out.println("gc invoked");
	}

}
