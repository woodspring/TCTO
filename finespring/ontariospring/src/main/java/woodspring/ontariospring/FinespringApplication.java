package woodspring.ontariospring;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FinespringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(FinespringApplication.class, args);
		ApplicationContext ctx = SpringApplication.run(FinespringApplication.class, args);
		String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
	}
}
