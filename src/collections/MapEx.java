package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hash map");
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(101, "bindu");
		hm.put(102, "ambika");
		hm.put(103, "navya");
		for (Map.Entry m: hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println(" \n"+"tree map");
		TreeMap<Integer, String> tm=new TreeMap<>();
		tm.put(201, "bindu");
		tm.put(202, "ambika");
		tm.put(203, "navya");
		for (Map.Entry m1: tm.entrySet()) {
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
	}

}
