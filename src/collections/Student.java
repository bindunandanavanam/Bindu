package collections;

public class Student implements Comparable<Student> {
int rno;
int age;
String name;
Student(int rno,int age,String name){
	this.rno=rno;
	this.age=age;
	this.name=name;
}
@Override
public int compareTo(Student o) {
	// TODO Auto-generated method stub
	if(age==o.age)
		return 0;	
	else if(age<o.age)
	return 1;
	else
		return -1;
}
}
