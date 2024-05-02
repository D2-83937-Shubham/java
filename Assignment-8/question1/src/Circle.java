package Q2;

public class Circle {

	Point2D cp;
	double d;
	
	public Circle(Point2D cp, double d) {
		super();
		this.cp = cp;
		this.d = d;
	}

	@Override
	public String toString() {
		return "Circle [cp=" + cp.getDetails() + ", d=" + d + "]";
	}

	public Point2D getCp() {
		return cp;
	}

	public void setCp(Point2D cp) {
		this.cp = cp;
	}

	public double getD() {
		return d;
	}

	public void setD(double diameter) {
		if(diameter<0) {
			throw new NegativeDiameterException("Enter the positive diameter");
		}
		this.d = diameter;
	}

	public Circle() {
		super();
		this.cp=new Point2D(0,0);
		this.d=100.00;
		
		
		// TODO Auto-generated constructor stub
	}
	
}
