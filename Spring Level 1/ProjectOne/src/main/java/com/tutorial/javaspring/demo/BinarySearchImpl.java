package com.tutorial.javaspring.demo;

public class BinarySearchImpl {
	
	private SortAlgorithm mSortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.mSortAlgorithm = sortAlgorithm;
	}
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int[] sortedNumbers = mSortAlgorithm.sort(numbers);
		System.out.println(mSortAlgorithm);
		System.out.println("Size of the array: "+sortedNumbers.length);
		// Implementing Sort Logic
		
		// Bubble Sort Algorithm
		
		// Search for the array
		return 3;
	}
}
