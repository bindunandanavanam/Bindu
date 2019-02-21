package files;

import java.util.*;
import java.io.*;

public class FileNameOutput {

	public static void main(String[] args) {
		FileInputStream f;
		try {
			f = new FileInputStream("E:\\Capg\\Demo.txt");
			int i;
			while ((i = f.read()) != -1) {
				System.out.println((char) i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
