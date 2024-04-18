package com.apcfss.praveen;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringAscAndDesc
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<String> list=List.of("apCFSS","Andhra","Pradesh","India","Mangalagiri");
		//Ascending Order
		list.stream().sorted((a,b)->a.compareToIgnoreCase(b)).forEach(
				(x)->
				{
					System.out.print(x+" ");
				});
		System.out.println();
		//Descending Order
		list.stream().sorted((a,b)->b.compareToIgnoreCase(a)).forEach(
						(x)->
						{
							System.out.print(x+" ");
						});
		System.out.println();
		//Natural order
		list.stream().sorted().forEach(
				(x)->
				{
					System.out.print(x+" ");
				});
		System.out.println();
		//Reverse Order based on ascii values
		list.stream().sorted(Comparator.reverseOrder()).forEach(
				(x)->
				{
					System.out.print(x+" ");
				});
		System.out.println();
		
			

	}

}
/*

 1. Write a Java program that uses lambda expressions to sort a list of strings in ascending order.
 2. Write a Java program that uses lambda expressions to sort a list of strings in desending order .

 Sample input for above 2 programs : List<String> names = Arrays.asList("Bob", "Charlie", "David", "Eva","Alice");
 
 
 */
