package streamapi;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import streamapi.Customer;
public class CollectorDemo3
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Customer> customerList = Arrays.asList(
				new Customer("Virat", "Kohli"),
				new Customer("Steve", "Smith"),
				new Customer("David", "Warner"),
				new Customer("Michle", "Starc"));
		
		String joining = customerList.stream()
				 .filter(c -> c.getLastName().contains("Kohli"))
				 .map(c -> c.getFirstName())
				 .collect(Collectors.joining(", ",
						"In customerList: [",
						"] have the same lastName Kohli."));

		System.out.println(joining);


	}

}
