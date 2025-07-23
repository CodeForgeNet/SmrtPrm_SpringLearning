### Steps to create Spring First WEB-MVC Program :-
1. Create MAVEN Project.
2. Provide "Spring-webmvc" dependency in pom.xml file.
3. Configure "DispatcherServlet" class in web.xml or in java class.
4. Create "Spring Configuration file" (myds-servlet.xml) [myds is servlet name in web.xml file]
5. Configure the handler mapping class in spring configuration file.  
	=> HandlerMapping <interface>  
	=> BeanNamUrlHandlerMapping  
	=> RequestMappingHandlerMapping  etc...
6. Create Controller ( create java class and annotate it with @Controller) in src/main/java folder.
7. Create handler methods in the controller and return the ModelAndView object.
8. Configure ViewResolver in spring Configuration file  
    = ViewResolver <interface>  
    = InternalResourceViewResolver (default)
9. Create view page to be returned (/WEB-INF/views/----.jsp)
10. Scan the package (in which controllers are created) in spring configuration file.  
 
	=========================================================================================