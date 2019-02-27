package threadexample;

public class Thread1 extends Thread {
	public void run() {
		System.out.println("thread implements");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 thread = new Thread1();
		thread.start();
	}

}
