
package com.apcfss.praveen;

import java.util.List;
import java.util.function.Predicate;
public class PrimeNum 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Integer> list=List.of(1,2,5,9,12,13,17,27,67,93,97,55,51,53);
		Predicate<Integer> prime=p->
		{
			int count=0;
			for(int i=2;i<=p/2;i++)
			{
				if(p%i==0)
				{
					count++;
					break;
				}
			}
			if(count>0 || p==1)
				return false;
			else
				return true;
		};
		//prime numbers
		list.stream().filter(prime).forEach(x->System.out.print(x+" "));
		System.out.println();
		//prime numbers greater than 6
		list.stream().filter(n->n>6).filter(prime).forEach(x->System.out.print(x+" "));
		System.out.println();
		//First prime number
		int firstPrime=list.stream().filter(prime).findFirst().get();
		System.out.println("First Prime:"+firstPrime);
		//nth prime
		System.out.print("5th prime is:");
		list.stream().filter(prime).skip(4).limit(1).forEach(x->System.out.print(x));
		
	}

}
/*
	5. Write a Java program that uses the Stream API to find the prime numbers in list of integers.
	6. Write a Java program that uses the Stream API to find the prime numbers in list of integers and number should be greater than 30;
	9. Write a Java program that uses lambda expressions to find first prime number in list.
	11. Write a Java program that uses lambda expressions to find 5th highest prime number in list .
*/