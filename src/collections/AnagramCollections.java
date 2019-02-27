package collections;
import java.util.*;
import java.io.*;
public class AnagramCollections {
	static boolean test(String a, String b) {

		// test for invalid input   
		if( a == null || b == null || a.equals("") || b.equals("") )
		    return false;

		// initial quick test for non-anagrams
		if ( a.length() != b.length() )
		    return false;

		a = a.toLowerCase();
		b = b.toLowerCase();

		// populate a map with letters and frequencies of String b
		Map<Character, Integer> map = new HashMap<>();

		for (int k = 0; k < b.length(); k++){
		     char letter = b.charAt(k);    

		    if( ! map.containsKey(letter)){
		        map.put( letter, 1 );
		    } else {
		        Integer frequency = map.get( letter );
		        map.put( letter, ++frequency );
		    }
		}

		// test each letter in String a against data in the map
		// return if letter is absent in the map or its  frequency is 0
		// otherwise decrease the frequency by 1

		for (int k = 0; k < a.length(); k++){
		    char letter = a.charAt(k);

		    if( ! map.containsKey( letter ) )
		        return false;

		    Integer frequency = map.get( letter );

		     if( frequency == 0 )
		        return false;
		    else    
		        map.put( letter, --frequency);
		}
		// if the code got that far it is an anagram
		return true;
	}
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string 1");
	String s1=sc.next();
	System.out.println("enter string 2");
	String s2=sc.next();
	boolean ret =test(s1, s2);
    System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
}
}
