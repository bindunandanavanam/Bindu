package files;
import java.io.*;
public class ArrayFileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream f = new FileInputStream("E:\\Capg\\File.txt");
			int i;
			while ((i = f.read()) != -1) {
				if(f.read()!='-'){
				System.out.println((byte) i);
			}
				}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
