package com.example.springboot;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext context) {
		return args -> {
			System.out.println("Lets check the beans provided by sboot");
			
			String[] beanLabels = context.getBeanDefinitionNames();
			Arrays.sort(beanLabels);
			
			for (String beanLabel : beanLabels) {
				System.out.println(beanLabel);
			}
						
		};
	}

}
