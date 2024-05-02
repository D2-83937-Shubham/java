package Q2;

public class MainMethod {

	public static void main(String[] args) {
		
		NegativeDiameterException n=new NegativeDiameterException();
		
		Circle c=new Circle();
		System.out.println(c.toString());
		try {
			c.setD(-1);
		} catch (NegativeDiameterException e) {
			e.printStackTrace();
		}
		
		System.out.println(c.toString());
		
		
	}
}
