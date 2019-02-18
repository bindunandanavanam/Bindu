package exceptionEx;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			throw new CustomException();
		}catch(CustomException ex){
			System.out.println("App1");
		}
	}

}
