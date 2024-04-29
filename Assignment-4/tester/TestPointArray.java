package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many points you want to plot");
		int n = sc.nextInt();
		Point2D[] points = new Point2D[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter Details for "+ (i+1) +" point");
			points[i] = new Point2D();
			points[i].acceptDetails();
			System.out.println("**********");			
		}
		
		boolean isMenu = true;
		 do{
			System.out.println("*****MENU******");
			System.out.println("ENter 1 to display details of specific point");
			System.out.println("Enter 2 to Display X,Y co-ordinates of all points");
			System.out.println("Enter 3 to Calculate distance between two points");
			System.out.println("Enter 0 to exit");
			int choice = sc.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter index of point to display");
					int index = sc.nextInt();
					if(index<0 || index>n-1) {
						System.out.println("Entered Index is Not in Specified Range");
						System.out.println("Please Enter index is range");
						break;
					}
					String details = points[index].getDetails();
					System.out.println(details);
					break;
				case 2:
					for(Point2D point : points) {
						 System.out.println(point.getDetails());
					}
					break;
				case 3:
					System.out.println("Enter index of  starting point ");
					int index1 = sc.nextInt();
					if(index1<0 || index1>n-1) {
						System.out.println("Entered Index is Not in Specified Range");
						System.out.println("Please Enter index is range");
						break;
					}
					System.out.println("Enter index of ending point");
					int index2 = sc.nextInt();
					if(index2<0 || index2>n-1) {
						System.out.println("Entered Index is Not in Specified Range");
						System.out.println("Please Enter index is range");
						break;
					}
					boolean res = Point2D.isEqual(points[index1], points[index2]);
					if(res) {						
						System.out.println("Both points are at same location");
						break;
					}
					double distance = Point2D.calculateDistance(points[index1], points[index2]);
					System.out.println("Distance between two points is "+distance);
					
					break;
				case 0:
					System.out.println("Thank You");
					isMenu = false;
					break;
				default:
					System.out.println("Invalid Choice");
					break;
			}	
			
		}while(isMenu);

	}

}
