package getset;

import java.io.Serializable;

//POJO CLASS (Plain Obj Java Obj)
public class Stu implements Serializable {
	private int rno;
	private double fees;
	private String name;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
