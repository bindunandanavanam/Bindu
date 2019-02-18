package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class BdayCandles {
 static int bdayCand(long[] arr){
	 int x=0;
	int l=arr.length;
	Arrays.sort(arr);
	System.out.println("sorted array");
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]>=arr[l-1]){
			x++;
		}
	}
	 return x;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of candles");
		int n=sc.nextInt();
		int num;
		long arr[]=new long[n];
		for (int i = 0; i < arr.length; i++) {
			num=sc.nextInt();
			arr[i]=num;
		}
		int res=bdayCand(arr);
		System.out.println("candles "+res);
	}

}
