package basics;
import java.io.*;
public class ConsoleEx {
//execute in cmd
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	String str= System.console().readLine();
	System.out.println(str);
	char[] pass=System.console().readPassword();
	System.out.println(pass);
	}

}
