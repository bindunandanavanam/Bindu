package wrapper;

import java.util.Scanner;

import getset.Stu;

public class ObjPassingEx {
	Stu s = new Stu();

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ObjPassingEx o = new ObjPassingEx();
		Stu s2 = new Stu();
		s2 = o.accept();// method returns an obj of student class
		o.display(s2);
		// o.display(o.accept()); single line for reducing the mem space for
		// creating s2 obj
	}

	private void display(Stu s) {
		System.out.println(s.getName());
		System.out.println(s.getFees());
		System.out.println(s.getRno());
	}

	private Stu accept() {// accept method returns stu class object
		System.out.println("enter name");
		s.setName(sc.next());
		System.out.println("enter fees");
		s.setFees(sc.nextDouble());
		System.out.println("enter rno");
		s.setRno(sc.nextInt());
		return s;// return student object
	}

}
