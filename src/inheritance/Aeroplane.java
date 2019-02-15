package inheritance;

public class Aeroplane implements Flyable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aeroplane f1=new Aeroplane();
		Flyable f=new Aeroplane();
	//	Flyable f3=new Flyable(); error
		f1.start();
		f.start();
		f1.land();
		f.land();
		f1.stop();
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("started");
		
	}
	public void stop(){
		System.out.println("stop");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("landed");
	}

}
