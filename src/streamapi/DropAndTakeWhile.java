package streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class DropAndTakeWhile 
{
	public static void main(String[] args)
	{
		List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9);
		
		List<Integer> greaterThanFive=numbers.stream()
		.dropWhile(n->n<5)
		.collect(Collectors.toList());
		
		System.out.println(greaterThanFive);
		
		
		List<Integer> lessThanFive=numbers.stream()
				.takeWhile(n->n<5)
				.collect(Collectors.toList());
				
				System.out.println(lessThanFive);
	}
}
