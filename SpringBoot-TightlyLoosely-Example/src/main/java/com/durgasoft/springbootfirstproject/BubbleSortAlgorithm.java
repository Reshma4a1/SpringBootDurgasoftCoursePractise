package com.durgasoft.springbootfirstproject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component("bubblesortalgorithm")
@Primary

public class BubbleSortAlgorithm implements SortAlgorithm {

	public BubbleSortAlgorithm() {
		System.out.println("BubbleSortAlgorithm Constructor");
	}

	@Override
	public int[] Sort(int[] numbers) {

		System.out.println("Method bubble sort");

		// code to perform the sort
		return numbers;

	}
}
