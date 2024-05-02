package question;

import java.util.Arrays;

public class MainS {

	public static void main(String[] args) {
		Student[] student = new Student[5];

		student[0] = new Student(101, "shubham", 81);
		student[1] = new Student(201, "shreyash", 82);
		student[2] = new Student(301, "shrikant", 83);
		student[3] = new Student(401, "mandar", 84);
		student[4] = new Student(501, "harshal", 85);

		Arrays.sort(student);
		for (Student student2 : student) {
			System.out.println(student2);
		}
	}

}
