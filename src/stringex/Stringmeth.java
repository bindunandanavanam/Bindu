package stringex;

import java.util.Scanner;

public class Stringmeth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=20;
		String s1= new String("I go to college by bus to read, to understand.");
		System.out.println(s1.charAt(19));
//System.out.println(s1.charAt(70));// string index out of range exception not error
System.out.println("length "+s1.length());
System.out.println(s1.toLowerCase());
System.out.println(s1.toUpperCase());
System.out.println(s1.startsWith("He"));
System.out.println(s1.endsWith("."));
System.out.println(s1.trim());
String vs=String.valueOf(a);
System.out.println(vs+10);

	}

}
