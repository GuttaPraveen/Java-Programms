package com.apcfss.praveen;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class EvenAndOddSum
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Integer> list=List.of(45,15,7,8,14,23,45,67,6);
		//Even Numbers Sum
		Predicate<Integer> even=e->e%2==0;
		Optional<Integer> evenSum=list.stream().filter(even).reduce((a,b)->a+b);
		System.out.println("Even Sum is:"+ evenSum.get());
		
		//Odd numbers Sum
		Predicate<Integer> odd=even.negate();
		Optional<Integer> oddSum=list.stream().filter(odd).reduce((a,b)->a+b);
		System.out.println("Odd Sum is:"+oddSum.get());
		
		//First Even
		int firstEven= list.stream().filter(even).findFirst().get();
		System.out.println("First Even:"+firstEven);
		
		//nth even like 3rd even
		System.out.println("3rd even: ");
		list.stream().filter(even).sorted().skip(2).limit(1).forEach(System.out::println);
		
		
	}

}
/*
	3. Write a Java program that uses the Stream API to find the sum of all even numbers from a list of integers.
	4. Write a Java program that uses the Stream API to find the sum of all odd numbers from a list of integers.
	8. Write a Java program that uses lambda expressions to find first even number in list.
	10. Write a Java program that uses lambda expressions to find 3rd highest even number in list.



 */
