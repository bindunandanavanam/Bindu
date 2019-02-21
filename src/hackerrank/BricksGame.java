package hackerrank;

import java.util.Scanner;

public class BricksGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter bricks");
		int b=sc.nextInt();
		int p=0,m=0,sum=0;
		for (int i = 1; i <=b; i++) {
			p=i;
			m=2*p;
			System.out.println(p+" "+m);
			sum=sum+p+m;
			if(sum<=b)
				break;
		}	
		int left=(sum-b);
		if(left<p){
			System.out.println("motu");
		}
		else{
			System.out.println("patlu");
		}
		//System.out.println(p+" "+m+" "+sum);
	}

}
