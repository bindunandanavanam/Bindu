package hackerrank;

import java.util.Scanner;

public class StringConv {
public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String Arr[] = str.split(":");
        String AP = Arr[2].substring(2,4);
        int hh,mm,ss;
        hh = Integer.parseInt(Arr[0]);
        mm = Integer.parseInt(Arr[1]);
        ss = Integer.parseInt(Arr[2].substring(0,2));
        int h2 = hh;
       if(AP.equals("AM")&&hh==12)
        	h2=0;
       else if(AP.equals("PM")&& hh<12)
        	h2=h2+12;
        
        System.out.printf("%02d:%02d:%02d",h2,mm,ss);
    }
}
