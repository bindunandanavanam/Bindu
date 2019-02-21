package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallLarge {
public static int Small(int a[],int n){
	Arrays.sort(a);
	int k=0;
	for (int i = 0; i < a.length; i++) {
	if(n==(i+1)){
		k=a[i];
	}
	}
	return k;
	
}
public static int Large(int a[],int n){
	
	Arrays.sort(a);
	int k=0;
	int l=a.length;
	/*for (int i = a.length-1; i >=0; i--) {
System.out.println(a[i]);
	if(n==i){
		k=a[i];
	}
	}*/
	k=a[l-n];
	return k;	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("enter array size");
		int x=sc.nextInt();
		System.out.println("enter array values");
		int a[]=new int[x];
		for (int i = 0; i < a.length; i++) {
			num=sc.nextInt();
			a[i]=num;
		}
		System.out.println("enter 1 for small or 2 for large");
		int ch=sc.nextInt();
		System.out.println("enter the postion");
		int p=sc.nextInt();
		if(ch==1){
			int res=Small(a,p);
			System.out.println(res);
			System.out.println("smallest number");
		}
		else if(ch==2){
			int r2=Large(a, p);
			System.out.println(r2);
			System.out.println("largest number");
		}
	}
	

}
