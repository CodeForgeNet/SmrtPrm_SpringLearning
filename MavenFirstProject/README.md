
Steps to Develop `SmrtPrm_SpringLearning/MavenFirstProject`:

1. Install Prerequisite
   ● Java JDK (version 8 or above) **must be**
   - Install **Maven** (if not already installed).
   - Install an Integrated Development Environment (IDE) such as **Eclipse**, **IntelliJ IDEA** or **Spring Tool Suite**.

2. Create New Maven Project
 1. Go to your command line.
 2. Go to the location of the project directory.
 3. Run the following command:
     ```bash
     mvn archetype:generate -DgroupId=com.example -DartifactId=MavenFirstProject -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
     ```
     - This will create the basic structure of a new maven project

3. Navigate to the Project Directory
- Change Directory to project:
     ```bash
     cd MavenFirstProject
     ```

4. Edit `pom.xml` File
- Edit `pom.xml` either in your IDE or text editor.
- Then we need to add spring dependencies For example to include Spring Core and Spring Web, add
     ```xml
     <dependencies>
         <dependency>
             <groupId>org.springframework</groupId>
             <artifactId>spring-core</artifactId>
             <version>5.3.9</version>
         </dependency>
         <dependency>
             <groupId>org.springframework</groupId>
             <artifactId>spring-web</artifactId>
             <version>5.3.9</version>
         </dependency>
     </dependencies>
     ```

5. Create Application Structure
- In `src/main/java/com/example/`, create a new package called `controller`
**Create a class in the `controller` package:**
     ```java
package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
        @GetMapping("/hello")
         public String hello() {
             return "Hello, Spring!";
         }
     }

     ```

6. Create The Application Main Class
- Inside the `src/main/java/com/example/`, create another class called MavenFirstProjectApplication:
     ```java
package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavenFirstProjectApplication {
         public static void main(String[] args) {
             SpringApplication.run(MavenFirstProjectApplication.class, args);
         }
     }
     ```

7. (Optional) Add Spring Boot Dependency
- Include the Spring Boot starter dependency in `pom.xml` if you want to use Spring Boot:
     ```xml
     <dependency>
         <groupId>org.springframework.boot</groupId>
         <artifactId>spring-boot-starter</artifactId>
         <version>2.5.4</version>
     </dependency>
     ```

8. Build The Project
- Build your project by running
 mvn clean package

9. Run the Application
- Boot the spring application by doing one of the following:
 ```bash
mvn spring-boot:run
```
or you can run the compiled JAR file:
```bash
java -jar target/MavenFirstProject-1.0-SNAPSHOT.jar
```

10. Test the Application
- Navigate to:
``` bash
http://localhost:8080/hello
``` 
- You will see:"Hello, Spring!"

11. Add Some More
- For the extra features of your application, you may use the additional controllers, services and repositories as necessary.

### Conclusion
You set up a basic Spring with maven application. You can add more features such as database integration, security or even start implementing restful services. Tell me if you have something specific in mind!
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> d8857db (Update files)



** Project Developing Details **
- Create maven project (choose maven-archetype-webapp)
1. Create Bean class in bean package
2. Create applicationContext.xml file in  resources package.
3. Add dependency to pom.xml (springContext)


