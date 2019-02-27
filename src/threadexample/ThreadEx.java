package threadexample;
class Thred1 extends Thread{
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println("thread 1");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
class Thred2 extends Thread{
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println("thread 2");
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
public class ThreadEx  {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thred1 t1=new Thred1();
		Thred2 t2=new Thred2();
		t1.start();
		t2.start();

	}

}
