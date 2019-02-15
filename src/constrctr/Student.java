package constrctr;
public class Student{
	int rno;
	String name;
  public Student(){
		System.out.println("default cons");
		//new Student(); stack overflow
	}
	public Student(int rno, String name) {
		this();
		this.rno=rno;
		this.name=name;
		System.out.println("param cons");
		//this(); error
		new Student();
	}
	public static void main(String[] args) {
		
		Student s1=new Student(12,"bindu");
		Student s2=new Student(123,"bhaksar");
		s2=s1;
		new Student();//orphan object
		new Student();
		new Student();
	}

}
