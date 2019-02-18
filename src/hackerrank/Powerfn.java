package hackerrank;
import java.util.Scanner;
public class Powerfn {
	static void Calc(int[] bas, int[] pow) throws Exception {
		double res = 0;
		int result = 0;
		for (int i = 0; i < pow.length; i++) {
			if ((bas[i] > 0) && (pow[i] > 0)) {
				res = (int) Math.pow(bas[i], pow[i]);
				System.out.println(res);
			} else if ((bas[i] < 0) && (pow[i] < 0)) {
				throw new Exception("n and p are negative");
			} else if ((bas[i] == 0) && (pow[i] == 0)) {

				throw new Exception("n and p are zero");
			}

		}

		for (int i = 0; i < pow.length; i++) {
			res = Math.pow(bas[i], pow[i]);
			//System.out.println(res);
		}
	
	}

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.println("enter base range");
		int x = sc.nextInt();
		int bas[] = new int[x];
		for (int i = 0; i < bas.length; i++) {
			n1 = sc.nextInt();
			bas[i] = n1;
		}
		System.out.println("enter power range");
		int y = sc.nextInt();
		int pow[] = new int[y];
		for (int i = 0; i < bas.length; i++) {
			n2 = sc.nextInt();
			pow[i] = n2;
		}
		
			try {
				Calc(bas, pow);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		
		}
	
}