package collections;
import java.util.*;

public class HashSetAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "the quick brown fox jumps over the lazy dog";
		HashSet hs1 = new HashSet<>();
		for (int i = 0; i < str1.length(); i++) {
			hs1.add(str1.charAt(i));  }
		System.out.println(hs1);
		if (hs1.size() == 27) 
			System.out.println("its a anagram");
		 else
			System.out.println("its not a anagram");
		
		String str2 = "we promptly judged antique ivory buckles for the next prize";
		HashSet hs2 = new HashSet<>();
		for (int i = 0; i < str2.length(); i++) {
			hs2.add(str2.charAt(i));  }
		System.out.println(hs2);
		if (hs2.size() == 27) 
			System.out.println("its a anagram");
		 else
			System.out.println("its not a anagram");
	}

}
