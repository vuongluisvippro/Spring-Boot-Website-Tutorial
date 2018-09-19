package com.tutorial.javaspring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tutorial.javaspring.demo.bubble.BubbleSortAlgorithm;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private BubbleSortAlgorithm mBubbleSortAlgorithm;
		
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		int[] sortedNumbers = mBubbleSortAlgorithm.sort(numbers);
		return sortedNumbers.length;
	}
}
