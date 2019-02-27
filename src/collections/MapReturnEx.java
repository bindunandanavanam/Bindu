package collections;
import java.util.*;
public class MapReturnEx {
public HashMap<String,Integer> disp(String name){
	HashMap<String, Integer> m= new HashMap<>();
	int l=name.length();
	m.put(name, l);
	return m;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapReturnEx m=new MapReturnEx();
		HashMap<String, Integer> m1= new HashMap<>();
		m1=	m.disp("bob");
		for (Map.Entry me: m1.entrySet()) {
			System.out.println(me.getKey()+" "+me.getValue());
		}
		Collection<Integer> value = m1.values();
		Set<String> key = m1.keySet();
		System.out.println(value+" "+key);
	}

}
