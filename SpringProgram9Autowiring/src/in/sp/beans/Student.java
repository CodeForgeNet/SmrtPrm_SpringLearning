package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int rollno;
	private String name;
	@Autowired
	private Address address;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Rollno : "+rollno);
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
	}
}
