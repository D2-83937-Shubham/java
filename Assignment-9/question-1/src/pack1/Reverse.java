package pack1;

import java.util.Scanner;

public class Reverse {
/*
	public static void main(String[] args) {//by using for charAt()

		String str1;
		String str2="";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		str1=sc.next();
		 for(int i=str1.length()-1;i>=0;i--) {
			 str2+=str1.charAt(i); 
		 }
		 System.out.println(str2);
		
	}*/
	public static void main(String[] args) {//by using for charAt()

		String str1;
		String str2="";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		StringBuilder sb = new StringBuilder(sc.next());
		 System.out.println(sb.reverse());
	}

}
