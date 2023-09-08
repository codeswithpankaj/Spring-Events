package in.p4n;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AutowiringApplication {

	public static void main(String[] args) {
		// SpringApplication.run(AutowiringApplication.class, args);
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		// Let us raise a start event.
		context.start();
			  
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		
		Info data = new Info("sanjana",21,158);
		
		System.out.println("My Name is : "+data.getName());
		System.out.println("My Age is : "+data.getAge());
		System.out.println("My Height is : "+data.getHeight());
		
		data.setName("omji");
		
		System.out.println(data.getName());
		
		

		 // Let us raise a stop event.
		context.stop();
	}
}


