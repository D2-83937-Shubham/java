package question2;
import java.util.Scanner;

public class Q2 {

	int total_miles;
	int cost_per_lit;
	int avg_bike;
	int parking_sb;
	
	int tolls_cost;
	int total_exp;
	Scanner sc=new Scanner(System.in);
	public int getTotal_miles() {
		return total_miles;
	}
	public void setTotal_miles(int total_miles) {
		this.total_miles = total_miles;
	}
	public int getCost_per_lit() {
		return cost_per_lit;
	}
	public void setCost_per_lit(int cost_per_lit) {
		this.cost_per_lit = cost_per_lit;
	}
	public int getAvg_bike() {
		return avg_bike;
	}
	public void setAvg_bike(int avg_bike) {
		this.avg_bike = avg_bike;
	}
	public int getTotal_exp() {
		return total_exp;
	}
	public void setTotal_exp(int total_exp) {
		this.total_exp = total_exp;
	}
	public int getParking_sb() {
		return parking_sb;
	}
	public void setParking_sb(int parking_sb) {
		this.parking_sb = parking_sb;
	}
	
	public int getTolls_cost() {
		return tolls_cost;
	}
	public void setTolls_cost(int tolls_cost) {
		this.tolls_cost = tolls_cost;
	}
	public void accept() {
		System.out.println("enter the total miles: ");
		setTotal_miles(sc.nextInt());
		
		System.out.println("enter cost of petrol: ");
		setCost_per_lit(sc.nextInt());
		
		System.out.println("enter the your bike_avg: ");
		setAvg_bike(sc.nextInt());
		
		System.out.println("enter the parking fees : ");
		setParking_sb(sc.nextInt());
		
		System.out.println("enter the toll: ");
		setTolls_cost(sc.nextInt());

	}
	void display() {
		setTotal_exp(((getCost_per_lit()/getAvg_bike())*getTotal_miles())+getTolls_cost()+getParking_sb());
		System.out.println("total_exp : "+getTotal_exp());
	}
	
}
class B{
	public static void main(String[] args) {
		Q2 q =new Q2();
		q.accept();
		q.display();
	}
}
