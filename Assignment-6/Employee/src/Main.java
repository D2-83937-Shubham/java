
import java.util.Scanner;

import com.employees.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in)
		System.out.println("How many employees you want ro store");
		int n=sc.nextInt();
		Employee []employees = new Employee[n];
		
	}
	public static int menu(Scanner sc) {
		System.out.println("0. EXIT");
		System.out.println("1.for salaried employees");
		System.out.println("2.for Hourly employees");
		System.out.println("3.for Commision employees");
		System.out.println("4.for Base salarried commision employees");
		System.out.println("5.Display all employees");
		System.out.println("enter the choice");
		return sc.nextInt();
	}

}
