package exceptionEx;

public class Exceptn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		String n="bob";
		System.out.println("hello");
		int arr[]={1,2,3,4};
		try{
			System.out.println(10/0);
		//System.out.println(a/n);//compile time error. checked exception. 
		System.out.println(arr[7]);
		System.out.println(10/0);//unchecked exception
	} catch(ArithmeticException e){
		System.out.println(e);
	} catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
		System.out.println(e);
	} 
		try{
			System.out.println("2nd try");
			System.out.println(10/0);
		}catch(Exception e){
			System.out.println("2nd catch");
		}
		finally{
		System.out.println("end");
	}
	}

}
