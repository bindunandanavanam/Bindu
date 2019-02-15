package inheritance;

public class GrandSon extends Child{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Child c=new Child();
		GrandSon g=new GrandSon();
		g.show();
		System.out.println("Grand son class "+g.childname);
		System.out.println("Grand son class "+g.name);
		g.show1();
	}

}
