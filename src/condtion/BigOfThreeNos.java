package condtion;

import java.util.Scanner;

public class BigOfThreeNos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1");
		int a=sc.nextInt();
		System.out.println("Enter num2");
		int b=sc.nextInt();
		System.out.println("Enter num3");
		int c=sc.nextInt();
	if((a==b) && (a==c) && (b==c))
	{ System.out.println("all are equal"+a);
	
	}
	else if (a>b) {
			if (a>c) {
				System.out.println("a is big "+a);
			} else {
				System.out.println("c ic big "+c);
			}
		}else if (b>c) {
			System.out.println("b is big "+b);
		} else {
			System.out.println("c ic big "+c);
		} 
	}

}
