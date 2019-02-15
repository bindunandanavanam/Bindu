package hackerrank;

import java.util.Scanner;
import java.math.*;

public class DiagonalDifference {
	
	public static int diff(int[][]arr,int r,int c){
		int t1=0,t2=0,t3=0;
		int ct=r-1;
		for (int i = 0; i < r; i++) {
				for (int j = 0; j <c; j++) {
					if(i==j){
						t1=t1+arr[i][j];
					}
				}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j <c; j++) {
					if ((i+j)==ct) {
					t2=t2+arr[i][j];	
					}
					
				}	
		}
		System.out.println(t1);
		System.out.println(t2);
		t3=t1-t2;
		int t4=Math.abs(t3);
		return t4;
	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		DiagonalDifference d=new DiagonalDifference();
		System.out.println("enter the rows and cols");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int mat[][]=new int[row][col];
		if(row==col){
			System.out.println("enter values");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					
					n = sc.nextInt();
					mat[i][j] = n;

				}

			}
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print(mat[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println(d.diff(mat,row,col));
		}
		
		else {
			System.out.println("enter the square matrix. Thank u");
		}
	}

}
