package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private int rollno;
	private String name;
	@Autowired
	private Address address;
	@Autowired
	@Qualifier("createSubjObj2")  //If more than one bean object is present. It removes the confusion b/w the object to autowired the object.
	private Subjects subjects;
	
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
	
//	No need to provide setter method , coz we have to achieve autowiring (DI automatically).
	
//	public Subjects getSubjects()
//	{
//		return subjects;
//	}
//	
//	public void setSubjects(Subjects subjects) {
//		this.subjects=subjects;
//	}
	
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}
	
	public void display() {
		System.out.println("Rollno : "+rollno);
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
		System.out.println("Subjects : "+subjects);
	}
	
}
