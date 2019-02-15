package arrayex;

import java.util.Scanner;

public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int matr1[][]=new int[2][2];
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rows and cols");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int mat1[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("enter values");
				num = sc.nextInt();
				mat1[i][j] = num;

			}

		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(mat1[i][j]+" ");
			}
			System.out.println();
		}
	}
}
