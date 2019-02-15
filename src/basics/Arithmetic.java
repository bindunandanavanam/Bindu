package basics;
// pkg name should always be in small case
import java.util.Scanner;

public class Arithmetic {
	public static void main(String args[]){
		short num1=500;
		short num2=400;
	//	short add=(short) (num1+num2);
		System.out.println(num1+num2);//good coding
	//	System.out.println(add);
		Scanner sc=new Scanner(System.in); //scanner class takes input from user at rum time . 
		//method nextInt for integer and depending on variable we call the method
		System.out.println("Enter num1");
		short n1=sc.nextShort();
		System.out.println("Enter num2");
		short n2=sc.nextShort();
		System.out.println("addition is "+n1+n2);// concatenation
		System.out.println("addition is "+(n1+n2));//addition
	}

}
