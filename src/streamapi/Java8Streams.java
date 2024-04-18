package streamapi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Java8Streams
{

	public static void main(String[] args)
	{
		
		//1. Given the list of integers, find the first element of the list using Stream functions
			List<Integer> nums=Arrays.asList(10,12,22,5,10,13,55,53,1,2);
			nums.stream().findFirst().ifPresent(System.out::println);;
		
		//2. Given a list of integers, find the total number of elements present in the list using Stream functions
			System.out.println(nums.stream().count());
		
		//3.Given a list of integers, find out all the even and odd numbers that exist in the list using Stream functions 
			nums.stream().filter(n->n%2==0).forEach(System.out::println);
			nums.stream().filter(n->n%2!=0).forEach(System.out::println);
			
		//4. Given a list of integers, find out all the numbers starting with 5 using Stream functions ?
			nums.stream().filter(n->n.toString().startsWith("5")).forEach(System.out::println);
			
		//5. How to find duplicate elements in a given integers list in java using Stream functions?
			Set<Integer> temp=new HashSet<>();
			nums.stream().filter(n->!temp.add(n)).forEach(System.out::println);
		
		//6. Given a list of integers, find the maximum and minimum value element present in it using Stream functions?
			Optional<Integer> max=nums.stream().max(Integer::compareTo);
			Optional<Integer> min=nums.stream().min(Integer::compareTo);
			System.out.println(max.orElse(null));
			System.out.println(min.orElse(null));
		
		//7. Given a list of integers, sort all the values present in it using Stream functions?
			nums.stream().sorted().forEach(System.out::println);
			
		//8. Given a list of integers, sort all the values present in it in descending order using Stream functions?
			nums.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
			
		//Check if an array contains duplicate values or not.
			int numbers[]=new int[] {1,2,3,5,1};
			if(Arrays.stream(numbers).distinct().count()!=numbers.length)
				System.out.println("It contain Duplicate Value");
			else
				System.out.println("It contain unique value");
			
		// Java 8 program to perform square on list elements and filter numbers greater than 50.
			nums.stream().map(n->n*n).filter(res->res>50).forEach(System.out::println);
			
		//Write a Java 8 program to sort an array and then convert the sorted array into Stream?
			Arrays.sort(numbers);
			Stream.of(numbers).forEach(System.out::println);
			
		// How to use map to convert words into Uppercase in Java 8?
			List<String> words = Arrays.asList("Dev","java","School","dev","backend");
			words.stream().map(w->w.toUpperCase()).forEach(System.out::println);
			
		// Write a Program to find the Maximum element in an array?
			nums.stream().max(Integer::compareTo).forEach(System.out::println);
		//Write a Java 8 program to concatenate two Streams?
				Stream<Integer> s1 = Stream.of(1,2,3);
				Stream<Integer> s2 = Stream.of(4,5,6);
				Stream.concat(s1,s2).forEach(System.out::println);
	   //Write a program in stream to print 10 random numbers.
				Random random = new Random();
				Stream.generate(random::nextInt).limit(10).forEach(System.out::println);
		//Print date and time using Java 8 feature?
				LocalDateTime localDateTime = LocalDateTime.now();
				System.out.println(localDateTime);
		//Then format it in dd-MM-yyyy format?
				DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				System.out.println(dateTimeFormatter.format(localDateTime));
		//How to check if a list is empty in Java 8 using Optional, if not null iterate through the list and print the object?
				List<String> list = null;
				Optional<List<String>> optionalList = Optional.ofNullable(list);
				optionalList.ifPresentOrElse(
				    i -> i.stream().forEach(System.out::println),
				    () -> System.out.println("The list is empty.")
				);
		//Given the array {10, 1, 20, 2, 100, 100, 100}, write Java code using Java Streams to determine the number of occurrences of a particular value.
				int[] values = {10, 1, 20, 2, 100, 100, 100};
				int number = 100;
				long result = Arrays.stream(values).filter(value -> value == number).count();
				System.out.println(result);
		//How to find only duplicate elements with their count from the String ArrayList in Java 8?
				Map<String,Long> map = words.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
				map.entrySet().stream().filter(m -> m.getValue() > 1).forEach(m -> System.out.println(m.getKey() + " : " + m.getValue()));
		//Write a Program to give the sum of the salary of employees.
				Employee employee1=new Employee("test1",1000);
				Employee employee2=new Employee("test2",2000);
				Employee employee3=new Employee("test3",3000);
				Employee employee4=new Employee("test1",4000);

				List employees=new ArrayList<>();

				employees.add(employee1);
				employees.add(employee2);
				employees.add(employee3);
				employees.add(employee4);

				System.out.println(employees.stream().mapToDouble(Employee::getSalary).sum());
		//Write a program to print the count of each character in a String using streams.
				String val= "JavaDeveloper";

				Map charCount = val.chars().mapToObj(c -> (char)c)
				    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

				System.out.println(charCount);
		//How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
				Map<String,Double> uniqueEmployee = employees.stream()
				    .collect(Collectors.toMap(Employee::getName,Employee::getSalary,
				        (existing,replacement)->existing,()-> new TreeMap<>(Comparator.naturalOrder())));

				System.out.println(uniqueEmployee);
				
		//Given a String, find the first non-repeated character in it using Stream functions.
				
				String str = "aabbcddef";
				Optional<Character> firstNonRepeatedChar = str.chars()
				    .mapToObj(c -> (char) c)
				    .collect(
				        LinkedHashMap::new,
				        (map, ch) -> map.put(ch, !map.containsKey(ch)),
				        LinkedHashMap::putAll
				    )
				    .entrySet()
				    .stream()
				    .filter(entry -> entry.getValue())
				    .map(Map.Entry::getKey)
				    .findFirst();

				firstNonRepeatedChar.ifPresent(System.out::println);
				
		//Find the first unique character in a string using Java streams
				
				String str1 = "aabbcddef";

				Optional<Object> firstUniqueChar = str1.chars()
				    .mapToObj(c -> (char) c)
				    .collect(
				        LinkedHashMap::new,
				        (map, ch) -> map.put(ch, !map.containsKey(ch)),
				        LinkedHashMap::putAll
				    )
				    .entrySet()
				    .stream()
				    .filter(entry -> entry.getValue())
				    .map(Map.Entry::getKey)
				    .findFirst();

				firstUniqueChar.ifPresent(System.out::println);
	}

}
class Employee
{
	private String name;
	private int salary;
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
}