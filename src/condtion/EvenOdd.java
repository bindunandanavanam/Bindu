package condtion;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
	System.out.println("enter n value");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n%2==0){
		//System.out.println("even number "+(n+10));
		n+=10;
	} else {
	//	System.out.println("odd number "+(n+15));
		n+=15;

	}
	System.out.println(n);
	}

}
