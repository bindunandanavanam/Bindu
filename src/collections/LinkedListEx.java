package collections;

import java.util.*;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ll=new LinkedList<>();
		ll.add(34);
		ll.add(540);
		ll.add(89);
		Iterator<Integer> it=ll.iterator();
		while (it.hasNext()) {
			System.out.println("element "+it.next());
		}
	}

}
