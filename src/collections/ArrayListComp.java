package collections;
import java.io.*;
import java.util.*;
import getset.*;
import getset.Stu1;
public class ArrayListComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(122,12,"Bindu"));
		al.add(new Student(102,10,"Nvaya"));
		al.add(new Student(12,21,"kanna"));
		Collections.sort(al);
		for(Student st:al){
			System.out.println(st.age+" "+st.rno+" "+st.name);
		}
	}

}
