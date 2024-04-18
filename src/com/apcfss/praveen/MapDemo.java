package com.apcfss.praveen;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//first even
		List<Integer> list=List.of(1,1,2,2,3,4);
		Map<Integer,Long> m=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(m);
		
	}

}
/*
	12. Write a Java program that uses lambda expressions to find how many times each number is repeated with count .
 		input : 1,1,2,2,3,4
		Expeted output : 1=2,2=2,3=1,4=1 
*/