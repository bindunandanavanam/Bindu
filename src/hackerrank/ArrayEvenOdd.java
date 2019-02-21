package hackerrank;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayEvenOdd {
	int[] EvenOdd(){
		Scanner sc=new Scanner(System.in);
		int n1,ec=0,oc=0;
		System.out.println("enter array  size");
		int x=sc.nextInt();
		System.out.println("enter array values");
		int a[]=new int[x];
		for (int i = 0; i < a.length; i++) {
			n1=sc.nextInt();
			a[i]=n1;
			if(a[i]%2==0)
				ec++;
			else oc++;
		}
		int e[]=new int[ec];
		int o[]=new int[oc];
		int c[]=new int[ec+oc];
		System.out.println(ec+" "+oc);
		int j=0;
	for (int i = 0; i < a.length; i++) {
			if((a[i]%2)==0){
				e[j]=a[i];
				j++;
			}
		}	
	int k=0;
		for (int i = 0; i < a.length; i++) {
				if((a[i]%2)!=0){
					o[k]=a[i];
					k++;
					}		
			}
	/*for ( j = 0; j < e.length; j++) {
		System.out.println(e[j]);	
	}
	for ( j = 0; j < o.length; j++) {
		System.out.println(o[j]);	
	}*/
		Arrays.sort(o);
		Arrays.sort(e);
	int l=0;
	for (int i = 0; i < c.length; i++) {
		if(i<e.length){
			c[i]=e[i];
		}
		else{
			c[i]=o[l];
			l++;
		}
	}
	for (int i = 0; i < c.length; i++) {
		System.out.println(c[i]);
	}
		return c;
		
	}
	void disp(int c[]){
		
	}
	public static void main(String[] args) {
	ArrayEvenOdd o=new ArrayEvenOdd();
	o.EvenOdd();

	}

}
