package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

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
		
		
		
		
//		SELECT OPERATION
		
		String select_query = "SELECT * FROM student";
		jdbcTemp.query(select_query, null);
		
		
		
	}
}
