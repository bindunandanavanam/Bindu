package collections;
import java.util.*;
import java.io.*;
public class HashMaptoHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<String, Integer> hm = new HashMap<String, Integer>();

		    hm.put("bindu", 123);
		    hm.put("navya", 30);
		    hm.put("ambika", 45);
		    Set st = hm.keySet();
		HashSet<Integer> s3=new HashSet<>(hm.values());
		 Collection<Integer> s2=hm.values();
		    Iterator itr = st.iterator();
		    System.out.println(s3);
		    System.out.println(s2);
		    while (itr.hasNext())
		      System.out.println(itr.next());
	}

}
