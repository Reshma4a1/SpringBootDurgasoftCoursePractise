package com.durgasoft.springbootfirstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringbootFirstprojectApplication {

	public static void main(String[] args) {
		
		//Loosely coupled through interface we can either use bubble or quick sort without using annotations
		/*
		 * BinaySearchImpl binarySearch = new BinaySearchImpl(new
		 * BubbleSortAlgorithm());
		 * 
		 * int finalvalue = binarySearch.BinaySearch(new int[] {10,9,8}, 9);
		 * System.out.println("finalvalue" + finalvalue);
		 * 
		 * SpringApplication.run(SpringbootFirstprojectApplication.class, args);
		 */
		
		
		//Using Annotations
		ApplicationContext context = SpringApplication.run(SpringbootFirstprojectApplication.class, args);
		BinaySearchImpl binarySearch = context.getBean(BinaySearchImpl.class);
		System.out.println(binarySearch.BinaySearch(new int[] {10,9,8}, 9));
		
	}

}
