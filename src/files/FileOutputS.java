package files;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputS {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			FileOutputStream f=new FileOutputStream("E:\\Capg\\Demo.txt");
			System.out.println("enter integer");
			int n=sc.nextInt();
			//writing into the file
			f.write(n);
			//close the connection from file
			f.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

}
