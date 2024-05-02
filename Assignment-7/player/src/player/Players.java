package player;

import java.util.*;
import java.util.Scanner;

public abstract class Players {
	private int id;
	private String name;
	private int age;
	private int matchesPlayed;

	public void accept(Scanner sc) {
		System.out.println("enter the id");
		setId(sc.nextInt());
		System.out.println("enter the name");
		setName(sc.next());
		System.out.println("enter the age");
		setAge(sc.nextInt());
		System.out.println("enter the matchesPlayed");
		setMatchesPlayed(sc.nextInt());

	}

	public Players(int id, String name, int age, int matchesPlayed) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.matchesPlayed = matchesPlayed;
	}

	public Players() {
		super();
	}

	@Override
	public String toString() {
		return "Players [id=" + id + ", name=" + name + ", age=" + age + ", matchesPlayed=" + matchesPlayed + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMatchesPlayed() {
		return matchesPlayed;
	}

	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, id, matchesPlayed, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Players other = (Players) obj;
		return age == other.age && id == other.id && matchesPlayed == other.matchesPlayed
				&& Objects.equals(name, other.name);
	}

}
