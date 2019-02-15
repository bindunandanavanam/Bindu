package getset;

public class Batch1 {

	public static void main(String[] args) {
		Stu s1=new Stu();
		s1.setFees(123.4);
		s1.setName("bindu");
		s1.setRno(12);
		System.out.println(s1.getFees());
		System.out.println(s1.getName());
		System.out.println(s1.getRno());
		System.out.println(s1);//address with hashcode
		Stu s2=new Stu();
		s2.setFees(24343.4);
		s2.setName("navya");
		s2.setRno(9);
		System.out.println(s2.getFees());
		System.out.println(s2.getName());
		System.out.println(s2.getRno());
	}

}
