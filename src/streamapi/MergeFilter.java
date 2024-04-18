package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MergeFilter 
{
	public static void main(String[] args)
	{
		List<Integer> list=Arrays.asList(12,13,7,50,40);
		Predicate<Integer> lessThanTwenty=a->a<20;
		Predicate<Integer> geaterThanTen=b->b>10;
		List l=list.stream().filter(lessThanTwenty.and(geaterThanTen)).collect(Collectors.toList());
		System.out.println(l);
		
		
	}
	
}
