package in.sp.beans;

// Here we create java POJO  class.

public class Student {
	
	private int rollno;
	private String name;
	private String email;
	
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display() {
		System.out.println("Roll_no : "+rollno);
		System.out.println("Name : "+name);
		System.out.println("Email : "+email);
	}

}
