package streamapi;
import java.util.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAndFilter
{

	public static void main(String[] args) 
	{
		List list=Arrays.asList("HI","hello","Good Morning");
		Stream s=list.stream();
		
		s.forEach(s1->System.out.println(s1));
		
		
	}

}
/*
s.filter(i->i%2==0).forEach(System.out::println);
TODO Auto-generated method stub
		Stream numbers=Stream.of("1","2","3","4","5","6");
		//Stream<String> s=numbers.stream();
		System.out.println(numbers.count());
		numbers.forEach(s1 -> System.out.println(s1));
		/*Stream<String> stream = Stream.of("Geeks", "For","Geeks", "A","Computer", "Portal");

		// Print the stream
			stream.forEach(s2 -> System.out.println(s2));*/