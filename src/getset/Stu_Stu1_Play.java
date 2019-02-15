package getset;

public class Stu_Stu1_Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu s1=new Stu();
		Stu1 s2=new Stu1();
		s1.setName("bindu");
		s2.setName(s1.getName());
		System.out.println(s1.getName());
		System.out.println(s2.getName());
		System.out.println(s1.equals(s2));//address is not same
	}

}
