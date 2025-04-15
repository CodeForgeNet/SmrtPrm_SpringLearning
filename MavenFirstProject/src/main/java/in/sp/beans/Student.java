package in.sp.beans;
// (1)
public class Student {
	private String name;
	private int rollno;
	private float marks;
	
//	Getter Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Rollno : "+rollno);
		System.out.println("Marks : "+marks);
	}
	

}
//(/1)