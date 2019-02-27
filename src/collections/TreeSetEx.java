package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> h= new TreeSet<Integer>();
		h.add(10);
	//null values are not allowed	h.add(null); error
	//	h.add(null);
		h.add(10);//no duplication, but not error
		h.add(5);
		h.add(80);
		Iterator<Integer> it=h.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());//ascending order
		}
	}

}
