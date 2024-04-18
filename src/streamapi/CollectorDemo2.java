package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import streamapi.Customer;
public class CollectorDemo2
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Customer> customerList = Arrays.asList(
				new Customer("Virat", "Kohli"),
				new Customer("Steve", "Smith"),
				new Customer("David", "Warner"),
				new Customer("Michle", "Starc"));
		
		Map<String, List<Customer>> groupMap = customerList.stream()
				  .collect(Collectors.groupingBy(c -> c.getLastName()));

		groupMap.forEach((lastName, customer) -> System.out.println(lastName + ": " + customer));

	}

}
