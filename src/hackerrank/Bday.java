package hackerrank;
import java.util.*;
public class Bday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter test");
int t=sc.nextInt();

while(t!=0){
	System.out.println("enter m");
	int m=sc.nextInt();
	System.out.println("enter n");
	int n=sc.nextInt();
if(n%m==0){
	System.out.println("yes");
}
else{
	System.out.println("no");
}
t--;
	}
	}
}
