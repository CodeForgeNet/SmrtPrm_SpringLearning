package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String[] args) {
		// All this jar file should be of same version.
		// spring-beans-xxx.jar
		// spring-core-xxx.jar
		// spring-context.xxx.jar
		// spring-expression-xxx.jar
		// commons-logging-xxx.jar

		// two way to add jar file one is go to java build path -> classpath -> add external jar file.
		// Another way is using library (this is best way) classpath -> add library -> user library (next) -> user library -> new -> springjars -> add external jars
		
		
		
		
//		ApplicationContext is interface so we can't create object of that . so for that there is one implemented class that is ClassPathXmlApplicationContext(through this we can  load the resource file or spring configuration file).
		
		String config_loc = "/in/sp/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc); //-> this line start the container.
		
		
		Student std = (Student) context.getBean("stdId");
		std.display();
		
		Student std2 = (Student) context.getBean("stdId2");
		std2.display();
				
		
		
		
	}
}



