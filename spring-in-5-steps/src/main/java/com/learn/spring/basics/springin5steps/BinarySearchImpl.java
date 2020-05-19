package com.learn.spring.basics.springin5steps;

public class BinarySearchImpl {
	
	private SortAlgorithm sortAlgorithm;

	

	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}



	public int binarySearch(int[] numbers,int numberToSearchFor){
		
		BubbleSortAlgorithm bubbleSortAlogorithm=new BubbleSortAlgorithm();
		int[] sortedNumbers=bubbleSortAlogorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		//implement sorting logic
		//search the array
		return 3;
	}
	
}
