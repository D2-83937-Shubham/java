package player;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cricketer []p = new Cricketer[11];
		int counter=0;
		int choice=0;
		do {
			System.out.println("0. Exit");
			System.out.println("1. Add Players");
			System.out.println("2. Display Total");
			System.out.println("3. Display All");
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				System.out.println("Thank You");
			break;
			
			case 1:
				if(counter >= 0 && counter<11) {
					p[counter]=new Cricketer();
					p[counter++].accept(sc);
				}
			break;
			case 2:
				int t_runs=0;
				int t_wickets=0;
				int t_playedMatches=0;
				for(int i=0;i<p.length;i++) {
					if(p[i]!=null) {
						t_runs +=p[i].getRuns();
						t_wickets +=p[i].getWickets();
						t_playedMatches +=p[i].getMatchesPlayed();
					}
				}
				System.out.println("total runs"+t_runs);
				System.out.println("total runs"+t_wickets);
				System.out.println("total runs"+t_playedMatches);
				break;
			case 3:
				for(int i=0;i<p.length;i++) {
					if(p[i]!=null) {
						System.out.println("Name: "+p[i].getName()+" Total Matches: "+p[i].getMatchesPlayed());
					}
				}
			break;
			default:
				
				break;
			}
		} while (choice !=0);

	}

}
