package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JavaRecordDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<PersonRecord> personList=Arrays.asList(
				new PersonRecord("Praveen","Gutta"),
				new PersonRecord("Maha","Pidikiti"),
				new PersonRecord("Sahithi","Raplou"),
				new PersonRecord("Praveen","Annavarapu"));
		
		personList.stream()
		.sorted(Comparator.comparing(PersonRecord::firstName)
		.reversed()
		.thenComparing(PersonRecord::lastName)) //first name same then compare last name
		.forEach(System.out::println);
		
		

	}

}
record PersonRecord(String firstName,String lastName)
{
	public String toString()
	{
		return "{" +firstName+" ,"+lastName+"}";
	}
}
