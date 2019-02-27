package collections;
import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		//creation
		List animal=new ArrayList();// or
		//ArrayList al=new ArrayList();
		animal.add(10);
		animal.add(20);
		
		animal.add("porter");
		System.out.println(animal);
		System.out.println(animal.get(2));
		animal.add(1, "bindu");
		System.out.println(animal);
		Collections.sort(animal);
		  Iterator itr = animal.iterator();
		while (itr.hasNext())
		      System.out.println(itr.next());
	}
		
	}

