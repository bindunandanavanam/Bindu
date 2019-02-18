package exceptionEx;

public class Atm {
	public static boolean isValid(int i) throws InValidPinException{
		if(Card.pin==1000){
			return true;
		}else throw new InValidPinException("not valid");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm a =new Atm();
		try{
		a.isValid(1000);
		}catch(InValidPinException e){
			System.out.println("error");
		}
	}

}
