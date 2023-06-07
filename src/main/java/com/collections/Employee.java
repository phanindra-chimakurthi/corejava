package com.collections;
import java.util.*;
//linkedlist for custom objects
class EmployeeDetails{
	private String firstName;
	private String lastName;
	public EmployeeDetails(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
}
public class Employee {
	public static void main(String[] args) {
		
		LinkedList<EmployeeDetails> l1=new LinkedList<EmployeeDetails>();
		l1.add(new EmployeeDetails("hi","bye"));
		l1.add(new EmployeeDetails("phani","ch"));
	for(EmployeeDetails em:l1) {
		System.out.println(em);
		}
	for(Object o:l1) {
			System.out.println(o);
		}
	}

}
