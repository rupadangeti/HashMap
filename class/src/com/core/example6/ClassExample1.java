
package com.core.example6;


public class ClassExample1 {
	
	public static void main(String[] args) {
		
		
		
		EmpDetails appleEmpDetailes=new EmpDetails("Rupa","Dangeti");
		appleEmpDetailes.display();
		
		/* Variable : 
		 start with Lowercase, Next word first letter hould be capital
		 appleEmployeeDetails*/ 
		
	}
}
class EmpDetails {
	private String firstName;
	private String lastName;
	String address;
	String state;
	int zipcode;
	int phoneNo;
	String designation;
	int expy;
	double sal;
	
	EmpDetails(String fName,String lName){
		this.firstName=fName;
		this.lastName=lName;
		
		
	}
	
	
	
	/*EmpDetails(){
		
		
	firstName="default first name";
	lastName="default last name";
	address="jsdhfskjfs";
	state="CA";
	zipcode=94555;
	phoneNo=83729329;
	designation="Manager";
	expy=10;
	
	sal=100000;
	    
	}
	*/
	
	void display() {
		System.out.println("first name:" +firstName);
		System.out.println("last name:" +lastName);
		System.out.println("address" +address);;
		
	}
}


