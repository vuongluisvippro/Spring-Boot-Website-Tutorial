package com.tutorial.javaspring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	// What are beans?
	// What are the dependencies of a bean?
	
	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);
		
		int result = binarySearch.binarySearch(new int[] {34, 21}, 3);
		System.out.println("-:-"+result);
	}
}
