** Summary **

The article discusses the SpringProgram12AutowiringXML project, which illustrates the concept of autowiring in the Spring Framework using XML configuration. The project demonstrates how to achieve Dependency Injection (DI) through autowiring by name, type, and constructor.

### Key Points
- The project defines two primary beans: Address and Student. 
- The applicationContext.xml file configures the beans and specifies autowiring modes (byName, byType, or constructor). 
- The Main class initializes the Spring context and retrieves the Student bean, which automatically gets its Address dependency injected. 
- Autowiring techniques include byName (matches property name with bean ID), byType (matches property type with a bean of the same type), and Constructor (injects dependencies via constructor arguments).



** The Purpose of this Project **

The **SpringProgram12AutowiringXML** project serves to demonstrate the concept of **autowiring** in the **Spring Framework** using XML configuration. Its primary purpose includes:

1. **Understanding Dependency Injection (DI)**:
   - The project shows how DI can be achieved through autowiring, which simplifies the process of managing bean dependencies in Spring applications.

2. **Illustrating Autowiring Techniques**:
   - It provides examples of different autowiring modes: by name, by type, and constructor injection. This allows developers to see how Spring resolves dependencies automatically based on configuration.

3. **Configuration Management**:
   - The project highlights the use of the `applicationContext.xml` file to configure beans and specify autowiring modes, showcasing how XML can be used effectively in Spring applications.

4. **Practical Application**:
   - By creating a simple model with `Address` and `Student` beans, the project demonstrates how to set up a Spring application that automatically injects dependencies, making it easier to understand the core concepts of Spring's DI mechanism.

This project is beneficial for developers looking to grasp the fundamentals of dependency injection and the practical application of autowiring in Spring Framework projects.

For further reading on the benefits of autowiring and dependency injection in Spring, you can refer to these sources:
- [How To Simplify Dependency Injection with @Autowired](https://springframework.guru/autowiring-in-spring/) [1]
- [Spring Autowiring - It's a kind of magic - Part 1](https://blog.scottlogic.com/2020/02/25/spring-autowiring-its-a-kind-of-magic.html) [2]
- [Spring @Autowired Annotation](https://www.digitalocean.com/community/tutorials/spring-autowired-annotation) [3]

 





* Project Details

-> Using build path we add jar file using library that i created to put all jar file together.
1. Create Bean class of name Address in package in.sp.beans
2. Create another bean class of name Student in package in.sp.beans
-> Create package named resources i.e; in.sp.resources
3. add spring config file xml schema 
4. Create beans a.) Address bean b.) Student bean
	4.1. Use autowire attribute in student bean tag by modes using byName.
	4.2. Provide address bean id : address i.e; exact same as in Student class
5. Create main package then create Main class. (after successfully running this class the output show the address in student details means we achieve DI using xml config file.
6. Create beans class this example for using autowire byType.
	6.1. If more than one same object bean is present then we use autowireCandidate(it is boolean 	type).
	6.2. this point is in applicationContext.xml file line no.44
	
	
