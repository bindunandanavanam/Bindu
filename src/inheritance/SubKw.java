package inheritance;

public class SubKw extends SuperKw {
	String name="sub";
	SubKw(){
		super();
		System.out.println(super.name);
		System.out.println(name);
		super.show();
		show();
	}
	public void show(){
		System.out.println("sub class show method");
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SubKw();
		
	}

}
