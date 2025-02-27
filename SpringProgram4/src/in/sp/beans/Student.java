package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("101")
	private int rollno;
	@Value("Luffy")
	private String name;
	@Value("94.25f")
	private float marks;
	
	
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
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	public void display() {
		System.out.println("Rollno : "+rollno);
		System.out.println("Name : "+name);
		System.out.println("Marks : "+marks);
	}

}
