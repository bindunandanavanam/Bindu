package logic;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r;
		int rev=0;
		int n=sc.nextInt();
		while(n!=0){
			r=n%10;
			 rev=rev*10 +r;
			n=n/10;
		}
		System.out.println(rev);
		

	}

}
