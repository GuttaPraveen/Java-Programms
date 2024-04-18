package com.apcfss.praveen;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import string.Split;

public class LowerAndUpperDemo
{
	static String lower="";
	static String upper="";
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 
		String s=sc.next();
		//Lower case characters
		s.chars().mapToObj(c -> (char) c).filter(Character::isLowerCase).forEach(
				ans->
				{
					lower+=ans;
					//System.out.println(ans);
				});
		//Upper casr Characters
		s.chars().mapToObj(c -> (char) c).filter(Character::isUpperCase).forEach(
				ans->
				{
					upper+=ans;
					//System.out.println(ans);
				});
		System.out.println(lower+" "+upper);
		//map lower
		Map<Character, Long> lowerMap=lower.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(lowerMap);
		//map upper 
		Map<Character, Long> upperMap=upper.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(upperMap);
	
		//map same characters
		s=s.toUpperCase();
		Map<Character, Long> characterCounts = s.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(characterCounts);
		

	}

}
