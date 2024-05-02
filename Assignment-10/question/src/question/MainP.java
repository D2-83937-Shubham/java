package question;

import java.util.Arrays;

public class MainP {

	public static void main(String[] args) {

		

		Product [] product = new Product[10];

		product[0] = new Product(101, "Rice", "glorsary",100);
		product[1] = new Product(102, "glows", "gym",250);
		product[2] = new Product(103, "oil", "glorsary",1520);
		product[3] = new Product(104, "dumbels", "gym",550);
		product[4] = new Product(105, "laptop", "elctronics",450000);
		product[5] = new Product(106, "mouse", "elctronics",350);
		product[6] = new Product(107, "rope", "gym",500);
		product[7] = new Product(108, "garam masala", "glorsary",20);
		product[8] = new Product(109, "rod", "gym",800);
		product[9] = new Product(200, "pc", "elctroincs",10000);
	

		Arrays.sort(product);
		for (Product P : product) {
			System.out.println(P);
		}

	}
}
