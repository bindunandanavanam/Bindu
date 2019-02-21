package hackerrank;

import java.util.Scanner;

public class AvgArray {
	double[] accept(){
		Scanner sc=new Scanner(System.in);
		double sum=0;
		double avg=0;
		double num;
		System.out.println("enter array size");
		int x=sc.nextInt();
		System.out.println("enter array values");
		double a[]=new double[x];
		for (int i = 0; i < a.length; i++) {
			num=sc.nextDouble();
			a[i]=num;
			sum=sum+a[i];	
			}
		avg=sum/x;
		System.out.println("average = "+avg);
		System.out.println("array values greater than average are ");
		for (int i = 0; i < a.length; i++) {
			if(a[i]>avg){
				
				System.out.println(a[i]);
			}
		}
		return a;
	}
		

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AvgArray o=new AvgArray();
		o.accept();

	}

}
