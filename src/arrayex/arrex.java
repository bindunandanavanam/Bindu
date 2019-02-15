package arrayex;

import java.util.Scanner;

public class arrex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int AcNo[]=new int[5];
	int num;
	Scanner sc=new Scanner(System.in);
	for (int i = 0; i < AcNo.length; i++) {
		System.out.println("enter "+(i+1)+" number : ");
		num=sc.nextInt();
		AcNo[i]=num;
	}
	//AcNo[2]=40;
	//AcNo[4]=90;
	//remaining places are 0 bcoz default value is 0.
	for (int j = 0; j < AcNo.length; j++) {
		System.out.println(AcNo[j]);
	}
	
	}

}
