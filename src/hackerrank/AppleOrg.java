package hackerrank;

import java.util.Scanner;

public class AppleOrg {
	static void CApOrg(int s,int t,int a,int b,int[]ap,int[]or){
		int c1=0,c2=0;
		for (int i = 0; i < ap.length; i++) {
			if((ap[i]>=(s-a))&&(ap[i]<=t)&&(ap[i]>=s)){
				c1++;
			}
		}
		for (int i = 0; i < or.length; i++) {
			if(((t-b)<=or[i])&&(or[i]<=(s))){
				c2++;
			}
		}
		
		System.out.println(c1+" "+c2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter s & t");
		int s=sc.nextInt();
		int t=sc.nextInt();
		System.out.println("enter a & b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("enter apple & orange");
		int m=sc.nextInt();
		int	n=sc.nextInt();
		System.out.println("enter apples");
		int[] ap=new int[m];
		for (int i = 0; i < ap.length; i++) {
			ap[i]=sc.nextInt();
		}
		System.out.println("enter oranges");
		int[] or=new int[n];
		for (int i = 0; i < or.length; i++) {
			or[i]=sc.nextInt();
		}
		CApOrg(s, t, a, b, ap, or);
	}

}