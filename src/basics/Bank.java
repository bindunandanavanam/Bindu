package basics;

import java.util.Scanner;

public class Bank {
	static double Bal = 1000;

	void trans(double amt) {
		Bal=Bal+amt;
		System.out.println("amount is" + Bal);
	}

	void trans(int ch, double amt) {

		if (amt < Bal){
			Bal=Bal-amt;
			System.out.println("debit " + Bal);
		}
		else
			System.out.println("insufficient balance");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		int i;
		Scanner sc = new Scanner(System.in);
		Bank b = new Bank();
		do {
			System.out.println("enter 1 for credit and 0 for debit.");
			int ch = sc.nextInt();
			System.out.println("enter amount");
			double amt = sc.nextDouble();
			switch (ch) {
			case 0:
				b.trans(ch, amt);
				break;
			case 1:
				b.trans(amt);
				break;
			default:
				System.out.println("invalid choice");
			}
			System.out.println("press 1 to continue");
			i = sc.nextInt();
		} while (i == 1);
		System.out.println("thank you");
	}

}
