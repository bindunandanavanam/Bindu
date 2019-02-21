package files;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream f=new FileInputStream("E:\\Capg\\Demo.txt");
			//read from file
			System.out.println(f.read());
			//close connection
			f.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
