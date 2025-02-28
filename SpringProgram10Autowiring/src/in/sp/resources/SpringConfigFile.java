package in.sp.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subjects;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddrObj() {
		Address addr = new Address();
		
		addr.setHouseno(100);
		addr.setCity("Delhi");
		addr.setPincode(100100);
		
		return addr;
	}
	
	@Bean
	public Subjects createSubjObj() {
		Subjects subj = new Subjects();
		
		List<String> subjList = new ArrayList<String>();
		subjList.add("java");
		subjList.add("python");
		subjList.add("c++");
		
		subj.setSubject(subjList);
		
		return subj;
	}
	
	
	@Bean
	public Student createStdObj() {
		Student std = new Student();
		
		std.setRollno(41);
		std.setName("Jindei");
		//To achieve autowiring provide annotation in Student class for address i.e; Autowired.
		//std.setAddress(createAddrObj());		//Manually DI
		//std.setSubjects(createSubjObj());		//Manually DI
		
		return std;
	}
	
}
