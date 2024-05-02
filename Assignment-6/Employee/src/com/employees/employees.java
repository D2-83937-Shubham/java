package com.employees;
import java.util.Scanner;
public abstract class employees {
	String firstName;
	String lastName;
	int id;
	Scanner sc = new Scanner(System.in);
	
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public employees(String firstName, String lastName, int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	public employees() {
		super();
	}
	public void accept() {
		System.out.println("enter the employyes id: ");
		setId(sc.nextInt());
		System.out.println("enter First name employees:  ");
		setFirstName(sc.next());
		System.out.println("enter the last name of employees: ");
		setLastName(sc.next());
		
	}
	@Override
	public String toString() {
		return "employees [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + "]";
	}

	
}
