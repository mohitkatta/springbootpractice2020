package com.learn.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author mohit katta
 *
 */
@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		BinarySearchImpl binarySearch=new BinarySearchImpl(new QuickSortAlgorithm());//if you want to change the sorting Algorithm
		//Change it here in line no 10 make BubbleSortAlgorithm() as QuickSortAlgorithm() if u want to use quick sort
		//hence it makes program loosely cuouple by changing only at one place
		int result=binarySearch.binarySearch(new int[] {12,4,6},3);
		System.out.println(result);
		//SpringApplication.run(SpringIn5StepsApplication.class, args);
	}

}
