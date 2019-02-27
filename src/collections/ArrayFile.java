package collections;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class ArrayFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		System.out.println("Enter the list");
		String str=sc.next(); 
		byte[] b=str.getBytes();
	try {
		FileOutputStream f=new FileOutputStream("E:\\Capg\\File.txt");
		f.write(b);
		f.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
		/*Iterator<Integer> it=l.listIterator();
        while (it.hasNext()) {
			Integer integer = (Integer) it.next();
		System.out.println(integer);	
		}*/

	}

}