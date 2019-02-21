package hackerrank;
import java.util.Scanner;
public class StringConcatAlt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string 1");
		String s1=sc.nextLine();
		int a=s1.length();
		char[] a1=s1.toCharArray();
		System.out.println("enter string 2");
		String s2=sc.nextLine();
		int b=s2.length();
		char[] b1=s2.toCharArray();
		
		String s3;
		s3=s1.concat(s2);
		char s4[]=new char[a+b];
		System.out.println(s3);
		int j=0;
		int l=0;
	for (int i = 0; i < s4.length; i++) {
		if(i%2==0){
			s4[i]=a1[j];
			j++;
		}
			else if(i%2!=0){
				s4[i]=b1[l];
				l++;
			}
		}
	System.out.println(s4);	 
	}
}
	


