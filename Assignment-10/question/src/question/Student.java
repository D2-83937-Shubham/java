package question;
import java.util.Scanner;
public class Student implements Comparable<Student> {

	private int RollNo;
	private String name;
	private int marks;
	
	Scanner sc = new Scanner(System.in);

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public Student() {
		super();
	}

	public Student(int rollNo, String name, int marks ){
		super();
		RollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [RollNo=" + RollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	
	@Override
	public int compareTo(Student s) {
		if(this.marks>s.marks) {
			return -1;
		}
		return 0;
	}
	

}

