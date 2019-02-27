package manipal;

public class SBAccount extends Account {//we can inherit only 1 class

	public SBAccount(double bal, int intRate, String status) {
		//constructor chaining
		//super(); default cons
		super(bal, intRate, status);
		
	}

	//simple interest
	@Override
	public double Calculateinterest() {
		// TODO Auto-generated method stub
		return (getBal()*1*getIntRate())/100;
	}

}
