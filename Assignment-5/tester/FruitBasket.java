package tester;

import com.app.fruits.*;

import java.util.Scanner;

public class FruitBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of basket");		
		int n = sc.nextInt();
		
		Fruit [] basket = new Fruit[n]; 
		int counter = 0;
		boolean isMenu = true;
		
		do {
			System.out.println("Enter 0 to Exit");
			System.out.println("Enter 1 to add Mango");
			System.out.println("Enter 2 to add Orange");
			System.out.println("Enter 3 to add Apple");
			System.out.println("Enter 4 to Display Name");
			System.out.println("Enter 5 to Display name,color,weight , taste of all fresh fruits , in the basket");
			System.out.println("Enter 6 to Mark a fruit as stale");
			System.out.println("Enter 7 to Display tastes of all stale(not fresh) fruits in the basket");
			System.out.println("Enter 8 to Mark all sour fruits stale");
			System.out.println("Enter Your Choice");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				isMenu = false;
				System.out.println("Thank You");
				break;
			case 1:
				if(counter<n) {
					basket[counter++] = new Mango("Yellow",100,"m1",true);
					System.out.println("Mango Added to Basket");
				}else if(n==0) {
					System.out.println("Your basket size is 0");
				}
				else {
					System.out.println("You cannot add fruit because basket is full");
				}
				
				break;
			case 2:
				if(counter<n) {
				basket[counter++] = new Orange("Orange",200,"o1",true);
				System.out.println("Orange Added to Basket");
				}else if(n==0) {
					System.out.println("Your basket size is 0");
				}
				else {
				System.out.println("You cannot add fruit because basket is full");
				}
				break;
			case 3:
				if(counter<n) {
				basket[counter++] = new Apple("Red",100,"a1",true);
				System.out.println("Apple Added to Basket");
				}else if(n==0) {
					System.out.println("Your basket size is 0");
				}
				else {
				System.out.println("You cannot add fruit because basket is full");
				}
				break;
			case 4:
				if(counter>0) {
					for( Fruit fruit : basket) {
						System.out.println(fruit.getName());
					}
				}else {
					System.out.println("Your Basket is Empty");
				}
				
				break;
				
			case 5:
				if(counter>0) {
				for(Fruit ele:basket) {
					if(ele.isFresh() == true) {						
						System.out.println(ele.toString());
						System.out.println("Taste : " +ele.taste());  
					}
				}
				}
				else {
					System.out.println("Your Basket is Empty");
				}
				break;
			case 6: 
				System.out.println("Enter the index of fruit that you want to mark as stale");
				int staleIndex = sc.nextInt();
				if(staleIndex < counter) {
					
					basket[staleIndex].setFresh(false);
					System.out.println(staleIndex+ " set to stale");
				}else {
					System.out.println("Index is not in range");
				}
				break;
			case 7: 
				System.out.println("Fruits which are not fresh");
				for(Fruit ele:basket) {
					if(ele.isFresh() == false) {						
						System.out.println("Name of Fruit: "+ele.getName()+" Taste : " +ele.taste());  
					}	
				}
				
				break;
			case 8:
				for(Fruit ele:basket) {
					if(ele.taste().equals("sour")) {						
						ele.setFresh(false);  
					}
				}
				System.out.println("Marked All sour fruits as stale");
				break;
			default :
				System.out.println("Invalid choice");
				break;
			}
		}while(isMenu);
		
	}

}
