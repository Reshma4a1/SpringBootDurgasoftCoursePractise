package com.durgasoft.springbootfirstproject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("quicksortalgorithm")

public class QuickSortAlgorithm implements SortAlgorithm{
	
	public QuickSortAlgorithm() {
		System.out.println("QuickSortAlgorithm Constructor");
	}
	
	@Override
	public int[] Sort(int[] numbers) {
		
		System.out.println("Method qiuck sort");
		//code to perform the sort
		return numbers;
		
	}

}
