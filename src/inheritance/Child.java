package inheritance;

public class Child extends Parent{
	String childname="John";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c=new Child();
		c.show();
		System.out.println("child class Father Name"+c.name);
	}
	public void show1(){
		System.out.println("child");
	}
}
