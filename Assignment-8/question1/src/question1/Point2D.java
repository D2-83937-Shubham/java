package Q2;

import java.util.Scanner;


public class Point2D {

	private int x;
	private int y;
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
	
	
	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Point2D() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter X: ");
		setX(sc.nextInt());
		System.out.println("Enter Y: ");
		setY(sc.nextInt());
	}
	
	
	public String getDetails()
	{
		return "("+x+","+y+")";
	}
	
	
	public boolean isEqual(Point2D p1) {
		if(x==p1.getX() && y==p1.getY()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double calculateDistance(Point2D p2) {
		double res=Math.sqrt(((x-p2.getX())*(x-p2.getX()))+((y-p2.getY())*(y-p2.getY())));
        return res;	
	}
	
}
//class D{
//	public static void main(String[] args) {
//		Point2D p1=new Point2D();
//		p1.accept();
//		Point2D p2=new Point2D();
//		p2.accept();
//		
//		System.out.println(p1.getDetails());
//		System.out.println(p2.getDetails());
//
//		if (p1.isEqual(p2)) {
//			System.out.println("x is equal to y");
//		}
//		else {
//			System.out.println(p1.calculateDistance(p2));
////			System.out.println("x is not equal to y");
//		}
//
//	}
//}
