package com.apcfss.praveen;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<List<Integer>> listOfLists = Arrays.asList(
				Arrays.asList(1, 2, 3),
	            Arrays.asList(4, 5),
	            Arrays.asList(6, 7, 8)
	        );
		listOfLists.stream().flatMap(a->a.stream()).filter(n->n%2==0).forEach(x->System.out.println(x));
		/*listOfLists.stream()
        .flatMap(List::stream)
        .filter(num -> num % 2 != 0)
        .mapToInt(Integer::intValue)
        .sum();*/
	}

}
