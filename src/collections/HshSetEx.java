package collections;
import java.util.*;
import java.io.*;
public class HshSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> h= new HashSet<Integer>();
		h.add(10);
		h.add(null);
		h.add(null);// no error for nulls though they are more than 1
		h.add(10);
		h.add(5);
		h.add(80);
		Iterator<Integer> it=h.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
