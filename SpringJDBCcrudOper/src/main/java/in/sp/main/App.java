package in.sp.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.beans.Student;
import in.sp.mappers.StudentRowMapper;
import in.sp.resources.SpringConfigFile;

public class App {
	public static void main(String[] args) {
		
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		JdbcTemplate jdbcTemp = context.getBean(JdbcTemplate.class);
		
		
//		INSERT OPERATION
		
//		int std_roll = 103;
//		String std_name="Krishna";
//		float std_marks = 86.2f;
//		
//		String insert_sql_query = "INSERT INTO student values(?,?,?)";
//		int count = jdbcTemp.update(insert_sql_query,std_roll,std_name,std_marks);
//		
//		if(count>0) {
//			System.out.println("insertion successfull");
//		}else {
//			System.out.println("insertion failed"); 
//		}
		
		
		
		
//		UPDATE OPERATION 
		
//		float marks = 98.2f;
//		int roll = 102;
//		
//		String update_query = "UPDATE student SET std_marks=? where std_roll=?";
//		int count = jdbcTemp.update(update_query,marks,roll);
//		
//		if(count>0) {
//			System.out.println("updation successfull");
//		}else {
//			System.out.println("updation failed");
//			
//		}
		
		
		
//		DELETE OPERATION 
		
//		 int roll_no = 102;
//		 
//		 String delete_query = "DELETE FROM STUDENT WHERE std_roll=?";
//		 int count = jdbcTemp.update(delete_query,roll_no);
//		if(count>0) {
//			System.out.println("DELETE SUCCESSFUL");
//		}else {			
//			System.out.println("DELETE SUCCESSFUL");
//		}
		
		
		
		
//		SELECT OPERATION (ALL)
		
//		String select_query = "SELECT * FROM student";
//		List<Student> std_list = jdbcTemp.query(select_query, new StudentRowMapper());
//		for(Student std : std_list) {
//			System.out.println("Rollno : " +std.getRoll());
//			System.out.println("Name : "+std.getName());
//			System.out.println("Marks : "+std.getMarks());
//			System.out.println("--------------");
//		}

		
		
//		SELECT OPERATION (SINGLE) - 1
		
//		int rollno = 102;
//		String select_query = "SELECT * FROM student where std_roll=?";
//		List<Student> std_list = jdbcTemp.query(select_query, new StudentRowMapper(),rollno);
//		for(Student std : std_list) {
//			System.out.println("Rollno : " +std.getRoll());
//			System.out.println("Name : "+std.getName());
//			System.out.println("Marks : "+std.getMarks());
//			System.out.println("--------------");
//		}
		
		
		
//		SELECT OPERATION (SINGLE) - 2
		
		int rollno = 103;
		String select_query = "SELECT * FROM student where std_roll=?";
		Student std = jdbcTemp.queryForObject(select_query, new StudentRowMapper(),rollno);
		System.out.println("Rollno : " +std.getRoll());
		System.out.println("Name : "+std.getName());
		System.out.println("Marks : "+std.getMarks());
		
		
	}
}
