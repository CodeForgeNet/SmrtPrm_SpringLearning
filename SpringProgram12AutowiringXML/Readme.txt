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