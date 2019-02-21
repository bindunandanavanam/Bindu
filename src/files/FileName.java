package files;

import java.io.*;
import java.util.*;

public class FileName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String str=sc.next(); 
		byte[] b=str.getBytes();
		try {
			FileOutputStream f=new FileOutputStream("E:\\Capg\\Demo.txt");
			f.write(b);
			f.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
