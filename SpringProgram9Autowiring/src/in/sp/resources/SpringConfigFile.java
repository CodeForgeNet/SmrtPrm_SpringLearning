package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddressObj() {
		Address addr = new Address();
		
		addr.setHouseno(100);
		addr.setCity("Delhi");
		addr.setPincode(100100);
		
		return addr;
	}
}
