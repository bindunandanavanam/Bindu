package arrayex;
import java.util.Scanner;
//Jagged Array
public class BankCustDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long l;
		Scanner sc=new Scanner(System.in);
		long Kotak[][]=new long[2][];
		long CustDetails1[]=new long[4];
		long CustDetails2[]=new long[4];
		System.out.println("enter customer 1 details");
		for (int i = 0; i < CustDetails1.length; i++) {
			l=sc.nextLong();
			CustDetails1[i]=l;
		}
		System.out.println("enter customer 2 details");
		for (int i = 0; i < CustDetails2.length; i++) {
			l=sc.nextLong();
			CustDetails2[i]=l;
		}
		Kotak[0]=CustDetails1;
		Kotak[1]=CustDetails2;
		for (int i = 0; i < Kotak.length; i++) {
			for (int j = 0; j < Kotak[i].length; j++) {
				
		System.out.println(Kotak[i][j]);	
		}
		}
	
	}

}
