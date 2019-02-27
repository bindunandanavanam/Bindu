package manipal;
//cosmic (obj) class is super class of all classes
public abstract class Account { //obj cant be created for abstract class. used to define common properties
public static int accCounter=101;
private int accNo;
private double bal;
private int intRate;
private String status;
public abstract double Calculateinterest();
public Account(double bal, int intRate, String status){
	super();
	this.bal=bal;
	this.accNo=accNo;
	this.intRate=intRate;
	this.status=status;
	
}
@Override
public String toString() {//represents values of the inst var returns the textual string 
	return "Account [accNo=" + accNo + ", bal=" + bal + ", intRate=" + intRate + ","
			+ " status=" + status + "]";
}
public static int getAccCounter() {
	return accCounter;
}
public static void setAccCounter(int accCounter) {
	Account.accCounter = accCounter;
}
public int getAccNo() {
	return accNo;
}
public void setAccNo(int accNo) {
	this.accNo = accNo;
}
public double getBal() {
	return bal;
}
public void setBal(double bal) {
	this.bal = bal;
}
public int getIntRate() {
	return intRate;
}
public void setIntRate(int intRate) {
	this.intRate = intRate;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
}
