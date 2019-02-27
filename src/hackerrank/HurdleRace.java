package hackerrank;

import java.util.*;
import java.io.*;

public class HurdleRace {
	public int count(int arr[], int k) {
		int c = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] < k) {
				System.out.println(arr[j]);
			} else
				c++;
		}
		System.out.println("extra " + c);
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of hurdles");
		int n = sc.nextInt();
		System.out.println("enter the max height");
		int k = sc.nextInt();
		int[] arr = new int[n];
		int num, c = 0;
		System.out.println("enter heights which he has to pass");
		for (int i = 0; i < arr.length; i++) {
			num = sc.nextInt();
			arr[i] = num;
		}
		
		HurdleRace h=new HurdleRace();
		h.count(arr, k);
	}
}
