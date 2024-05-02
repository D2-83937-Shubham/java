package Q1;

public class Except {

	int length;
	
	void calculateString(String s){
		length=s.length();
		System.out.println("length "+length);
		if(s.length()>80) {
			
			throw new ExceptionLineTooLong("Enter String less than 80");
		}
	}
}
