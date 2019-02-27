package threadexample;

public class Thread2 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread2 thread=new Thread2();
		Thread th=new Thread(thread);
		th.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("implements runnable");
	}

}
