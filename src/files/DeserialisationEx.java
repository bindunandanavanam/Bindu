package files;
import java.io.*;
import java.util.*;
import getset.*;
public class DeserialisationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream file=new FileInputStream("E:\\Capg\\Serial.txt");
			ObjectInputStream out=new ObjectInputStream(file);
			Stu s=(Stu)out.readObject();
			s.setFees(1234);
			System.out.println(s.getFees()+" "+s.getName()+" "+s.getRno());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done desrialisation");

	}

	}


