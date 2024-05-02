package pack1;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string ");
		StringBuilder sb = new StringBuilder(sc.next());
		
		if(sb.toString().equals(sb.reverse().toString())) {
			System.out.println("string is palindrome");
		}else 
			System.out.println("enter valid again");
	
	}

}
