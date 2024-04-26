package question_1;

import java.util.Scanner;

public class Q1 {

	int accNo;
	int item_charged;
	int pend_bal;

	int Allowed_credit;
	int applied_credits;
	int new_bal;

	Scanner sc = new Scanner(System.in);

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public int getItem_charged() {
		return item_charged;
	}

	public void setItem_charged(int item_charged) {
		this.item_charged = item_charged;
	}

	public int getPend_bal() {
		return pend_bal;
	}

	public void setPend_bal(int pend_bal) {
		this.pend_bal = pend_bal;
	}

	public int getAllowed_credit() {
		return Allowed_credit;
	}

	public void setAllowed_credit(int allowed_credit) {
		Allowed_credit = allowed_credit;
	}

	public int getApplied_credits() {
		return applied_credits;
	}

	public void setApplied_credits(int applied_credits) {
		this.applied_credits = applied_credits;
	}

	public int getNew_bal() {
		return new_bal;
	}

	public void setNew_bal(int new_bal) {
		this.new_bal = new_bal;
	}

	void display() {
		System.out.println("accNo :" + getAccNo());
		System.out.println("Allowed_credit:" + getAllowed_credit());
		System.out.println("total all applied credit applied in this mon9th:" + getApplied_credits());
		System.out.println("pending balance at begining of month" + getPend_bal());
		setNew_bal(getPend_bal() + getAllowed_credit() - getApplied_credits());
		System.out.println("new balance: " + getNew_bal());

		if (getNew_bal() > getAllowed_credit()) {
			System.out.println("exceeded");
		}
	}

	public void accept() {
		System.out.println("enter the account no: ");
		setAccNo(sc.nextInt());

		System.out.println("enter the allowed limit: ");
		setAllowed_credit(sc.nextInt());

		System.out.println("enter the total items charged: ");
		setApplied_credits(sc.nextInt());

		System.out.println("enter the pending balalnce: ");
		setPend_bal(sc.nextInt());
	}
}

class A {
	public static void main(String[] args) {
		Q1 q = new Q1();
		q.accept();
		q.display();
	}
}
