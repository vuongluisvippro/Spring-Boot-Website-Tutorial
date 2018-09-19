package com.tutorial.javaspring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		int result = binarySearch.binarySearch(new int[] {34, 21}, 3);
		System.out.println("Result is returned from binarySearchAlgorithm: "+result);
		SpringApplication.run(DemoApplication.class, args);
	}
}
