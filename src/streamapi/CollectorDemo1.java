package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorDemo1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Customer> customerList = Arrays.asList(
				new Customer("Virat", "Kohli"),
				new Customer("Steve", "Smith"),
				new Customer("David", "Warner"),
				new Customer("Michle", "Starc"));
		List <Customer> cust=customerList.stream()
		.filter(name->name.getLastName().endsWith("Warner")).collect(Collectors.toList());
		System.out.println(cust);
		

	}

}
class Customer
{
	private String firstName;
	private String lastName;
	public Customer(String firstName, String lastName) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public String toString() 
	{
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
}