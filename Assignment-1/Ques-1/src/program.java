import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		try {
			System.out.println("enter the values for num1 and num2");
			Scanner sc = new Scanner(System.in);

			boolean num1b = sc.hasNextDouble();
			double num1 = sc.nextDouble();

			boolean num2b = sc.hasNextDouble();
			double num2 = sc.nextDouble();

			if (num1b == true && num2b == true) {
				System.out.println((num1 + num2) / 2);
			}

		} catch (Exception e) {
			System.out.println("Please enter the double value");
		}

	}

}
