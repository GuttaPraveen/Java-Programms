package com.apcfss.praveen;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NumbersAsc
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[]=new int[] {2,4,12,5,15,23,27,34,65};
		Predicate<Integer> greaterThanSix=n->n>6;
		Arrays.stream(a).filter((IntPredicate) greaterThanSix).sorted().forEach(
				(x)->
				{
					System.out.print(x+" ");
				});
	}

}
