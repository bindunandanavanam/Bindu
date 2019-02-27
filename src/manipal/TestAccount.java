package manipal;

public class TestAccount {

	public static void main(String[] args) {
		//Account ac=new Account(5000.25,4,"active");error as its abstract class
		SBAccount ac=new SBAccount(5000.25,4,"active");
		System.out.println(ac.Calculateinterest());
		System.out.println(ac.toString());
		System.out.println(ac.getIntRate());
		FDAccount ac2=new FDAccount(10000, 8, "active", 2);	
		System.out.println(ac2);
	}

}
