package hackerrank;

import java.util.Scanner;

public class SevenToLeftofArray {
	private static void SevenLeft(int[] a, int x) {
		
		int l = a.length;
		for (int i = 0; i < a.length-1; i++) {
		 for(int j = i+1; j < l;j++) {
	            if(a[j] == 7){
	                int temp = a[i];
	                a[i] = a[j];
	                a[j] = temp;
	            }
	        }
		}
			for (int j = l-1; j >=0; j--) {
				System.out.println(a[j]);
			}
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
		SevenLeft(a,x);

	}

	
}
