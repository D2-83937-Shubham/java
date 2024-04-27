package com.app.geometry;

public class test {

	public static void main(String[] args) {
		double distance;
		String s1;
		String s2;
		Point2D p1 = new Point2D();
		Point2D p2 = new Point2D();
		System.out.println("Enter for Point p1");
		System.out.println(); 
		p1.getDetails();
		System.out.println("Enter for Point p2");
		p2.accept();
		p1.getDetails();
		
		
		boolean pointsEqual = Point2D.isEqual(p1,p2);
		if(pointsEqual == true) {
			System.out.println("Points p1 and p2 are located at same position");
		}else {
			distance = Point2D.calculateDistance(p1, p2);
			System.out.println("Points p1 and p2 are at distance of "+distance);
		}

	}

}
