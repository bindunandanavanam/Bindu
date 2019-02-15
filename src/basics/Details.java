package basics;

public class Details {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setClgname("VJIT");
		s1.setFees(200);
		s1.setRno(12);
		s1.setName("bindu");
		Student s2=new Student();
		s2.setClgname("KGF");
		s2.setFees(200);
		s2.setName("bhavya");
		s2.setRno(123);
		Student s3=new Student();
		s3.setClgname("kkr"); //last updation is updated
		s3.setFees(200);
		s3.setName("vidya");
		s3.setRno(123);
		System.out.println(s1.getClgname());
		System.out.println(s2.getClgname());
		System.out.println(s3.getClgname());
		
	}

}
