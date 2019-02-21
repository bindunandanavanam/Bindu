package hackerrank;
import java.util.*;
public class RoyProfile {
	void pic(int l,int w,int h){
			if((w>=l)&&(h>=l)){
				if(h==w){
					System.out.println("ACCEPTED");
				}
				else {
					System.out.println("CROP IT");
				}
			}else{
				System.out.println("UPLOAD ANOTHER");
			} 	
		}
		
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		RoyProfile o=new RoyProfile();
		System.out.println("enter pictures");
		int n=sc.nextInt();
		while(n!=0){
		System.out.println("enter l");
		int l=sc.nextInt();
		System.out.println("enter w and h");
		int w=sc.nextInt();
		int h=sc.nextInt();
		o.pic(l,w,h);
		n--;
		}
	}

}
