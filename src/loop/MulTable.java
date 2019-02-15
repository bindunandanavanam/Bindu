package loop;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class MulTable {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n value");
	int n=sc.nextInt();
	int i=1;
	while(i<=10){
		System.out.println(n+" "+"*"+" "+i+" "+"="+" "+(n*i));
		i++;
	}

	}

}
