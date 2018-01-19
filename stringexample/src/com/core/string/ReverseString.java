package com.core.string;
import java.io.*;
import java.util.*;

public class ReverseString {
	
	

	
	 public static void main(String[] args) {
	    String input = "Core Java Class";
	    char[] temporary= input.toCharArray();
	    int left,right=0;
	    right=temporary.length-1;
	    for (left=0; left < right ; left++ ,right--)
	    {
	     // Swap values of left and right 
	     char temp = temporary[left];
	     temporary[left] = temporary[right];
	     temporary[right]=temp;
	    }
	    for (char c : temporary)
	     System.out.print(c);
	    System.out.println();
	   }}


