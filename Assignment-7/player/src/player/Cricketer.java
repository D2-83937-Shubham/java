package player;
import java.util.Scanner;

public class Cricketer extends Players implements Batter,Bowler {
	private int wickets;
	private int runs;
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public Cricketer(int id, String name, int age, int matchesPlayed, int wickets, int runs) {
		super(id, name, age, matchesPlayed);
		this.wickets = wickets;
		this.runs = runs;
	}
	public Cricketer() {
		super();
	}
	public void accept(Scanner sc) {
		super.accept(sc);
		
		System.out.println("Enter the runs: ");
		runs=sc.nextInt();
		System.out.println("Enter the wickets: ");
		wickets=sc.nextInt();
	}
	
}
