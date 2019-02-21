package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2,j=0;
		System.out.println("enter array 1 size");
		int x=sc.nextInt();
		System.out.println("enter 1st array");
		int a[]=new int[x];
		for (int i = 0; i < a.length; i++) {
			n1=sc.nextInt();
			a[i]=n1;
		}
		System.out.println("enter array 2 size");
		int y=sc.nextInt();
		System.out.println("enter 2nd array");
		int b[]=new int[y];
		for (int i = 0; i < b.length; i++) {
			n2=sc.nextInt();
			b[i]=n2;
		}
		int c[]=new int[x+y];
		Arrays.sort(a);
		Arrays.sort(b);
		for (int i = 0; i < c.length; i++) {
			if(i<a.length){
				c[i]=a[i];
			}
			else{
				c[i]=b[j];
				j++;
			}
		}
		Arrays.sort(a);
for (int i = 0; i < c.length; i++) {
	System.out.println(c[i]);
}
	}

}
