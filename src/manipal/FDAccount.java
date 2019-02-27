package manipal;

public class FDAccount extends Account {
	private double principleInt;
	private int duration;
	private double maturityAmt;
	
	
	public FDAccount(double bal, int intRate, String status,int duration) {
		super(bal, intRate, status);
		this.principleInt=bal;
		this.duration=duration;
	}

	public double getPrincipleInt() {
		return principleInt;
	}

	public void setPrincipleInt(double principleInt) {
		this.principleInt = principleInt;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getMaturityAmt() {
		return maturityAmt;
	}

	public void setMaturityAmt(double maturityAmt) {
		this.maturityAmt = maturityAmt;
	}

	@Override
	public String toString() {
		return super.toString()+ "FDAccount [principleInt=" + principleInt +
				", duration=" + duration + 
				", maturityAmt=" + (principleInt+Calculateinterest())
				+ "]";
	}

	
	@Override
	public double Calculateinterest() {
		//compound interest
		double amt=principleInt*Math.pow((1+(double)getIntRate()/100), duration);
		return (amt-principleInt);
	}

}
