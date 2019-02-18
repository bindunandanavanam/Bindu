package hackerrank;

import java.util.Scanner;

public class PlusMinus {
	static void PlusMinus(int a[],int n){
		double c1=0,c2=0,c3=0;
		double r1=0,r2=0,r3=0;
	for (int i = 0; i < a.length; i++) {
		if(a[i]>0){
			c1++;
		}
		else if (a[i]==0) {
			c2++;
		}
		else if (a[i]<0) {
			c3++;
		}
	}	
	r1=c1/n;
	r2=c2/n;
	r3=c3/n;
	//System.out.println(c1+" "+ c2+" "+c3);
	System.out.println(r1);
	System.out.println(r2);
	System.out.println(r3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int x=sc.nextInt();
		int ar[]=new int[x];
		int num;
		System.out.println("enter array values");
		for (int i = 0; i < ar.length; i++) {
			num=sc.nextInt();
			ar[i]=num;
		}
		PlusMinus(ar, x);
	}

}
