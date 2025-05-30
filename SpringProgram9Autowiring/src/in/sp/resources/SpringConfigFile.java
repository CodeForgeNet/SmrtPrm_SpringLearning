package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

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
	public Student createStdObj() {
		Student std = new Student();
		
		std.setRollno(41);
		std.setName("Jindei");
		//std.setAddress(createAddrObj());		//Manually DI
		//To achieve autowiring provide annotation in Student class for address i.e; Autowired.
		
		return std;
	}
	
}
