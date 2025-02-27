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
		addr.setCity("Noida");
		addr.setPincode(201301);
		
		return addr;
	}
	
	
	@Bean
	public Student createStudObj() {
		Student std = new Student();
		std.setRollno(23);
		std.setName("Brook");
		std.setAddress(createAddrObj());
		
		return std;
	}
}
