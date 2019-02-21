package hackerrank;

import java.util.Scanner;

public class RightTrngl {
	public static void RightTriangle(int a, int b, int c) {
		if (a * a == (b * b + c * c) || (b * b == (a * a + c * c) || (c * c == (a * a + b * b)))) {
			System.out.println("right triangle");
		} else {
			System.out.println("not right triangle");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		//int c1=(int) Math.sqrt(a);
		int b = sc.nextInt();
		int c = sc.nextInt();
		RightTriangle(a, b, c);
	}

}
