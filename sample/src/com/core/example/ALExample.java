package com.core.example;
import java.util.*;
public class ALExample {
	public static void main(String[]args) {
		ArrayList list1=new ArrayList();
		
		list1.add("core");
		list1.add(23);
		list1.add(100000.00);
		System.out.println(list1);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(23);
		list2.add(45);
		list2.add(55);
		list2.add(44);
		list2.add(66);
		System.out.println(list2);
		
		
		System.out.println("/n For loop/n");
				
		
		for(int i=0; i<list2.size();i++) {
			System.out.println(list2.get(i));
		}
		System.out.println("for each loop");
	for(Integer data:list2) {
		System.out.println(data);
	
	
	}
	
	System.out.println("Using iterator");
	ListIterator
	
	while(iterator.hasNext()) {
		
	}
	}
}
	


