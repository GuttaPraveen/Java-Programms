package streamapi;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAssignment 
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
		Stream<Integer> stream = list.stream();
		//stream.filter(a->a%2==0).forEach(System.out::println);
		//stream.map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
		
		/*LinkedHashSet lhm = new LinkedHashSet(); 
		stream.filter(n->!lhm.add(n)).forEach(System.out::println);*/
		
		//stream.findFirst().ifPresent(System.out::println);
		
		//System.out.println(stream.count());
		
		String input = "Hello, World!";

        // Convert the characters to lowercase and print them
        List<Integer> codePoints=input.chars().boxed().collect(Collectors.toList());
        
        System.out.println(codePoints);
             input.chars().mapToObj(c -> (char) c)
             .map(Character::toLowerCase)
             .forEach(System.out::print);
	}
}

/*

Given a list of integers, find out all the even numbers that exist in the list using Stream functions?

*/