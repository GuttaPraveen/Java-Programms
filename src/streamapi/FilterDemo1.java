package streamapi;
import java.util.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterDemo1
{

	public static void main(String[] args) 
	{
		System.out.println("Implementing Stream API");
//		List list=Arrays.asList("HI","hello","Good Morning");
		ArrayList<String> al=new ArrayList();
		al.add("Praveen");
		al.add("Maha");
		al.add("Rishi");
		al.add("Sahithi");
		al.add("saisri");
		System.out.println(al);
		
		Stream<String> stream = al.stream();
		//Predicate =>boolean test(T t) ==>
		stream.filter(count->count.length()<=5).collect(Collectors.toList());
		
		
		
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