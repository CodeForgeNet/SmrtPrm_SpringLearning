package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	
	
	@Bean("stdObj")
	public Student createStdBeanObj() {
		Student std = new Student();
		std.setName("Arjun");
		std.setEmail("arjun@gmail.com");
		std.setRollno(21);
		
		return std;
	}
	
	@Bean("stdObj2")
	public Student createStdBeanObj2() {
		Student std = new Student();
		std.setName("luffy");
		std.setEmail("luffy@gmail.com");
		std.setRollno(1212);
		
		return std;
	}
	
}
