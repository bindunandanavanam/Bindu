package files;
import java.io.*;
import java.util.*;
import getset.*;
public class SerialisationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu s =new Stu();
		//s.setFees(123);
		s.setName("Bindu");
		s.setRno(12);
		try {
			FileOutputStream file=new FileOutputStream("E:\\Capg\\Serial.txt");
			ObjectOutputStream out=new ObjectOutputStream(file);
			out.writeObject(s);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done srialisation");

	}

}
