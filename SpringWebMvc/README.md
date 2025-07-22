### Steps to create Spring First WEB-MVC Program :-
1. Create MAVEN Project.
2. Provide "Spring-webmvc" dependency in pom.xml file.
3. Configure "DispatcherServlet" class in web.xml or in java class.
4. Create "Spring Configuration file" (myds-servlet.xml) [myds is servlet name in web.xml file]
5. Configure the handler mapping class in spring configuration file.  
	=> HandlerMapping <interface>  
	=> BeanNamUrlHandlerMapping  
	=> RequestMappingHandlerMapping  etc...