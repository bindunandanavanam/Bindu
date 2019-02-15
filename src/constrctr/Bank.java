package constrctr;

public class Bank {
	int Ac;
	int Bal;
	public Bank(){
		System.out.println("cons called");
	}
	public Bank(int i, int j) {
		Ac=i;
		Bal=j;
		System.out.println(Ac);
		System.out.println(Bal);
	}
	public static void main(String[] args) {
	// default cons. If we dont give default cons,its created by JVM automatically.
		Bank b1=new Bank();
		Bank b2=new Bank(20,100);
		Bank b3=new Bank();
		//Bank b1=new Bank();//error. obj is overriden. duplicate local var.
//for b1,b2,b3 mem is created 3 times bcoz of new keyword.
//garbage collection destroys the obj after execution. 
//if we want the obj to be preserved, we use serialisation, stored in text file.
//deserialisation again and refrence is used again.
	}

}
