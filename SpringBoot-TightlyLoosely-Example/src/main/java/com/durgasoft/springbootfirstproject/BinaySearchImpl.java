package com.durgasoft.springbootfirstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinaySearchImpl{
	
	@Autowired
	private SortAlgorithm bubblesortalgorithm;
	
	@Autowired
	private SortAlgorithm quicksortalgorithm;
	
	
	
	  public BinaySearchImpl(SortAlgorithm quicksortalgorithm) { super();
	  System.out.println("BinaySearchImpl Constructor");
	  this.quicksortalgorithm=quicksortalgorithm; }
	 
	 
	
	/**
	 * This is tightly coupled beacuse binary search is completly packed up with the bubble sort code
	 * if it needs to implement some other sorting then we need to remove and use
	 * 
	 * to resolve that problem we need to use decoupling ---through interface
	 */
	
	
	public int BinaySearch(int[] numbers,int numbertosearch) {	
		/*
		 * BubbleSortAlgorithm algorithm = new BubbleSortAlgorithm();
		 * algorithm.Sort(numbers);
		 */
		
	//	QuickSortAlgorithm algorithm = new QuickSortAlgorithm();
	//	algorithm.Sort(numbers);
		
		int[] sortednumbers = bubblesortalgorithm.Sort(numbers);
		int[] sortednumbers2 = quicksortalgorithm.Sort(numbers);
		
		return 9;
		
	}

	
	

}
