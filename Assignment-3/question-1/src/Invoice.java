import java.util.Scanner;

public class Invoice {

	String partNo;
	String desc_part;
	int Qty;
	double Price;
	Scanner sc = new Scanner(System.in);

	public Invoice() {
	}

	public Invoice(String partNo, String desc_part, int qty, double price, Scanner sc) {
		this.partNo = partNo;
		this.desc_part = desc_part;
		Qty = qty;
		Price = price;
		this.sc = sc;
	}

	public String getPartNo() {
		return partNo;
	}

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}

	public String getDesc_part() {
		return desc_part;
	}

	public void setDesc_part(String desc_part) {
		this.desc_part = desc_part;
	}

	public int getQty() {
		return Qty;
	}

	public void setQty(int qty) {
		Qty = qty;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public void accept() {
		System.out.println("enter the partNo: ");
		partNo = sc.next();

		System.out.println("enter the partDiscrption: ");
		desc_part = sc.next();

		System.out.println("enter the Qnty: ");
		Qty = sc.nextInt();
		if (Qty <= 0) {
			setQty(0);
		}

		System.out.println("enter the price of part: ");
		Price = sc.nextDouble();
		if (Price < 0) {
			setPrice(0.0);
		}
	}

	public void display() {
		System.out.println("----- total invoice ---- ");
		System.out.println("---------------------");
		System.out.println("partNo: " + partNo);
		System.out.println("partDesc: " + desc_part);
		System.out.println("Qty: " + Qty);
		System.out.println("price: Rs." + Price + "/-");
		System.out.println("---------------------");
		System.out.println("Total: Rs." + Price * Qty + "/-");

	}

}
