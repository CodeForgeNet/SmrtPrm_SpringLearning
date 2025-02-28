package in.sp.main;

// ->Annotation Based Autowiring. (If multiple bean object is present).
// We have to use Qualifier annotation to remove confusion b/w the object.

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student std = context.getBean(Student.class);
		
		std.display();
	}
}
