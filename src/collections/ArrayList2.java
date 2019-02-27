package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(30);
		System.out.println(al);
		al.add(1, 45);
		System.out.println(al);
		ArrayList<Integer> a2=new ArrayList<>();
		a2.add(50);
		System.out.println(a2);
		a2.add(1, 100);
		System.out.println(a2);
		a2.addAll(al);
		//3 ways to print arraylist elements. sysout and while, foreach loops
		System.out.println(a2);
	Iterator<Integer> li=a2.iterator();
	ListIterator<Integer> k =a2.listIterator();
	while (k.hasNext()) {
		System.out.println("element :"+k.next());
		
	}
	while(k.hasPrevious()){
		System.out.println("element :"+k.previous());
	}
	for (Integer i : a2) {
		System.out.println(i);
	}
	}

}
