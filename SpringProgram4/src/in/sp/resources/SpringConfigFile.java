package in.sp.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("in.sp.beans")
//@ComponentScan({"in.sp.beans","------","----"})  //This is for multiple.
@ComponentScan(basePackages = {"in.sp.beans"})
public class SpringConfigFile {

}
