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
		
//		int std_roll = 102;
//		String std_name="Arjun";
//		float std_marks = 95.3f;
		
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
		
		
		
		
	}
}
