package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class CiferFileIO {
	public static StringBuilder encryption(String msg, int key){
		char[] letters=msg.toCharArray();
		StringBuilder encmsg=new StringBuilder();
		for (int i = 0; i < letters.length; i++) {
			encmsg.append((char)(byte)(letters[i]+key));
		}
		System.out.println("en "+encmsg);
		return encmsg;
	}
	public static void decryp(StringBuilder encmsg,int key){
		String msg=encmsg.toString();
		char[] let=msg.toCharArray();
		StringBuilder decmsg=new StringBuilder();
		for (int i = 0; i < let.length; i++) {
			decmsg.append((char)(byte)(let[i]-key));
		}
		System.out.println("de "+decmsg);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String str=sc.next();
		System.out.println("enter key");
		int k=sc.nextInt();
		
		byte[] b=str.getBytes();
		StringBuilder s=new StringBuilder();
		try {
			FileInputStream f2 = new FileInputStream("E:\\Capg\\Demo.txt");//msg
			FileOutputStream f1=new FileOutputStream("E:\\Capg\\Demo.txt");//msg
			FileOutputStream f3 = new FileOutputStream("E:\\Capg\\Demo1.txt");//key
			FileInputStream f4=new FileInputStream("E:\\Capg\\Demo1.txt");//key
			f1.write(b);//msg
			f3.write(k);//key
			int i,j;
			while ((i = f2.read()) != -1) {
				s.append(i);
				System.out.println((char) i);
			}
			String s1=s.toString();
		int k1=	f4.read();
		System.out.println(k1);
			f1.close();
			f2.close();
			f3.close();
			f4.close();
			decryp(encryption(s1, k1),k1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
sc.close();
	}

}
