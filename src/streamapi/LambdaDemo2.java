package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaDemo2
{
	public static void main(String[] args)
	{
		System.out.println("HI");
		List<String> list=Arrays.asList("Hello","HI","How are");
		Stream<String> stream=list.stream();
		stream.filter(count->count.length()>4).forEach(System.out::println);
		//System.out.println(l);
		
	}
}
