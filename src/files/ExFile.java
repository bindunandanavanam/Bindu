package files;
import java.util.*;

import basics.Student;

import java.io.*;
public class ExFile {
static int count=1;
	public static Student setInfo(){
		Scanner sc=new Scanner(System.in);
		Student s =new Student();
		System.out.println("enter student details"+count);
		s.setClgname(sc.nextLine());
		s.setFees(sc.nextDouble());
		s.setRno(sc.nextInt());
		count++;
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> sa=new ArrayList<>();
		sa.add(setInfo());
		sa.add(setInfo());
		
		System.out.println(sa);
		try {
			FileOutputStream f=new FileOutputStream("E:\\Capg\\StuFile.txt");
			ObjectOutputStream obj=new ObjectOutputStream(f);
			obj.writeObject(sa);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
