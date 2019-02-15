package inheritance;

public class Bindu implements Madhu, Sujatha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bindu b=new Bindu();
		b.name();
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("I am bindu");
	}

}
