package logic;
import java.util.*;
import java.util.regex.MatchResult;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 values");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		System.out.println("enter operator");
		String ch=sc.next();
		switch(ch){
		case "+" :
			System.out.println("sum = "+(a+b));
			break;
		case "-" :
			System.out.println("difference = "+(a-b));
			break;
		case "*" :
			System.out.println(a*b);
			break;
		case "/" :
			System.out.println(a/b);
			break;
		case "%" :
			System.out.println(a%b);
			break;
			default:
				System.out.println("invalid operator. Try Again!!!");
				
		}
	}

}
