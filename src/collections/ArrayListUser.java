package collections;
import java.util.*;
public class ArrayListUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();
        System.out.println("Enter the input");
        Scanner sc=new Scanner(System.in);
         int a =sc.nextInt();
         	l.add(a);
            System.out.println(l);
            System.out.println("Enter the choice");
            int ch=sc.nextInt();
            System.out.println(l.contains(ch));
            System.out.println("enter element");
            int c2=sc.nextInt();
            System.out.println(l.indexOf(c2));
         /*  Iterator<Integer> it=l.listIterator();
           while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			
		}*/

	}

}
