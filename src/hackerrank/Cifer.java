package hackerrank;

import java.util.Scanner;

public class Cifer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        
	        int n = sc.nextInt();
	        String word = sc.next();
	        int k = sc.nextInt();
	        String w="abc";
	        System.out.println(w.charAt(2));
	        StringBuilder sb = new StringBuilder();
	        
	        for(int i = 0; i < n; i++) {
	            sb.append(encryptChar(word.charAt(i), k));
	        }
	        
	        System.out.println(sb.toString());
	    }
	    
	    private static char encryptChar(char c, int k) {
	        int base = 'a';
	        System.out.println(base);
	        return (char)((c + k - base) % 26 + base);

	}

}
