package com.app.geometry;

import java.util.Scanner;

public class Point2D {

	int x;
	int y;

	public Point2D() {
	}

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the X coordinate");
		setX(sc.nextInt());
		System.out.println("enter the Y coordinate");
		setY(sc.nextInt());
	}
	public String getDetails() {
		String res;
		res = "X : "+getX()+" Y : "+getY();
		return res;
	}

	public static boolean isEqual(Point2D a,Point2D b) {
		if( a.getX()== b.getX() && a.getY() == b.getY() ) {
			return true;
		}
		return false;
	}
	public static double calculateDistance(Point2D a,Point2D b) {
		int x1 = a.getX();
		int x2 = b.getX();
		int y1 = a.getY();
		int y2 = b.getY();

		double distance = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		return distance;
	}

}
