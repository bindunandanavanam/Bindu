package manipal;
//polymorphism
public class TestPoly {

	public static void main(String[] args) {
		Account ac1=new SBAccount(5000.25,4,"active");//sb a/c is taking form of a/c
		Account ac2=new FDAccount(1000, 8, "active", 2);
		System.out.println(ac1.getAccNo());
		System.out.println(ac2.getAccNo());
		
		//dynamic polymorphism
		System.out.println(ac1);
		System.out.println(ac2);
		
		Account[] acc={ac1,ac2};
	}

}
