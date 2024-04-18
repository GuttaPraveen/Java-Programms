package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemoOnStrings
{
	public static void main(String[] args)
	{
		String names=Stream.of("bald eagle","pronghorn","puma","sea lion","Bengal Tiger")
								.collect(Collectors.toSet())
								.stream()
								.collect(Collectors.groupingBy(s->s.contains(" ")))
								.entrySet()
								.stream()
								.filter(e->e.getKey())
								.map(Entry::getValue)
								.flatMap(List::stream)
								.sorted(Comparator.reverseOrder())
								.collect(Collectors.joining(", "));
		System.out.println(names);
		
		String input = "gainjavaknowledge";

        String output = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1)
                .map(e -> e.getKey()).findFirst().get();
        System.out.println("First Non Repeated Character : " + output);
        
        int[] numbers = {5, 13, 41, 88, 99, 77};

        Integer SecondHighestElement = Arrays.stream(numbers)
                .boxed().sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get();

        System.out.println("Second Highest Element is:"+SecondHighestElement);
		
		
		
		
	}
}
