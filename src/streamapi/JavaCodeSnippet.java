package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaCodeSnippet
{
	public static void main(String[] args) 
	{
		//Write a program to find the maximum element in an array using the Arrays class.
        int[] array = {5, 8, 3, 2, 9, 1};
        int max = Arrays.stream(array).max().orElse(0);
        System.out.println(max);


        //Implement a function to remove duplicates from an ArrayList using the Collections class.

        List<Integer> list = Arrays.asList(3, 5, 3, 2, 1, 5);
        list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);


        System.out.println("sort descending");
        //Create a method to sort an ArrayList in descending order using the Collections class.

        //list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted list in descending order: " + list);

        //Write a program to find the common elements between two arrays using the Arrays class.

        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {4, 5, 6, 7, 8};
        ArrayList<Integer> commonElements = new ArrayList<>(Arrays.asList(array1));
        commonElements.retainAll(Arrays.asList(array2));
        System.out.println("Common elements: " + commonElements);
        
            List<Integer> nums = Arrays.asList(1,2,3,4,5,6,8,101);
            int[] arr = {1,2,3,4};
           // Write a program to find the sum of all elements in a List using streams.
            int sums = nums.stream().mapToInt(Integer::intValue).sum();
            System.out.println(sums);


            //Given a List of integers, write a program to find the maximum element using streams.
            int maxNum = nums.stream().max(Comparator.naturalOrder()).get();

            System.out.println("max element :"+maxNum);

            List<String> fruits = Arrays.asList("apple", "banana", "cherry", "coconut", "apple");

            //Given a List of strings, write a program to count the number of strings that start with a specific character using streams.
            long fruitCount = fruits.stream().filter( s -> s.startsWith("c")).count();
            System.out.println("fruitCount: "+fruitCount);


            //Write a program to convert a List of strings to uppercase using streams.
            fruits.stream().map(String::toUpperCase).forEach(System.out::println);

            //Given a List of integers, write a program to filter out the even numbers using streams.
            // Count the number of elements in a list that satisfy a specific condition using streams.

            nums.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
            int even = (int) nums.stream().filter(n -> n % 2 == 0).count();
            System.out.println("no of even "+even);


            //Write a program to find the average of a List of floating-point numbers using streams.
            List<Double> numsFloat = Arrays.asList(1.3, 2.4, 3.1, 4.2, 5.4);
            double avg = numsFloat.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
            System.out.println("avg ::"+avg);

            //Given a List of strings, write a program to concatenate all the strings using streams.
            String concat = fruits.stream().collect(Collectors.joining());
            System.out.println(concat);

            //Write a program to remove duplicate elements from a List using streams.
            fruits.stream().distinct().forEach(System.out::println);

            //Given a List of objects, write a program to sort the objects based on a specific attribute using streams.
            

            //Write a program to check if all elements in a List satisfy a given condition using streams.
            List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
            boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
            System.out.println("All numbers are even: " + allEven);


            //Sort a list of strings in ascending order using streams.
            fruits.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);

            //Check if a list contains a specific element using streams.
            boolean exists = nums.stream().anyMatch(n -> n.equals(9));
            System.out.println(exists);

            //Create a new list containing the square of each element from the original list using streams
            nums.stream().map(n -> n*n).collect(Collectors.toList()).forEach(System.out::println);

            //Find the average length of strings in a list using streams.
            fruits.stream().mapToInt(String::length).average();

            //Find the longest string in a list using streams.
            fruits.stream().mapToInt(String::length).max();

//            Group a list of objects based on a specific attribute using streams.
//            List<Employee> sortedEmployees = people.stream()
//                    .sorted(Comparator.comparing(Employee::getDepartment)
//                            .thenComparing(Employee::getSalary))
//                    .collect(Collectors.toList());


            //Remove null values from a list using streams.
            List<String> nonNullValues = fruits.stream()
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());


            //Find the second smallest element in a list of integers using streams.
            Optional<Integer> secondSmallest = numbers.stream()
                    .distinct()
                    .sorted()
                    .skip(1)
                    .findFirst();



            //Find the intersection of two lists using streams
            List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
            List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);

            List<Integer> intersection = list1.stream()
                    .filter(list2::contains)
                    .collect(Collectors.toList());
            
            
          //1. Given a sentence, find and print the frequency of each word.
            String sentence = "Java is a programming language. Java is versatile.";

            Map<String, Long> wordFreqMap = Arrays.stream(sentence.split("\\s+"))
                    .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));


