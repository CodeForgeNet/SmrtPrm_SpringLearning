package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.resources.SpringConfigFile;

public class App {
	public static void main(String[] args) {
		
		int std_rollno = 101;
		String std_name="Karan";
		float std_marks = 97.5f;
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		JdbcTemplate jdbcTemp = context.getBean(JdbcTemplate.class);
		
		String insert_sql_query = "INSERT INTO student values(?,?,?)";
		int count = jdbcTemp.update(insert_sql_query,std_rollno,std_name,std_marks);
		
		if(count>0) {
			System.out.println("insertion successfull");
		}else {
			System.out.println("insertion failed"); 
		}
	}
}