//           System.out.println(wordFreqMap);

           //2. Given a list of integers, find out all the numbers starting with 1.

           List<Integer> num = Arrays.asList(12, 13, 18, 21, 90, 11);

           List<Integer> numsWithOne = num.stream().filter( n -> String.valueOf(n).startsWith("1")).collect(Collectors.toList());

//           System.out.println(numsWithOne);

          //3. Given a list of names, group them by their first letter, and then count the number of names in each group.

           String[] names = {"Alice", "Bob", "Charlie", "Amy", "Bill", "Anna"};

           Map<Character,Long> namesMap = Arrays.stream(names).collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.counting()));

//           System.out.println(namesMap);


           // 4. Find and print duplicate numbers in an array if it contains multiple duplicates?

           int[] ar = {2,4,2,3,1,5, 5,78,3,1,5};

//           Arrays.stream(arr).boxed()
//                   .collect(Collectors.groupingBy(e-> e, Collectors.counting()))
//                   .entrySet().stream()
//                   //key -value - 2 (k), 2(val)
//                   .filter(entry -> entry.getValue() > 1)
//                   .map(Map.Entry::getKey)
//                   .forEach(System.out::println);


           // 5. How are duplicates removed from a given array in Java?
   //
           int[] arr2 = {2,4,2,3,1,78};

           int[] newarr = Arrays.stream(arr).distinct().toArray();

//           System.out.println(Arrays.toString(newarr));


           //6. Given a list of words, filter and print the palindromes

           List<String> strings = List.of("level", "hello", "radar", "world", "deed");

           List<String> palindromeWords = strings.stream().
                   filter(str -> str.equals(new StringBuilder(str).reverse().toString())).collect(Collectors.toList());

//           System.out.println(palindromeWords);


           // 7. How do you merge two sorted arrays into a single sorted array?
           int[] arra1 = {1, 3,32, 5, 7};
           int[] arra2 = {2, 4, 6,62, 8};

           int[] sortedArray = IntStream.concat(Arrays.stream(arra1), Arrays.stream(arra2)).sorted().toArray();
//          System.out.println(Arrays.toString(sortedArray));


           //8. Given two lists of strings, concatenate them and remove duplicates.

           List<String> lis1 = List.of("apple", "banana", "orange");
           List<String> lis2 = List.of("banana", "kiwi", "grape");

           List<String> uniqueList = Stream.concat(lis1.stream(), lis2.stream()).distinct().collect(Collectors.toList());
//           System.out.println(uniqueList);


     
           //10. Given a list of strings, sort them according to increasing order of their length.

           List<String> fruis = Arrays.asList("Mango","pear" ,"Apple", "Banana", "Pineapple", "Kiwi");

           fruis.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);


           //12.Partition a list of numbers into two groups: even and odd, using a custom predicate.
           List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
           Map<Boolean, List<Integer>> partitionedNumbers = numbers1.stream()
                   .collect(Collectors.partitioningBy(n -> n % 2 == 0));

           System.out.println(partitionedNumbers);

           //13. Find the squares of the first three even numbers in a list.

           List<Integer> numbes = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
           List<Integer> firstThreeSquares = numbes.stream()
                   .filter(n -> n % 2 == 0)
                   .map(n -> n * n)
                   .limit(3)
                   .collect(Collectors.toList());

           // 14. Flatten a list of lists

           List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));
           List<Integer> flattenedList = listOfLists.stream()
                   .flatMap(List::stream)
                   .collect(Collectors.toList());

           System.out.println(flattenedList);


           // 1. Find the sum of all elements in a List using streams.

           // 2. Given a List of integers, write a program to find the maximum element using streams.

           // 3. Given a List of strings, write a program to count the number of strings that start with a specific character using streams.

           // 4. Convert a List of strings to uppercase using streams.

           // 5. Given a List of integers, write a program to filter out the even numbers using streams.
           //    Count the number of elements in a list that satisfy a specific condition using streams.

           // 6. Write a program to find the average of a List of floating-point numbers using streams.

           // 7. Given a List of strings, write a program to concatenate all the strings using streams.

           // 8. Write a program to remove duplicate elements from a List using streams.

           // 9. Given a List of objects, write a program to sort the objects based on a specific attribute using streams.

           // 10. Write a program to check if all elements in a List satisfy a given condition using streams.

           //Extra practice questions

           // 11. Given a List of integers, write a program to find the difference between the maximum and minimum elements using streams.

           // 12. Write a program to check if a List of strings contains at least one uppercase word using streams.

           // 13. Given a List of integers, write a program to filter out the prime numbers using streams.

           // 14. Write a program to check if a List of strings contains any duplicates using streams.

           // 15. Given a List of strings, write a program to count the total number of characters in all strings using streams.

	}
}
